package com.liferay.common.extensions.preaction.login.api;

import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.WebKeys;
import org.osgi.service.component.annotations.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component(
        immediate = true, property = "key=" + PropsKeys.SERVLET_SERVICE_EVENTS_PRE,
        service = LifecycleAction.class
)
public class LoginPreAction implements LifecycleAction {

    @Override
    public void processLifecycleEvent(LifecycleEvent lifecycleEvent) {

        HttpServletRequest request = lifecycleEvent.getRequest();

        ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);

        if(!themeDisplay.isSignedIn() && themeDisplay.getURLCurrent().contains("/sample-page")){
            try{
                lifecycleEvent.getResponse().sendRedirect("/hidden-page");
            }catch (IOException ioException){
                throw new RuntimeException(ioException);
            }
            _log.info("Guest user attempted to access the sample page");

        }
    }
    private static final Log _log = LogFactoryUtil.getLog(LoginPreAction.class);

}
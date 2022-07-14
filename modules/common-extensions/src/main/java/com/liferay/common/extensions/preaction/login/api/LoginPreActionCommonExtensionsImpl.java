package com.liferay.common.extensions.preaction.login.api;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;
import com.liferay.portal.kernel.util.PropsKeys;
import org.osgi.service.component.annotations.Component;

@Component(
        immediate = true, property = "key=" + PropsKeys.SERVLET_SERVICE_EVENTS_PRE,
        service = LifecycleAction.class
)
public class LoginPreActionCommonExtensionsImpl implements LifecycleAction {

    @Override
    public void processLifecycleEvent(LifecycleEvent lifecycleEvent) throws ActionException {

    }
}

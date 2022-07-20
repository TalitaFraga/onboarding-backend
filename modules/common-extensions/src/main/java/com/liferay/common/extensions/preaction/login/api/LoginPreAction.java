/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.common.extensions.preaction.login.api;

import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.WebKeys;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;

/**
 @author Talita Fraga
 */
@Component(
	immediate = true, property = "key=" + PropsKeys.SERVLET_SERVICE_EVENTS_PRE,
	service = LifecycleAction.class
)
public class LoginPreAction implements LifecycleAction {

	@Override
	public void processLifecycleEvent(LifecycleEvent lifecycleEvent) {
		HttpServletRequest request = lifecycleEvent.getRequest();

		ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(
			WebKeys.THEME_DISPLAY);

		String urlCurrent = themeDisplay.getURLCurrent();

		if (!themeDisplay.isSignedIn() && urlCurrent.contains("/sample-page")) {
			HttpServletResponse response = lifecycleEvent.getResponse();

			try {
				response.sendRedirect("/hidden-page");
			}
			catch (IOException ioException) {
				throw new RuntimeException(ioException);
			}

			_log.info("Guest user attempted to access the sample page");
		}
	}

	private static final Log _log = LogFactoryUtil.getLog(LoginPreAction.class);

}
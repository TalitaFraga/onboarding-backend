package com.liferay.docs.modules.internal.jaxrs.application;

import javax.annotation.Generated;

import javax.ws.rs.core.Application;

import org.osgi.service.component.annotations.Component;

/**
 * @author TalitaFraga
 * @generated
 */
@Component(
	property = {
		"liferay.jackson=false",
		"osgi.jaxrs.application.base=/amf-registration-rest",
		"osgi.jaxrs.extension.select=(osgi.jaxrs.name=Liferay.Vulcan)",
		"osgi.jaxrs.name=AmfRegistrationRest"
	},
	service = Application.class
)
@Generated("")
public class AmfRegistrationRestApplication extends Application {
}
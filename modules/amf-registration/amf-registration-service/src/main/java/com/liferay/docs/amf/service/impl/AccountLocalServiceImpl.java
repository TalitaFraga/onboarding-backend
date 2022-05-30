/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 * <p>
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * <p>
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.docs.amf.service.impl;

import com.liferay.docs.amf.service.base.AccountLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
        property = "model.class.name=com.liferay.docs.amf.model.Account",
        service = AopService.class
)
public class AccountLocalServiceImpl extends AccountLocalServiceBaseImpl {

    public Account createAccount(long accountId, String firstName, String lastName, String emailAddress, String userName_,
                                 String male, Date birthday, String password1, String password2, int homePhone,
                                 int mobilePhone, String address, String address2, String city, String state, String zip,
                                 String securityQuestion, String securityAnswer, String acceptedTou) {

        Account account = addAccount(accountId);

        account.setAccountId(accountId);
        account.setFirstName(firstName);
        account.setLastName(lastName);
        account.setEmailAddress(emailAddress);
        account.setUserName_(userName_);
        account.setGender(male);
        account.setBirthday(birthday);
        account.setPassword1(password1);
        account.setPassword2(password2);
        account.setHomePhone(homePhone);
        account.setMobilePhone(mobilePhone);
        account.setAddress(address);
        account.setAddress2(address2);
        account.setCity(city);
        account.setState(state);
        account.setZip(zip);
        account.setSecurityQuestion(securityQuestion);
        account.setSecurityAnswer(securityAnswer);
        account.setAcceptedTou(staacceptedToute);

        return accountPersistence.update(account);

    }

    public Account updateAccount(long accountId, String firstName, String lastName, String emailAddress, String userName_,
                                 String male, Date birthday, String password1, String password2, int homePhone,
                                 int mobilePhone, String address, String address2, String city, String state, String zip,
                                 String securityQuestion, String securityAnswer, String acceptedTou) throws PortalException {

        Account account = getAccount(accountId);


        account.setFirstName(firstName);
        account.setLastName(lastName);
        account.setEmailAddress(emailAddress);
        account.setUserName_(userName_);
        account.setGender(male);
        account.setBirthday(birthday);
        account.setPassword1(password1);
        account.setPassword2(password2);
        account.setHomePhone(homePhone);
        account.setMobilePhone(mobilePhone);
        account.setAddress(address);
        account.setAddress2(address2);
        account.setCity(city);
        account.setState(state);
        account.setZip(zip);
        account.setSecurityQuestion(securityQuestion);
        account.setSecurityAnswer(securityAnswer);
        account.setAcceptedTou(staacceptedToute);

        return accountPersistence.update(account);

    }

	public deleteAccount(long accountId) throws PortalException{
		Account account = account.deleteAccount(accountId);

		return accountPersistence.remove(account);
	}




}
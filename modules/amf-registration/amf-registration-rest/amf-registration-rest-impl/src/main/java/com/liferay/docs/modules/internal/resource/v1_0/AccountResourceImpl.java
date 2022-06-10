package com.liferay.docs.modules.internal.resource.v1_0;

import com.liferay.docs.amf.service.AccountLocalService;
import com.liferay.docs.modules.dto.v1_0.Account;
import com.liferay.docs.modules.resource.v1_0.AccountResource;


import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;


/**
 * @author TalitaFraga
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/account.properties",
	scope = ServiceScope.PROTOTYPE, service = AccountResource.class
)
public class AccountResourceImpl extends BaseAccountResourceImpl {

@Override
public Account createAccount(Account account) throws Exception {
	_accountLocalService.createAccount(account.getFirstName(), account.getLastName(), account.getEmailAddress(),
			account.getUserName_(), account.getGenre(), account.getBirthday(), account.getPassword(),
			account.getPassword2(), account.getHomePhone(), account.getMobilePhone(), account.getAddress1(),
			account.getAddress2(), account.getCity(), account.getState(), account.getZip(),
			account.getSecurityQuestion(), account.getSecurityAnswer(), account.getAcceptedTou());
	return account;
}


@Reference
	private AccountLocalService _accountLocalService;


}
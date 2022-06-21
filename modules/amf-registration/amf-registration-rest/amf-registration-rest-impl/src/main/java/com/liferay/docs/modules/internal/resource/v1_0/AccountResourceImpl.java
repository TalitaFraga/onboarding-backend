package com.liferay.docs.modules.internal.resource.v1_0;

import com.liferay.docs.amf.service.AccountLocalService;
import com.liferay.docs.modules.dto.v1_0.AccountDTO;
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
public abstract class AccountResourceImpl extends BaseAccountResourceImpl {

    @Override
    public AccountDTO createAccount(AccountDTO accountDTO) throws Exception {
        _accountLocalService.createAccount(accountDTO.getFirstName(), accountDTO.getLastName(), accountDTO.getEmailAddress(),
                accountDTO.getUserName_(), accountDTO.getGenre(), accountDTO.getBirthday(), accountDTO.getPassword(),
                accountDTO.getPassword2(), accountDTO.getHomePhone(), accountDTO.getMobilePhone(), accountDTO.getAddress1(),
                accountDTO.getAddress2(), accountDTO.getCity(), accountDTO.getState(), accountDTO.getZip(),
                accountDTO.getSecurityQuestion(), accountDTO.getSecurityAnswer(), accountDTO.getAcceptedTou());
        return accountDTO;
    }
    @Reference
    private AccountLocalService _accountLocalService;
}
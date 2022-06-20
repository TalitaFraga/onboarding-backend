package com.liferay.docs.modules.internal.AccountMapper;

import com.liferay.docs.amf.model.Account;
import com.liferay.docs.modules.dto.v1_0.AccountDTO;

public class AccountMapper {

    public AccountDTO accountToDTO(Account accountModel){
        AccountDTO accountDTO = new AccountDTO();

        accountDTO.setFirstName(accountModel.getFirstName());
        accountDTO.setFirstName(accountModel.getLastName());
        accountDTO.setFirstName(accountModel.getAccountId());
        accountDTO.setFirstName(accountModel.getUserName_());
        accountDTO.setFirstName(accountModel.getGender());
        accountDTO.setFirstName(accountModel.getBirthday());
        accountDTO.setFirstName(accountModel.getPassword1());
        accountDTO.setFirstName(accountModel.getPassword2());
        accountDTO.setFirstName(accountModel.getHomePhone());
        accountDTO.setFirstName(accountModel.getMobilePhone());
        accountDTO.setFirstName(accountModel.getAddress());
        accountDTO.setFirstName(accountModel.getAddress2());
        accountDTO.setFirstName(accountModel.getCity());
        accountDTO.setFirstName(accountModel.getState());
        accountDTO.setFirstName(accountModel.getZip());
        accountDTO.setFirstName(accountModel.getSecurityQuestion());
        accountDTO.setFirstName(accountModel.getSecurityAnswer());
        accountDTO.setFirstName(accountModel.getAcceptedTou());

        return accountDTO;
    }
}
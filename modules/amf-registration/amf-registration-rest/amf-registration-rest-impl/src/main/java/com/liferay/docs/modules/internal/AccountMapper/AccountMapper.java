package com.liferay.docs.modules.internal.AccountMapper;

import com.liferay.docs.amf.model.Account;
import com.liferay.docs.modules.dto.v1_0.AccountDTO;

public class AccountMapper {

    public AccountDTO accountToDTO(Account accountModel) {
        AccountDTO accountDTO = new AccountDTO();

        accountDTO.setFirstName(accountModel.getFirstName());
        accountDTO.setLastName(accountModel.getLastName());
        accountDTO.setUserName_(accountModel.getUserName_());
        accountDTO.setGenre(accountModel.getGender());
        accountDTO.setBirthday(accountModel.getBirthday());
        accountDTO.setPassword(accountModel.getPassword1());
        accountDTO.setPassword2(accountModel.getPassword2());
        accountDTO.setHomePhone(accountModel.getHomePhone());
        accountDTO.setMobilePhone(accountModel.getMobilePhone());
        accountDTO.setAddress1(accountModel.getAddress());
        accountDTO.setAddress2(accountModel.getAddress2());
        accountDTO.setCity(accountModel.getCity());
        accountDTO.setState(accountModel.getState());
        accountDTO.setZip(accountModel.getZip());
        accountDTO.setSecurityQuestion(accountModel.getSecurityQuestion());
        accountDTO.setSecurityAnswer(accountModel.getSecurityAnswer());
        accountDTO.setAcceptedTou(accountModel.getAcceptedTou());

        return accountDTO;
    }
}
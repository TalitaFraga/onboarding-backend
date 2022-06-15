package com.liferay.docs.amf.web.actions;

import com.liferay.docs.amf.web.constants.AccountWebPortletKeys;
import com.liferay.docs.amf.service.AccountLocalService;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + AccountWebPortletKeys.ACCOUNT,
                "mvc.command.name=/add-account"
        },
        service = MVCActionCommand.class
)

public class RegisterAccountMVCActionCommand extends BaseMVCActionCommand {

    @Override
    protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {

        String firstName = ParamUtil.getString(actionRequest, "firstName");
        String lastName = ParamUtil.getString(actionRequest, "lastName");
        String emailAddress = ParamUtil.getString(actionRequest, "emailAddress");
        String userName_ = ParamUtil.getString(actionRequest, "userName_");
        String gender = ParamUtil.getString(actionRequest, "gender");
        String birthday = ParamUtil.getString(actionRequest, "birthday");
        String password1 = ParamUtil.getString(actionRequest, "password1");
        String password2 = ParamUtil.getString(actionRequest, "password2");
        String homePhone = ParamUtil.getString(actionRequest, "homePhone");
        String mobilePhone = ParamUtil.getString(actionRequest, "mobilePhone");
        String address = ParamUtil.getString(actionRequest, "address");
        String address2 = ParamUtil.getString(actionRequest, "address2");
        String city = ParamUtil.getString(actionRequest, "city");
        String state = ParamUtil.getString(actionRequest, "state");
        String zip = ParamUtil.getString(actionRequest, "zip");
        String securityQuestion = ParamUtil.getString(actionRequest, "securityQuestion");
        String securityAnswer = ParamUtil.getString(actionRequest, "securityAnswer");
        String acceptedTou = ParamUtil.getString(actionRequest, "acceptedTou");

        _accountLocalService.createAccount(firstName, lastName, emailAddress, userName_, gender, birthday, password1,
                password2, homePhone, mobilePhone, address, address2, city, state, zip, securityQuestion,
                securityAnswer, acceptedTou);


        System.out.println("created");
    }
    @Reference
    private AccountLocalService _accountLocalService;
}
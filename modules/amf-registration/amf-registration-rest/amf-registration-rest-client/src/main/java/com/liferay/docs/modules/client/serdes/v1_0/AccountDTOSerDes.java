package com.liferay.docs.modules.client.serdes.v1_0;

import com.liferay.docs.modules.client.dto.v1_0.AccountDTO;
import com.liferay.docs.modules.client.json.BaseJSONParser;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

import javax.annotation.Generated;

/**
 * @author TalitaFraga
 * @generated
 */
@Generated("")
public class AccountDTOSerDes {

	public static AccountDTO toDTO(String json) {
		AccountDTOJSONParser accountDTOJSONParser = new AccountDTOJSONParser();

		return accountDTOJSONParser.parseToDTO(json);
	}

	public static AccountDTO[] toDTOs(String json) {
		AccountDTOJSONParser accountDTOJSONParser = new AccountDTOJSONParser();

		return accountDTOJSONParser.parseToDTOs(json);
	}

	public static String toJSON(AccountDTO accountDTO) {
		if (accountDTO == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (accountDTO.getPassword2() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"Password2\": ");

			sb.append("\"");

			sb.append(_escape(accountDTO.getPassword2()));

			sb.append("\"");
		}

		if (accountDTO.getAcceptedTou() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"acceptedTou\": ");

			sb.append("\"");

			sb.append(_escape(accountDTO.getAcceptedTou()));

			sb.append("\"");
		}

		if (accountDTO.getAddress1() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"address1\": ");

			sb.append("\"");

			sb.append(_escape(accountDTO.getAddress1()));

			sb.append("\"");
		}

		if (accountDTO.getAddress2() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"address2\": ");

			sb.append("\"");

			sb.append(_escape(accountDTO.getAddress2()));

			sb.append("\"");
		}

		if (accountDTO.getBirthday() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"birthday\": ");

			sb.append("\"");

			sb.append(_escape(accountDTO.getBirthday()));

			sb.append("\"");
		}

		if (accountDTO.getCity() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"city\": ");

			sb.append("\"");

			sb.append(_escape(accountDTO.getCity()));

			sb.append("\"");
		}

		if (accountDTO.getEmailAddress() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"emailAddress\": ");

			sb.append("\"");

			sb.append(_escape(accountDTO.getEmailAddress()));

			sb.append("\"");
		}

		if (accountDTO.getFirstName() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"firstName\": ");

			sb.append("\"");

			sb.append(_escape(accountDTO.getFirstName()));

			sb.append("\"");
		}

		if (accountDTO.getGenre() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"genre\": ");

			sb.append("\"");

			sb.append(_escape(accountDTO.getGenre()));

			sb.append("\"");
		}

		if (accountDTO.getHomePhone() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"homePhone\": ");

			sb.append("\"");

			sb.append(_escape(accountDTO.getHomePhone()));

			sb.append("\"");
		}

		if (accountDTO.getLastName() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"lastName\": ");

			sb.append("\"");

			sb.append(_escape(accountDTO.getLastName()));

			sb.append("\"");
		}

		if (accountDTO.getMobilePhone() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"mobilePhone\": ");

			sb.append("\"");

			sb.append(_escape(accountDTO.getMobilePhone()));

			sb.append("\"");
		}

		if (accountDTO.getPassword() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"password\": ");

			sb.append("\"");

			sb.append(_escape(accountDTO.getPassword()));

			sb.append("\"");
		}

		if (accountDTO.getSecurityAnswer() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"securityAnswer\": ");

			sb.append("\"");

			sb.append(_escape(accountDTO.getSecurityAnswer()));

			sb.append("\"");
		}

		if (accountDTO.getSecurityQuestion() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"securityQuestion\": ");

			sb.append("\"");

			sb.append(_escape(accountDTO.getSecurityQuestion()));

			sb.append("\"");
		}

		if (accountDTO.getState() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"state\": ");

			sb.append("\"");

			sb.append(_escape(accountDTO.getState()));

			sb.append("\"");
		}

		if (accountDTO.getUserName_() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"userName_\": ");

			sb.append("\"");

			sb.append(_escape(accountDTO.getUserName_()));

			sb.append("\"");
		}

		if (accountDTO.getZip() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"zip\": ");

			sb.append("\"");

			sb.append(_escape(accountDTO.getZip()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		AccountDTOJSONParser accountDTOJSONParser = new AccountDTOJSONParser();

		return accountDTOJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(AccountDTO accountDTO) {
		if (accountDTO == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (accountDTO.getPassword2() == null) {
			map.put("Password2", null);
		}
		else {
			map.put("Password2", String.valueOf(accountDTO.getPassword2()));
		}

		if (accountDTO.getAcceptedTou() == null) {
			map.put("acceptedTou", null);
		}
		else {
			map.put("acceptedTou", String.valueOf(accountDTO.getAcceptedTou()));
		}

		if (accountDTO.getAddress1() == null) {
			map.put("address1", null);
		}
		else {
			map.put("address1", String.valueOf(accountDTO.getAddress1()));
		}

		if (accountDTO.getAddress2() == null) {
			map.put("address2", null);
		}
		else {
			map.put("address2", String.valueOf(accountDTO.getAddress2()));
		}

		if (accountDTO.getBirthday() == null) {
			map.put("birthday", null);
		}
		else {
			map.put("birthday", String.valueOf(accountDTO.getBirthday()));
		}

		if (accountDTO.getCity() == null) {
			map.put("city", null);
		}
		else {
			map.put("city", String.valueOf(accountDTO.getCity()));
		}

		if (accountDTO.getEmailAddress() == null) {
			map.put("emailAddress", null);
		}
		else {
			map.put(
				"emailAddress", String.valueOf(accountDTO.getEmailAddress()));
		}

		if (accountDTO.getFirstName() == null) {
			map.put("firstName", null);
		}
		else {
			map.put("firstName", String.valueOf(accountDTO.getFirstName()));
		}

		if (accountDTO.getGenre() == null) {
			map.put("genre", null);
		}
		else {
			map.put("genre", String.valueOf(accountDTO.getGenre()));
		}

		if (accountDTO.getHomePhone() == null) {
			map.put("homePhone", null);
		}
		else {
			map.put("homePhone", String.valueOf(accountDTO.getHomePhone()));
		}

		if (accountDTO.getLastName() == null) {
			map.put("lastName", null);
		}
		else {
			map.put("lastName", String.valueOf(accountDTO.getLastName()));
		}

		if (accountDTO.getMobilePhone() == null) {
			map.put("mobilePhone", null);
		}
		else {
			map.put("mobilePhone", String.valueOf(accountDTO.getMobilePhone()));
		}

		if (accountDTO.getPassword() == null) {
			map.put("password", null);
		}
		else {
			map.put("password", String.valueOf(accountDTO.getPassword()));
		}

		if (accountDTO.getSecurityAnswer() == null) {
			map.put("securityAnswer", null);
		}
		else {
			map.put(
				"securityAnswer",
				String.valueOf(accountDTO.getSecurityAnswer()));
		}

		if (accountDTO.getSecurityQuestion() == null) {
			map.put("securityQuestion", null);
		}
		else {
			map.put(
				"securityQuestion",
				String.valueOf(accountDTO.getSecurityQuestion()));
		}

		if (accountDTO.getState() == null) {
			map.put("state", null);
		}
		else {
			map.put("state", String.valueOf(accountDTO.getState()));
		}

		if (accountDTO.getUserName_() == null) {
			map.put("userName_", null);
		}
		else {
			map.put("userName_", String.valueOf(accountDTO.getUserName_()));
		}

		if (accountDTO.getZip() == null) {
			map.put("zip", null);
		}
		else {
			map.put("zip", String.valueOf(accountDTO.getZip()));
		}

		return map;
	}

	public static class AccountDTOJSONParser
		extends BaseJSONParser<AccountDTO> {

		@Override
		protected AccountDTO createDTO() {
			return new AccountDTO();
		}

		@Override
		protected AccountDTO[] createDTOArray(int size) {
			return new AccountDTO[size];
		}

		@Override
		protected void setField(
			AccountDTO accountDTO, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "Password2")) {
				if (jsonParserFieldValue != null) {
					accountDTO.setPassword2((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "acceptedTou")) {
				if (jsonParserFieldValue != null) {
					accountDTO.setAcceptedTou((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "address1")) {
				if (jsonParserFieldValue != null) {
					accountDTO.setAddress1((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "address2")) {
				if (jsonParserFieldValue != null) {
					accountDTO.setAddress2((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "birthday")) {
				if (jsonParserFieldValue != null) {
					accountDTO.setBirthday((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "city")) {
				if (jsonParserFieldValue != null) {
					accountDTO.setCity((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "emailAddress")) {
				if (jsonParserFieldValue != null) {
					accountDTO.setEmailAddress((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "firstName")) {
				if (jsonParserFieldValue != null) {
					accountDTO.setFirstName((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "genre")) {
				if (jsonParserFieldValue != null) {
					accountDTO.setGenre((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "homePhone")) {
				if (jsonParserFieldValue != null) {
					accountDTO.setHomePhone((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastName")) {
				if (jsonParserFieldValue != null) {
					accountDTO.setLastName((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "mobilePhone")) {
				if (jsonParserFieldValue != null) {
					accountDTO.setMobilePhone((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "password")) {
				if (jsonParserFieldValue != null) {
					accountDTO.setPassword((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "securityAnswer")) {
				if (jsonParserFieldValue != null) {
					accountDTO.setSecurityAnswer((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "securityQuestion")) {
				if (jsonParserFieldValue != null) {
					accountDTO.setSecurityQuestion(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "state")) {
				if (jsonParserFieldValue != null) {
					accountDTO.setState((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "userName_")) {
				if (jsonParserFieldValue != null) {
					accountDTO.setUserName_((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "zip")) {
				if (jsonParserFieldValue != null) {
					accountDTO.setZip((String)jsonParserFieldValue);
				}
			}
		}

	}

	private static String _escape(Object object) {
		String string = String.valueOf(object);

		for (String[] strings : BaseJSONParser.JSON_ESCAPE_STRINGS) {
			string = string.replace(strings[0], strings[1]);
		}

		return string;
	}

	private static String _toJSON(Map<String, ?> map) {
		StringBuilder sb = new StringBuilder("{");

		@SuppressWarnings("unchecked")
		Set set = map.entrySet();

		@SuppressWarnings("unchecked")
		Iterator<Map.Entry<String, ?>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, ?> entry = iterator.next();

			sb.append("\"");
			sb.append(entry.getKey());
			sb.append("\": ");

			Object value = entry.getValue();

			Class<?> valueClass = value.getClass();

			if (value instanceof Map) {
				sb.append(_toJSON((Map)value));
			}
			else if (valueClass.isArray()) {
				Object[] values = (Object[])value;

				sb.append("[");

				for (int i = 0; i < values.length; i++) {
					sb.append("\"");
					sb.append(_escape(values[i]));
					sb.append("\"");

					if ((i + 1) < values.length) {
						sb.append(", ");
					}
				}

				sb.append("]");
			}
			else if (value instanceof String) {
				sb.append("\"");
				sb.append(_escape(entry.getValue()));
				sb.append("\"");
			}
			else {
				sb.append(String.valueOf(entry.getValue()));
			}

			if (iterator.hasNext()) {
				sb.append(", ");
			}
		}

		sb.append("}");

		return sb.toString();
	}

}
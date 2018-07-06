package components.generators;


import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.json.simple.JSONObject;

import com.google.common.collect.ImmutableMap;


/**
 * {@link NewUserGenerator} provides ...
 *
 */
public class NewUserGenerator
{
	private static int NAME_LENGTH = 5;
	private static int USERNAME_LENGTH = 8;
	private static int PASSWORD_LENGTH = 6;
	private static int EMAIL_SUFFIX_LENGTH = 2;

	private static String GMAIL_DOMAIN = "@gmail.com";


	@SuppressWarnings("unchecked")
	public static String generateRandomUser()
	{
		final JSONObject test = new JSONObject();
		test.putAll(new NewUserGenerator().newUserMap());

		return test.toJSONString();
	}
	
	
	private Map<String, String> newUserMap()
	{
		return ImmutableMap.<String, String>builder()
				.put("FirstName", randomName())
				.put("LastName", randomName())
				.put("UserName", randomUsername())
				.put("Password", randomPassword())
				.put("Email", randomEmail())
				.build();
	}


	private String randomName()
	{
		return StringUtils.capitalize(RandomStringUtils.randomAlphabetic(NAME_LENGTH));
	}


	private String randomUsername()
	{
		return StringUtils.capitalize(RandomStringUtils.randomAlphanumeric(USERNAME_LENGTH));
	}


	private String randomPassword()
	{
		return StringUtils.capitalize(RandomStringUtils.randomAlphanumeric(PASSWORD_LENGTH));
	}


	private String randomEmail()
	{
		return randomName() + RandomStringUtils.randomNumeric(EMAIL_SUFFIX_LENGTH) + GMAIL_DOMAIN;
	}
}

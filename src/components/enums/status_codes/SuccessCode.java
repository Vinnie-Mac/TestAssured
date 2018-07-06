package components.enums.status_codes;

/**
 * {@link SuccessCode} provides status code values that indicate the client's request was successfully received,
 * understood, and accepted.
 *
 */
public enum SuccessCode
{
	OK(200, "200"),
	CREATED(201, "201"),
	ACCEPTED(202, "202"),
	NON_AUTHORITATIVE_INFORMATION(203, "203"),
	NO_CONTENT(204, "204"),
	RESET_CONTENT(205, "205"),
	PARTIAL_CONTENT(206, "206"),
	MULTI_STATUS(207, "207"),
	ALREADY_REPORTED(208, "208"),
	IM_USED(226, "226");


	int codeValue;
	String codeValueAsString;


	SuccessCode(final int codeValue, final String codeValueAsString)
	{
		this.codeValue = codeValue;
		this.codeValueAsString = codeValueAsString;
	}


	public int getValue()
	{
		return this.codeValue;
	}


	public String getValueAsString()
	{
		return this.codeValueAsString;
	}
}

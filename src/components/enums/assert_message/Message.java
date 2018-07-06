package components.enums.assert_message;

/**
 * {@link Message} provides ...
 *
 */
public enum Message
{

	OPERATION_SUCCESS("Operation completed successfully", "OPERATION_SUCCESS"),
	INCORRECT_STATUS_CODE_FOUND("Incorrect status code has been found.", ""),
	RESPONSE_DOES_NOT_CONTAIN_APPROPRIATE_STRING("Response does not contain appropriate string.", "");

	String message;
	String responseValue;

	Message(final String message, String responseValue)
	{
		this.message = message;
		this.responseValue = responseValue;
	}


	public String getMessage()
	{
		return this.message;
	}
	
	public String getResponseValue()
	{
		return this.responseValue;
	}
}

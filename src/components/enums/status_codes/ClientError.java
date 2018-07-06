package components.enums.status_codes;

/**
 * {@link ClientError} provides status code values that indicates the client will have thrown an error for a request
 * that was sent towards it. The response that brings back any of these codes indicates several issues with the request
 * or even with the client itself.
 *
 */
public enum ClientError
{
	BAD_REQUEST(400, "400"),
	UNAUTHORIZED(401, "401"),
	PAYMENT_REQUIRED(402, "402"),
	FORBIDDEN(403, "403"),
	NOT_FOUND(404, "404"),
	METHOD_NOT_ALLOWED(405, "405"),
	NOT_ACCEPTABLE(406, "406"),
	PROXY_AUTHENTICATION_REQUIRED(407, "407"),
	REQUEST_TIMEOUT(408, "408"),
	CONFLICT(409, "409"),
	GONE(410, "410"),
	LENGTH_REQUIRED(411, "411"),
	PRECONDITON_FAILED(412, "412"),
	REQUEST_ENTITY_TOO_LARGE(413, "413"),
	REQUEST_URI_TOO_LONG(414, "414"),
	UNSUPPORTED_MEDIA_TYPE(415, "415"),
	REQUESTED_RANGE_NOT_SATISFIABLE(416, "416"),
	EXPECTATION_FAILED(417, "417"),
	UNPROCESSABLE_ENTITY(422, "422"),
	LOCKED(423, "423"),
	FAILED_DEPENDENCY(424, "424"),
	UPGRADE_REQUIRED(426, "426"),
	PRECONDITION_REQUIRED(428, "428"),
	TOO_MANY_REQUESTS(429, "429"),
	REQUEST_HEADER_FIELDS_TOO_LARGE(431, "431"),
	NO_RESPONSE(444, "444"),
	RETRY_WITH(449, "449"),
	BLOCKED_BY_WINDOWS_PARENTAL_CONTROLS(450, "450"),
	UNAVAILABLE_FOR_LEGAL_REASONS(451, "451"),
	CLIENT_CLOSED_REQUEST(499, "499");

	int codeValue;
	String codeValueAsString;


	ClientError(final int codeValue, final String codeValueAsString)
	{
		this.codeValue = codeValue;
		this.codeValueAsString = codeValueAsString;
	}


	public int getCodeValue()
	{
		return this.codeValue;
	}


	public String getCodeValueAsString()
	{
		return this.codeValueAsString;
	}
}

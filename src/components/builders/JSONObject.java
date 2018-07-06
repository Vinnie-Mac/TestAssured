package components.builders;

/**
 * {@link JSONObject} provides ...
 *
 */
public class JSONObject
{
	private final String firstName;
	private final String lastName;
	private final String username;
	private final String password;
	private final String email;


	public JSONObject(final String newFirstName, final String newLastName, final String newUsername,
			final String newPassword, final String newEmail)
	{
		this.firstName = newFirstName;
		this.lastName = newLastName;
		this.username = newUsername;
		this.password = newPassword;
		this.email = newEmail;
	}

	public static class Builder
	{
		private String nestedFirstName;
		private String nestedLastName;
		private String nestedUsername;
		private String nestedPassword;
		private String nestedEmail;


		public Builder()
		{}


		public Builder withFirstName(final String newFirstName)
		{
			this.nestedFirstName = newFirstName;
			return this;
		}


		public Builder withLastName(final String newLastName)
		{
			this.nestedLastName = newLastName;
			return this;
		}


		public Builder withUserName(final String newUsername)
		{
			this.nestedUsername = newUsername;
			return this;
		}


		public Builder withPassword(final String newPassword)
		{
			this.nestedPassword = newPassword;
			return this;
		}


		public Builder withEmail(final String newEmail)
		{
			this.nestedEmail = newEmail;
			return this;
		}


		public JSONObject build()
		{
			return new JSONObject(
					this.nestedFirstName,
					this.nestedLastName,
					this.nestedUsername,
					this.nestedPassword,
					this.nestedEmail);
		}
	}


	/**
	 * Returns the value for the field {@link firstName}
	 */
	public String getFirstName()
	{
		return this.firstName;
	}


	/**
	 * Returns the value for the field {@link lastName}
	 */
	public String getLastName()
	{
		return this.lastName;
	}


	/**
	 * Returns the value for the field {@link username}
	 */
	public String getUsername()
	{
		return this.username;
	}


	/**
	 * Returns the value for the field {@link password}
	 */
	public String getPassword()
	{
		return this.password;
	}


	/**
	 * Returns the value for the field {@link email}
	 */
	public String getEmail()
	{
		return this.email;
	}
}

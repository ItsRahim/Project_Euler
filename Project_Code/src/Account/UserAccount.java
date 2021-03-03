package Account;

public class UserAccount {

	private String firstName;
	private String password;
	private String role;
	private int userID;
	private String lastName;

	public String getPassword() {
		return this.password;
	}

	/**
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return this.role;
	}

	/**
	 * 
	 * @param role
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param password
	 * @param role
	 * @param userID
	 */
	public UserAccount(String firstName, String lastName, String password, String role, int userID) {
		// TODO - implement UserAccount.UserAccount
		throw new UnsupportedOperationException();
	}

	public int getUserID() {
		return this.userID;
	}

	public String getFirstName() {
		return this.firstName;
	}

	/**
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	/**
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
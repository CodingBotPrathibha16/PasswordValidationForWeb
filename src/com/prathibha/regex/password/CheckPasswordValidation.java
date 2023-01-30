package com.prathibha.regex.password;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPasswordValidation {

	// digit ; lowercase char + uppercase char ;white space;
	private static final String PASSWORD_CHECK = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])"
			+ "(?=\\S+$).{8,}$";;

	private static final Pattern pattern = Pattern.compile(PASSWORD_CHECK);

	public static boolean isValid(final String password) {
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
	};

	/**
	 * This method will verify the old password is not same as newPassword
	 * 
	 * @param {String} newPassword is the new password from test data.
	 * @param {String} oldPassword from the test data
	 * 
	 * @return {boolean} indicating pass or fail status of function execution.
	 * 
	 */

	public boolean validatePasswordMismatch(String newPassword, String oldPassword) {
		return (newPassword != null && oldPassword != null && !newPassword.equals(oldPassword));
	};

	/**
	 * This method will verify the password confirmation comparing newPassword .
	 * 
	 * @param {String} newPassword is the new password from test data.
	 * @param {String} confirmPassword is the confirmation of password from the test
	 *        data.
	 * 
	 * @returns {boolean} indicating pass or fail status of function execution.
	 * 
	 */

	public boolean validatePasswordIsSame(String newPassword, String confirmPassword) {
		return (newPassword != null && confirmPassword != null && newPassword.equals(confirmPassword));
	};

	/**
	 * This method will verify the user name is not same as newPassword
	 * 
	 * @param {String} userName from test data.
	 * @param {String} newPassword from the test data
	 * 
	 * @return {boolean} indicating pass or fail status of function execution.
	 * 
	 */

	public boolean validateUserNameNotSame(String userName, String newPassword) {
		return (userName != null && newPassword != null && newPassword.indexOf(userName) > -1);

	};

	/**
	 * This method will verify the Empty field.
	 * 
	 * @param {String} oldPassword from test data.
	 * @param {String} newPassword from the test data
	 * @param {String} confirmPassword from the test data
	 * 
	 * 
	 * @return {boolean} indicating pass or fail status of function execution.
	 * 
	 */

	public boolean validatePasswordEmptyField(String oldPassword, String newPassword, String confirmPassword) {
		// if password field is empty
		// it will display error message "Field can not be empty"
		if (oldPassword.isEmpty() && oldPassword.length() < 1) {
			System.out.println("Field can not be empty");
			return false;
		} else if (newPassword.isEmpty() && newPassword.length() < 1) {
			System.out.println("Field can not be empty");
			return false;
		} else if (confirmPassword.isEmpty() && confirmPassword.length() < 1) {
			System.out.println("Field can not be empty");
			return false;
		}
		return true;

	};

}
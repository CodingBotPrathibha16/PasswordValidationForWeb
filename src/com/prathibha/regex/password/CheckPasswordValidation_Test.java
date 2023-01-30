
package com.prathibha.regex.password;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CheckPasswordValidation_Test {

	@ParameterizedTest(name = "{index} Positive Scenario - Test case execution with valid password = {0}")
	@MethodSource("validPasswordTestdata")
	void testPasswordValid(String password) {
		assertTrue(CheckPasswordValidation.isValid(password));
	}

	@ParameterizedTest(name = "{index} Negative Scenario- Test case execution with Invalid password = {0}")
	@MethodSource("invalidPasswordTestdata")
	void testPasswordInvalid(String password) {
		assertFalse(CheckPasswordValidation.isValid(password));
	}
   
	@Test
	public void checkMultiArgumentsMethodSource() {
		String newPassword = "Hello@1432_";
		String confirmPassword = "Hello@1432_";
		assertEquals(newPassword,confirmPassword);
		
	}
	
	@Test
	public void checkMultiArgumentsMethodNotEqual() {
		String newPassword = "Hello@1432_";
		String oldPassword = "Hello@143223_";
		assertNotEquals(newPassword,oldPassword);
		
	}
	// Testdata been provided below:test 8 chars and less than 100; all the pssible positive scenario and check
	// the password is strong with no white space
	static Stream<String> validPasswordTestdata() {
		return Stream.of("Qwerty@14789", "A!@#&()–a1", "~$<>a1ABCD", "QqWw12@1", "Wertyhk@1478##%%");
	}

	// At least one lowercase character, one uppercase character, one digit, one
	// special character and length between 8 to 100.
	static Stream<String> invalidPasswordTestdata() {
		return Stream.of("0987654321", "qwertyasdf", "PRATHIBHA", "abc123$$$", "ABCDEF123@@@@", "QWERTY$$$$$$",
				"java123 %", "________", "--------", " ", "asdf", "");

	}

}

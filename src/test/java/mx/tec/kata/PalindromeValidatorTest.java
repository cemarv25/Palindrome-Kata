package mx.tec.kata;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeValidatorTest {

PalindromeValidator validator = new PalindromeValidator();
	
	@Test
	void givenSingleLetterString_whenValidatingPalindrome_thenTrue() {
		// Given
		String string = "a";
		// When
		boolean actualResult = validator.validate(string);
		// Then
		boolean expectedResult = true;
		assertEquals(expectedResult, actualResult);
	}
}

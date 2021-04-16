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
	
	@Test
	void given2DifferentLettersString_whenValidatingPalindrome_thenFalse() {
		// Given
		String string = "ab";
		
		// When
		boolean actualResult = validator.validate(string);
		
		// Then
		boolean expectedResult = false;
		assertEquals(expectedResult, actualResult);
		
	}
	
	@Test
	void given2EqualLettersString_whenValidatingPalindrome_thenTrue() {
		// Given
		String string = "aa";
		
		// When
		boolean actualResult = validator.validate(string);
		
		// Then
		boolean expectedResult = true;
		assertEquals(expectedResult, actualResult);
		
	}

	@Test
	void given3LetterWord_whenValidatingPalindrome_thenTrue() {
		// Given
		String string = "ada";
		
		// When
		boolean actualResult = validator.validate(string);
		
		// Then
		boolean expectedResult = true;
		assertEquals(expectedResult, actualResult);
		
	}
}

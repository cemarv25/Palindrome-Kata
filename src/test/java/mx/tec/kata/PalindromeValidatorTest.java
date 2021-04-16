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
	void given3LetterPalindromeWord_whenValidatingPalindrome_thenTrue() {
		// Given
		String string = "ada";
		
		// When
		boolean actualResult = validator.validate(string);
		
		// Then
		boolean expectedResult = true;
		assertEquals(expectedResult, actualResult);
		
	}
	
	@Test
	void given4LetterPalindromeWord_whenValidatingPalindrome_thenTrue() {
		// Given
		String string = "adda";
		
		// When
		boolean actualResult = validator.validate(string);
		
		// Then
		boolean expectedResult = true;
		assertEquals(expectedResult, actualResult);
		
	}
	
	@Test
	void given4LetterNonPalindromeWord_whenValidatingPalindrome_thenFalse() {
		// Given
		String string = "adna";
		
		// When
		boolean actualResult = validator.validate(string);
		
		// Then
		boolean expectedResult = false;
		assertEquals(expectedResult, actualResult);
		
	}
	
	@Test
	void givenAPalindromePhrase_whenValidatingPalindrome_thenTrue() {
		// Given
		String string = "a man a plan a canal panama";
		
		// When
		boolean actualResult = validator.validate(string);
		
		// Then
		boolean expectedResult = true;
		assertEquals(expectedResult, actualResult);
		
	}
	
	@Test
	void givenANonPalindromePhrase_whenValidatingPalindrome_thenFalse() {
		// Given
		String string = "this is a non palindrome phrase";
		
		// When
		boolean actualResult = validator.validate(string);
		
		// Then
		boolean expectedResult = false;
		assertEquals(expectedResult, actualResult);
		
	}

}

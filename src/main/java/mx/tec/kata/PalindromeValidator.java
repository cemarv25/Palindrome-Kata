package mx.tec.kata;

public class PalindromeValidator {
	public boolean validate(String string) {
		String cleanedString = string.replaceAll("\\s+", "");
		for (int i = 0; i < cleanedString.length() / 2; i++) {
			if (cleanedString.charAt(i) != cleanedString.charAt(cleanedString.length() - 1 - i)) {
				return false;
			}
		}
		return true;
		
	}

}

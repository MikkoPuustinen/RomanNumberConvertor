package romannumbers.model;

import java.util.regex.Pattern;
/**
 * 
 * @author Mikko Puustinen
 *
 */
public class Validator implements ValidatorIF{
	
	/*
	 * (non-Javadoc)
	 * @see romannumbers.model.ValidatorIF#validateRomanNumber(java.lang.String)
	 */
	public int validateRomanNumber(String number) {
		
		if (!checkForInvalidCharacters(number)) {
			return -1;
		} else {
			if (!checkRomanNumberValidity(number)) {
				return 0;
			} else {
				return 1;
			}
		}
	}
		
	private boolean checkForInvalidCharacters(String number) {
		return Pattern.matches(RomanNumbers.getRomanNumbersAsRegexp(), number);
	}
	
	
	private boolean checkRomanNumberValidity(String number) {
		return Pattern.matches(RomanNumbers.getRomanNumbersAsRegexpWithValidation(), number);	
	}
		
}

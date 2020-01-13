package romannumbers.model;
/**
 * Interface for a roman number validator.
 * @author Mikko Puustinen
 *
 */
public interface ValidatorIF {
	
	/**
	 * Returns an integer value based on the Roman number received as input. Return value will be 1 
	 * for valid roman numbers, 0 for strings that contain only valid roman numerals but are 
	 * @param input the input string to validate
	 * @return 1 if the input is a valid roman number, 0 if the input contains only correct roman 
	 * numerals but is not a valid roman number, -1 if the String is empty or contains wrong characters.
	 * 
	 */
	public int validateRomanNumber(String input);
}

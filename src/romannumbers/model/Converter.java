package romannumbers.model;
/**
 * Class for converting roman numbers.
 * @author Mikko Puustinen
 *
 */
public class Converter implements ConverterIF{

	
	/**
	 *
	 * @see romannumbers.model.ConverterIF#convertRomanNumberIntoDecimal(java.lang.String)
	 */
	public int convertRomanNumberIntoDecimal(String number) {
		int currentNumber, nextNumber = 0;
		int result = 0;
		currentNumber = RomanNumbers.getEnumByString(number.substring(0, 1)).getNumber();
		if (number.length() < 2) {
			nextNumber = RomanNumbers.getEnumByString(number.substring(0, 1)).getNumber(); // If number length is one, no need to iterate to next number 
		} else {
			for (int i = 0; i < number.length() - 1; i++) {
				nextNumber = RomanNumbers.getEnumByString(number.substring(i+1, i+2)).getNumber();
				if (currentNumber < nextNumber) {
					result -= currentNumber;
				} 
				else {
					result += currentNumber;
				}
				currentNumber = nextNumber;			
			}
		}
		result += nextNumber;
		return result;
	}
}

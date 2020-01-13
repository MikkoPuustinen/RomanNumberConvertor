package romannumbers.model;
/**
 * Interface for a roman number converter class.
 * @author Mikko Puustinen
 *
 */
public interface ConverterIF {
	
	/**
	 * Method converts a roman numeral to a decimal format. The input String given
	 * needs to contain only valid uppercase roman numeral symbols (I, V, X, L, C, D, M).
	 * Method will parse the string regardless of the numeral order being correct. The method 
	 * will parse the String character by character adding or reducing the current numeral being 
	 * iterated based on the character after the current numeral. If the current numeral is smaller
	 * than the next numeral, it will get reduced from the total, in other cases it will be added to
	 * the total. 
	 * @param number String representation of a roman numeral
	 * @return Converted number in int format.
0	 */
	public int convertRomanNumberIntoDecimal(String number);
}

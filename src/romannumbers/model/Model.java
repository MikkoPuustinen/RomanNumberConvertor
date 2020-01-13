package romannumbers.model;
/**
 * 
 * @author Mikko Puustinen
 *
 */
public class Model implements ModelIF{

	private ConverterIF converter;

	private ValidatorIF validator;
	
	public Model () {
		this.converter = new Converter();
		this.validator = new Validator();
	}
	/**
	 * Returns converted roman numbers as integers. Will throw an IllegalArgumentException when
	 * receiving incorrectly formed roman numbers.
	 * @param input the user input
	 * @return the converted roman number as an integer
	 * @see romannumbers.model.ModelIF#handleUserInput(java.lang.String)
	 */
	public int handleUserInput(String input) {

		switch(validator.validateRomanNumber(input)) {
			case -1:
				throw new IllegalArgumentException("Your input contains invalid characters. Valid characters are: M, D, C, L, C, V, I");			
			case 0:
				throw new IllegalArgumentException("Your input contains a malformed roman numeral.");
			case 1:
				return converter.convertRomanNumberIntoDecimal(input);
			default:
				return 0;
					
		}
	
	}
	
}

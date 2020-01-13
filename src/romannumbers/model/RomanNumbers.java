package romannumbers.model;
/**
 * Enum representation of roman numerals.
 * @author Mikko Puustinen
 *
 */
public enum RomanNumbers {
	
	I(1),V(5),X(10),L(50),C(100),D(500),M(1000);
	
	private int number;
	
	RomanNumbers(int number) {
		this.number = number;
	}
	
	public int getNumber(){
        return number;
    }
	
	/**
	 * Returns a regular expression which can be used to check if a String
	 * contains only roman numerals defined by this class.
	 * @return the regular expression string
	 */
	public static String getRomanNumbersAsRegexp() {
		StringBuilder str = new StringBuilder();
		str.append("[");
		for (RomanNumbers r : RomanNumbers.values()) {
			str.append(r.name());
		}
		str.append("]+");
		return str.toString();
	}
	/**
	 * Returns a regular expression which can be used to check if a String 
	 * is a valid roman number. 
	 * @see <a href="https://projecteuler.net/about=roman_numerals">https://projecteuler.net/about=roman_numerals</a>
	 * @return the regular expression string.
	 */
	public static String getRomanNumbersAsRegexpWithValidation() {
		return "M*(C[MD]|D?C*)(X[CL]|L?X*)(I[XV]|V?I*)";
	}
	/**
	 * Returns a single enum instance based on its name. If no enum is found,
	 * null is returned.
	 * @param romanNumber the enum name to search for
	 * @return an enum instance
	 */
    public static RomanNumbers getEnumByString(String romanNumber){
        for(RomanNumbers r : RomanNumbers.values()){
            if(romanNumber.equals(r.name())) {
            	return r;
            }
        }
        return null;
    }
}

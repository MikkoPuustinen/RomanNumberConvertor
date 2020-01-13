package romannumbers.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class ValidatorTest {
	
	
	
	private ValidatorIF validator = new Validator();
	
	@ParameterizedTest
	@CsvFileSource(resources = "/romannumbervalidatortest.csv", numLinesToSkip = 1)
	void testRomanNumberValidator(String input, int output) {
		assertEquals(output, validator.validateRomanNumber(input));
	}

}

package romannumbers.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class ConverterTest {

	private ConverterIF converter = new Converter();
	
	@ParameterizedTest
	@CsvFileSource(resources = "/romannumberconvertertest.csv", numLinesToSkip = 1)
	void testConverterWithValidRomanNumbers(String input, int output) {	
		assertEquals(output, converter.convertRomanNumberIntoDecimal(input));
	}

}

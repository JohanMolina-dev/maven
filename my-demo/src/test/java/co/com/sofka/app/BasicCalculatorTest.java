package co.com.sofka.app;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BasicCalculatorTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    public void testSum() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.sum(number1, number2);

        // Assert
        assertEquals(expectedValue, result);


    }
    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101",
            "2, 505, 507"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }







    @DisplayName("Testing several subtract")
    @ParameterizedTest(name = "{1} - {1} = {0}")
    @CsvSource({
            "0,    1,   -1",
            "985,    872,   113",
            "49,  51, -2",
            "100,  1, 99",
            "7981, 956, 7025"
    })
    public void severalSubtract(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.subtract(first, second),
                () -> first + " - " + second + " should equal " + expectedResult);
    }


    @DisplayName("Testing several Multiply")
    @ParameterizedTest(name = "{1} * {1} = {0}")
    @CsvSource({
            "0,    1,   0",
            "985,    872, 858920",
            "49,  51, 2499",
            "100,  1, 100",
            "781, 56, 43736"
    })
    public void severalMultiply(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.multiply(first, second),
                () -> first + " * " + second + " should equal " + expectedResult);
    }

    @DisplayName("Testing several subtract")
    @ParameterizedTest(name = "{82} / {2} = {41}")
    @CsvSource({
            "106,    1,   106",
            "9,    8,   1",
            "4,  2, 2",
            "100,  20, 5",
            "8000, 2000, 4"
    })
    public void severalDivi(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.divi(first, second),
                () -> first + " - " + second + " should equal " + expectedResult);
    }


}
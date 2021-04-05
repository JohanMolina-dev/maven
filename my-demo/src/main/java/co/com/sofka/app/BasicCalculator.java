package co.com.sofka.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {

    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }

    //TODO Resta, multiplicacion y division.
    //resta

    public Long subtract(Long number1, Long number2) {
        logger.info( "subtract {} - {}", number1, number2 );
        return number1 - number2;
    }

    //multiplicacion multiply
    public Long multiply(Long number1, Long number2) {
        logger.info( "multiply {} * {}", number1, number2 );
        return number1 * number2;
    }
    //divi

    public Long divi(Long number1, Long number2) {
        logger.info( "divi {} / {}", number1, number2 );
        return number1 / number2;
    }






}

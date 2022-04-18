package calculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;

import java.lang.Math;
public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public double SquareRoot(double x)
    {
        logger.info("Square Root");
        return Math.sqrt(x);
    }
    public double factorial(double x)
    {
        logger.info("Factorial");
        double fac = 1;
        for(int i =2;i<=x;i++)
        {
            fac = fac*i;
        }
        return fac;
    }

    public double log(double x)
    {
        logger.info("Logarithm");
        return Math.log(x);
    }

    public double power(double x , int y)
    {
        logger.info("Power");
        return Math.pow(x, y);
    }
}

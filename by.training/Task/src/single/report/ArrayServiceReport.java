package single.report;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import single.entity.ArrayCreator;


public class ArrayServiceReport {
    private static final Logger logger = LogManager.getLogger();

    public void binarySearchReport(int elementToFind, int index, ArrayCreator array){
        logger.info("Element " + elementToFind + " is found at index: " + index);
    }

    public void maxReport (int max, ArrayCreator array){
        logger.info("The biggest number is: " + max);
    }

    public void minReport (int min, ArrayCreator array){
        logger.info("The lowest number is: " + min);
    }

    public void primeNumberReport (ArrayCreator array){
        logger.info("The following numbers are prime: " + array);
    }

    public void fibonacciNumberReport(ArrayCreator array){
        logger.info("The following numbers are Fibonacci:" + array);
    }

    public void uniqueNumberReport(ArrayCreator array){
        logger.info("The digits of the following numbers are unique: " + array);
    }
}

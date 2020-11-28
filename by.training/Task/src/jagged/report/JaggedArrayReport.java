package jagged.report;

import jagged.entity.JaggedArrayCreator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class JaggedArrayReport {
    private static final Logger logger = LogManager.getLogger();

    public void sumDecreaseReport(JaggedArrayCreator jaggedArray){
        logger.info(jaggedArray + "has been sorted by decrease of the elements sum");
    }

    public void sumIncreaseReport(JaggedArrayCreator jaggedArray){
        logger.info(jaggedArray + "has been sorted by increase of the elements sum");
    }

    public void minDecreaseReport(JaggedArrayCreator jaggedArray){
        logger.info(jaggedArray + "has been sorted by decrease of the minimal elements");
    }

    public void minIncreaseReport(JaggedArrayCreator jaggedArray){
        logger.info(jaggedArray + "has been sorted by increase of the minimal elements");
    }

    public void maxDecreaseReport(JaggedArrayCreator jaggedArray){
        logger.info(jaggedArray + "has been sorted by decrease of the maximal elements");
    }

    public void maxIncreaseReport(JaggedArrayCreator jaggedArray){
        logger.info(jaggedArray + "has been sorted by increase of the maximal elements");
    }
}

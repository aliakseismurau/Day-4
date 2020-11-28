package jagged.main;

import jagged.entity.JaggedArrayCreator;
import jagged.report.JaggedArrayReport;
import jagged.service.JaggedArrayService;

public class Solution {
    public static void main(String[] args) {
        int[][] array = new int[3][10];
        JaggedArrayCreator jaggedArray = new JaggedArrayCreator(array);
        JaggedArrayService jaggedArrayService = new JaggedArrayService();
        jaggedArrayService.sumDecreaseSorting(jaggedArray);
        jaggedArrayService.sumIncreaseSorting(jaggedArray);
        jaggedArrayService.maxDecreaseSorting(jaggedArray);
        jaggedArrayService.maxIncreaseSorting(jaggedArray);
        jaggedArrayService.minDecreaseSorting(jaggedArray);
        jaggedArrayService.minIncreaseSorting(jaggedArray);
        JaggedArrayReport jaggedArrayReport = new JaggedArrayReport();
        jaggedArrayReport.maxDecreaseReport(jaggedArray);
        jaggedArrayReport.maxIncreaseReport(jaggedArray);
        jaggedArrayReport.minDecreaseReport(jaggedArray);
        jaggedArrayReport.minIncreaseReport(jaggedArray);
        jaggedArrayReport.sumDecreaseReport(jaggedArray);
        jaggedArrayReport.sumIncreaseReport(jaggedArray);
    }
}

package single.main;

import single.entity.ArrayCreator;
import single.report.ArrayServiceReport;
import single.service.ArrayFillingService;
import single.service.ArraySortingService;
import single.service.NumbersSearchService;

public class Solution {
    public static void main(String[] args) {
        ArrayCreator array = new ArrayCreator(10);
        ArrayCreator secondArray = new ArrayCreator(10);
        ArrayCreator thirdArray = new ArrayCreator(10);
        ArrayFillingService arrayFillingService = new ArrayFillingService();
        arrayFillingService.fillRandomArray(array, 10);
        arrayFillingService.fillConsoleArray(secondArray, 10);
        arrayFillingService.fillFileArray(thirdArray, 10, "d://text");
        ArraySortingService arraySortingService = new ArraySortingService();
        arraySortingService.sortByDecrease(array);
        arraySortingService.sortByIncrease(secondArray);
        NumbersSearchService numbersSearchService = new NumbersSearchService();
        numbersSearchService.findMax(array);
        numbersSearchService.findMin(secondArray);
        numbersSearchService.fibonacciNumbers(thirdArray);
        numbersSearchService.primeNumbers(array);
        numbersSearchService.uniqueNumbers(secondArray);
        ArrayServiceReport arrayServiceReport = new ArrayServiceReport();
        arrayServiceReport.binarySearchReport(3, 5, array);
        arrayServiceReport.fibonacciNumberReport(array);
        arrayServiceReport.uniqueNumberReport(array);
        arrayServiceReport.primeNumberReport(array);
        arrayServiceReport.maxReport(numbersSearchService.findMax(array), array);
        arrayServiceReport.minReport(numbersSearchService.findMin(array), array);
    }
}

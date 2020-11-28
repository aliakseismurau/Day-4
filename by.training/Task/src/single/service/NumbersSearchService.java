package single.service;

import single.entity.ArrayCreator;


public class NumbersSearchService {
    ArraySortingService arraySortingService = new ArraySortingService();
    public int linearSearch(ArrayCreator array, int elementToSearch) {
        for (int i = 0; i < array.getSize(); i++) {
            if (array.getElement(i) == elementToSearch) {
                return i;
            }
        }
        return -1;
    }

    public int findMax(ArrayCreator array){
        arraySortingService.sortByDecrease(array);
        int max = array.getElement(0);
        return max;
    }

    public int findMin(ArrayCreator array){
        arraySortingService.sortByIncrease(array);
        int min = array.getElement(0);
        return min;
    }

    public boolean isNumberFibonacci(int number) {
        int[] fibonacciArray = new int[10];
        int count = 0;
        while (count < fibonacciArray.length && number >= fibonacciArray[count]) {
            if (number == fibonacciArray[count++]) {
                return false;
            }
        }
        return true;
    }

    public ArrayCreator fibonacciNumbers(ArrayCreator fibonacciArray){
        ArrayCreator fibonacci = new ArrayCreator(10);
        int count = 0;
        for (int i = 0; i < fibonacciArray.getSize(); i++){
            if(isNumberFibonacci(fibonacciArray.getElement(i))){
                fibonacci.setElement(count, fibonacciArray.getElement(i));
                count++;
            }
        }
        return fibonacci;
    }

    public boolean isNumberPrime(int number){
        if (number == 0) {
            return false;
        }
        number = Math.abs(number);
        int i = 2;
        while (i <= number / 2) {
            if (number % i++ == 0) {
                return false;
            }
        }
        return true;
    }

    public ArrayCreator primeNumbers(ArrayCreator primeArray){
        ArrayCreator prime = new ArrayCreator(10);
        int count = 0;
        for (int i = 0; i < primeArray.getSize(); i++){
            if(isNumberPrime(primeArray.getElement(i))){
                prime.setElement(count, primeArray.getElement(i));
                count++;
            }
        }
        return prime;
    }

    public boolean isNumberUnique(ArrayCreator uniqueArray) {
        int i = 0;
        while (i < uniqueArray.getSize() - 1) {
            int j = i + 1;
            while (j < uniqueArray.getSize()) {
                if (uniqueArray.getElement(i) == uniqueArray.getElement(j++)) {
                    return false;
                }
            }
            i++;
        }
        return true;
    }

    public ArrayCreator uniqueNumbers(ArrayCreator uniqueArray){
        ArrayCreator unique = new ArrayCreator(10);
        int count = 0;
        for (int i = 0; i < uniqueArray.getSize(); i++){
            if(isNumberPrime(uniqueArray.getElement(i))){
                unique.setElement(count, uniqueArray.getElement(i));
                count++;
            }
        }
        return unique;
    }
}

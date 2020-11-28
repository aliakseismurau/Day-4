package jagged.service;

import jagged.entity.JaggedArrayCreator;

public class JaggedArrayService {
    public int rowsSum(JaggedArrayCreator jaggedArray, int row){
        int cols = jaggedArray.getCols();
        int sum = 0;
        for(int i = 0; i < cols; i++) {
            sum += jaggedArray.getElement(row, i);
        }
        return sum;
    }

    public int searchMax(JaggedArrayCreator jaggedArray, int row){
        int cols = jaggedArray.getCols();
        int max = jaggedArray.getElement(row, 0);
        for(int i = 0; i < cols; i++) {
            if(jaggedArray.getElement(row, i) > max){
                max = jaggedArray.getElement(row, i);
            }
        }
        return max;
    }

    public int searchMin(JaggedArrayCreator jaggedArray, int row){
        int cols = jaggedArray.getCols();
        int min = jaggedArray.getElement(row, 0);
        for(int i = 0; i < cols; i++){
            if(jaggedArray.getElement(row, i) < min){
                min = jaggedArray.getElement(row, i);
            }
        }
        return min;
    }
    public void swapCols(JaggedArrayCreator jaggedArray, int row1, int col1, int row2, int col2){
        int a = jaggedArray.getElement(row1, col1);
        jaggedArray.setElement(row1, col1, jaggedArray.getElement(row2, col2));
        jaggedArray.setElement(row2, col2, a);
    }

    public void swapRows(JaggedArrayCreator jaggedArray, int row1, int row2){
        int cols = jaggedArray.getCols();
        for(int i = 0; i < cols; i++){
            swapCols(jaggedArray, row1, i, row2, i);
        }
    }

    public void sumIncreaseSorting(JaggedArrayCreator jaggedArray){
        int rows = jaggedArray.getRows();
        for (int i = 0; i < rows - 1; i++){
            for (int j = 0; j < rows - i - 1; j++){
                if (rowsSum(jaggedArray, j) < rowsSum(jaggedArray, j + 1)){
                    swapRows(jaggedArray, j, j + 1);
                }
            }
        }
    }

    public void sumDecreaseSorting(JaggedArrayCreator jaggedArray){
        int rows = jaggedArray.getRows();
        for (int i = 0; i < rows - 1; i++){
            for (int j = 0; j < rows - i - 1; j++){
                if (rowsSum(jaggedArray, j) > rowsSum(jaggedArray, j + 1)){
                    swapRows(jaggedArray, j, j + 1);
                }
            }
        }
    }

    public void maxIncreaseSorting(JaggedArrayCreator jaggedArray){
        int rows = jaggedArray.getRows();
        for (int i = 0; i < rows - 1; i++){
            for (int j = 0; j < rows - i - 1; j++){
                if (searchMax(jaggedArray, j) < searchMax(jaggedArray, j + 1)){
                    swapRows(jaggedArray, j, j + 1);
                }
            }
        }
    }

    public void maxDecreaseSorting(JaggedArrayCreator jaggedArray){
        int rows = jaggedArray.getRows();
        for (int i = 0; i < rows - 1; i++){
            for (int j = 0; j < rows - i - 1; j++){
                if (searchMax(jaggedArray, j) > searchMax(jaggedArray, j + 1)){
                    swapRows(jaggedArray, j, j + 1);
                }
            }
        }
    }

    public void minIncreaseSorting(JaggedArrayCreator jaggedArray){
        int rows = jaggedArray.getRows();
        for (int i = 0; i < rows - 1; i++){
            for (int j = 0; j < rows - i - 1; j++){
                if (searchMin(jaggedArray, j) > searchMin(jaggedArray, j + 1)){
                    swapRows(jaggedArray, j, j + 1);
                }
            }
        }
    }
    public void minDecreaseSorting(JaggedArrayCreator jaggedArray){
        int rows = jaggedArray.getRows();
        for (int i = 0; i < rows - 1; i++){
            for (int j = 0; j < rows - i - 1; j++){
                if (searchMin(jaggedArray, j) < searchMin(jaggedArray, j + 1)){
                    swapRows(jaggedArray, j, j + 1);
                }
            }
        }
    }
}

package jagged.entity;

import java.util.Arrays;

public class JaggedArrayCreator {
    private int[][] jaggedArray;

    public JaggedArrayCreator(int[][] jaggedArray) {
        this.jaggedArray = jaggedArray;
    }

    public JaggedArrayCreator(int rows, int cols){
        this.jaggedArray = new int[rows][cols];
    }

    public int getElement(int firstValue, int secondValue){
        return jaggedArray[firstValue][secondValue];
    }
    public void setElement(int firstValue, int secondValue, int newValue){
        jaggedArray[firstValue][secondValue] = newValue;
    }
    public void setArray(int[][] jaggedArray){
        this.jaggedArray = jaggedArray;
    }

    public int getRows(){
        return jaggedArray.length;
    }

    public int getCols(){
        return jaggedArray[0].length;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("JaggedArrayCreator{");
        sb.append("jaggedArray=").append(Arrays.toString(jaggedArray));
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JaggedArrayCreator that = (JaggedArrayCreator) o;

        return Arrays.deepEquals(jaggedArray, that.jaggedArray);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(jaggedArray);
    }
}

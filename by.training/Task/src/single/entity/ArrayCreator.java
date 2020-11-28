package single.entity;

import java.util.Arrays;

public class ArrayCreator {
    private int[] array;

    public ArrayCreator(int size) {
        array = new int[size];
    }

    public ArrayCreator(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getElement(int index){
        return array[index];
    }

    public void setElement(int index, int value){
        array[index] = value;
    }

    public int getSize(){
        return array.length;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ArrayCreator{");
        sb.append("array=").append(Arrays.toString(array));
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArrayCreator creator = (ArrayCreator) o;

        return Arrays.equals(array, creator.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }
}

package single.service;

import single.entity.ArrayCreator;

public class ArraySortingService {
    public void sortByDecrease(ArrayCreator array) {
        for (int i = 0; i < array.getSize(); i++) {
            for (int j = 0; j < array.getSize(); j++) {
                if (array.getElement(j) < array.getElement(i)) {
                    int aj = array.getElement(j);
                    int ai = array.getElement(i);
                    array.setElement(j, ai);
                    array.setElement(i, aj);
                }
            }
        }
    }
    public void sortByIncrease(ArrayCreator array) {
        for (int i = 0; i < array.getSize(); i++) {
            for (int j = 0; j < array.getSize(); j++) {
                if (array.getElement(j) > array.getElement(i)) {
                    int aj = array.getElement(j);
                    int ai = array.getElement(i);
                    array.setElement(j, ai);
                    array.setElement(i, aj);
                }
            }
        }
    }
}

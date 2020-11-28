package single;

import single.entity.ArrayCreator;
import org.testng.annotations.Test;
import single.service.ArraySortingService;

import static org.testng.AssertJUnit.assertEquals;

public class ArraySortTest {
    @Test
    public void testSort(){
        ArrayCreator array = new ArrayCreator(3);
        array.setElement(0, 4);
        array.setElement(1, 5);
        array.setElement(2, 3);
        ArraySortingService arraySortingService = new ArraySortingService();
        arraySortingService.sortByIncrease(array);
        int expected = 3;
        int actual = array.getElement(0);
        assertEquals(actual, expected);
    }
}

package single;

import single.entity.ArrayCreator;
import single.service.ArrayFillingService;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ArrayFillingTest {
    @Test
    public void testRandomArray(){
        ArrayCreator array = new ArrayCreator(10);
        ArrayFillingService arrayFillingService = new ArrayFillingService();
        arrayFillingService.fillRandomArray(array, 10);
        int expected = 10;
        int actual = array.getSize();
        assertEquals(actual, expected);
    }
}

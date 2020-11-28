package single;

import single.entity.ArrayCreator;
import org.testng.annotations.Test;
import single.service.NumbersSearchService;

import static org.testng.AssertJUnit.assertEquals;

public class NumbersSearchTest {
    @Test
    public void findMinTest(){
        int[] customArray = new int[]{134, 156, 111, 123, 175, 333, 321, 322};
        ArrayCreator array = new ArrayCreator(customArray);
        NumbersSearchService numbersSearchService = new NumbersSearchService();
        int expected = 111;
        int actual = numbersSearchService.findMin(array);
        assertEquals(actual, expected);
    }
}

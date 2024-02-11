import com.ironhack.IntMethods;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class IntMethodsTest {

    @Test
    public void returnOddNumbersTest() {
        IntMethods method = new IntMethods();
        int[] allNumbers1 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] oddNumbers1 = new int[]{1, 3, 5, 7, 9};
        assertArrayEquals(oddNumbers1, method.returnOddNumbers(allNumbers1));

        int[] allNumbers2 = new int[]{99, 9, 3, 23, 43, 57, 31};
        int[] oddNumbers2 = new int[]{99, 9, 3, 23, 43, 57, 31};
        assertArrayEquals(oddNumbers2, method.returnOddNumbers(allNumbers2));

        int[] allNumbers3 = new int[]{34, 46, 56, 68, 80, 12};
        int[] oddNumbers3 = new int[]{};
        assertArrayEquals(oddNumbers3, method.returnOddNumbers(allNumbers3));
    }
}

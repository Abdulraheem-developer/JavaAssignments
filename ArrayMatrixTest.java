import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayMatrixTest {

    @Test
    public void testRotate90Clockwise() {
        int[][] input = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] expected = {
            {7, 4, 1},
            {8, 5, 2},
            {9, 6, 3}
        };

        int[][] result = ArrayMatrix.rotate90Clockwise(input);

        assertArrayEquals(expected, result);
    }
}

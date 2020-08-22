package array;

import com.germlin.array.Rotate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateTest {

    @Test
    void solution() {
        int[] nums = {1,2,3,4,5};
        int k = 3;
        Rotate rotate = new Rotate();
        rotate.solution(nums, k);
        assertArrayEquals(new int[]{3,4,5,1,2}, nums);
    }
}
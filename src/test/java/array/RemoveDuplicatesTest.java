package array;

import com.germlin.array.RemoveDuplicates;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
class RemoveDuplicatesTest {

    @Test
    void solution() {
        int[] nums = {1, 1, 1, 2, 3, 3, 4};
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int num = removeDuplicates.solution(nums);
        assertEquals(4, num);
        assertArrayEquals(new int[]{1, 2, 3, 4, 3, 3, 4}, nums);
    }
}
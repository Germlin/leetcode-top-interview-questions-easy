package array;

import com.germlin.array.ContainsDuplicate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    @Test
    void solution() {
        int[] nums = {1,2,3,2,1};
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        boolean result= containsDuplicate.solution(nums);
        assertTrue(result);
    }
}
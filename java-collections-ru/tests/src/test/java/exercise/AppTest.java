package exercise;

import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.Assert.assertEquals;
//import static org.assertj.core.api.Assertions.ListAssert;
//import static org.assertj.core.api.Assertions.sassertArrayEquals;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        List<Integer> numbers1 = new ArrayList<Integer>();
        List<Integer> count1 = new ArrayList<Integer>();
        List<Integer> result1 = App.take(numbers1, 3);
        assertThat(result1).isEqualTo(count1);

        List<Integer> numbers2 = new ArrayList<Integer>(Arrays.asList(7, 3, 10));
        List<Integer> count2 = new ArrayList<Integer>();
        List<Integer> result2 = App.take(numbers2, 4);
        assertThat(result2).isEqualTo(numbers2);

        List<Integer> numbers3 = new ArrayList<Integer>(Arrays.asList(7, 8, 10, 2));
        List<Integer> count3 = new ArrayList<Integer>(Arrays.asList(7, 8));
        List<Integer> result3 = App.take(numbers3, 2);
        assertThat(result3).isEqualTo(count3);

        List<Integer> numbers4 = new ArrayList<Integer>(Arrays.asList(7, 3, 10, 5));
        List<Integer> count4 = new ArrayList<Integer>();
        List<Integer> result4 = App.take(numbers4, 0);
        assertThat(result4).isEqualTo(count4);
    }
}

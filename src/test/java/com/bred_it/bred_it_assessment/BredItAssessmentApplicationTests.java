package com.bred_it.bred_it_assessment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class BredItAssessmentApplicationTests {

    @Test
    @DisplayName(value = "For test question 1")
    void testQuestion1() {
        int result = Question1.process(10, 3);
        Assertions.assertEquals(1000, result, "Result should be [1000] but found [" + result + "]");
        result = Question1.process(100, 4);
        Assertions.assertEquals(100000000, result, "Result should be [100000000] but found [" + result + "]");
        result = Question1.process(11, 2);
        Assertions.assertEquals(121, result, "Result should be [121] but found [" + result + "]");
    }

    @Test
    @DisplayName(value = "For test question 2")
    void testQuestion2() {
        List<String> instruction = Arrays.asList("a", "b", "c");
        Assertions.assertEquals("<table><tr><td>a</td><td>b</td></tr><tr><td>c</td><td></td></tr></table>", new Question2().process(instruction, 2));
        Assertions.assertEquals("<table><tr><td>a</td><td>b</td><td>c</td></tr></table>", new Question2().process(instruction, 3));
    }


    @Test
    @DisplayName(value = "For test question 3")
    void testQuestion3() {
        Assertions.assertEquals(9, new Question3().process(10, 2, 1));
        Assertions.assertEquals(7, new Question3().process(10, 2, 2));
        Assertions.assertEquals(0, new Question3().process(20, 3, 5));
        Assertions.assertEquals(7, new Question3().process(20, 3, 3));
    }


}

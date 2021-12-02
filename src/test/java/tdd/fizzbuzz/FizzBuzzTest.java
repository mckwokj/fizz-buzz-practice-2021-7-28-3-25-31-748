package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_return_order_when_count_off_given_order_number_with_normal_case() {
        // given
        int order = 1;

        // when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(order);

        // then
        String expected = "1";
        assertEquals(expected, actual);
    }

    @Test
    void should_return_Fizz_when_count_off_given_order_number_with_multiple_of_3() {
        // given
        int order = 9;

        // when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(order);

        // then
        String expected = "Fizz";
        assertEquals(expected, actual);
    }

    @Test
    void should_return_Buzz_when_count_off_given_order_number_with_multiple_of_5() {
        // given
        int order = 10;

        // when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(order);

        // then
        String expected = "Buzz";
        assertEquals(expected, actual);
    }

    @Test
    void should_return_Whizz_when_count_off_given_order_number_with_multiple_of_7() {
        // given
        int order = 14;

        // when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(order);

        // then
        String expected = "Whizz";
        assertEquals(expected, actual);
    }

    @Test
    void should_return_FizzBuzz_when_count_off_given_order_number_with_multiple_of_3_and_5() {
        // given
        int order = 15;

        // when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(order);

        // then
        String expected = "FizzBuzz";
        assertEquals(expected, actual);
    }

    @Test
    void should_return_FizzWhizz_when_count_off_given_order_number_with_multiple_of_3_and_7() {
        // given
        int order = 21;

        // when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(order);

        // then
        String expected = "FizzWhizz";
        assertEquals(expected, actual);
    }

    @Test
    void should_return_BuzzWhizz_when_count_off_given_order_number_with_multiple_of_5_and_7() {
        // given
        int order = 35;

        // when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(order);

        // then
        String expected = "BuzzWhizz";
        assertEquals(expected, actual);
    }

//    @Test
//    void should_return_FizzBuzzWhizz_when_count_off_given_order_number_with_multiple_of_3_5_and_7() {
//        // given
//        int order = 105;
//
//        // when
//        FizzBuzz fizzBuzz = new FizzBuzz();
//        String actual = fizzBuzz.countOff(order);
//
//        // then
//        String expected = "FizzBuzzWhizz";
//        assertEquals(expected, actual);
//    }
}

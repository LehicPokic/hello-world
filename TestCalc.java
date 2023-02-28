import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class TestCalc {

    private Calc underTest;

    @BeforeEach
    void setup() {
        underTest = new Calc();
    }

    @Test
    @DisplayName("+")
    void test1(){
        final int first = 1;
        final int second = 2;
        final int result = 3;

        final int actualresult = underTest.sum(first, second);

        assertEquals(result, actualresult);
    }
    @Test
    @DisplayName("-")
    void test2(){
        final int first = 2;
        final int second = 2;
        final int result = 0;

        final int actualresult = underTest.subtract(first, second);

        assertEquals(result, actualresult);
    }
    @Test
    @DisplayName("*")
    void test3(){
        final int first = 2;
        final int second = 2;
        final int result = 4;

        final int actualresult = underTest.multiply(first, second);

        assertEquals(result, actualresult);
    }
    @Test
    @DisplayName("/")
    void test4(){
        final int first = 2;
        final int second = 0;

        assertThrows(IllegalArgumentException.class, () -> underTest.divide(first, second));
    }
    @Test
    @DisplayName("/2")
    void test5(){
        final int first = 2;
        final int second = 2;
        final int result = 1;

        final int actualresult = underTest.divide(first, second);

        assertEquals(result, actualresult);
    }
    @Test
    @DisplayName("+2")
    void test6(){
        final int first = -2;
        final int second = -2;
        final int result = -4;

        final int actualresult = underTest.sum(first, second);

        assertEquals(result, actualresult);
    }
    @Test
    @DisplayName("-2")
    void test7(){
        final int first = -2;
        final int second = -2;
        final int result = 0;

        final int actualresult = underTest.subtract(first, second);

        assertEquals(result, actualresult);
    }

}

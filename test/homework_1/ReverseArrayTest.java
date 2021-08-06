package homework_1;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ReverseArrayTest {

    ReverseArray reverseArray = new ReverseArray();

    @Test(expected = NullPointerException.class)
    public void whenValueNullSuppliedThenExceptionRaised() {
        reverseArray.reverse(null);
    }
    @Test()
    public void whenValues5() {
        String[] arg = {"222", "111", "555", "333", "444"};
        String[] result = {"444", "333", "555", "111", "222"};
        assertArrayEquals(result, reverseArray.reverse(arg));
    }
    @Test()
    public void whenValues6() {
        String[] arg = {"222", "111", "555", "333", "444","000"};
        String[] result = {"000","444", "333", "555", "111", "222"};
        assertArrayEquals(result, reverseArray.reverse(arg));
    }
}

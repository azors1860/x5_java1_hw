package homework_1;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class StringLengthSortingTest {

    StringLengthSorting stringLengthSorting = new StringLengthSorting();

    @Test(expected = NullPointerException.class)
    public void whenValueNullSuppliedThenExceptionRaised() {
        stringLengthSorting.sort(null);
    }

    @Test(expected = NullPointerException.class)
    public void whenArrayHasNullThenExceptionRaised() {
        String[] arg = {"xaawdd", null, "ddd", "wddw", "13"};
        stringLengthSorting.sort(arg);
    }

    @Test
    public void whenServedArrayWithStringsThenSortsByWordLength() {
        String[] arg = {"xaawdd", "dadawdawd", "ddd", "wddw", "13"};
        String[] result = {"13", "ddd", "wddw", "xaawdd", "dadawdawd"};
        assertArrayEquals(result, stringLengthSorting.sort(arg));
    }

    @Test
    public void whenWordLengthEqualThenSortingNotPerformed() {
        String[] arg = {"222", "111", "555", "333", "444"};
        String[] result = {"222", "111", "555", "333", "444"};
        assertArrayEquals(result, stringLengthSorting.sort(arg));
    }
}


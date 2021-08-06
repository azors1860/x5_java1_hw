package homework_1;

public class StringLengthSorting {

    public String[] sort(String[] array) {
        for (int left = 0; left < array.length; left++) {
            String value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value.length() < array[i].length()) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
        return array;
    }
}
package homework_1;

public class TriangleMatrix {

    public int[][] rows(int count) {
        int[][] triangle = new int[count][];
        int c = 1;
        for (int i = 0; i < count; i++) {
            int[] tmp = new int[i + 1];
            for (int j = 0; j < tmp.length; j++) {
                tmp[j] = c;
                c++;
            }
            triangle[i] = tmp;
        }
        return triangle;
    }
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>();

        List<Integer> row1 = new ArrayList<>();
        row1.add(11);
        row1.add(2);
        row1.add(4);
        matrix.add(row1);

        List<Integer> row2 = new ArrayList<>();
        row2.add(4);
        row2.add(5);
        row2.add(6);
        matrix.add(row2);

        List<Integer> row3 = new ArrayList<>();
        row3.add(10);
        row3.add(8);
        row3.add(-12);
        matrix.add(row3);

        System.out.println(diagonalDifference(matrix));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int primary = 0;
        int secondary = 0;
        int tamano = arr.size() - 1;

        for (int y = 0; y < arr.size(); y++) {
            for (int x = 0; x < arr.size(); x++) {
                if (y == x) {
                    primary += arr.get(y).get(x);
                }
            }
            secondary += arr.get(y).get(tamano);
            tamano--;
        }

        return Math.abs(primary - secondary);
    }
}

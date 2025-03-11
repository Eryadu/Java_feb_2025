package Assignment.Array;

public class EqualArrayMatrix {
    public static void main(String[] args) {
        //Input matrix m1
        int m1[][] = {

                {6, 14, 16},
                {4, 15, 17}
        };

        //Input matrix m2
        int m2[][] = {
                {19, 8, 17},
                {16, 14, 16},
                {4, 15, 17}
        };

        int rows1 = m1.length;
        int col1 = m1[0].length;
        int rows2 = m2.length;
        int col2 = m2[0].length;
        boolean flag = true;

        if (rows1 != rows2 || col1 != col2) {
            System.out.println("Given matrices are not equal");
        } else {
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < col1; j++) {
                    if (m1[i][j] != m2[i][j]) {
                        flag = false;
                        break;
                    }

                }
            }

            if (flag) {
                System.out.println("Matrices are equal.");
            } else {
                System.out.println("Matrices are not equal.");
            }
        }
    }
}
package ex_16_Arrays;

public class Lab162_2D_Array_Iterate_For_Loop {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        // 3 x 3
        // R -> 3
        // C -> 3

        // 1,2,3
        // 4,5,6
        // 7,8,9

        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

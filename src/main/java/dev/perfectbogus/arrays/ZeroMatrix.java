package dev.perfectbogus.arrays;

public class ZeroMatrix {

    public static void main(String[] args){
        int[][] matrix = { {1, 2, 3}, {4, 0, 6}, {7, 8, 9} };
        printMatrix(matrix);
        Zeros(matrix);
        printMatrix(matrix);
    }

    public static void Zeros(int[][] matrix){
        System.out.println();
        boolean[] columns = new boolean[matrix.length];
        boolean[] rows = new boolean[matrix[0].length];

        // Store the location of the Zeros on rows and columns
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    columns[i] = true;
                    rows[j] = true;
                }
            }
        }

        for(int i = 0; i < rows.length; i++){
            if(rows[i]) zerofyRows(matrix, i);
        }

        for(int i = 0; i < columns.length; i++){
            if(columns[i]) zerofyColumns(matrix, i);
        }

    }

    private static void zerofyRows(int[][] matrix, int row){
        for(int i = 0; i < matrix[0].length; i++){
            matrix[row][i] = 0;
        }
    }

    private static void zerofyColumns(int[][] matrix, int column){
        for(int i = 0; i < matrix.length; i++){
            matrix[i][column] = 0;
        }
    }

    private static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix[0].length; i++){
            for(int j = 0; j < matrix.length; j++){
                System.out.print(matrix[i][j]);;
            }
            System.out.println();
        }
    }
}

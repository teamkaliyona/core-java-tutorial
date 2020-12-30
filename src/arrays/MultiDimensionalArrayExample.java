package arrays;

/**
 * Kaliyona Course: Core Java Tutorial
 * Module: Arrays
 * This is an example class to illustrate Types of Arrays in Java
 */

public class MultiDimensionalArrayExample {
    public static void main(String[] args) {
            int matrix[][] = {{1,2,3}, {4,5,6}};
            for (int i=0; i< 2; i++){
                for(int j=0; j< 3; j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
    }
}

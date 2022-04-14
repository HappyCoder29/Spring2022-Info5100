package edu.northeastern.ashish;

import java.util.Arrays;
import java.util.HashSet;
//https://leetcode.com/problems/set-matrix-zeroes/
public class Main {

    public static void main(String[] args) {
        int[][] matrix = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };

        setZeros(matrix);
        printMatrix(matrix);

    }

    private static void printMatrix(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i = 0 ; i < rows; i ++){
            int[] arr = matrix[i];
            System.out.println(Arrays.toString(arr));
        }
    }

    private static void setZeros(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        HashSet<Integer> hashSetRows = new HashSet<>();
        HashSet<Integer> hashSetCols = new HashSet<>();

        for(int i = 0 ; i < rows; i ++ ){
            for(int j = 0 ; j < cols ; j ++){
                if(matrix[i][j] == 0 ){
                    hashSetRows.add(i);
                    hashSetCols.add(j);
                }
            }
        }

        for(int i = 0 ; i < rows; i ++ ){
            for(int j = 0 ; j < cols ; j ++){
                if(hashSetRows.contains(i) || hashSetCols.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }

    }
}

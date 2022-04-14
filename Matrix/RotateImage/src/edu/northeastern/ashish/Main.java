package edu.northeastern.ashish;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}

        };


        int[][] rotated = rotate90DegreesAntiClockWise(matrix);
        printMatrix(rotated);


    }

    private static void printMatrix(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i = 0 ; i < rows; i ++){
            int[] arr = matrix[i];
            System.out.println(Arrays.toString(arr));
        }
    }

    private static int[][] rotate90DegreesAntiClockWise(int[][] matrix){
        int[][] transpose = transposeMatrix(matrix);
        int cols = transpose[0].length;
        int rows = transpose.length;

        for(int i = 0 ; i < cols; i ++){
            int start = 0;
            int end = rows -1;

            while(start < end){
               int temp = transpose[start][i];
               transpose[start][i] = transpose[end][i];
               transpose[end][i] = temp;
               start ++;
               end --;
            }

        }
        return transpose;

    }


    private static int[][] rotate90DegreesClockWise(int[][] matrix){
        int[][] transpose = transposeMatrix(matrix);

        for(int i = 0 ; i < transpose.length; i ++){
            int[] arr = transpose[i];
            rotateArray(arr);
        }
        return transpose;

    }

    private static void rotateArray(int[] arr){
        int start = 0 ;
        int end = arr.length -1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
    }


    private static int[][] transposeMatrix(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = new int[cols][rows];

        for(int i = 0 ; i < rows; i ++){
            int[] arr = matrix[i];
            for(int j = 0 ; j < cols; j ++){
                transpose[j][i] = arr[j];
            }

        }
        System.out.println();

        return transpose;

    }
}

package edu.northeastern.ashish;

import javax.imageio.ImageTranscoder;

public class Main {

    public static void main(String[] args) {
        int[][] matrix = {
                {1,1,1},
                {1,1,0},
                {1,0,1}
        };
        floodFillMatrix(matrix, 1,1, 2);
        System.out.println();

    }

    private static void floodFillMatrix(int[][]matrix, int row, int col, int newColor){

        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[][] visited = new boolean[rows][cols];

        floodFillMatrix(matrix, visited, newColor, matrix[row][col], 0,0);


    }

    private static void floodFillMatrix(int[][] matrix, boolean[][] visited, int newColor, int oldColor, int row, int col){
        // if we are out of bound we return
        if(row < 0 || col < 0 || row >= matrix.length || col >= matrix[0].length
                || matrix[row][col] != oldColor
         ){
            return;
        }
        matrix[row][col] = newColor;
        visited[row][col] = true;
        floodFillMatrix(matrix, visited, newColor, oldColor, row -1, col);// top
        floodFillMatrix(matrix, visited, newColor, oldColor, row , col + 1 );// right
        floodFillMatrix(matrix, visited, newColor, oldColor, row + 1, col);// bottom
        floodFillMatrix(matrix, visited, newColor, oldColor, row , col -1);// left

    }
}

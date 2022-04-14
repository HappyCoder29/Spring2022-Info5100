package edu.northeastern.ashish;

import java.util.Stack;

//https://leetcode.com/problems/minimum-path-sum/

public class Main {

    public static void main(String[] args) {
        int[][] matrix = {
                {4,7,8,6,4},
                {6,7,3,9,2},
                {3,8,1,2,4},
                {7,1,7,3,7},
                {2,9,8,9,3}

        };

        System.out.println( getMinPathMatrix(matrix));

    }

    private static int getMinPathMatrix(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] result = new int[rows][cols];
        result[0][0] = matrix[0][0];

        // Initialize first col

        for(int i = 1 ; i < cols; i ++){
            result[0][i] = matrix[0][i] + result[0][i-1];
        }

        // Initialize first row
        for(int i = 1 ; i < rows; i ++){
            result[i][0] = matrix[i][0] + result[i-1][0];
        }

        for(int i = 1; i < rows; i ++){
            for(int j = 1; j < cols; j ++){
                result[i][j] = matrix[i][j] + Math.min(result[i-1][j], result[i][j-1]);
            }
        }

        int row = rows-1;
        int col = cols -1;
        Stack<Integer> stack = new Stack<>();
        stack.push(matrix[row][col]);

        while(row != 0 && col != 0){

            int val = result[row][col] - matrix[row][col];
            if(row == 0){
                col--;
                stack.push(matrix[row][col]);

                continue;
            }
            if(col == 0){
                row --;
                stack.push(matrix[row][col]);

                continue;
            }

            if(val == result[row-1][col]){
                row --;
            }else{
                col --;
            }
            stack.push(matrix[row][col]);

        }
        stack.push(matrix[0][0]);

        while(!stack.isEmpty()){
            System.out.printf(stack.pop() + " -> ");
        }
        System.out.println("END");
        return result[rows-1][cols-1];

    }
}

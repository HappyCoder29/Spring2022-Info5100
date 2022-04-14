package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {
        int[][] matrix = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };

        System.out.println(search2D(matrix, 7));

    }

    private static boolean search2D(int[][]matrix, int target){
        int row = matrix.length -1;
        int col = 0;

        while(row >= 0 && col < matrix[0].length ){
            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col] < target){
                col ++;
            }else{
                row --;
            }

        }
        return false;
    }


}

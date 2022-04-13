package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }



    private static void visitNeighbours(String[][] matrix,
                                        boolean[][] visited,
                                        int row,
                                        int col,
                                        int index,
                                        String word,
                                        BoxValue<Boolean> bFound)
    {
        // Check if we are in bounds, if current matrix is not same as the current value in the word
        // or we have already visited this return

        if(row < 0 || col < 0 || row >= matrix.length || col >= matrix[0].length ||
                !matrix[row][col].equals(Character.toString( word.charAt(index))) ||
                visited[row][col] == true){
            return;
        }
        // System.out.println(matrix[row][col]);
        // if this is the last word
        if(index == word.length() -1){
            bFound.data = true;
            return;
        }

        visited[row][col] = true;
        visitNeighbours(matrix, visited, row -1, col, index + 1, word, bFound);// top
        visitNeighbours(matrix, visited, row , col + 1, index + 1, word, bFound);// right
        visitNeighbours(matrix, visited, row + 1 , col, index + 1, word, bFound);// bottom
        visitNeighbours(matrix, visited, row, col -1, index + 1, word, bFound);// left

    }
}

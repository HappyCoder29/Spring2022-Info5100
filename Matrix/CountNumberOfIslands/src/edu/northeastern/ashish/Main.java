package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {

        int[][] matrix = {
                {1,1,0,0,0},
                {1,1,0,0,0},
                {0,0,1,0,0},
                {0,0,0,1,1}
        };

        int numIslands = countIslandsDiagonal(matrix);
        System.out.println("Number of Islands = " + numIslands);

    }

    public static int countIslands(int[][]matrix){
        int count = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[][] visited = new boolean[rows][cols];

        for(int i = 0; i < rows; i ++){
            for(int j = 0 ; j < cols; j ++){
                if(matrix[i][j] == 1 && visited[i][j] == false){
                    // If I have not visited this place and the matrix[i][j] == 1
                    count++;
                    visitNeighbours(matrix, visited, i, j);
                }
            }
        }

        return count;
    }

    public static int countIslandsDiagonal(int[][]matrix){
        int count = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[][] visited = new boolean[rows][cols];

        for(int i = 0; i < rows; i ++){
            for(int j = 0 ; j < cols; j ++){
                if(matrix[i][j] == 1 && visited[i][j] == false){
                    // If I have not visited this place and the matrix[i][j] == 1
                    count++;
                    visitNeighboursDiagonal(matrix, visited, i, j);
                }
            }
        }

        return count;
    }

    private static void visitNeighbours(int[][] matrix, boolean[][] visited, int row, int col){
        // If we are not out of bound Or the value of current one is 0
        // or we have visited this place earlier we just return
        if(row < 0 || col < 0 || row >= matrix.length || col >= matrix[0].length ||
            matrix[row][col] == 0 || visited[row][col] == true){
            return;
        }
        visited[row][col] = true;
        visitNeighbours(matrix, visited, row -1, col); // top
        visitNeighbours(matrix, visited, row , col + 1); // right
        visitNeighbours(matrix, visited, row + 1 , col); // bottom
        visitNeighbours(matrix, visited, row , col -1); // Left

    }

    private static void visitNeighboursDiagonal(int[][] matrix, boolean[][] visited, int row, int col){
        // If we are not out of bound Or the value of current one is 0
        // or we have visited this place earlier we just return
        if(row == 2 && col == 2){
            System.out.println();
        }
        if(row < 0 || col < 0 || row >= matrix.length || col >= matrix[0].length ||
                matrix[row][col] == 0 || visited[row][col] == true){
            return;
        }
        visited[row][col] = true;
        visitNeighbours(matrix, visited, row -1, col); // top
        visitNeighbours(matrix, visited, row -1, col +1); // top  right Diagonal
        visitNeighbours(matrix, visited, row , col + 1); // right
        visitNeighbours(matrix, visited, row + 1 , col + 1); // right bottom diagonal
        visitNeighbours(matrix, visited, row + 1 , col); // bottom
        visitNeighbours(matrix, visited, row + 1 , col -1); // bottom left diagonal
        visitNeighbours(matrix, visited, row , col -1); // Left
        visitNeighbours(matrix, visited, row - 1 , col -1); // Left top diagonal

    }
}

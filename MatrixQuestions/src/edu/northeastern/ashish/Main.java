package edu.northeastern.ashish;

public class Main {

    enum Direction {UP, DOWN, LEFT, RIGHT}

    ;

    public static void main(String[] args) {
//        int[][] matrix = {
//                {1, 2, 3, 4},
//                {12,13,14,5},
//                {11,16,15,6},
//                {10,9, 8, 7}
//        };

        int[][] matrix = createSpiralMatrix(3,4);
        printInSpiralManner(matrix);
    }


    private static void printInSpiralManner(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;
        int count = rows * cols;
        int topLimit = 0;
        int bottomLimit = rows - 1;
        int leftLimit = 0;
        int rightLimit = cols - 1;

        int row = 0;
        int col = 0;

        Direction dir = Direction.RIGHT;
        while (count > 0) {
            System.out.printf(matrix[row][col] + ", ");
            count--;

            if (dir == Direction.RIGHT) {
                col++;
                if (col > rightLimit) {
                    col--;
                    row++;
                    dir = Direction.DOWN;
                    topLimit++;
                }

            } else if (dir == Direction.LEFT) {
                col--;
                if (col < leftLimit) {
                    col++;
                    row--;
                    dir = Direction.UP;
                    bottomLimit--;
                }

            } else if (dir == Direction.UP) {
                row--;
                if (row < topLimit) {
                    row++;
                    col++;
                    dir = Direction.RIGHT;
                    leftLimit++;
                }

            } else {
                row++;
                if (row > bottomLimit) {
                    row--;
                    col--;
                    dir = Direction.LEFT;
                    rightLimit--;
                }
            }
        }// end of while
        System.out.println();

    }


    private static int[][] createSpiralMatrix(int n) {
        int rows = n;
        int cols = n;
        int[][] matrix = new int[rows][cols];
        int row = 0;
        int col = 0;
        int count = rows * cols;
        Direction dir = Direction.RIGHT;

        int topLimit = 0;
        int bottomLimit = rows - 1;
        int leftLimit = 0;
        int rightLimit = cols - 1;
        int currentValue = 1;
        while (count > 0) {
            matrix[row][col] = currentValue;
            currentValue++;
            count--;

            if (dir == Direction.RIGHT) {
                col++;
                if (col > rightLimit) {
                    col--;
                    row++;
                    dir = Direction.DOWN;
                    topLimit++;
                }

            } else if (dir == Direction.LEFT) {
                col--;
                if (col < leftLimit) {
                    col++;
                    row--;
                    dir = Direction.UP;
                    bottomLimit--;
                }

            } else if (dir == Direction.UP) {
                row--;
                if (row < topLimit) {
                    row++;
                    col++;
                    dir = Direction.RIGHT;
                    leftLimit++;
                }

            } else {
                row++;
                if (row > bottomLimit) {
                    row--;
                    col--;
                    dir = Direction.LEFT;
                    rightLimit--;
                }
            }
        }// end of while
        return matrix;

    }


    private static int[][] createSpiralMatrix(int n, int m) {
        int rows = n;
        int cols = m;
        int[][] matrix = new int[rows][cols];
        int row = 0;
        int col = 0;
        int count = rows * cols;
        Direction dir = Direction.RIGHT;

        int topLimit = 0;
        int bottomLimit = rows - 1;
        int leftLimit = 0;
        int rightLimit = cols - 1;
        int currentValue = 1;
        while (count > 0) {
            matrix[row][col] = currentValue;
            currentValue++;
            count--;

            if (dir == Direction.RIGHT) {
                col++;
                if (col > rightLimit) {
                    col--;
                    row++;
                    dir = Direction.DOWN;
                    topLimit++;
                }

            } else if (dir == Direction.LEFT) {
                col--;
                if (col < leftLimit) {
                    col++;
                    row--;
                    dir = Direction.UP;
                    bottomLimit--;
                }

            } else if (dir == Direction.UP) {
                row--;
                if (row < topLimit) {
                    row++;
                    col++;
                    dir = Direction.RIGHT;
                    leftLimit++;
                }

            } else {
                row++;
                if (row > bottomLimit) {
                    row--;
                    col--;
                    dir = Direction.LEFT;
                    rightLimit--;
                }
            }
        }// end of while
        return matrix;
    }
}

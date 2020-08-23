package com.germlin.array;

public class IsValidSudoku {
    public boolean solution(char[][] board) {
        for (int i = 0; i < 9; i++) {
            boolean isColValid = checkColumn(board, i);
            if (!isColValid) {
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            boolean isRowValid = checkRow(board, i);
            if (!isRowValid) {
                return false;
            }
        }
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                boolean isBlockValid = checkBlock(board, i, j);
                if (!isBlockValid) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkBlock(char[][] board, int beginRow, int beginCol) {
        int[] numbers = initNumbers();
        for (int i = beginRow; i < beginRow + 3; i++) {
            for (int j = beginCol; j < beginCol + 3; j++) {
                int number = getNumber(board[i][j]);
                boolean exist = numberExist(numbers, number);
                if (exist) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkColumn(char[][] board, int colIndex) {
        int[] numbers = initNumbers();
        for (int i = 0; i < 9; i++) {
            int number = getNumber(board[i][colIndex]);
            boolean exist = numberExist(numbers, number);
            if (exist) {
                return false;
            }
        }
        return true;
    }

    private boolean checkRow(char[][] board, int rowIndex) {
        int[] numbers = initNumbers();
        for (int i = 0; i < 9; i++) {
            int number = getNumber(board[rowIndex][i]);
            boolean exist = numberExist(numbers, number);
            if (exist) {
                return false;
            }
        }
        return true;
    }

    private boolean numberExist(int[] numbers, int number) {
        if (number == 0) {
            return false;
        } else {
            if (numbers[number] == 0) {
                numbers[number] = 1;
                return false;
            } else {
                return true;
            }
        }
    }

    private int[] initNumbers() {
        int[] number = new int[10];
        for (int i = 0; i < 10; i++) {
            number[i] = 0;
        }
        return number;
    }

    private int getNumber(char number) {
        if ('.' == number) {
            return 0;
        } else {
            return (int) number - '0';
        }
    }


}

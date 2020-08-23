package com.germlin.array;

public class RotateImage {
    public void solution(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - 1 - i; j++) {
                int temp1 = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = matrix[i][j];

                int temp2 = matrix[n - 1 - i][n - 1 - j];
                matrix[n - 1 - i][n - 1 - j] = temp1;

                temp1 = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = temp2;

                matrix[i][j] = temp1;
            }
        }
    }
}

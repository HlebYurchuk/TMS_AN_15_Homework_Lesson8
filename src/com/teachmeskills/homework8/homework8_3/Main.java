package com.teachmeskills.homework8.homework8_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] array1 = new int[][]{{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] array2 = new int[][]{{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};

        Utils.showMatrix(array1);
        Utils.showMatrix(array2);

        int strMx1 = array1.length;
        int colMx1 = array1[0].length;
        int colMx2 = array2[0].length;

        int[][] result = new int[strMx1][colMx2];

        for (int i = 0; i < strMx1; i++) {
            for (int j = 0; j < colMx2; j++) {
                for (int k = 0; k < colMx1; k++) {
                    result[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }
        Utils.showMatrix(result);
    }
    }

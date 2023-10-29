/*
 * ====================================================================================
 *
 * Copyright (c) 2005, 2023 Oracle Ⓡ and/or its affiliates. All rights reserved.
 *
 * ====================================================================================
 */

package dev.perfectbogus.mit.lecture3;

import java.util.Arrays;

public class InsertionSort {

  public static void main(String[] args) {

    int[] data = {5, 2, 4, 6, 1, 3};

    for (int i = 1; i < data.length; i++) {
      for (int j = i; j > 0; j--){
        if (data[j] < data[j - 1]) {
          int tmp = data[j - 1];
          data[j - 1] = data[j];
          data[j] = tmp;
        }
      }
    }

    System.out.println(Arrays.toString(data));
    // Move through the array forward but do a pair swap backward


    // i=1:  2 5 4 6 1 2
    // i=2:  2 4 5 6 1 2
    // i=3:  2 4 5 6 1 2
    // i=4   2 4 5 1 6 2
    //       2 4 1 5 6 2
    //       2 1 4 5 6 2
    //       1 2 4 5 6 2
    // i=5:

  }
}

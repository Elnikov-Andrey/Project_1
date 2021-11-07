package com.company;

import org.jetbrains.annotations.NotNull;
import java.util.Arrays;
enum SortEnum {ASC, DESC}

public class Main {



    public static void homeWork_1(int n){
        int n1 = n % 10;
        int n2 = (n / 10) % 10;
        int n3 = (n / 100) % 10;
        int x = n1*100 + n2*10 + n3;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(x);
    }

    public static void homeWork_2_task_1(int n){
        if (n < 0){
            throw new UnsupportedOperationException();
        } else if (n == 0){
            throw new UnsupportedOperationException();
        } else {
            int b = n;
            int numberOfDigits = 0;

            while (b != 0) {
                numberOfDigits ++;
                b = b / 10;
            }

            int number;
            int divider = 1;
            int sum = 0;

            for (int i=0; i<numberOfDigits; i++){
                number = (n / divider) % 10;
                divider = divider * 10;
                if (number % 2 == 1){
                    sum = sum + number;
                }
            }
            System.out.println("Summa of 1 is " + sum);
            System.out.println("--------------------");
        }
    }

    public static void homeWork_2_task_2(int n){
        if (n < 0){
            throw new UnsupportedOperationException();
        } else if (n == 0){
            throw new UnsupportedOperationException();
        } else {
            int number;
            int sum = 0;

            while (n >= 1) {
                number = n % 2;
                if (number == 1) {
                    sum += 1;
                }
                n = n - n / 2 - number;
            }
            System.out.println("Kol-vo 1 is " + sum);
            System.out.println("------------------");
        }
    }

    public static void homeWork_2_task_3(int n){
        if (n < 0){
            throw new UnsupportedOperationException();
        } else if (n == 0){
            throw new UnsupportedOperationException();
        } else {
            int number = 0, number1 = 1, number2 = 1;
            int sum = 0;

            for (int i=3; i<n; i++){
                number = number1 + number2;
                System.out.println("chislo is " + number);
                number1 = number2;
                number2 = number;
                sum = sum + number;
            }
            System.out.println(sum + 2);
        }
    }

    public static void homeWork_3_task_1(int @NotNull [] array){
        int num_before;
        int num_after;

        for (int i=0; i<array.length/2; i++ ){

            num_before = array[i];
            num_after = array[array.length - 1 - i];

            if (num_before%2==0 & num_after%2==0 ) {
                array[array.length - 1 - i] = num_before;
                array[i] = num_after;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void homeWork_3_task_2(int @NotNull [] array){
        int x = 0;
        int max=0;
        int num = 0;

        int max_num = 0;
        
        for (int i=0; i<array.length; i++ ){
            if (array[i]>max){
                max=array[i];
                max_num += 1;
            }
        }
        int[] arrayMax = new int[10];
        for (int i=0; i<array.length; i++){
            for (int j=0; j<max_num; j++){
                if (array[i] == max){
                    arrayMax[max_num] = i;
                }
            }
        }
        x = arrayMax[max_num] - arrayMax[0] - 1;

        System.out.println("X " + x);
        System.out.println(Arrays.toString(array));
    }

    public static void homeWork_3_task_3(int[][] matrix){

        for (int i=0; i<matrix.length; i++ ){
            for (int j=0; j<matrix.length; j++){
                if ( i < j ) {
                    matrix[i][j] = 1;
                } else if (i > j) {
                    matrix[i][j] = 0;
                }
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(matrix));
    }

    public static void homeWork_4_task_1(SortEnum se, int [] array){

        boolean sorted = true;

        if (array[0] <= array[1]) {
            System.out.println("Ascending mode detected.");

            for (int i = 2; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    sorted = false;
                    break;
                }
            }

            if (sorted) {
                System.out.println("Array sorted in in ascending mode");
            }
            else {
                System.out.println("ERROR: Array not sorted.");
            }
        }
        else {
            System.out.println("Descending mode detected.");

            for (int i = 2; i < array.length; i++) {
                if (array[i] > array[i - 1]) {
                    sorted = false;
                    break;
                }
            }

            if (sorted) {
                System.out.println("Array sorted in in descending mode");
            }
            else {
                System.out.println("ERROR: Array not sorted.");
            }
        }

    }

    public static void homeWork_4_task_2(SortEnum se, int [] array){

        boolean sorted = true;
        int [] arrayNew = new int[array.length];
        if (array[0] <= array[1]) {
            System.out.println("Ascending mode detected.");

            for (int i = 2; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    sorted = false;
                    break;
                }
            }

            if (sorted) {
                System.out.println("Array sorted in in ascending mode");
            }
            else {
                System.out.println("ERROR: Array not sorted.");
            }
        }
        else {
            System.out.println("Descending mode detected.");

            for (int i = 2; i < array.length; i++) {
                if (array[i] > array[i - 1]) {
                    sorted = false;
                    break;
                }
            }

            if (sorted) {
                System.out.println("Array sorted in in descending mode");
                for (int i = 0; i < array.length; i++){
                    arrayNew[i] = array[i] + i;
                    //i += 1;
                }
                System.out.println(Arrays.toString(arrayNew));
            }
            else {
                System.out.println("ERROR: Array not sorted.");
            }
        }
    }

    public static void homeWork_4_task_3(int a1, int t, int n){
        int s = 1;
        for (int i = 1; i <= n; i++) {
            s = s * a1;
            a1 = a1 + t;
            System.out.println("S = " + s);
        }
    }

    public static void homeWork_4_task_4(double a1, double t, double alim){
        double s = a1;
        do {
            a1 = a1 * t;
            s = s + a1;
        }
        while (alim < a1*t);
        System.out.println("S = " + s);
    }


    public static void main(String args[]) {
        //homeWork_1(456);
        //homeWork_2_task_1(246);
        //homeWork_2_task_2(14);
        //homeWork_2_task_3(17);
        //homeWork_3_task_1(new int[]{100, 2, 3, 45, 33, 8, 4, 54});
        //homeWork_3_task_2(new int[]{5, 350, 350, 4, 350});
        //homeWork_3_task_3(new int[][]{{2, 4, 3, 3},  {5, 7, 8, 5},  {2, 4, 3, 3},  {5, 7, 8, 5}});
        SortEnum se = SortEnum.ASC;
        int [] array = {15, 10, 3, 1};
        //homeWork_4_task_1(se, array);
        //homeWork_4_task_2(se, array);
        //homeWork_4_task_3(5, 3, 4);
        homeWork_4_task_4(100, 0.5, 20);
    }
}

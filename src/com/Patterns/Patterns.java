package com.Patterns;

public class Patterns {

    static void main() {

//         rightAngledTriangleStarPattern();
//         rightAngledTriangleNumbers();
//         rightAngledTriangleIncreasingNumbers();
//         invertedStarTriangle();
//         invertedNumberTriangle();

    }

    static void rightAngledTriangleStarPattern(){

        int n = 4;

        for (int rows = 1; rows <= n; rows++) {
            for (int columns = 1; columns <= rows; columns++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void rightAngledTriangleNumbers(){

        int total = 5;

        for (int rows = 1; rows <= total; rows++) {
            for (int columns = 1; columns <= rows; columns++) {
                System.out.print(columns + " ");
            }
            System.out.println();
        }
    }

    static void rightAngledTriangleIncreasingNumbers(){

        int total = 5;
        int nums = 1;

        for (int rows = 1; rows <= total; rows++) {
            for (int columns = 1; columns <= rows; columns++) {
                System.out.print(nums + " ");
                nums++;
            }
            System.out.println();
        }
    }

    static void invertedStarTriangle(){

        int n = 5;

        for (int rows = 1; rows <= n; rows++) {
            for (int columns = n; columns >= rows; columns--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void invertedNumberTriangle(){

        int totalRows = 5;

        for (int rows = 1; rows <= totalRows; rows++) {
            int nums = 1;
            for (int columns = totalRows; columns >= rows; columns--) {
                System.out.print(nums + " ");
                nums++;
            }
            System.out.println();
        }


    }




}

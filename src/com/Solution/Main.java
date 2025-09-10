package com.Solution;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter matrix Dimension (n * n): ");
        int n = in.nextInt();

        char [][] matrix = new char[n][n];

        // Initialize matrix with '0'
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = '0';
            }
        }

        System.out.println("Enter Adventurer Position (Row, Col): ");
        int aRow = in.nextInt();
        int aCol = in.nextInt();

        matrix[aRow][aCol] = 'A';

        System.out.println("Enter Adventurer Destination (Row, Col): ");
        int dRow = in.nextInt();
        int dCol = in.nextInt();

        matrix[dRow][dCol] = 'D';

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int shortestPath = findShortestDistance(aRow, aCol, dRow, dCol);
        System.out.println("Shortest Path is : "+shortestPath);
    }

    private static int findShortestDistance(int aRow, int aCol, int dRow, int dCol) {

        return Math.max(Math.abs(dRow - aRow), Math.abs(dCol - aCol));

    }


}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uma.ctesp.arq.ficha4;

/**
 *
 * @author Turma A
 */
public class MatrixUtilities {

    public static void show(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int j;
            System.out.print("[");
            for (j = 0; j < matrix[i].length - 1; j++) {
                System.out.print(matrix[i][j] + ",");
            }
            System.out.print(matrix[i][j]);
            System.out.println("]");
        }
    }

    public static boolean isMatrix(int[][] matrix) {
        boolean t = false;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix.length == matrix[i].length) {
                t = true;
            } else {
                t = false;
                break;
            }
        }
        return t;
    }

    public static boolean isIdentify(int[][] matrix) {
        if (isMatrix(matrix)) {
            boolean t = true;
            for (int i = 0; i < matrix.length; i++) {
                for (int l = 0; i < matrix[i].length; l++) {
                    if (l == 1) {
                        if (matrix[i][l] != 1) {
                            t = false;
                            break;
                        }
                    }
                    if (i != 1) {
                        if (matrix[i][l] != 0) {
                            t = false;
                            break;
                        }
                    }
                }
            }
            return t;
        } else {
            System.out.println("Not a matrix");
            return false;
        }
    }
    public static void multiplyBy(int[][] matrix, int x){
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]*=x;  
            }   
        }
    }   
    public static boolean areCompatibleForSum(int[][] matrix, int [][] matrix2){
        boolean t=false;
        if(isMatrix(matrix)&& isMatrix(matrix2)){
              t = true;
        }else{
             t=false;
        }
        return t;
    }
    public static void sumOf(int[][] matrix, int [][] matrix2){
        
      if(areCompatibleForSum(matrix,matrix2)){
          for (int i = 0; i < matrix.length; i++) {
              for (int j = 0; j < matrix[i].length; j++) {
                  matrix[i][j]+=matrix2[i][j];
                  
              }
          }
          
      }
    }
}

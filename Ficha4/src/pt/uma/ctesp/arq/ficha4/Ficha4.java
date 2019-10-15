/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uma.ctesp.arq.ficha4;

import static pt.uma.ctesp.arq.ficha4.MatrixUtilities.*;

/**
 *
 * @author Turma A
 */
public class Ficha4 {
     public static void main(String[] args) {
        int[][] matrix = {
        {1,0,0},
        {0,1,0},
        {0,0,1}
    };
        int[][] matrix2 = {
        {1,0,0},
        {0,1,0},
        {0,0,1}
    };
         int[][] matrix3 = {
        {1,0,0},
        {0,1,0},
        {1,0}
    };
         int[][] matrix4 = {
        {1,0,0},
        {0,1,0},
        {0,0,1}
    };
        show(matrix);
         System.out.println(isMatrix(matrix));
         System.out.println(isIdentify(matrix3));
         multiplyBy(matrix,2);
         MatrixUtilities.show(matrix);
         System.out.println(areCompatibleForSum(matrix, matrix2));
         sumOf(matrix4,matrix2);
         MatrixUtilities.show(matrix);
    }

   
    
}

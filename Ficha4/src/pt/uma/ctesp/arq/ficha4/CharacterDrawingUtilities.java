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
public class CharacterDrawingUtilities {
    public static void drawElement(char l) {
        System.out.print(l);
    }

    public static void drawNewLine() {
        System.out.println("");
    }

    public static void drawHorizontalSegmentWith(char l, int n) {
        for (int i = 0; i < n; i++) {
            drawElement(l);
        }
    }

    public static void drawFilledRectangleWith(int a, int l, char c) {
        for (int i = 0; i < a; i++) {
            drawHorizontalSegmentWith(c, l);
            drawNewLine();
        }
    }

    public static void drawEmptyRectangleWith(int a, int l, char c) {
        for (int i = 0; i < a; i++) {
            if (i == 0 || i == a - 1) {
                drawHorizontalSegmentWith(c, l);
                drawNewLine();
            } else {
                drawHorizontalSegmentWith(c, 1);
                drawHorizontalSegmentWith(' ', l - 2);
                drawHorizontalSegmentWith(c, 1);
                drawNewLine();
            }
        }
    }
    
}

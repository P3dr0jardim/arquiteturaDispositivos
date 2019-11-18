/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhogrupo;

import java.util.Scanner;

/**
 *
 * @author Turma A
 */
public class Validation {
    public static int verificaInteiro(String pergunta) {
        Scanner scan = new Scanner(System.in);
        int number;
        System.out.print(pergunta);
        while (!scan.hasNextInt()) {
            System.out.println("introduza um numero válido!");
            scan.next(); 
        }
        number = scan.nextInt();
        return number;
    }
    
    public static <E extends Enum<E>> boolean isInEnum(String value, Class<E> enumClass) {
        for (E e : enumClass.getEnumConstants()) {
            if (e.name().equals(value)) {
                return false;
            }
        }
        System.out.println("Introduza um comando válido!!");
        return true;
    }

}

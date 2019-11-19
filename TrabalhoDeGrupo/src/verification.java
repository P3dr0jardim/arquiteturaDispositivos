import java.util.Scanner;

public class verification {

    public static int IntVerify(String pergunta) {
        Scanner scann = new Scanner(System.in);
        int number;
        System.out.print(pergunta);
        while (!scann.hasNextInt()) {
            System.out.println("Introduza um numero válido!");
            scann.next(); // this is important!
        }
        number = scann.nextInt();
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

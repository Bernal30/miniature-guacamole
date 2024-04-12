import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //System.in funge como comunicación entre el sistema y el teclado del ususario
        Scanner keyboard = new Scanner(System.in);
        double userRating = 0;
        double mediaRatings = 0;

        //el bucle de repetición recorre los números 0, 1 y 2 por eso la condición i < 3
        for (int i = 0; i < 3; i++) {
            System.out.println("Escribe la nota que le darias a la pelicula Mattrix");
            userRating = keyboard.nextDouble();
            mediaRatings =  mediaRatings + userRating;
        }
        System.out.println("La media de ratings para Matrix es: " + mediaRatings / 3);
    }
}

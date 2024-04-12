import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        //Encuesta sobre una pelicula a un usuario
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Escribe el nombre de tu pelicula favorita:");
        String move = keyboard.nextLine();
        System.out.println("Ahora escribe el año de lanzamiento:");
        int dateMoveUser = keyboard.nextInt();
        System.out.println("Por ultimo da una calificación a la pelicula del 1 al 10");
        //una variable de tipo double es por ejemplo 9.8 mas no 9,8
        double ratingUser = keyboard.nextDouble();

        System.out.println(move);
        System.out.println(dateMoveUser);
        System.out.println(ratingUser);
    }
}

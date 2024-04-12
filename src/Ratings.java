import java.util.Scanner;

public class Ratings {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double userRating = 0;
        double mediaRatings = 0;
        double totalRatings = 0;

        while (userRating != -1) {
            System.out.println("Escribe la nota que le darias a la pelicula Mattrix");
            userRating = keyboard.nextDouble();

            //el -1 obtenido del Scanner para romper el ciclo while no contara como un rating
            if (userRating != -1){
                //suma de los ratings para la formula de la media
                mediaRatings += userRating;
                //en cada iteración del bucle se suma 1 a la variable que cuenta los ratings totales
                totalRatings++;
            }
        }
        System.out.println("La media de ratings para Matrix es: " + mediaRatings / totalRatings);
    }
}

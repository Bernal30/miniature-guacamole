public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Screen Match");
        System.out.println("Pelicula: Matrix");

        //variables
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLPelicula = 8.2;

        //media del rating
        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);

        //texto concatenado a una variable
        String sinopsis = """
                Matrix es una paradoja
                La mejor pelicual del fin del milenio
                Fue lanzada en: """ + fechaDeLanzamiento;
        System.out.println(sinopsis);

        //conversión del tipo de dato de la variable media (double) a un entero (int)
        int clasificacion = (int) (media / 2);
    }
}
public class Decisiones {
    public static void main(String[] args) {
        //variables
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = false;
        double notaDeLPelicula = 8.2;
        String tipoPlan = "plus";

        if (fechaDeLanzamiento >= 2022) {
            System.out.println("Peliculas más populares");
        } else {
            System.out.println("Peliculas retro de las chidas");
        }

        //operador logico && (AND) ambas condiciones deben ser verdaderas
        //equals hace una comparación estricta entre variables del tipo String
        if (incluidoEnElPlan && tipoPlan.equals("plus") ) {
            System.out.println("Disfrute de su pelicula.");
        } else {
            System.out.println("Pelicula no disponible para su plan actual.");
        }
    }
}

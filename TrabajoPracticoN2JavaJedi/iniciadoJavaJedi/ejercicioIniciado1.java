package TrabajoPracticoN2JavaJedi.iniciadoJavaJedi;

public class ejercicioIniciado1 {
    public static void main(String[] args) {
        /*Triangulo de asteriscos : Se le solicita que creen un programa que imprima un
        triángulo de asteriscos en la consola. Usar bucles.*/
        String triangulo = "";

        int index = 1;
        int base = 10;

        while (index <= base) {
            String estrellas = "*".repeat(index);
            estrellas = estrellas + " ".repeat(base - index) + "\n";
            triangulo = triangulo + estrellas;
            index++;
        }

        System.out.println(triangulo);
    }
}

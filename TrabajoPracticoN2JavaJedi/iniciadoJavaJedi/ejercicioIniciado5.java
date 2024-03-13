package TrabajoPracticoN2JavaJedi.iniciadoJavaJedi;

public class ejercicioIniciado5 {
    public static void main(String[] args) {
        /*La suma de los primeros: Realizar un programa que calcule la suma de los
        primeros N números naturales, donde N es un número entero guardado en memoria */
        int n = 100;

        int suma = 0;
        int i = 1;
        while (i<=n) {
            suma += i;
            i++;
        }
        System.out.println("La suma de los primeros "+n+" numeros naturales es "+suma);
    }
}

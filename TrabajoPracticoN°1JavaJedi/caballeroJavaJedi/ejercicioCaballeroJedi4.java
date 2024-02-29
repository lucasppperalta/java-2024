package caballeroJavaJedi;

public class ejercicioCaballeroJedi4 {
    public static void main(String[] args) {
        /*Conversión de libras esterlinas a dólares: Escribir un programa en Java que
        solicite al usuario una cantidad en libras esterlinas y muestre el equivalente en
        dólares, utilizando una tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1
        libra esterlina = 1.40 dólares, y el usuario ingresa 50 libras esterlinas, el programa
        deberá mostrar 70 dólares. */

        double dolares = 1.40;
        double librasEstarlinas = 50;
        double conversion = dolares * librasEstarlinas;
        System.out.println("50 libras estarlinas equivale a "+conversion+" dolares");
    }
}

package caballeroJavaJedi;

public class ejercicioCaballeroJedi3 {
    public static void main(String[] args) {
        /*Conversión de euros a dólares: Escribir un programa en Java que solicite al
        usuario una cantidad en euros y muestre el equivalente en dólares, utilizando una
        tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 euro = 1.20 dólares, y
        el usuario ingresa 100 euros, el programa deberá mostrar 120 dólares. */
        double euro = 100;
        double dolares = 1.20;
        double conversion = euro * dolares;
        System.out.println("100 euros equivale a " + conversion + " Dolares");
    }
}

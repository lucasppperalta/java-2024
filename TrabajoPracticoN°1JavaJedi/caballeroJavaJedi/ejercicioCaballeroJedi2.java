package caballeroJavaJedi;

public class ejercicioCaballeroJedi2 {
    public static void main(String[] args) {
        /*Conversión de dólares a pesos: Escribir un programa en Java que solicite al
        usuario una cantidad en dólares y muestre el equivalente en pesos, utilizando una
        tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 dólar = 20 pesos, y el
        usuario ingresa 50 dólares, el programa deberá mostrar 1000 pesos */
        double dolares = 50;
        double pesos = 20;
        double conversion = pesos * dolares;
        System.out.println("50 DOLARES EQUIVALE A "+ conversion + " PESOS ARGENTINOS");
    }
}

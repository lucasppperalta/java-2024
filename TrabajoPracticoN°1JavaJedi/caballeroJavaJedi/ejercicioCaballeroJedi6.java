package caballeroJavaJedi;

public class ejercicioCaballeroJedi6 {
    public static void main(String[] args) {
        /*Conversión de bitcoins a dólares: Escribir un programa en Java que solicite al
        usuario una cantidad en bitcoins y muestre el equivalente en dólares, utilizando una
        tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 bitcoin = 50000
        dólares, y el usuario ingresa 0.5 bitcoins, el programa deberá mostrar 25000 dólares */
        double dolares = 50000;
        double bitcoin = 0.5;
        double conversion = dolares * bitcoin;
        System.out.println("0.5 bitcoins equivale a " + conversion + " dolares");
    }
}

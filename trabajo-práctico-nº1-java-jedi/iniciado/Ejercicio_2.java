public class Ejercicio_2 {
    public static void main(String[] args) {
                /*Suma de dos números bis: Se les solicita que guarden dos números enteros y los sumen.
     El resultado guardarlo, mostrarlo por pantalla junto con un mensaje que indique si se 
    trata de un número par o impar. El mensaje debe tener el siguiente formato:
     “El resultado es “ {Resultado} “y es” {paridad} */

    int numero1 = 10;
    int numero2 = 13;
    int resultado = numero1 + numero2;
    var paridad = (resultado % 2 == 0)? "es par":"no es par";
    System.out.println("El resultado es: " + resultado + " y " + paridad);
    }
    
}

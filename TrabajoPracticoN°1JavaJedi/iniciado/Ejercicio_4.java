public class Ejercicio_4 {
    public static void main(String[] args) {
        /*Cálculo de divisibilidad: Se le solicita que guarden dos números enteros 
        y
        los sumen, 
        determine si el primer número es divisible por el segundo número
        y muestre el resultado.*/
        int numero1 = 20;
        int numero2 = 2;
        int suma = numero1 + numero2;
        var divisibilidad = (numero1 / numero2 == 0)? numero1 / numero2 : 0;
        System.out.println(suma + divisibilidad);
    }
}

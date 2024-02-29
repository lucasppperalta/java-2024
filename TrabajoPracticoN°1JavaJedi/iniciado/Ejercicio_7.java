public class Ejercicio_7 {
    public static void main(String[] args) {
        /*Multiplicación: Se le solicita que guarde dos números reales y los multiplique,
         luego guarde otros dos números enteros y multiplicarlos. Guarde en un espacio de memoria 
         la suma entre estas dos multiplicaciones ¿Que resultado le da? ¿Entero o real? ¿Por qué? */
         double numero1 = 12.5f;
         double numero2 = 5.4;
         double resultadoReal = numero1 * numero2;
         int numeroEntero = 20;
         int numeroEntero2 = 45;
         int resultadoEntero = numeroEntero * numeroEntero2;
         double suma =  resultadoReal * resultadoEntero;
         System.out.println("El resultado es " + suma);
    }
}

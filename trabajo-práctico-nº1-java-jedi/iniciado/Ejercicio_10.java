public class Ejercicio_10 {
    public static void main(String[] args) {
        /*Acumulador: Se le solicita que guarde en un espacio de memoria la acumulación de quince
        multiplicaciones entre dos números enteros divididos por el número de la multiplicación. 
        Por ejemplo: Numero1Numero2/1 + Numero1Numero2/2 + … + Numero1*Numero2/15 El resultado mostrarlo
        por pantalla. */
                int numero1 = 5; // Reemplaza con el primer número entero que desees
                int numero2 = 3; // Reemplaza con el segundo número entero que desees
                
                // Cálculo manual de las 15 multiplicaciones y su acumulación
                double acumulador = 0;
                acumulador += numero1 * numero2 / 1.0;
                acumulador += numero1 * numero2 / 2.0;
                acumulador += numero1 * numero2 / 3.0;
                acumulador += numero1 * numero2 / 4.0;
                acumulador += numero1 * numero2 / 5.0;
                acumulador += numero1 * numero2 / 6.0;
                acumulador += numero1 * numero2 / 7.0;
                acumulador += numero1 * numero2 / 8.0;
                acumulador += numero1 * numero2 / 9.0;
                acumulador += numero1 * numero2 / 10.0;
                acumulador += numero1 * numero2 / 11.0;
                acumulador += numero1 * numero2 / 12.0;
                acumulador += numero1 * numero2 / 13.0;
                acumulador += numero1 * numero2 / 14.0;
                acumulador += numero1 * numero2 / 15.0;
        
                System.out.println("El resultado de la acumulación es: " + acumulador);
            }
        
        
    }
    


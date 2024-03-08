package arreglos;

public class ArreglosUnidimensionales {
    public static void main(String[] args) {
        /*
         * Los arreglos son objetos, el new devuelve la referencia al espacio de memoria reservado
         * Los arreglos solo tienen componentes o valores del mismo tipo
         * Los arreglos se alojan contiguamente en memoria
         * A partir de indices enteros no negativos accedemos a los elementos del arreglo
         * Todo arreglo inicia desde el indice 0
         */

        int [] arr = {1,2,3,4,5,6};
        System.out.println("el tamaño del arreglo es "+ arr.length);
        System.out.println("El valor de la posicion 3 es " + arr[2]);

        int[] arr2 = new int[6]; // Esto es lo mismo que el primero pero sin valores de inicializacion
        System.out.println("el tamaño del arreglo es "+ arr2.length);
        System.out.println("El valor de la posicion 3 es " + arr2[2]);
        /*para darle un valor a la posicion 2 */
        arr2[2] = 10;
        System.out.println("El valor de la posicion 3 es " + arr2[2]);

        boolean[] booleanos = new boolean[3];

        System.out.println("El valor 1 del arreglo de bolleanos: " + booleanos[0]);

        for (int i = 0; i < booleanos.length; i++) {
            System.out.println("El valor" + i + " del arreglo de bolleanos con valor : " + booleanos[i]);
        }
    }
}

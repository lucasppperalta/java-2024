package arreglos;

public class ArreglosBidimensionales {
    public static void main(String[] args) {
        /*
         * 
         * 
         */

         //Arreglo bidiensional
        int [][] arrBidimensional = {{1,2}, {3,4}};
         //cada fila de la matriz es un conjunto de {}
         //cada columna es un elemento del {}
        System.out.println("Elemento 0 , 0 : "+ arrBidimensional[0][0]);
        System.out.println("Elemento 0 , 1 : "+ arrBidimensional[0][1]);
        System.out.println("Elemento 1 , 0 : "+ arrBidimensional[1][0]);
        System.out.println("Elemento 1 , 1 : "+ arrBidimensional[1][1]);

        for (int i = 0; i < arrBidimensional.length; i++) {
            for (int j = 0; j < arrBidimensional.length; j++) {
                System.out.println("Elemento: " +i + " , " + j + " : " + arrBidimensional[i][j]);
            }
        }

        int posicion1 = 2+2;
        int posicion2 = 0;

        arrBidimensional[posicion1][posicion2] = 10; //Asignacion
    }
    
}

package programacionEstructurada.iterativas;

public class blucleFor {
    public static void main(String[] args) {
        // bucle for conocemos la cantidad de veces que iteramos

        //declaracion del indice int i = 1
        //condicion del contador i <= 5 
        // incremento o decremento i++
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hola mundo!");
        }

        boolean activador = false;
        for(int i = 1; !activador && i <= 5; i++){
            System.out.println("Hola mundo!");
        }

        int j = 5;
        for (int i = 5; activador && i > 0; i--) {
            
            while (j > 0 ) {
                j --;
                System.out.println("Hola mundo! Bucle 2");
                if (j % 2 == 0) {
                    System.out.println(" Soy par");
                }
            }
            j = 5;
        }

        for (int i = 0; i < 10; i++) {
            for (int k = 10; k < 10; k--) {
                System.out.println("Valor Bucle 1 " + i + "Valor bucle 2 " + k);
            }
        }


    }
}

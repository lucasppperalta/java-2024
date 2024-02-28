package programacionEstructurada.iterativas;

public class MientrasYHacerMientras {
    public static void main(String[] args) {
        //Bucle while lo primero que hace es evaluar la condicion
        //siempre debe devolver un booleano

        int contador = 1; //el estado de esta variable debe cambiar

        while (contador <= 10) {
            System.out.println("Hola soy el numero "+ contador);
            contador ++; //contador = contador + 1; o contador+= 1;
        }

        // bucle do while ejecuta de 1 a n veces 

        do {
            System.out.println("Adios soy el numero = "+ contador);
            contador--;
        } while (contador > 0);

    }
}

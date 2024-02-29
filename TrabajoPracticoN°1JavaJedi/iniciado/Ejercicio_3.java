public class Ejercicio_3 {
    public static void main(String[] args) {
        /*Caracteres : Guarde en distintos espacios de memoria los caracteres de su nombre
         y luego imprimirlos por pantalla. ¿Por qué no puede usar "" en el char?*/
         char letra = 'L';
         char letra1 = 'u';
         char letra2 = 'c';
         char letra3 = 'a';
         char letra4 = 's';
         
         System.out.println(letra);
         System.out.println(letra1);
         System.out.println(letra2);
         System.out.println(letra3);
         System.out.println(letra4); 

        /*En Java, las comillas dobles ("") se utilizan para representar cadenas de caracteres (String).
        Sin embargo, para representar un único carácter, se utiliza el tipo de datos char, y para esto se
        utilizan comillas simples (''). Por lo tanto, no puedes usar comillas dobles para declarar un char
        en Java. */
    }
}

package programacionImperativa.conversiones;

public class Conversiones {
    public static void main(String[] args) {
        // Conversion de tipo promocion
        int value1 = 5;

        //Conversion de tipo contraccon
        int value2 = (int)5.50f; //es un casteo (cast)
        System.out.println(value2);
        // conversion de tipo implicita
        double value3 = 10 + 20.5d;
        System.out.println(value3);
    }
}

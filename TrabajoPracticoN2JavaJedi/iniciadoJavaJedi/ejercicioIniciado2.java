package TrabajoPracticoN2JavaJedi.iniciadoJavaJedi;

public class ejercicioIniciado2 {
    public static void main(String[] args) {
        /*Mis amigos : Guarde en variables el nombre de N cantidad de amigos, itere sobre
        esa cantidad mostrando el nombre de cada amigo. */
        String amigo1 = "setecientos setenta y seis mil";
        String amigo2 = "cuatrocientos veinte pesos la recaudación";
        String amigo3 = "para esta nueva edicion";
        String amigo4 = "del superclásico";
        String amigo5 = "Del fútbol argentino";
        String amigo6 = "MARTIIIIIIIIIIIIIIIIIIIIIIIIN";
        String amigo7 = "GOL GOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOLLL";
        int contador = 0;
        while (contador <= 7) {
            switch (contador) {
                case 1:
                    System.out.println(amigo1);
                    break;
                case 2:
                    System.out.println(amigo2);
                    break;
                case 3:
                    System.out.println(amigo3);
                    break;
                case 4:
                    System.out.println(amigo4);
                    break;
                case 5:
                    System.out.println(amigo5);
                    break;
                case 6:
                    System.out.println(amigo6);
                    break;
                case 7:
                    System.out.println(amigo7);
                    break;    
                default:
                    break;
            }
            contador ++;
        }
    }
}

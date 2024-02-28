package programacionEstructurada.condicionales;

public class SwitchCase {
    public static void main(String[] args) {
        int calificacion1 = 10;
        int calificacion2 = 5;
        String mensaje;
        int division = ((calificacion1 + calificacion2) / 2);
        System.out.println("Valor : " + division);
        switch ( division ) {
            case 1 : // no hace nada, como no hay break continua 
            case 2 : // no hace nada, como no hay break continua
            case 3 : // no hace nada, como no hay break continua
            case 4 : // no hace nada, como no hay break continua
            case 5 : // este es el valor que arroja. EJECUTA
                mensaje = "Desaprobado";
                break;
            case 6 :
            case 7 :
            case 8 :
            case 9 :
            case 10 :
                mensaje = "Aprobado";
                break;
        
            default:
                mensaje = "Valor no válido";
                break;
        } 
        System.out.println(mensaje);
        System.out.println("Continuacion del switch");
    }

    
}

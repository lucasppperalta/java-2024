package programacionEstructurada;

public class EstructuraElseIf {
    public static void main(String[] args) {
        //Las variables booleanas siempre se escriben como forma de pregunta
        
        boolean esUnDiaDeClases = false;
        final String DIA = "Viernes";

        //if (esUnDiaDeClases) {
        //    System.out.println("Hoy es " + DIA + " si hay clases");
        //}else{
         //   System.out.println("Hoy es "+ DIA+ " y no hay clases");
        //}

        if (esUnDiaDeClases && DIA == "Lunes"){
            System.out.println("Hoy es " + DIA +" y no hay clases");
        }else if(!esUnDiaDeClases){
            System.out.println("Hoy es "+ DIA + " y no hay clases" );
        }else {
            System.out.println("Hoy es martes por lo que no hay informacion de las clases");
        }
        //minuto 55:14
    }
}

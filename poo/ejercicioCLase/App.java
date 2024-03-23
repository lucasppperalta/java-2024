package poo.ejercicioCLase;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        Vehiculo vehiculo = new Vehiculo("Mercedes Benz", 4, Boolean.TRUE,"100","0");

        Persona persona = new Persona(123456789L,"Lucas",LocalDate.of(1996, 8, 26),null);

        System.out.println("Nombre de persona"+ persona.getNombre());
        System.out.println("Dni de persona "+ persona.getDni());
        System.out.println("Fecha de nacimiento "+persona.getFechaDeNacimiento());
        System.out.println("Marca de Vehiculo "+ persona.getVehiculo().getMarca());


        //Arrancamos Vehiculo
        persona.getVehiculo().arrancarVehiculo();
        //Apaga la alarma
        persona.getVehiculo().setLaAlarmaEstaEncendida(Boolean.FALSE);
        //arrancamos vehiculo
        persona.getVehiculo().arrancarVehiculo();
    }
    
}

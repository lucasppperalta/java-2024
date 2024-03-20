package poo;

public class App {
    public static void main(String[] args) {
        // new devuelve la dirección de memoria que hace referencia al objeto creado
        Persona persona = new Persona(); // Instancia de un objeto

        // Asignacion de valores 
        /*persona.nombre = "Lucas";
        persona.apellido = "Peralta";
        persona.edad = 27;


        // Acceso a la informacion del objeto
        System.out.println(persona.nombre);
        System.out.println(persona.apellido);
        System.out.println(persona.edad);*/

        persona.setNombre("Lucas");
        persona.setApellido("Peralta");
        persona.setEdad(27);
        System.out.println(persona.getNombre());
        System.out.println(persona.getApellido());
        System.out.println(persona.getEdad());
        persona.setNombre("Rodrigo");
        System.out.println(persona.getNombre());

    }
}

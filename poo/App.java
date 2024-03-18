package poo;

public class App {
    public static void main(String[] args) {
        // new devuelve la dirección de memoria que hace referencia al objeto creado
        Persona persona = new Persona(); // Instancia de un objeto
        persona.nombre = "Lucas";
        persona.apellido = "Peralta";
        persona.edad = 27;

        System.out.println(persona.nombre);
        System.out.println(persona.apellido);
        System.out.println(persona.edad);


    }
}

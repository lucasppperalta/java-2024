package poo;

public class Persona {
        //Atributos no variables. Porque son atributos o informacion de la clase
        private String nombre;
        private String apellido;
        private int edad;
        
        // Metodos
        //[clasificador] [tipoDeRetorno] nombreDelMetodo([<expresiones>])){}
        // puede ser public 

        public String getNombre (){
                return this.nombre; //this hace referencia a sí mismo
        }

        public String getApellido(){
                return this.apellido;
        }

        public int getEdad(){
                return this.edad;
        }

        public void setNombre(String nombre){
                if(this.nombre == null){ // Para que no se pueda modificar luego el nombre
                        this.nombre = nombre;
                }
                
        }

        public void setApellido(String apellido){
                this.apellido= apellido;
        }
        public void setEdad(int edad){
                this.edad = edad;
        }

}

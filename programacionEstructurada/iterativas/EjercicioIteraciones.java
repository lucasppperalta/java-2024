public class EjercicioIteraciones {
    public static void main(String[] args) {
        /*
         * 1,2,3,4,5
         * 
         * Para valores igual o menor a 1 no lo consideramos primos
         * Para valores menor a 2 no lo consideramos primos
         * 
         * Tenemos que comprobar que dado los valores de 1 a n que no exista un valor tal que el numero evaluacion % n % == 0  
         * 
         * 
         */
        int numero = 220;  
        if (numero == 2) {
            System.out.println(numero + " Es un valor primo");
        }else{
            
            //3,4,5 ....
            for (int divisor = 2; divisor < numero; divisor++) {
                
                if (numero % divisor == 0){
                    System.out.println(numero + " Es un valor no primo");
                    break;
                }else if(divisor == numero -1)// Si divisor es igual al
                {System.out.println(numero + " Es un valor primo");

                } 
            }
        }
    }
}

package programacionImperativa.tiposDatos;

public class ByteShortLongAndWidth {
    public static void main(String[] args) {
        

        //Byte value - 8 bits
        System.out.println("Rango del valor del byte: " + Byte.MIN_VALUE + " " + Byte.MAX_VALUE);

        byte minvalue = -127;
        byte maxValue = 127;

        //Short value - 16 bits - Clase Wrapper
        System.out.println("Rango del valor del short: " + Short.MIN_VALUE + " " + Short.MAX_VALUE);
    
        short minvalueShort = -32768;
        short maxValueShort = 32767;

        //Integer Value - 32 bits - clase wrapper
        System.out.println("Rango del valor del integer: " + Integer.MIN_VALUE + " " + Integer.MAX_VALUE);
    
        int minvalueInteger = -2147483648;
        int maxValueInteger = 2147483647;

        // Tipo long 

        long valorLong = 3276712313l;
    }
}

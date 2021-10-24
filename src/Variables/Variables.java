package Variables;

public class Variables {

    public static void main(String[] args) {
        //Variables en cualquier momento puede cambiar
        int enteroEdad = 28; //Primitiva int usado para enteros
        System.out.println("enteroEdad = " + enteroEdad);
        String nombre = "David"; //String es de tipo clase de maneja como objeto
        System.out.println("nombre = " + nombre);
        //var - inferencia de tipos en java
        var años = 28;//el nombre se puede definir inicial (minusculas, _ , $) son valores permitidos al iniciar, inicia con minuscula por camelCase
        años++;
        años+=2;
        System.out.println("años = " + años);

    } 
}

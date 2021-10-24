package funcional.holamundo.clasesimplementaciones;

import funcional.holamundo.interfaces.Proveedor;

import java.util.Random;

public class NumerosAleatorio implements Proveedor {
    @Override
    public Integer obtener() {
        Random rand = new Random();
        return rand.nextInt(1000);
    }
}

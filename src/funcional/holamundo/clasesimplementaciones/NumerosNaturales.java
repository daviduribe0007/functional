package funcional.holamundo.clasesimplementaciones;

import funcional.holamundo.interfaces.Proveedor;

import java.util.Random;

public class NumerosNaturales implements Proveedor {

    static Integer numero = 0;

    @Override
    public Integer obtener() {


            return numero++;

    }
}

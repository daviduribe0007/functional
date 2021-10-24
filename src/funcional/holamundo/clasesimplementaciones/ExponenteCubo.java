package funcional.holamundo.clasesimplementaciones;

import funcional.holamundo.interfaces.Funcion;

public class ExponenteCubo implements Funcion {
    @Override
    public Integer aplicar(Integer valor) {
        return valor*valor*valor;
    }
}

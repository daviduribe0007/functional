package funcional.holamundo.clasesimplementaciones;

import funcional.holamundo.interfaces.Funcion;

public class ExponenteCuadrado implements Funcion {
    @Override
    public Integer aplicar(Integer valor) {
        return valor*valor;
    }
}

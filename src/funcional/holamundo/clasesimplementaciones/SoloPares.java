package funcional.holamundo.clasesimplementaciones;

import funcional.holamundo.interfaces.Predicado;

public class SoloPares implements Predicado {
    @Override
    public Boolean test(Integer valor) {
        return valor%2 == 0;
    }
}

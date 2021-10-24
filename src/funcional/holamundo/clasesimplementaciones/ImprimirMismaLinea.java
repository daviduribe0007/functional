package funcional.holamundo.clasesimplementaciones;

import funcional.holamundo.interfaces.Consumidor;

public class ImprimirMismaLinea implements Consumidor {
    @Override
    public void aceptar(Integer valor) {
        System.out.print( valor + ",");
    }
}

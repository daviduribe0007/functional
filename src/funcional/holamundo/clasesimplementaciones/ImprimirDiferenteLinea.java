package funcional.holamundo.clasesimplementaciones;

import funcional.holamundo.interfaces.Consumidor;

public class ImprimirDiferenteLinea implements Consumidor {
    @Override
    public void aceptar(Integer valor) {
        System.out.println( valor + ",");
    }
}

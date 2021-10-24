package funcional.holamundo;

import funcional.holamundo.interfaces.Consumidor;
import funcional.holamundo.interfaces.Funcion;
import funcional.holamundo.interfaces.Predicado;
import funcional.holamundo.interfaces.Proveedor;

import java.util.ArrayList;
import java.util.List;

public class SuperFunciones {

    public static List<Integer> filtrar(List<Integer> valores, Predicado predicado){
        List<Integer> resultados = new ArrayList<>();
        for (Integer valor:valores) {
            if (predicado.test(valor)){
                resultados.add(valor);

            }
        }
        return resultados;
    }

    public static List<Integer> proveer(Integer cantidadDenumeros, Proveedor proveedor){
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < cantidadDenumeros; i++) {
            numbers.add(proveedor.obtener());
        }
        return numbers;
    }

    public static List<Integer> transform(List<Integer> valores, Funcion funcion){
        List<Integer> resultados = new ArrayList<>();
        for (Integer valor:valores) {
                resultados.add(funcion.aplicar(valor));
        }
        return resultados;
    }

    public static List<Integer> Realizar( List<Integer> valores, Consumidor consumidor){

        for (Integer valor:valores) {
            consumidor.aceptar(valor);
        }
        return valores;
    }
}

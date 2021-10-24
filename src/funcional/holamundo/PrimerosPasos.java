package funcional.holamundo;

import funcional.holamundo.clasesimplementaciones.*;

import java.util.ArrayList;
import java.util.List;

public class PrimerosPasos {

    public static void main(String[] args) {
        new PrimerosPasos();
    }

    public PrimerosPasos() {

        //PROCESOIMPERATIVO
        // Crear lista de enteros
        List<Integer> numeros = crearLista();
        System.out.println("numeros = " + numeros);
        //Solo obtener los pares
        List<Integer> pares = filtrarEnteros(numeros);
        System.out.println("pares = " + pares);
        //pasar cada numero al cuadrado
        List<Integer> cuadrados = numerosAlCuadrado(numeros);
        System.out.println("cuadrados = " + cuadrados);
        //mostrar cada cuadrado por pantalla
        mostrarListaCuadradosUnoAUno(cuadrados);
        // obtener la suma de cuadrados
        sumarListaCuadrados(cuadrados);
        //INPERATIVO
        //-----------------------------------------------------------------
        //PROCESO DECLARATIVO
        // Crear lista de enteros
        List<Integer> listaNumeros = SuperFunciones.proveer(10,new NumerosAleatorio());
        List<Integer> numerosNaturales = SuperFunciones.proveer(10,new NumerosNaturales());

        //Solo obtener los pares
        List<Integer> paresFiltrados = SuperFunciones.filtrar(listaNumeros,new SoloPares());
        List<Integer> imparesFiltrados = SuperFunciones.filtrar(listaNumeros,new SoloImpares());
        List<Integer> paresFiltradosNaturales = SuperFunciones.filtrar(numerosNaturales,new SoloPares());
        List<Integer> imparesFiltradosNaturales = SuperFunciones.filtrar(numerosNaturales,new SoloImpares());
        System.out.println("paresFiltrados Declarativo= " + paresFiltrados);
        System.out.println("imparesFiltrados Declarativo= " + imparesFiltrados);
        System.out.println("paresFiltradosNaturales = " + paresFiltradosNaturales);
        System.out.println("imparesFiltradosNaturales = " + imparesFiltradosNaturales);

        //pasar cada numero al cuadrado
        List<Integer> exponentesCuadrado = SuperFunciones.transform(numerosNaturales,new ExponenteCuadrado());
        System.out.println("exponentes al cuadrado de los naturales = " + exponentesCuadrado);

        List<Integer> exponentesCubo = SuperFunciones.transform(numerosNaturales,new ExponenteCubo());
        System.out.println("exponentes al cubo de los naturales = " + exponentesCubo);
        
        //mostrar cada cuadrado por pantalla
        System.out.println("En la misma linea" + SuperFunciones.Realizar(numerosNaturales,new ImprimirMismaLinea()));
        System.out.println("En diferente linea" + SuperFunciones.Realizar(numerosNaturales,new ImprimirDiferenteLinea()));
        // obtener la suma de cuadrados



    }

    private void sumarListaCuadrados(List<Integer> cuadrados) {
        Integer contador = 0;
        for (Integer pares : cuadrados) {

           contador+= pares;

        }
        System.out.println("contador total de cuadrados = " + contador);
    }

    private void mostrarListaCuadradosUnoAUno(List<Integer> cuadrados) {
        for (Integer pares : cuadrados) {

                System.out.println("pares = " + pares);

        }
    }

    private List<Integer> crearLista() {
        return List.of(1, 2, 3, 4, 5, 6, 7, 7, 8, 9, 9, 10, 10);
    }

    private List<Integer> filtrarEnteros(List<Integer> numeros) {
        List<Integer> integers = new ArrayList<>();
        for (Integer pares : numeros) {
            if (pares % 2 == 0) {
                integers.add(pares);
            }
        }
        return integers;
    }

    private List<Integer> numerosAlCuadrado(List<Integer> numeros) {
        List<Integer> integers = new ArrayList<>();
        for (Integer pares : numeros) {
            integers.add(pares * pares);
        }
        return integers;
    }


}

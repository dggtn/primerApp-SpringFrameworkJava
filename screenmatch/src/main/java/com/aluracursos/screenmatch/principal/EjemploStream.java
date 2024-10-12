package com.aluracursos.screenmatch.principal;

import java.util.Arrays;
import java.util.List;

public class EjemploStream {
    public void muestraEjemplo(){
        List<String> nombre= Arrays.asList("Brenda","Luis","Fernanda","Eric","Genesys");
        nombre.stream()
                .sorted()
                .forEach(System.out::println);

    }
}

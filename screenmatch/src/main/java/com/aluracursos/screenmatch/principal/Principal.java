package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.model.DatosSerie;
import com.aluracursos.screenmatch.model.DatosTemporadas;
import com.aluracursos.screenmatch.service.ConsumoAPI;
import com.aluracursos.screenmatch.service.ConvierteDatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    private Scanner teclado = new Scanner(System.in);
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private final String URL_BASE = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=4fc7c187";
    private ConvierteDatos conversor = new ConvierteDatos();
    public void mostrarMenu(){
        System.out.println("porfavor escribe el nombre de la serie que deseas buscar");
        //Busca los datos generales de las series
        var nombreSerie = teclado.nextLine();

        var consumoApi = new ConsumoAPI();
        var json = consumoAPI.obtenerDatos(URL_BASE+nombreSerie.replace(" ","+")+API_KEY);
        var datos = conversor.obtenerDatos(json, DatosSerie.class);
        System.out.println(datos);

        //busca los datos de todas las temporadas
        List<DatosTemporadas> temporadas = new ArrayList<>();
        for (int i = 1; i <= datos.totaltemporadas() ; i++) {
            json = consumoApi.obtenerDatos(URL_BASE+nombreSerie.replace(" ","+")+"Season"+i+API_KEY);
            var datosTemporadas = conversor.obtenerDatos(json,DatosTemporadas.class);
            temporadas.add(datosTemporadas);
        }

        temporadas.forEach(System.out::println);

    }
}

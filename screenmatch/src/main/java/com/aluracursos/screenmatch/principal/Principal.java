package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.service.ConsumoAPI;

import java.util.Scanner;

public class Principal {
    private Scanner teclado = new Scanner(System.in);
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private final String URL_BASE = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=4fc7c187";
    public void mostrarMenu(){
        System.out.println("porfavor escribe el nombre de la serie que deseas buscar");
        var nombreSerie = teclado.nextLine();

        var consumoApi = new ConsumoAPI();
        var json = consumoAPI.obtenerDatos(URL_BASE+nombreSerie.replace(" ","+")+API_KEY);


    }
}

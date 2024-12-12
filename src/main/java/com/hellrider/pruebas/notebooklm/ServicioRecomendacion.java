package com.hellrider.pruebas.notebooklm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ServicioRecomendacion {

    @Autowired
    private CatalogoPeliculas catalogoPeliculas;

    public void mostrarRecomendaciones(String genero) {
        List<Pelicula> peliculas = catalogoPeliculas.obtenerRecomendaciones(genero);
        System.out.println("Recomendaciones para el género " + genero + ":");
        for (Pelicula pelicula : peliculas) {
            System.out.println("- " + pelicula.getTitulo());
        }
    }
}

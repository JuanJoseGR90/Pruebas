package com.hellrider.pruebas.notebooklm;

import org.springframework.stereotype.Component;
import java.util.Arrays;
import java.util.List;

@Component
public class RecomendadorPeliculasImpl implements CatalogoPeliculas {

    @Override
    public List<Pelicula> obtenerRecomendaciones(String genero) {
        if ("Accion".equals(genero)) {
            return Arrays.asList(new Pelicula("Misión Imposible", "Accion"),
                    new Pelicula("John Wick", "Accion"));
        } else if ("Comedia".equals(genero)) {
            return Arrays.asList(new Pelicula("Superbad", "Comedia"),
                    new Pelicula("The Hangover", "Comedia"));
        } else {
            return Arrays.asList(new Pelicula("El Padrino", "Drama"),
                    new Pelicula("Ciudadano Kane", "Drama"));
        }
    }
}

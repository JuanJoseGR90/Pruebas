package com.hellrider.pruebas.notebooklm;

import java.util.List;

public interface CatalogoPeliculas {

    List<Pelicula> obtenerRecomendaciones(String genero);

}

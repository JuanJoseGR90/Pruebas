package com.hellrider.pruebas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MovieRecommender {

    @Autowired
    private MovieCatalog[] movieCatalogs;

    public MovieRecommender() {}

    public void printCatalogs() {
        for (MovieCatalog catalog : movieCatalogs) {
            System.out.println(catalog.getMovieCatalog());
        }
    }
}

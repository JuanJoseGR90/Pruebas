package com.hellrider.pruebas.varios;

import com.hellrider.pruebas.MovieCatalog;
import org.springframework.beans.factory.annotation.Autowired;

public class MovieRecommender {

    @Autowired
    private MovieCatalog[] movieCatalogs;

    public void printCatalogs() {
        for (MovieCatalog catalog : movieCatalogs) {
            System.out.println(movieCatalogs);
        }
}

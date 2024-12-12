package com.hellrider.pruebas;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class ComedyMovieCatalog implements MovieCatalog {

    @Override
    public String getMovieCatalog() {
        return "Comedy";
    }

}

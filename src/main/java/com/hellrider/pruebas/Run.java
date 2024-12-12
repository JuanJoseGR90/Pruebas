package com.hellrider.pruebas;

import com.hellrider.pruebas.notebooklm.ServicioRecomendacion;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class Run {

    public static void main(String[] args) throws IOException {

        ApplicationContext applicationContext = SpringApplication.run(Run.class, args);

        ServicioRecomendacion servicioRecomendacion = applicationContext.getBean(ServicioRecomendacion.class);

        servicioRecomendacion.mostrarRecomendaciones("Accion");
    }

}

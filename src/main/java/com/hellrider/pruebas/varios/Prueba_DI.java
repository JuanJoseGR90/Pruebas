package com.hellrider.pruebas.varios;

public class Prueba_DI {

    private Dependencia dep;

//    Inyección por constructor
    public Prueba_DI(Dependencia dep) {
        this.dep = dep;
    }

//    Inyección por factory method
    public static Prueba_DI getInstance(Dependencia dep) {
        return new Prueba_DI(dep);
    }

//    Inyección por setter
    public void setDep(Dependencia dep) {
        this.dep = dep;
    }

}

class Dependencia {

    private String nombreDep;

    public Dependencia(String nombreDep) {
        this.nombreDep = nombreDep;
    }
}

class Run_DI {

    public static void main(String[] args) {

        Dependencia dep = new Dependencia("la dependencia");

        Prueba_DI prueba = new Prueba_DI(dep);

        Prueba_DI.getInstance(dep);

        prueba.setDep(dep);

    }
}

package com.hellrider.pruebas.varios;

@FunctionalInterface
public interface InterfazFuncional {

    int multiplicar(int n);

    static void getObject() {
        String name;
    }
}

class UsoInterfazFuncional {

    public static void main(String[] args) {
        int v = 9;

        InterfazFuncional r = (int a) -> a * a;

        v = r.multiplicar(v);

        System.out.println(v);
    }
}

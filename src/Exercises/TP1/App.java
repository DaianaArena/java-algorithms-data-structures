package Exercises.TP1;

import Exercises.TP1.src.edificio.Edificio;

public class App {
    public static void main(String[] args) throws Exception {
    
        int o = 9;
        double s = 10;

        Edificio edificio = new Edificio(9, 10);

        System.out.println(edificio.mostrar());
        System.out.println(edificio.cantidadoficinasactivas(o,s));
        System.out.println(edificio.encontrarprimeroficinaactiva(o, s).mostrar());
    }
}

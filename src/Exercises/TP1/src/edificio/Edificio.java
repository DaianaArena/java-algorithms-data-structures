package Exercises.TP1.src.edificio;

import Exercises.TP1.src.oficina.Oficina;

public class Edificio {
    
    private int numOficinas;
    private double superficie;


    
    //constructor
    public Edificio(int o, int s) {
        this.numOficinas = o;
        this.superficie = s;
    }

    public boolean obtenersensor(int p, int o){

        //
        return false;
     }

   
    public int cantidadoficinasactivas (int numOf, int numPisos){

        //devolverá la cantidad de oficinas activas del edificio (valor entre 0 y 90).
        int totalActivo = 0;

        return totalActivo;

    }



    public Oficina encontrarprimeroficinaactiva(){
        //devolverá un objeto de la clase oficina (con los valores de piso y oficina), que representará la primera oficina activa encontrada partiendo desde el primer piso.
        // llama a obtener sensor
        int p = 1;
        int o = 1;

        Oficina primerActivo = new Oficina(p, o);
        

        return primerActivo;

    }

 


    public String mostrar() {
        return "Edificio de  " + numOficinas + " oficinas divididas en  " + superficie + " pisos.";
    }

}

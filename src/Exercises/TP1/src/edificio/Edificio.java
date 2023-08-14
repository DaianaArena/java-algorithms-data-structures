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

        return  (o%2==0);
    }

   
    public int cantidadoficinasactivas (int numOf, double superficie){

        //devolverá la cantidad de oficinas activas del edificio (valor entre 0 y 90).
        int totalActivo = 0;
        int p = 1;
        int o = 1;

        do {

            boolean check = obtenersensor( p,  o);
            //System.out.println(" p: "+p+"o: " + o + " check: " +  check);
            if (check == true) {
                totalActivo++;                
            }

            if (o < numOf){
                o++;
            }  else {
                p++;
                o=1;
            }
            
        } while (p <= superficie);


        return totalActivo;

    }



    public Oficina encontrarprimeroficinaactiva(int numOf, double superficie){
        //devolverá un objeto de la clase oficina (con los valores de piso y oficina)
        //que representará la primera oficina activa encontrada partiendo desde el primer piso.
        
        int p = 1;
        int o = 1;
        int pAct = 0;
        int oAct = 0;

        do {
            // llama a obtener sensor
            boolean check = obtenersensor( p,  o);
            if (check == true) {
                  pAct = p;
                  oAct = o;
                  p = (int) superficie + 1;        
            } else {

                if (o < numOf){
                    o++;
                }  else {
                    p++;
                    o=1;
                }
            }
            
        } while (p <= superficie);


        
        Oficina primerActivo = new Oficina(pAct, oAct); 
        return primerActivo;

    }

 


    public String mostrar() {
        return "Edificio de  " + superficie + " pisos. Cuenta con " + numOficinas + " oficinas. En total son " + superficie*numOficinas +" oficinas." ;
    }

}

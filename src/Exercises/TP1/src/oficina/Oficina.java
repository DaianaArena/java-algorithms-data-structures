package Exercises.TP1.src.oficina;

public class Oficina {
    
    private int piso;
    private int oficina;

    public Oficina(int p, int o) {
        this.piso = p;
        this.oficina = o;
    }

    

     public String mostrar() {
        return "Oficina " + oficina + " del piso " + piso;
    }


}

public class Obra
{
    private final String nit;
    private String nombreObra;
    private Ayudante[] ayudante;
    private Oficial[] oficial;
    private Maestro[] maestro;
    private int numAyudantes;
    private int numOficiales;
    private int numMaestros;
    
    public Obra(String nit, String nombreObra){
        if(nit != null) this.nit = nit;
        else this.nit ="";
        setNombreObra(nombreObra);
        ayudante = new Ayudante[50];
        oficial = new Oficial[50];
        maestro = new Maestro[50];
        numAyudantes =0;
        numOficiales =0;
        numMaestros =0;
    }
    
    public String getNit(){
        return nit;
    }
    
    public String getNombreObra(){
        return nombreObra;
    }
    public void setNombreObra(String nombreObra){
        if(nombreObra != null) this.nombreObra = nombreObra;
        else this.nombreObra ="";
    }
    
    public int getNumAyudantes(){
        return numAyudantes;
    }
    
    public int getNumOficiales(){
        return numOficiales;
    }
    
    public int getNumMaestros(){
        return numMaestros;
    }
    
    public double calcularPromedioGeneral(){
        double promedio =0;
        for(int i=0; i<numAyudantes; i++){
            promedio = promedio + ayudante[i].calcularPromedio() / numAyudantes;
        }
        for(int i=0; i<numOficiales; i++){
            promedio = promedio + ayudante[i].calcularPromedio() / numOficiales;
        }
        for(int i=0; i<numMaestros; i++){
            promedio = promedio + ayudante[i].calcularPromedio() / numMaestros;
        }
        return promedio /3;
    }
}









































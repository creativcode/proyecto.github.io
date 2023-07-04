public class Obra
{
    private final String nit;
    private String nombreObra;
    private String direccion;
    private Trabajador[] trabajador;
    private int numTrabajadores;
    
    public Obra(String nit, String nombreObra, String direccion){
        if(nit != null) this.nit =nit;
        else this.nit = "";
        setNombreObra(nombreObra);
        setDireccion(direccion);
        trabajador = new Trabajador[50];
        numTrabajadores =0;
    }
    
    public String getNit(){
        return nit;
    }
    
    public String getNombreObra(){
        return nombreObra;
    }
    public void setNombreObra(String nombreObra){
        if(nombreObra != null){
            this.nombreObra = nombreObra;
        }else{
            this.nombreObra = "";
        }
    }
    
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        if(direccion != null){
            this.direccion = direccion;
        }else{
            this.direccion ="";
        }
    }
    
    public int getNumTrabajadores(){
        return numTrabajadores;
    }
    
    public double calcularPromedioGeneral(){
        double promedio = 0;
        for(int i=0;i<numTrabajadores;i++){
            promedio = promedio + trabajador[i].calcularPromedio();      
        }
        promedio = promedio / numTrabajadores; 
        return promedio;
    }
    
    public void adicionarTrabajador(String identificacion, String nombre, String rango, double sueldouno, double sueldodos, double sueldotres){
        Trabajador t = new Trabajador(identificacion, nombre, rango, sueldouno, sueldodos, sueldotres);
        trabajador[numTrabajadores] = t;
        numTrabajadores++;
    }
}




















public class Obra {
    private final String nit;
    private String nombreObra;
    private String direccion;
    private Ayudante[] ayudantes;
    private Oficial[] oficiales;
    private Maestro[] maestros;
    private int numAyudantes;
    private int numOficiales;
    private int numMaestros;

    public Obra(String nit, String nombreObra, String direccion) {
        if (nit != null) this.nit = nit;
        else this.nit = "";
        
        setNombreObra(nombreObra);
        setDireccion(direccion);
        ayudantes = new Ayudante[50];
        oficiales = new Oficial[50];
        maestros = new Maestro[50];
        numAyudantes = 0;
        numOficiales = 0;
        numMaestros = 0;
    }

    public String getNit() {
        return nit;
    }

    public String getNombreObra() {
        return nombreObra;
    }
    public void setNombreObra(String nombreObra) {
        if (nombreObra != null) this.nombreObra = nombreObra;
        else this.nombreObra = "";
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        if (direccion != null) this.direccion = direccion;
        else this.direccion = "";
    }

    public int getNumAyudantes() {
        return numAyudantes;
    }
    
    public int getNumOficiales() {
        return numOficiales;
    }

    public int getNumMaestros() {
        return numMaestros;
    }

    public double calcularPromedioGeneral() {
        double promedio = 0;
        
        for (int i=0;i<numAyudantes;i++) {
            promedio = promedio + ayudantes[i].calcularPromedio();
        }
        for (int i=0;i<numOficiales;i++) {
            promedio = promedio + oficiales[i].calcularPromedio();
        }
        for (int i = 0; i < numMaestros; i++) {
            promedio = promedio + maestros[i].calcularPromedio();
        }
        return promedio / 3;
    }

    public void adicionarAyudante(String identificacion, String nombre, String rango, double sueldouno, double sueldodos, double sueldotres) {
        ayudantes[numAyudantes] = new Ayudante(identificacion, nombre, rango, sueldouno, sueldodos, sueldotres);
        numAyudantes++;
    }

    public void adicionarOficial(String identificacion, String nombre, String rango, double sueldouno, double sueldodos, double sueldotres) {
        oficiales[numOficiales] = new Oficial(identificacion, nombre, rango, sueldouno, sueldodos, sueldotres);
        numOficiales++;
    }

    public void adicionarMaestro(String identificacion, String nombre, String rango, double sueldouno, double sueldodos, double sueldotres) {
        maestros[numMaestros] = new Maestro(identificacion, nombre, rango, sueldouno, sueldodos, sueldotres);
        numMaestros++;
    }
}

public class Obrero {
    private int id;
    private String cedula;
    private String nombre;
    private double sueldo;
    private double bonos;
    private double estras;

    public Obrero(int id, String cedula, String nombre, double sueldo, double bonos, double estras) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.bonos = bonos;
        this.estras = estras;
    }
    
    public Obrero(String cedula, String nombre, double sueldo, double bonos, double estras) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.bonos = bonos;
        this.estras = estras;
    }

    public int getId() {
        return id;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public double getBonos() {
        return bonos;
    }

    public double getEstras() {
        return estras;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setBonos(double bonos) {
        this.bonos = bonos;
    }

    public void setEstras(double estras) {
        this.estras = estras;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(id)
          .append("\nCedula: ").append(cedula)
          .append("\nNombre: ").append(nombre)
          .append("\nSueldo: ").append(sueldo)
          .append("\nBonos: ").append(bonos)
          .append("\nEstras: ").append(estras);
        return sb.toString();
    }
}


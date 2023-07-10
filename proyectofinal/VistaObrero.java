import java.util.List;

public class VistaObrero {

    public void verObrero(Obrero obrero) {
        System.out.println("Datos del Obrero:");
        System.out.println("ID: " + obrero.getId());
        System.out.println("Cedula: " + obrero.getCedula());
        System.out.println("Nombre: " + obrero.getNombre());
        System.out.println("Sueldo: " + obrero.getSueldo());
        System.out.println("Bonos: " + obrero.getBonos());
        System.out.println("Estras: " + obrero.getEstras());
    }

    public void verObreros(List<Obrero> obreros) {
        System.out.println("Datos de los obreros:");
        for (Obrero obrero : obreros) {
            verObrero(obrero);
            System.out.println();
        }
    }
}

import java.util.InputMismatchException;
import java.util.Scanner;

public class ObreroInterfaz {
    private static final ControlObrero control;
    private static final Scanner sc = new Scanner(System.in);

    static {
        try {
            control = new ControlObrero();
        } catch (ExcepcionAcceso e) {
            System.out.println("Error en el controlador");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String action;
        while (true) {
            System.out.println("-------------------------");
            System.out.println("[L]istar | [C]onsultar por ID | [R]egistrar | [A]ctualizar | [E]liminar | [S]alir: ");
            action = sc.next().toUpperCase();
            try {
                switch (action) {
                    case "L":
                        listarObreros();
                        break;
                    case "C":
                        consultarObreroPorID();
                        break;
                    case "R":
                        registrarObrero();
                        break;
                    case "A":
                        actualizarObrero();
                        break;
                    case "E":
                        eliminarObrero();
                        break;
                    case "S":
                        return;
                    default:
                        System.out.println("Acción inválida");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void registrarObrero() {
        Obrero obrero = guardarObrero();
        control.registrar(obrero);
        System.out.println("Ingresado Correctamente");
        System.out.println("Registro realizado: " + obrero.getId());
    }

    private static void actualizarObrero() {
        int id = leerId();
        Obrero obrero = control.obtenerObreroPorId(id);
        if (obrero != null) {
            System.out.println("**************Datos originales**************");
            System.out.println(obrero);
            System.out.println("Actualize los nuevos datos");

            String cedula = leerString("Ingrese la cedula del obrero: ");
            String nombre = leerString("Ingrese el nombre del obrero: ");
            double sueldo = leerPago("Ingrese el sueldo: ");
            double bonos = leerPago("Ingrese los bonos: ");
            double estras = leerPago("Ingrese las estras: ");

            obrero = new Obrero(id, cedula, nombre, sueldo, bonos, estras);
            control.actualizar(obrero);
            System.out.println("Actualizado");
        } else {
            System.out.println("Obrero no se encuentra.");
        }
    }

    private static void eliminarObrero() {
        int id = leerId();
        Obrero obrero = control.obtenerObreroPorId(id);
        if (obrero != null) {
            control.eliminar(obrero);
            System.out.println("Obrero eliminado: " + obrero.getId());
        } else {
            System.out.println("Obrero no se encuentra.");
        }
    }

    private static void listarObreros() {
        control.verObreros();
    }

    private static void consultarObreroPorID() {
        int id = leerId();
        Obrero obrero = control.obtenerObreroPorId(id);
        if (obrero != null) {
            System.out.println("Obrero encontrado:");
            System.out.println(obrero);
        } else {
            System.out.println("Obrero no encontrado.");
        }
    }

    private static Obrero guardarObrero(){    
        String cedula = leerString("Ingrese la cedula del obrero: ");
        String nombre = leerString("Ingrese el nombre del obrero: ");
        double sueldo = leerPago("Ingrese el sueldo: ");
        double bonos = leerPago("Ingrese los bonos: ");
        double estras = leerPago("Ingrese las estras: ");

        return new Obrero(cedula, nombre, sueldo, bonos, estras);
    }

    private static int leerId() {
        int id;
        while (true) {
            try {
                System.out.println("Ingrese el ID del obrero (número entero): ");
                id = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error en el número");
                sc.next();
            }
        }
        return id;
    }

    private static double leerPago(String message) {
        double pago;
        while (true) {
            try {
                System.out.println(message);
                pago = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error en el número");
                sc.next();
            }
        }
        return pago;
    }

    private static String leerString(String message) {
        String s;
        while (true) {
            System.out.println(message);
            s = sc.next().trim();
            if (s.length() <= 2) {
                System.out.println("El tamaño de la cadena debe ser >= 2");
            } else {
                break;
            }
        }
        return s;
    }
}

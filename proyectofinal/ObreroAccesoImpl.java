import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ObreroAccesoImpl implements ObreroAcceso
{
    private static final String INSERT_QUERY = "INSERT INTO obrero (cedula, nombre, sueldo, bonos, estras) VALUES (?, ?, ?, ?, ?)";
    private static final String SELECT_ALL_QUERY = "SELECT * FROM obrero ORDER BY id";
    private static final String UPDATE_QUERY = "UPDATE obrero SET cedula=?, nombre=?, sueldo=?, bonos=?, estras=? WHERE id=?";
    private static final String DELETE_QUERY = "DELETE FROM obrero WHERE id=?";
    private static final String SELECT_BY_ID_QUERY = "SELECT * FROM obrero WHERE id = ?";

    @Override
    public boolean registrarObrero(Obrero obrero) throws ExcepcionAcceso {
        try (Connection con = ConexionObrero.conectar();
             PreparedStatement pstmt = con.prepareStatement(INSERT_QUERY)) {
            pstmt.setString(1, obrero.getCedula());
            pstmt.setString(2, obrero.getNombre());
            pstmt.setDouble(3, obrero.getSueldo());
            pstmt.setDouble(4, obrero.getBonos());
            pstmt.setDouble(5, obrero.getEstras());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw new ExcepcionAcceso("Error en el registro de obrero", e);
        }
    }

    @Override
    public List<Obrero> obtenerObreros() throws ExcepcionAcceso {
        List<Obrero> listaObrero = new ArrayList<>();

        try (Connection con = ConexionObrero.conectar();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(SELECT_ALL_QUERY)) {
            while (rs.next()) {
                Obrero obrero = obtenerObreroDesdeResultSet(rs);
                listaObrero.add(obrero);
            }
        } catch (SQLException e) {
            throw new ExcepcionAcceso("Error al registar obrero", e);
        }

        return listaObrero;
    }

    @Override
    public boolean actualizarObrero(Obrero obrero) throws ExcepcionAcceso {
        try (Connection con = ConexionObrero.conectar();
             PreparedStatement pstmt = con.prepareStatement(UPDATE_QUERY)) {
            pstmt.setString(1, obrero.getCedula());
            pstmt.setString(2, obrero.getNombre());
            pstmt.setDouble(3, obrero.getSueldo());
            pstmt.setDouble(4, obrero.getBonos());
            pstmt.setDouble(5, obrero.getEstras());
            pstmt.setInt(6, obrero.getId());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw new ExcepcionAcceso("Error al acualizar obrero", e);
        }
    }

    @Override
    public boolean eliminarObrero(Obrero obrero) throws ExcepcionAcceso {
        try (Connection con = ConexionObrero.conectar();
             PreparedStatement pstmt = con.prepareStatement(DELETE_QUERY)) {
            pstmt.setInt(1, obrero.getId());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw new ExcepcionAcceso("Error al eliminar obrero", e);
        }
    }

    @Override
    public Obrero obtenerObreroPorId(int id) throws ExcepcionAcceso {
        try (Connection con = ConexionObrero.conectar();
             PreparedStatement pstmt = con.prepareStatement(SELECT_BY_ID_QUERY)) {
            pstmt.setInt(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return obtenerObreroDesdeResultSet(rs);
                }
            }
        } catch (SQLException e) {
            throw new ExcepcionAcceso("Error al obtener el obrero por ID", e);
        }
        return null;
    }

    private Obrero obtenerObreroDesdeResultSet(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String cedula = rs.getString("cedula");
        String nombre = rs.getString("nombre");
        double sueldo = rs.getDouble("sueldo");
        double bonos = rs.getDouble("bonos");
        double estras = rs.getDouble("estras");
        return new Obrero(id, cedula, nombre, sueldo, bonos, estras);
    }
}

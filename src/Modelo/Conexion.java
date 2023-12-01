package Modelo;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class Conexion {

    private static final String DATABASE = "TORNEOFUTBOL";

    // Establecer la conexión a la base de datos
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://viaduct.proxy.rlwy.net:49481/" + DATABASE;
        String usuario = "root";
        String contraseña = "F3eehhE-3gGHCDdBbfCbDdDbHhfDBEA5";
        return DriverManager.getConnection(url, usuario, contraseña);
    }

    /*
        |----------  JUGADORES   ----------|
     */
    private static final String TABLA_JUGADOR = "JUGADOR";

    public static ArrayList<Jugador> getJugadores() {
        try (Connection conexion = getConnection()) {
            String selectQuery = "SELECT * FROM " + TABLA_JUGADOR;

            try (Statement statement = conexion.createStatement()) {
                ResultSet resulset = statement.executeQuery(selectQuery);

                ArrayList<Jugador> listado_jugadores = new ArrayList<>();

                while (resulset.next()) {

                    int documento = resulset.getInt("DOCUMENTO");
                    String nombre = resulset.getString("NOMBRE");
                    String apellido = resulset.getString("APELLIDO");
                    int telefono = resulset.getInt("TELEFONO");
                    String email = resulset.getString("EMAIL");

                    Jugador jugador = new Jugador(documento, telefono, nombre, apellido, email);

                    listado_jugadores.add(jugador);
                }

                return listado_jugadores;
            } catch (Exception e) {
                System.out.println("ups!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static Jugador getDatosJugador(int documento) {
        try (Connection conexion = getConnection()) {
            String selectQuery = "SELECT * FROM " + TABLA_JUGADOR + " WHERE DOCUMENTO = " + documento;

            try (Statement statement = conexion.createStatement()) {
                ResultSet resulset = statement.executeQuery(selectQuery);

                Jugador jugador = null;

                while (resulset.next()) {

                    String nombre = resulset.getString("NOMBRE");
                    String apellido = resulset.getString("APELLIDO");
                    int telefono = resulset.getInt("TELEFONO");
                    String email = resulset.getString("EMAIL");
                    String posicion = resulset.getString("POSICION");
                    String modo = resulset.getString("MODO");
                    String suscripcion = resulset.getString("SUSCRIPCION");

                    jugador = new Jugador(documento, telefono, nombre, apellido, posicion, email, modo, suscripcion);
                }

                return jugador;
            } catch (Exception e) {
                System.out.println("ups!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    /*
        |----------  PARTIDOS   ----------|
     */
    private static final String TABLA_PATIDO = "PARTIDO";
    
    /*
        |----------  EQUIPOS   ----------|
     */
    private static final String TABLA_EQUIPO = "EQUIPO";
    
    /*
        |----------  CALIFICACIONES   ----------|
     */
    private static final String TABLA_CALIFICACION = "CALIFICACION";
    private static final String TABLA_DETALLE_CALIFICACION = "DETALLE_CALIFICACION";
    
    /*
        |----------  INFRACCIONES   ----------|
     */
    private static final String TABLA_INFRACCION = "INFRACCION";
    
}

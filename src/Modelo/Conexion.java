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

    private static int[] getJugadoresEquipos() {
        try (Connection conexion = getConnection()) {
            String selectQuery = "SELECT DOCUMENTO FROM " + TABLA_JUGADOR + " ORDER BY MODO, SUSCRIPCION DESC LIMIT 10";

            try (Statement statement = conexion.createStatement()) {
                ResultSet resulset = statement.executeQuery(selectQuery);

                int[] listado_jugadores = new int[10];
                int cont = 0;

                while (resulset.next()) {

                    int documento = resulset.getInt("DOCUMENTO");

                    listado_jugadores[cont] = documento;
                    cont++;
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

    /*
        |----------  PARTIDOS   ----------|
     */
    private static final String TABLA_PARTIDO = "PARTIDO";

    public static ArrayList<Partido> getPartidos() {
        try (Connection conexion = getConnection()) {
            String selectQuery = "SELECT * FROM " + TABLA_PARTIDO;

            try (Statement statement = conexion.createStatement()) {
                ResultSet resulset = statement.executeQuery(selectQuery);

                ArrayList<Partido> listado_partidos = new ArrayList<>();

                while (resulset.next()) {

                    int id = resulset.getInt("ID");
                    String fecha = resulset.getString("FECHA");
                    String estado = resulset.getString("ESTADO");

                    Partido partido = new Partido(id, fecha, estado);

                    listado_partidos.add(partido);
                }

                return listado_partidos;
            } catch (Exception e) {
                System.out.println("ups!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void crearPartido() {
        int idGenerado = 0;

        try (Connection conexion = getConnection()) {
            String insertQuery = "INSERT INTO " + TABLA_PARTIDO + " (FECHA, ESTADO) VALUES (NULL, NULL)";

            // Habilitar la recuperación de la clave primaria generada
            try (PreparedStatement statement = conexion.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS)) {
                statement.executeUpdate();

                try ( // Recuperar las claves generadas
                        ResultSet generatedKeys = statement.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        idGenerado = generatedKeys.getInt(1); // Obtener el valor de la clave primaria
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        generarEquipos(idGenerado);
    }

    /*
        |----------  EQUIPOS   ----------|
     */
    private static final String TABLA_EQUIPO = "EQUIPO";

    public static ArrayList<Equipo> getEquiposXPartido(int partido) {
        try (Connection conexion = getConnection()) {
            String selectQuery = "SELECT * FROM " + TABLA_EQUIPO + "WHERE PARTIDO = " + partido;

            try (Statement statement = conexion.createStatement()) {
                ResultSet resulset = statement.executeQuery(selectQuery);

                ArrayList<Equipo> listado_equipos = new ArrayList<>();

                while (resulset.next()) {

                    int num_equipo = resulset.getInt("NUM_EQUIPO");

                    Equipo equipo = new Equipo(num_equipo, partido);
                    for (int i = 0; i < 5; i++) {
                        equipo.getJugadores()[i] = resulset.getInt("JUGADOR_" + i);
                    }

                    listado_equipos.add(equipo);
                }

                return listado_equipos;
            } catch (Exception e) {
                System.out.println("ups!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    private static void generarEquipos(int partido) {
        try (Connection conexion = getConnection()) {
            for (int i = 1; i <= 2; i++) {
                String insertQuery = "INSERT INTO " + TABLA_EQUIPO + "(NUM_EQUIPO, PARTIDO) VALUES (?,?)";
                try (PreparedStatement statement = conexion.prepareStatement(insertQuery)) {
                    statement.setString(1, String.valueOf(i));
                    statement.setInt(2, partido);
                    statement.executeUpdate();
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void listarJugadoresEquipos(int partido) {
        int[] jugadores = getJugadoresEquipos();

        try (Connection conexion = getConnection()) {

            // Llenar el equipo 1
            int cont = 1;
            for (int i = 0; i < 5; i++) {
                String updateQuery = "UPDATE " + TABLA_EQUIPO + " SET JUGADOR_" + cont + " = ? WHERE NUM_EQUIPO = '1' AND PARTIDO = ?";
                try (PreparedStatement statement = conexion.prepareStatement(updateQuery)) {
                    statement.setInt(1, jugadores[i]);
                    statement.setInt(2, partido);
                    statement.executeUpdate();
                }
                
                cont++;
            }
            
            // Llenar el equipo 2
            cont = 1;
            for (int i = 5; i < jugadores.length; i++) {
                String updateQuery = "UPDATE " + TABLA_EQUIPO + " SET JUGADOR_" + cont + " = ? WHERE NUM_EQUIPO = '2' AND PARTIDO = ?";
                try (PreparedStatement statement = conexion.prepareStatement(updateQuery)) {
                    statement.setInt(1, jugadores[i]);
                    statement.setInt(2, partido);
                    statement.executeUpdate();
                }
                
                cont++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*
        |----------  CALIFICACIONES   ----------|
     */
    private static final String TABLA_CALIFICACION = "CALIFICACION";
    private static final String TABLA_DETALLE_CALIFICACION = "DETALLE_CALIFICACION";

    public static ArrayList<Calificacion> getCalificaciones() {
        try (Connection conexion = getConnection()) {
            String selectQuery = "SELECT * FROM " + TABLA_CALIFICACION;

            try (Statement statement = conexion.createStatement()) {
                ResultSet resulset = statement.executeQuery(selectQuery);

                ArrayList<Calificacion> listado_calificaciones = new ArrayList<>();

                while (resulset.next()) {

                    int documento = resulset.getInt("DOCUMENTO_JUGADOR");
                    double promedio = resulset.getDouble("PROMEDIO");

                    Calificacion calificacion = new Calificacion(documento, promedio);

                    listado_calificaciones.add(calificacion);
                }

                return listado_calificaciones;
            } catch (Exception e) {
                System.out.println("ups!");

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static ArrayList<Detalle_Calificacion> getDetalleCalificacion(int calificacion) {
        try (Connection conexion = getConnection()) {
            String selectQuery = "SELECT * FROM " + TABLA_DETALLE_CALIFICACION + "WHERE ID_CALIFICACION = " + calificacion;

            try (Statement statement = conexion.createStatement()) {
                ResultSet resulset = statement.executeQuery(selectQuery);

                ArrayList<Detalle_Calificacion> listado_detalle_calificacion = new ArrayList<>();

                while (resulset.next()) {

                    int documento = resulset.getInt("DOCUMENTO_CALIFICADOR");
                    int puntaje = resulset.getInt("PUNTAJE");
                    String relato = resulset.getString("RELATO");

                    Detalle_Calificacion detalle = new Detalle_Calificacion(documento, puntaje, relato, calificacion);

                    listado_detalle_calificacion.add(detalle);
                }

                return listado_detalle_calificacion;
            } catch (Exception e) {
                System.out.println("ups!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static Calificacion buscarCalificacion(int documento) {
        try (Connection conexion = getConnection()) {
            String selectQuery = "SELECT * FROM " + TABLA_CALIFICACION + "WHERE DOCUMENTO_JUGADOR = " + documento;

            try (Statement statement = conexion.createStatement()) {
                ResultSet resulset = statement.executeQuery(selectQuery);

                Calificacion calificacion = null;

                while (resulset.next()) {

                    double promedio = resulset.getDouble("PROMEDIO");

                    calificacion = new Calificacion(documento, promedio);
                }

                return calificacion;
            } catch (Exception e) {
                System.out.println("ups!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    /*
        |----------  INFRACCIONES   ----------|
     */
    private static final String TABLA_INFRACCION = "INFRACCION";

    public static ArrayList<Infraccion> getInfracciones() {
        try (Connection conexion = getConnection()) {
            String selectQuery = "SELECT * FROM " + TABLA_INFRACCION;

            try (Statement statement = conexion.createStatement()) {
                ResultSet resulset = statement.executeQuery(selectQuery);

                ArrayList<Infraccion> listado_infracciones = new ArrayList<>();

                while (resulset.next()) {

                    int id = resulset.getInt("ID");
                    String motivo = resulset.getString("MOTIVO");
                    String relato = resulset.getString("RELATO");
                    int documento_infraccion = resulset.getInt("DOCUMENTO_INFRACCION");

                    Infraccion infraccion = new Infraccion(id, motivo, relato, documento_infraccion);

                    listado_infracciones.add(infraccion);
                }

                return listado_infracciones;
            } catch (Exception e) {
                System.out.println("ups!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static ArrayList<Infraccion> buscarInfracciones(int documento) {
        try (Connection conexion = getConnection()) {
            String selectQuery = "SELECT * FROM " + TABLA_INFRACCION + "WHERE DOCUMENTO_INFRACCION = " + documento;

            try (Statement statement = conexion.createStatement()) {
                ResultSet resulset = statement.executeQuery(selectQuery);

                ArrayList<Infraccion> listado_infracciones = new ArrayList<>();

                while (resulset.next()) {

                    int id = resulset.getInt("ID");
                    String motivo = resulset.getString("MOTIVO");
                    String relato = resulset.getString("RELATO");

                    Infraccion infraccion = new Infraccion(id, motivo, relato, documento);

                    listado_infracciones.add(infraccion);
                }

                return listado_infracciones;
            } catch (Exception e) {
                System.out.println("ups!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

}

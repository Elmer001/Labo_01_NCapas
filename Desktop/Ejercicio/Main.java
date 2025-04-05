import java.util.*;
import java.util.stream.Collectors;

public class Main {

    // 1. Definición de la clase jugador
    static class Jugador {
        private int id;
        private String nombre;
        private String apellido;
        private int golesMarcados;
        private int partidosJugados;

        // Constructor
        public Jugador(String nombre, String apellido,  int id) {
            this.id = id;
            this.nombre = nombre;
            this.apellido = apellido;
        }

        public Jugador() {
        }

        // Getters
        public String getNombre() {
            return nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public int getId() {
            return id;
        }

        public int getGolesMarcados() {
            return golesMarcados;
        }
        
        public int getPartidosJugados() {
            return partidosJugados;
        }

        // toString para imprimir el objeto
        @Override
        public String toString() {
            return "Persona{" +
                    "nombre='" + nombre + '\'' +
                    ", id=" + id +
                    "golesMarcados" + golesMarcados +
                    "partidosJugados" + partidosJugados +
                    '}';
        }

// Método para generar una lista de jugadores
public List<Jugador> generarJugadores() {
    List<String> nombres = Arrays.asList("Luis", "Juan", "Maria", "Carlos");
    List<String> apellidos = Arrays.asList("Sanchez", "Perez", "Torrez", "Lopez");

    List<Jugador> jugadores = new ArrayList<>();
    for (int i = 0; i < 3; i++) {
        jugadores.add(generarJugadorAleatorio(nombres, apellidos));
    }

    return jugadores;
}
    }

    // 1. Definición de la clase Partido
    static class Partido {
        private List<Jugador> equipoA = new ArrayList<>();
        private List<Jugador> equipoB = new ArrayList<>();
        private int golesEquipoA;
        private int golesEquipoB;

        // Constructor
        public Partido(List<Jugador> equipoA, List<Jugador> equipoB, int golesEquipoA, int golesEquipoB) {
            this.equipoA = equipoA;
            this.equipoA = equipoA;
            this.golesEquipoA = golesEquipoA;
            this.golesEquipoB = golesEquipoB;
        }

        // Registrar goles
        public void registrarGoles() {
            
        }

        public String equipoGanador() {
            return "";
        }

        public String DetallesPartido() {
            return "";
        }
        
    }
    //Método para generar un jugador aleatorio
    public static Jugador generarJugadorAleatorio(List<String> nombres, List<String> apellidos) {
    String nombre = nombres.get((int) (Math.random() * nombres.size()));
    String apellido = apellidos.get((int) (Math.random() * apellidos.size()));
    int id = (int) (Math.random() * 1000);
    return new Jugador(nombre, apellido, id);
}

    public static void main(String[] args) {
        System.out.println("Opciones:");
        System.out.println("1. Generar Partido");
        System.out.println("2. Mostrar detalles del partido anterior");

        switch (new Scanner(System.in).nextInt()) {
            case 1:
                // Generar jugadores
                Jugador jugador = new Jugador();
                List<Jugador> jugadores = jugador.generarJugadores();
                
                // Generar equipos
                List<Jugador> equipoA = jugador.generarJugadores();
                List<Jugador> equipoB = jugador.generarJugadores();

                // Mostrar equipos
                System.out.println("Equipo A:");
                for (Jugador j : equipoA) {
                    System.out.println(j);
                }
                System.out.println("Equipo B:");
                for (Jugador j : equipoB) {
                    System.out.println(j);
                }

                // Crear partido
                Partido partido = new Partido(equipoA, equipoB, 0, 0);
                
                // Registrar goles
                partido.registrarGoles();
                
                break;
            case 2:
                break;
        
            default:
                break;
        }
    }
}

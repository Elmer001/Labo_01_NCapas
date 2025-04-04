import java.util.*;
import java.util.stream.Collectors;

public class Main {

    // 1. Definición de la clase jugador
    static class Jugador {
        private int id;
        private String nombre;
        private int golesMarcados;
        private int partidosJugados;

        // Constructor
        public NewJugador(String nombre, int id) {
            this.id = id;
            this.nombre = nombre;
        }

        // Getters
        public String getNombre() {
            return nombre;
        }

        public int getId() {
            return id;
        }

        public String getGolesMarcados() {
            return golesMarcados;
        }
        
        public String getPartidosJugados() {
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
    }

    // 1. Definición de la clase Partido
    static class Partido {
        private List<Jugador> equipoA = new ArrayList<>();
        private List<Jugador> equipoB = new ArrayList<>();
        private int golesEquipoA;
        private int golesEquipoB;

        // Constructor
        public NewPartido(List<Jugador> equipoA, List<Jugador> equipoB, int golesEquipoA, int golesEquipoB) {
            this.equipoA = equipoA;
            this.equipoA = equipoA;
            this.golesEquipoA = golesEquipoA;
            this.golesEquipoB = golesEquipoB;
        }

        // Registrar goles
        public void registrarGoles() {
            return nombre;
        }

        public String equipoGanador() {
            return id;
        }

        public String DetallesPartido() {
            return golesMarcados;
        }
        
    }

    public static void main(String[] args) {
        
    }
}

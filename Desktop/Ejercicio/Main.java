import java.util.*;
import java.util.stream.Collectors;
import java.util.Random;

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

        //metodo para generera jugadores
        public List<Jugador> generarJugadores(){
            List<String> nombres = new ArrayList<>();
            nombres.add("Luis");
            nombres.add("Juan");
            nombres.add("Maria");
            nombres.add("Carlos");
                
            List<String> aplellidos = new ArrayList<>();
            nombres.add("Sanchez");
            nombres.add("Perez");
            nombres.add("Torrez");
            nombres.add("Lopez");

            List<Jugador> jugadores = new ArrayList<>();
            for (int i = 0; i < 5; i++){
                String nombre = nombres.get((Math.random()*4) + 1);
                String apellidos = aplellidos.get((Math.random()*4) + 1);

                jugadores.add(new Jugador(nombre, apellidos, (Math.random()*4) + 1));
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

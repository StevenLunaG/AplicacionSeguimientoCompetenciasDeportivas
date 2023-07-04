import org.sportaplication.model.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        DeporteEquipo deporteEquipo = new DeporteEquipo("Futbol", Formato.GRUPOS);
        Temporada temporada = new Temporada("Liga Pro 2023", LocalDate.of(2023, 3, 1), LocalDate.of(2023, 12, 31));
        Competencia competencia = new Competencia(temporada, "Liga Casi-Pro", LocalDate.of(2023, 3, 1), LocalDate.of(2023, 7, 31)) ;
        competencia.asignarPeriodoTemporada(LocalDate.of(2023, 3, 1), LocalDate.of(2023, 7, 31));
        Encuentro encuentro = new Encuentro(true);
        Marcador marcador = new Marcador("2 - 1", LocalTime.of(1, 30));
        encuentro.setMarcador(marcador);
        Fecha fecha = new Fecha(LocalDate.of(2023, 3, 1), LocalTime.of(12, 0));
        encuentro.setFecha(fecha);
        Equipo equipo = new Equipo("Barcelona", "Española");
        Jugador jugador = new Jugador("Lionel", "Messi", "Futbol");
        Inscripcion inscripcion = new Inscripcion(temporada, equipo);

        Estadistica estadistica = new Estadistica();
        estadistica.setEncuentrosTotalesGanados(10);
        estadistica.setEncuentrosTotalesPerdidos(5);
        estadistica.setEncuentrosTotalesEmpatados(3);
        estadistica.setRachaVictoria(7);
        estadistica.setCompetenciasGanadas(2);
        jugador.setEstadistica(estadistica);

        Reglamento reglamento = new Reglamento("FuchibolCHampions");
        Regla regla1 = new Regla("Forma del Balon", "Redondo");
        Regla regla2 = new Regla("Tamanio de la Cancha", "Grande");
        Regla regla3 = new Regla("Implementos", "Comida");
        reglamento.agregarRegla(regla1);
        reglamento.agregarRegla(regla2);
        reglamento.agregarRegla(regla3);

        TablaPosicion tablaPosicion = new TablaPosicion(12);
        Jugador jugador1 = new Jugador("Cristiano", "Ronaldo", "Futbol");
        Jugador jugador2 = new Jugador("Luis", "Suarez", "Futbol");



        System.out.println("\n--------Deporte---------");
        System.out.println(deporteEquipo);
        System.out.println(reglamento);

        System.out.println("\n--------Jugador---------");
        System.out.println(jugador);
        System.out.println("Estadísticas:");
        System.out.println(jugador.getEstadistica());
        System.out.println("\n--------Inscripcion---------");
        System.out.println(equipo);
        System.out.println(deporteEquipo);
        System.out.println(inscripcion);
        System.out.println("\n--------Temporada---------");
        System.out.println(temporada);
        System.out.println(competencia);
        System.out.println(encuentro);

    }
}
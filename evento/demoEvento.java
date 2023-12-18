package classes.evento;

public class demoEvento {
    public static void main(String[] args) {
        EventoAcademico ev = new EventoAcademico("ECOP", "CMPF", 450);
        ev.mostraEvento();
        EventoAcademico evento = new EventoAcademico("Rockinrio", "Rio de Janeiro", 100000);
        evento.mostraEvento();
    }
}

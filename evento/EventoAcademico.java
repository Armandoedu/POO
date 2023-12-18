package classes.evento;

public class EventoAcademico {
    String nomeDoEvento;
    String localDoEvento;
    int numeroDeParticipante;

    EventoAcademico(String nomeDoEvento, String localDoEvento, int numeroDeParticipante){
        this.nomeDoEvento = nomeDoEvento;
        this.localDoEvento = localDoEvento;
        this.numeroDeParticipante = numeroDeParticipante;
    }

    void mostraEvento(){
        System.out.println("Nome do evento: " + nomeDoEvento);
        System.out.println("Local do evento: " + localDoEvento);
        System.out.println("Numero de participantes: " + numeroDeParticipante);
    }
}

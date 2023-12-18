package classes.Faculdade;

public class DemoRegistroAcademico {
    public static void main(String[] args) {
        RegistroAcademico michael = new RegistroAcademico();
        michael.inicializaRegistroAcademico("michael", "2022011110", 3, 0.75);
        double p = michael.calculoMensalidade();
        System.out.println("A mensalidade de Michael: " + p);
    }
}

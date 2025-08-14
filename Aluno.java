public class Aluno {
    private String matricula;
    private double altura;
    private double peso;
    private Planos plano;
    private Objetivos objetivo;

    public Aluno(String matricula, String altura, String peso, Planos plano, Objetivos objetivo) {
        setMatricula(matricula);
        setAltura(altura);
        setPeso(peso);
        setPlano(plano);
        setObjetivo(objetivo);
    }
}

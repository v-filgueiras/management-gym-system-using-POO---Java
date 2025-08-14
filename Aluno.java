public class Aluno extends Pessoa {
    private String matricula;
    private double altura;
    private double peso;
    private Planos plano;
    private Objetivos objetivo;

    public Aluno(String matricula, double altura, double peso, Planos plano, Objetivos objetivo, String nome, String cpf, String telefone, String email) {
        super(nome, cpf, telefone, email);
        setMatricula(matricula);
        setAltura(altura);
        setPeso(peso);
        setPlano(plano);
        setObjetivo(objetivo);
    }

    public String getAluno() {
        return this.matricula;
    }

    public double getAltura() {
        return this.altura;
    }

    public double getPeso() {
        return this.peso;
    }

    public Planos getPlano() {
        return this.plano;
    }

    public Objetivos getObjetivo() {
        return this.objetivo;
    }

    public void setMatricula(String matricula) {
        if (matricula == null || matricula.isEmpty()) {
            throw new IllegalArgumentException("O codigo de matricula nao deve ser nulo ou vazio");
        }
        else {
            this.matricula = matricula;
        }
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Nao e possivel adotar uma altura menor ou igual a zero");
        }
        else {
            this.altura = altura;
        }
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("O peso da pessoa nao deve ser menor ou igual a zero");
        }
        else {
            this.peso = peso;
        }
    }

    public void setPlano(Planos plano) {
        this.plano = plano;
    }

    public void setObjetivo(Objetivos objetivo) {
        this.objetivo = objetivo;
    }
}

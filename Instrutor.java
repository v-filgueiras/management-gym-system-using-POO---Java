public class Instrutor extends Pessoa {
    private String cref;
    private Especialidades especialidade;
    private double salario;

    public Instrutor(String cref, String especialidades, double salario, String nome, String cpf, String telefone, String email) {
        super(nome, cpf, telefone, email);
        setCref(cref);
        setEspecialidades(especialidades);
        setSalario(salario);
    }

    public String getCref() {
        return this.cref;
    }

    public Especialidades getEssEspecialidades() {
        return this.especialidade;
    }

    public double getSalario() {
        return this.salario;
    }
}
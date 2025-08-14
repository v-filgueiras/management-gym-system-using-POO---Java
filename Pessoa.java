public class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;
    private String email;


    public Pessoa(String nome, String cpf, String telefone, String email) {
        setNome(nome);
        setCpf(cpf);
        setTelefone(telefone);
        setEmail(email);
    }


    public String getNome() {
        return this.nome;
    }


    public String getCpf() {
        return this.cpf;
    }


    public String getTelefone() {
        return this.telefone;
    }


    public String getEmail() {
        return this.email;
    }


    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("O nome da pessoa a ser cadastrada não deve ser nulo ou vazio.");
        }
        else {
            this.nome = nome;
        }
    }


    public void setCpf(String cpf) {
        if (cpf == null || cpf.isEmpty()) {
            throw new IllegalArgumentException("O cpf da pessoa a ser cadastrada não deve ser nulo ou vazio.");
        }
        else {
            this.cpf = cpf;
        }
    }


    public void setTelefone(String telefone) {
        if (telefone == null || telefone.isEmpty()) {
            throw new IllegalArgumentException("A pessoa a ser cadastrada precisa de um numero de telefone. Nao deixe nulo ou vazio.");
        }
        else {
            this.telefone = telefone;
        }
    }


    public void setEmail(String email) {
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Nao é possivel cadastrar sem um email. Por favor, nao deixe nulo ou vazio");
        }
        else {
            this.email = email;
        }
    }
}

/**
 * Classe que representa um aluno da Escola XYZ.
 * Contém os dados básicos necessários para o cadastro.
 */
public class Aluno {
    private String nome;
    private String enderecoResidencial;
    private String telefone;
    private String email;
    private String matricula;

    /**
     * Construtor da classe Aluno.
     */
    public Aluno(String nome, String enderecoResidencial, String telefone,
                 String email, String matricula) {
        this.nome = nome;
        this.enderecoResidencial = enderecoResidencial;
        this.telefone = telefone;
        this.email = email;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnderecoResidencial() {
        return enderecoResidencial;
    }

    public void setEnderecoResidencial(String enderecoResidencial) {
        this.enderecoResidencial = enderecoResidencial;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Exibe os dados cadastrados do aluno.
     */
    public void exibirDados() {
        System.out.println("===== CADASTRO DO ALUNO =====");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço residencial: " + enderecoResidencial);
        System.out.println("Telefone: " + telefone);
        System.out.println("E-mail: " + email);
        System.out.println("Matrícula: " + matricula);
    }
}

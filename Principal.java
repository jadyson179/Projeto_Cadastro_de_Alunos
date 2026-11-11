/**
 * Classe principal para testar o cadastro de alunos.
 */
public class Principal {
    public static void main(String[] args) {
        // Cria um objeto da classe Aluno com dados fictícios para teste.
        Aluno aluno1 = new Aluno(
            "Ana Souza",
            "Rua das Flores, 123",
            "(82) 99999-0000",
            "ana.souza@example.com",
            "2026A001"
        );

        // Exibe os dados do objeto criado.
        aluno1.exibirDados();

        // Exemplo de alteração de um atributo usando um método setter.
        aluno1.setTelefone("(82) 98888-1111");

        System.out.println();
        System.out.println("Após atualizar o telefone:");
        aluno1.exibirDados();
    }
}

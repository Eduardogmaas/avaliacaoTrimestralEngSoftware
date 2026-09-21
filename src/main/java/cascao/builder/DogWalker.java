package cascao.builder;

public class DogWalker {
    private final String nome;
    private final String telefone;
    private final String tamanhoAtendido;
    private final String atividade;
    private final double precoPorHora;
    private final boolean disponivel;

    public DogWalker(String nome, String telefone, String tamanhoAtendido,
                     String atividade, double precoPorHora, boolean disponivel) {
        this.nome = nome;
        this.telefone = telefone;
        this.tamanhoAtendido = tamanhoAtendido;
        this.atividade = atividade;
        this.precoPorHora = precoPorHora;
        this.disponivel = disponivel;
    }

    public String getNome() { return nome; }
    public String getTelefone() { return telefone; }
    public String getTamanhoAtendido() { return tamanhoAtendido; }
    public String getAtividade() { return atividade; }
    public double getPrecoPorHora() { return precoPorHora; }
    public boolean isDisponivel() { return disponivel; }

    @Override
    public String toString() {
        return "Nome: " + nome +
               "\nTelefone: " + telefone +
               "\nTamanho atendido: " + tamanhoAtendido +
               "\nAtividade: " + atividade +
               "\nPreço por hora: R$ " + String.format("%.2f", precoPorHora) +
               "\nDisponível: " + (disponivel ? "Sim" : "Não");
    }
}

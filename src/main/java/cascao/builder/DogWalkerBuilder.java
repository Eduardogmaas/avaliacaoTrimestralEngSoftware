package cascao.builder;

public class DogWalkerBuilder {
    private String nome;
    private String telefone;
    private String tamanhoAtendido;
    private String atividade;
    private double precoPorHora;
    private boolean disponivel;

    public DogWalkerBuilder setNome(String nome) {
        this.nome = nome; return this;
    }

    public DogWalkerBuilder setTelefone(String telefone) {
        this.telefone = telefone; return this;
    }

    public DogWalkerBuilder setTamanhoAtendido(String tamanhoAtendido) {
        this.tamanhoAtendido = tamanhoAtendido; return this;
    }

    public DogWalkerBuilder setAtividade(String atividade) {
        this.atividade = atividade; return this;
    }

    public DogWalkerBuilder setPrecoPorHora(double precoPorHora) {
        this.precoPorHora = precoPorHora; return this;
    }

    public DogWalkerBuilder setDisponivel(boolean disponivel) {
        this.disponivel = disponivel; return this;
    }

    public DogWalker build() {
        if (nome == null || nome.isBlank()) {
            throw new IllegalStateException("O nome do DogWalker é obrigatório.");
        }
        if (telefone == null || telefone.isBlank()) {
            throw new IllegalStateException("O telefone do DogWalker é obrigatório.");
        }
        if (tamanhoAtendido == null || tamanhoAtendido.isBlank()) {
            throw new IllegalStateException("O tamanho atendido é obrigatório.");
        }
        if (atividade == null || atividade.isBlank()) {
            throw new IllegalStateException("A atividade é obrigatória.");
        }
        if (precoPorHora <= 0) {
            throw new IllegalStateException("O preço por hora deve ser maior que zero.");
        }

        return new DogWalker(nome, telefone, tamanhoAtendido,
                atividade, precoPorHora, disponivel);
    }
}

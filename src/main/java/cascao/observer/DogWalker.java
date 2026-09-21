package cascao.observer;

public class DogWalker {
    private final String nome;
    private final String telefone;

    public DogWalker(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() { return nome; }
    public String getTelefone() { return telefone; }
}

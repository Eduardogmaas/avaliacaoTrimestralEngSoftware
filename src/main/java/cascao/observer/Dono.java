package cascao.observer;

public class Dono {
    private final String nome;
    private final String telefone;

    public Dono(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() { return nome; }
    public String getTelefone() { return telefone; }
}

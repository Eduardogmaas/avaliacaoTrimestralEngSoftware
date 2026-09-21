package cascao.observer;

import java.util.ArrayList;
import java.util.List;

public class Contratacao {
    private final int id;
    private String status;
    private final List<ContratacaoObserver> observadores = new ArrayList<>();

    public Contratacao(int id) {
        this.id = id;
        this.status = "PENDENTE";
    }

    public int getId() { return id; }
    public String getStatus() { return status; }

    public void adicionarObservador(ContratacaoObserver observer) {
        observadores.add(observer);
    }

    public void removerObservador(ContratacaoObserver observer) {
        observadores.remove(observer);
    }

    private void notificar() {
        for (ContratacaoObserver observer : observadores) {
            observer.atualizar(this);
        }
    }

    public void confirmar() {
        status = "CONFIRMADA";
        notificar();
    }

    public void cancelar() {
        status = "CANCELADA";
        notificar();
    }
}

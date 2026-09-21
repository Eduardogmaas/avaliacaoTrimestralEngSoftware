package cascao.observer;

public class DonoObserver implements ContratacaoObserver {
    private final Dono dono;

    public DonoObserver(Dono dono) {
        this.dono = dono;
    }

    @Override
    public void atualizar(Contratacao contratacao) {
        System.out.println("[NOTIFICAÇÃO - DONO] " + dono.getNome()
                + ": sua contratação #" + contratacao.getId()
                + " está " + contratacao.getStatus() + ".");
    }
}

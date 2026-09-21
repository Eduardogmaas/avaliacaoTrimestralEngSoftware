package cascao.observer;

public class DogWalkerObserver implements ContratacaoObserver {
    private final DogWalker dogWalker;

    public DogWalkerObserver(DogWalker dogWalker) {
        this.dogWalker = dogWalker;
    }

    @Override
    public void atualizar(Contratacao contratacao) {
        System.out.println("[NOTIFICAÇÃO - DOGWALKER] " + dogWalker.getNome()
                + ": a contratação #" + contratacao.getId()
                + " está " + contratacao.getStatus() + ".");
    }
}

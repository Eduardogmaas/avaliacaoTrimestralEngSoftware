package cascao;

import cascao.builder.DogWalkerBuilder;
import cascao.builder.DogWalker;
import cascao.adapter.Coordenada;
import cascao.adapter.GoogleMapsAdapter;
import cascao.adapter.GoogleMapsService;
import cascao.adapter.LocalizacaoService;
import cascao.observer.Contratacao;
import cascao.observer.ContratacaoObserver;
import cascao.observer.Dono;
import cascao.observer.DonoObserver;
import cascao.observer.DogWalkerObserver;

public class Main {
    public static void main(String[] args) {
        executarBuilder();
        executarAdapter();
        executarObserver();
    }

    private static void executarBuilder() {
        System.out.println("\n=== 1. BUILDER ===");
        DogWalker walker = new DogWalkerBuilder()
                .setNome("Carlos")
                .setTelefone("45999999999")
                .setTamanhoAtendido("Grande")
                .setAtividade("Corrida")
                .setPrecoPorHora(40.0)
                .setDisponivel(true)
                .build();

        System.out.println("DogWalker criado com sucesso:");
        System.out.println(walker);
    }

    private static void executarAdapter() {
        System.out.println("\n=== 2. ADAPTER ===");
        LocalizacaoService localizacao = new GoogleMapsAdapter(new GoogleMapsService());

        Coordenada tutor = new Coordenada(-25.3025, -54.5955);
        Coordenada walker = new Coordenada(-25.2950, -54.5900);

        double distancia = localizacao.calcularDistancia(tutor, walker);

        System.out.printf("Distância calculada pelo serviço adaptado: %.2f km%n", distancia);
    }

    private static void executarObserver() {
        System.out.println("\n=== 3. OBSERVER ===");
        Contratacao contratacao = new Contratacao(15);

        Dono dono = new Dono("Eduardo", "45988888888");
        cascao.observer.DogWalker walker =
                new cascao.observer.DogWalker("Carlos", "45999999999");

        ContratacaoObserver donoObserver = new DonoObserver(dono);
        ContratacaoObserver walkerObserver = new DogWalkerObserver(walker);

        contratacao.adicionarObservador(donoObserver);
        contratacao.adicionarObservador(walkerObserver);

        System.out.println("Contratação #" + contratacao.getId()
                + " criada com status: " + contratacao.getStatus());
        System.out.println("Alterando status para CONFIRMADA...");
        contratacao.confirmar();
    }
}

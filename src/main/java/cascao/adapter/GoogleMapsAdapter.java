package cascao.adapter;

public class GoogleMapsAdapter implements LocalizacaoService {
    private final GoogleMapsService googleMapsService;

    public GoogleMapsAdapter(GoogleMapsService googleMapsService) {
        this.googleMapsService = googleMapsService;
    }

    @Override
    public double calcularDistancia(Coordenada origem, Coordenada destino) {
        return googleMapsService.getDistance(origem, destino);
    }
}

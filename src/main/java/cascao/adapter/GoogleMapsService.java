package cascao.adapter;

public class GoogleMapsService {
    public double getDistance(Coordenada origem, Coordenada destino) {
        // Simulação local de um serviço externo.
        double deltaLat = (origem.latitude() - destino.latitude()) * 111.0;
        double deltaLon = (origem.longitude() - destino.longitude()) * 111.0;
        return Math.sqrt(deltaLat * deltaLat + deltaLon * deltaLon);
    }
}

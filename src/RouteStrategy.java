public interface RouteStrategy {
    double calculateTravelTime(double distanceKm);
    String getTransportType();
}
public class CycleStrategy implements RouteStrategy {
    private static final double AVERAGE_SPEED_KMH = 15.0;

    @Override
    public double calculateTravelTime(double distanceKm) {
        return (distanceKm / AVERAGE_SPEED_KMH) * 60.0;
    }

    @Override
    public String getTransportType() {
        return "Bicycle";
    }
}
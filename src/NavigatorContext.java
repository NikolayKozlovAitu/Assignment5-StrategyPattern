public class NavigatorContext {
    private RouteStrategy routeStrategy;

    public NavigatorContext(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void setRouteStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void buildRoute(String origin, String destination, double distanceKm) {
        if (routeStrategy == null) {
            throw new IllegalStateException("Routing strategy is not set!");
        }

        double timeMinutes = routeStrategy.calculateTravelTime(distanceKm);
        System.out.printf("Route: %s -> %s (%s) | Distance: %.1f km | Travel Time: %.1f min%n",
                origin, destination, routeStrategy.getTransportType(), distanceKm, timeMinutes);
    }
}
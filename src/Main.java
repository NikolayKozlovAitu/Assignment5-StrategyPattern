public class Main {
    public static void main(String[] args) {
        NavigatorContext navigator = new NavigatorContext(new CarStrategy());
        System.out.println("=== Strategy Pattern Demonstration ===");

        // 1. Car strategy
        navigator.buildRoute("Astana IT University", "Khan Shatyr", 5.5);

        // 2. Walking strategy
        navigator.setRouteStrategy(new WalkStrategy());
        navigator.buildRoute("Astana IT University", "Khan Shatyr", 5.5);

        // 3. Cycling strategy
        navigator.setRouteStrategy(new CycleStrategy());
        navigator.buildRoute("Astana IT University", "Khan Shatyr", 5.5);
    }
}
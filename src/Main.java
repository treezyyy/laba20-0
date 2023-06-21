public class Main {
    public static void main(String[] args) {
        LogisticFactory airplaneFactory = new AirplaneFactory();
        Logistic airplane = airplaneFactory.createLogistic();
        airplane.shipping();

        LogisticFactory courtFactory = new CourtFactory();
        Logistic court = courtFactory.createLogistic();
        court.shipping();

        LogisticFactory trucksFactory = new TrucksFactory();
        Logistic trucks = trucksFactory.createLogistic();
        trucks.shipping();
    }
}
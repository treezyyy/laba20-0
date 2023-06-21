public class AirplaneFactory implements LogisticFactory{

    @Override
    public Logistic createLogistic() {
        return new Airpalane();
    }
}

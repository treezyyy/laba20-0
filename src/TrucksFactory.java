public class TrucksFactory implements LogisticFactory{
    @Override
    public Logistic createLogistic() {
        return new Trucks();
    }
}

public class CourtFactory implements LogisticFactory {
    @Override
    public Logistic createLogistic() {
        return new Court();
    }
}

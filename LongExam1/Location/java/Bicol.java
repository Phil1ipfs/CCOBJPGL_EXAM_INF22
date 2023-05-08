public class Bicol implements location {
    int Fare = 90;
    public int Fare() {
        return Fare;
    }
    @Override
    public void accept(Terorista terorista) {
        terorista.visit(this);
    }
    
}
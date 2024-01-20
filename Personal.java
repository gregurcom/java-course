public class Personal extends Muncitor {
    public Personal(String nume) {
        super(nume);
    }

    @Override
    public void lucreaza() {
        System.out.println("Personalul " + nume + " lucrează.");
    }

    @Override
    public String toString() {
        return "Personalul " + nume;
    }
}
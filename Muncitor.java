public class Muncitor implements Angajat {
    String nume;

    public Muncitor(String nume) {
        this.nume = nume;
    }

    @Override
    public void lucreaza() {
        System.out.println("Muncitorul " + nume + " lucrează.");
    }

    @Override
    public String toString() {
        return "Muncitorul " + nume;
    }
}
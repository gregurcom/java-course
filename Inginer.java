public class Inginer extends Personal implements Angajat {
    public Inginer(String nume) {
        super(nume);
    }

    @Override
    public void lucreaza() {
        System.out.println("Inginerul " + nume + " lucrează la proiect.");
    }

    @Override
    public String toString() {
        return "Inginerul " + nume;
    }
}
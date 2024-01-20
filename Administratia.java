public class Administratie extends Personal implements Angajat {
    public Administratie(String nume) {
        super(nume);
    }

    @Override
    public void lucreaza() {
        System.out.println("Angajatul din administratie " + nume + " lucrează la documente.");
    }

    @Override
    public String toString() {
        return "Angajatul din administratie " + nume;
    }
}
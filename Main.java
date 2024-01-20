public class Main {
    public static void main(String[] args) {
        Muncitor muncitor = new Muncitor("Ion");
        System.out.println(muncitor);

        Personal personal = new Personal("Ana");
        System.out.println(personal);

        Inginer inginer = new Inginer("George");
        System.out.println(inginer);

        Administratie administratie = new Administratie("Elena");
        System.out.println(administratie);

        muncitor.lucreaza();
        personal.lucreaza();
        inginer.lucreaza();
        administratie.lucreaza();
    }
}
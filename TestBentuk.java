public class TestBentuk {
    public static void main(String[] args) {
        Bentuk b = new Bentuk("merah");
        BujurSangkar bs = new BujurSangkar(4, "biru");
        Lingkaran l = new Lingkaran(7, "hijau");
        Silinder s = new Silinder(10, 7, "kuning");

        b.printInfo();
        bs.printInfo();
        l.printInfo();
        s.printInfo();

        bs.setSisi(5);
        l.setRadius(3);
        s.setTinggi(2);
        s.setWarna("ungu");
        System.out.println("--- setelah diubah ---");
        bs.printInfo();
        l.printInfo();
        s.printInfo();
    }
}

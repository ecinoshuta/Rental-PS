package paket;

public class Reguler {
    String nama;
    float uang;

    public static float bayar(float uang, int harga) {
        float bayar = uang - harga;
        return bayar;
    }
}

package paket;

public class vip {
    String nama;
    float uang;

    public static float bayar(float uang, int harga) {
        float bayar = uang - harga;
        return bayar;
    }
}

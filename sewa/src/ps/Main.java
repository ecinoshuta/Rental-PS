package ps;
import paket.Reguler;
import paket.vip;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        char y;
        int pilih, pil;
        float uang;
        int harga;
        String nama;
        do {
            System.out.println("Tempat Sewa PS");
            System.out.println("Menu");
            System.out.println("1. 1 Jam Rp.3000");
            System.out.println("2. 2 Jam Rp.6000");
            System.out.println("3. 3 Jam Rp.8000");
            System.out.println("4. Paket");
            Scanner menu = new Scanner(System.in);
            System.out.println("Pilih : ");
            pilih = menu.nextInt();
            switch (pilih) {
                case 1:
                    harga = 3000;
                    System.out.print("Masukan Nama Anda : ");
                    nama = menu.next();
                    System.out.print("Masukan Nominal Bayar : ");
                    uang = menu.nextFloat();
                    System.out.println("Nama " + nama);
                    System.out.println("Bayar " + uang);
                    System.out.println("Kembalian Rp. " + Reguler.bayar(uang, harga) );
                    break;
                case 2:
                    harga = 6000;
                    System.out.print("Masukan Nama Anda : ");
                    nama = menu.next();
                    System.out.print("Masukan Nominal Bayar : ");
                    uang = menu.nextFloat();
                    System.out.println("Nama " + nama);
                    System.out.println("Bayar " + uang);
                    System.out.println("Kembalian Rp. " + Reguler.bayar(uang, harga) );
                    break;
                case 3:
                    harga = 8000;
                    System.out.println("Masukan Nama Anda : ");
                    nama = menu.next();
                    System.out.println("Masukan Nominal Bayar : ");
                    uang = menu.nextFloat();
                    System.out.println("Nama " + nama);
                    System.out.println("Bayar " + uang);
                    System.out.println("Kembalian Rp. " + Reguler.bayar(uang, harga) );
                    break;

                case 4:
                    System.out.println("Paket 1 = 3 Jam + Air Mineral Rp. 10.000");
                    System.out.println("Paket 2 = 1 Jam + Air Mineral Rp. 5000");
                    System.out.println("Paket 3 = 2 Jam + Air Mineral Rp. 8000");
                    System.out.println("Masukan Pilihan Anda : ");
                    pil=menu.nextInt();
                    switch (pil)
                    {
                        case 1:
                            harga = 10000;
                            System.out.print("Masukan Nama Anda : ");
                            nama = menu.next();
                            System.out.print("Masukan Nominal Bayar : ");
                            uang = menu.nextFloat();
                            System.out.println("Nama " + nama);
                            System.out.println("Bayar " + uang);
                            System.out.println("Kembalian Rp. " + vip.bayar(uang, harga) );
                            System.out.println("Selamat Anda Mendapatkan Air Mineral");
                            break;
                        case 2:
                            harga= 5000;
                            System.out.print("Masukan Nama Anda : ");
                            nama = menu.next();
                            System.out.print("Masukan Nominal Bayar : ");
                            uang = menu.nextFloat();
                            System.out.println("Nama " + nama);
                            System.out.println("Bayar " + uang);
                            System.out.println("Kembalian Rp. " + vip.bayar(uang, harga) );
                            System.out.println("Selamat Anda Mendapatkan Air Mineral");
                            break;
                        case 3:
                            harga = 8000;
                            System.out.print("Masukan Nama Anda : ");
                            nama = menu.next();
                            System.out.print("Masukan Nominal Bayar : ");
                            uang = menu.nextFloat();
                            System.out.println("Nama " + nama);
                            System.out.println("Bayar " + uang);
                            System.out.println("Kembalian Rp. " + vip.bayar(uang, harga) );
                            System.out.println("Selamat Anda Mendapatkan Air Mineral");
                            break;
                    }
            }
            System.out.print("Mau booking lgi gak?? (y/n)");
            y = menu.next().charAt(0);
        } while (y == 'y');
        System.out.println("Selamat Menikmati");
    }
}

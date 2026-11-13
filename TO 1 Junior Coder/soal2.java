import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Harga Barang : Rp. ");
        double harga = input.nextDouble();

        System.out.print("Diskon       : ");
        double diskonPersen = input.nextDouble();

        double diskonRp = harga * diskonPersen / 100;

        double total = harga - diskonRp;
        
        System.out.println("Total Harga  : Rp. " + total);

        input.close();
    }
}
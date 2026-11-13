import javax.swing.JOptionPane;

public class soal3 {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Nilai 1 :"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Nilai 2 :"));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("Nilai 3 :"));

        double rata = (n1 + n2 + n3) / 3.0;

        String hasil;
        if (rata >= 60) {
            hasil = "LULUS";
        } else {
            hasil = "GAGAL";
        }

        System.out.println("Nilai 1 : " + n1);
        System.out.println("Nilai 2 : " + n2);
        System.out.println("Nilai 3 : " + n3);
        System.out.println("Rata    : " + rata);
        System.out.println("Hasil   : " + hasil);

        JOptionPane.showMessageDialog(null, "Rata-rata : " + rata + "\nHasil : " + hasil);
    }
}
package Top5;

public class SegitigaBintang {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            // Untuk Membuat spasi
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Untuk Mencetak bintang
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

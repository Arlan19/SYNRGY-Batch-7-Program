package Top5;

public class SegitigadenganAngka {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            // Mencetak spasi
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            // Mencetak angka dari 1 hingga (rows - i)
            for (int k = 1; k <= rows - i; k++) {
                System.out.print(k + " ");
            }

            // Mencetak angka dari (rows - i - 1) hingga 1
            for (int l = rows - i - 1; l >= 1; l--) {
                System.out.print(l + " ");
            }

            System.out.println();
        }
    }
}

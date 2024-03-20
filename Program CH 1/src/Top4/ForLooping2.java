package Top4;

public class ForLooping2 {
    public static void main(String[] args) {
        for (int baris = 1; baris <= 5; baris++){
            for (int kolom = 1; kolom <= baris; kolom++){
                System.out.print(kolom + " ");
            }
            System.out.println(" ");
        }
    }
}

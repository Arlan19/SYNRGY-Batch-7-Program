package ch2.pertemuan4Exception;

public class ThrowsEx {
    public static void main(String[] args) {
        try {
            performNullOperation();
        } catch (NullPointerException e) {
            System.out.println("Terjadi NullPointerException: " + e.getMessage());
            // Lakukan penanganan yang sesuai
        } finally {
            System.out.println("Blok finally dieksekusi.");
        }
    }

    public static void performNullOperation() throws NullPointerException {
        String str = null;
        int length = str.length(); // Melemparkan NullPointerException secara otomatis karena str adalah null
        System.out.println("Panjang string: " + length);
    }


}

package ch2.pertemuan4Exception;

public class Main {
    public static void main(String[] args) {
        TrowsWithObjectResponse processor = new TrowsWithObjectResponse();
        try {
            processor.processPayment(-100); // Ini akan melemparkan PaymentException
            System.out.println("Pembayaran berhasil diproses");
        } catch (TrowsWithObjectResponse.PaymentException e) {
            System.out.println("Terjadi kesalahan dalam pemrosesan pembayaran: " + e.getMessage());
            TrowsWithObjectResponse.PaymentResponse response = e.getResponse();
            System.out.println("Status pembayaran: " + (response.isSuccess() ? "Berhasil" : "Gagal"));
            System.out.println("Pesan kesalahan: " + response.getErrorMessage());
            // Lakukan penanganan yang sesuai, misalnya memberikan pesan kesalahan kepada pengguna
        }
    }
}

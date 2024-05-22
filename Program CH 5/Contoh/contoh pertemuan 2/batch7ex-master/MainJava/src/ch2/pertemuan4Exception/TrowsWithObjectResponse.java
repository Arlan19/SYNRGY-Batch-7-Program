package ch2.pertemuan4Exception;

import lombok.Data;

public class TrowsWithObjectResponse {

    public void processPayment(double amount) throws PaymentException {
        if (amount <= 0) {
            throw new PaymentException("Jumlah pembayaran tidak valid", new PaymentResponse(false, "Jumlah pembayaran tidak boleh negatif"));
        }
        // Proses pembayaran...
    }
    public class PaymentException extends Exception {
        private PaymentResponse response;

        public PaymentException(String message, PaymentResponse response) {
            super(message);
            this.response = response;
        }
        public PaymentResponse getResponse() {
            return response;
        }
    }

    @Data
    public class PaymentResponse {
        private boolean success;
        private String errorMessage;

        public PaymentResponse(boolean success, String errorMessage) {
            this.success = success;
            this.errorMessage = errorMessage;
        }
    }
}

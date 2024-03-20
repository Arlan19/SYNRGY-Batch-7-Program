package pertemuan6;

public class StringBufferEx {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("BEJ 2");
        sb.delete(1, 2);
        sb.replace(0, 4, "Hy");
        String message = sb.toString();
        System.out.println(message);
    }
}

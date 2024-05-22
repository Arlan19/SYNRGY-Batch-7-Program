package ch1.pertemuan6;

public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        sb.append("belajar");
        sb.append("java");
        sb.append("di binar");

        System.out.println(sb.delete(1,3).toString());
    }

}

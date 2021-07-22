package string;

public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Ganesh");

        sb.reverse();
        System.out.println(sb);

        sb.append("Kale");
        System.out.println(sb);

        sb.setCharAt(1, 'Z');
        System.out.println(sb);

        sb.delete(0, 2);
        System.out.println(sb);

        sb.insert(1, "Gan");
        System.out.println(sb);
    }
}

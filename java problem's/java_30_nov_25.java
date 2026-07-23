public class java_30_nov_25 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.setCharAt(0, 'c');
        System.out.println(sb);

        sb.delete(0,2);
        System.out.println(sb);
    }
}
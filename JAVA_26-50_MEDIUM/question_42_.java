public class question_42_ {

    public static int powerOf(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {

            result *= a;
        }
return result;
    }

    public static void main(String[] args) {
        // Find power of a number using loop.

        int number = 5;
        int power = 3;
        int result = powerOf(number ,power);

        System.out.println(result);
        
    }
}

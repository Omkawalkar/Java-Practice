public class question_50_ {
    public static void main(String[] args) {

        int addEven = 0;
        int addOdd = 0;
        for (int i = 0; i <= 100; i += 2) {
            addEven += i;

        }

        for (int i = 1; i <= 100; i+=2) {
            addOdd += i;
        }
        System.out.println("sum of all even number " + addEven);
        System.out.println("sum of all odd number " +addOdd);

    }
}

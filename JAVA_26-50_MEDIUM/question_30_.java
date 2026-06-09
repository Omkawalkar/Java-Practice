public class question_30_ {

    public static void SumOfEvenNumber(int number) {
        int i = number;
        int sum = 0;
        while (number <= 10) {
            if (number % 2 == 0) {
                System.out.println(number);
                sum += number;
            }
            number++;
        }

        System.out.println("Sum Of The Even Number Is " + sum);

    }

    public static void main(String[] args) {
        int n = 1;
        SumOfEvenNumber(n);
    }
}

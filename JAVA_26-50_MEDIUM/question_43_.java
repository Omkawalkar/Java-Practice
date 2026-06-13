public class question_43_ {

    public static void yearOf(int year) {

        if (year % 400 == 00) {
            System.out.println("year is leap year");
        } else if (year % 100 == 0) {
            System.out.println("year is not a leap year");
        }

        else if (year % 4 == 0) {
            System.out.println("year is  leap year");
        }

        else {
            System.out.println("year is not leap year");
        }
    }

    public static void main(String[] args) {

        int Year = 2000;

        yearOf(Year);

    }
}
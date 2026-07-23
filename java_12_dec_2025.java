public class java_12_dec_2025 {

    // static int logic(int x, int y) {

    // int z;
    // if (x > y) {

    // z = (x + y) * 5;
    // }

    // else {
    // z = x + y;
    // }
    // return z;
    // }

    // static void hello() {
    // System.out.println("hello good morning");
    // }

    static void change(int [] arr){
    arr[0] = 98 ;
    }

    public static void main(String[] args) {

        // int a = 5;
        // int b = 6;
        // int c;

        // c = logic(a, b);
        // System.out.println(c);

        // int a1 = 6;
        // int b1 = 4;
        // int c1;
        // c1 = logic(a1, b1);
        // System.out.println(c1);
        // hello();

        int[] marks = { 66, 77, 44, 22, 44, 76 };
        change(marks);
        System.out.println("array is " + marks[0]);
    }
}

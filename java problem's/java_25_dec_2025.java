class Base {
    public int x;

    public int getx() {
        return x;

    }

    public void setx(int x) {
        this.x = x;

    }

    public void printMe() {
        System.out.println("I am a constructor from x");
    }

}

class derived extends Base {
    public int y;

    public int gety() {
        return y;
    }

    public void sety(int y) {
        this.y = y;

    }

    public void printy() {
        System.out.println("i am a constructor from y");
    }

}

public class java_25_dec_2025 {

    public static void main(String[] args) {

        Base b = new Base();
        b.setx(5);
        System.out.println(b.getx());

        derived d = new derived();
        d.setx(44);
        System.out.println(d.getx());
    }
}

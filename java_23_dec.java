
class cellPhone {

    public void vibrate() {
        System.out.println("phone is vibrating");

    }

    public void ring() {
        System.out.println("phonr is ringing");
    }

}

public class java_23_dec {
    public static void main(String[] args) {

        cellPhone phone = new cellPhone();
        phone.vibrate();
        phone.ring();

    }
}

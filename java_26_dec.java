// |||||||||||||||||||||||||||||||||||||PRACTICE SET 9 Q.1 ||||||||||||||||||||||||||||||||||||||||||||||

/* class container {
    // int a = 6; // radius
    // int b = 15; // height

    int radius;
    int height;
-
    public int getRadius() {
        return radius;

    }

    public void setRadius(int a) {
        this.radius = a;

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int b) {
        this.height = b;
    }

}

public class java_26_dec {

    public static void main(String[] args) {

        container cirele = new container();

        cirele.setHeight(5);
        cirele.setRadius(15);

        System.out.println(" radius is " + cirele.getRadius());
        System.out.println(" Height is " + cirele.getHeight());
    }
}
*/

// ||||||||||||||||||||||||||||||||||||| PRACTICE SET 9 Q.2 ||||||||||||||||||||||||||||||||||||||||||||||

/*class Area_Of_Circle {


    int radius;

    // float area = sum * 3.14 ;

    public void Setarea(int a) {
        this.radius = a;

    }

    public int Getarea() {

        return radius;

    }

}

public class java_26_dec {

    public static void main(String[] args) {
        Area_Of_Circle Ar = new Area_Of_Circle();
        double pi = 3.14;
        Ar.Setarea(8);
        System.out.println("Area of circle " + Ar.Getarea());

        int radi = Ar.Getarea();

        double conversion = (radi * radi) * pi;
        System.out.println("area of circle is " + conversion);
    }

}
*/

// ||||||||||||||||||||||||||||||||||||| PRACTICE SET 9 Q.3 ||||||||||||||||||||||||||||||||||||||||||||||

/*public class java_26_dec {


    static double conversion(int a, int b) {
        double pi = 3.14;
        int sum = a + b;

        double total = (2 * 3.14) * a;
        double finalTotal = total * sum;
        return finalTotal;

    }

    public static void main(String[] args) {

        int r = 14;
        int h = 10;
        System.out.println(conversion(r, h));
    }
}
*/

// ||||||||||||||||||||||||||||||||||||| PRACTICE SET 9 Q.4 ||||||||||||||||||||||||||||||||||||||||||||||
/*class area_of_cylinder {
    int radius;
    int height;

    public void setradius(int a) {
        this.radius = a;
    }

    public int getradius() {
        return radius;
    }

    public void setheight(int b) {
        this.height = b;
    }

    public int getheight() {
        return height;
    }
}

public class java_27_dec {
    public static void main(String[] args) {
        area_of_cylinder ex = new area_of_cylinder();
        ex.setradius(14);
        ex.setheight(10);

        System.out.println("radius is " + ex.getradius());
        System.out.println("height is " + ex.getheight());

        int rad = ex.getradius();
        int hei = ex.getheight();
        // int sum = (rad + hei); // 24
        // double sum1 = rad * sum; // 240
        // double total = 2 * 3.14 * sum1; // 2110.08

        float sum = rad * (rad + hei);
        double total = 2 * (3.14 * sum);

        System.out.println("Area Of Cylinder is " + total);

        // System.out.println(sum);
    }
*/

// ||||||||||||||||||||||||||||||||||||| PRACTICE SET 9 Q. ||||||||||||||||||||||||||||||||||||||||||||||

class volume {
    int radius;
    int height;

    public void setradius(int a) {
        this.radius = a;

    }

    public int getradius() {
        return radius;
    }

    public void setheight(int b) {
        this.height = b;
    }

    public int getheight() {
        return height;
    }

}

public class java_26_dec {
    public static void main(String[] args) {

        volume vol = new volume();

        vol.setradius(5);
        vol.setheight(10);

        int radius = vol.getradius();
        int height = vol.getheight();

        int R = radius * radius;
        double total = 3.14 * R * height;
        System.out.println("volume of the cylinder is " + total);

    }
}

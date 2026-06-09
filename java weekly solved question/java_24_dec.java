
class MyEmployee {

    int id;
    String name;

    public String getname() {

        return name;

    }

    public void setname(String n) {
        name = n;

    }

    public int getid() {
        return id;

    }

    public void setid(int a) {
        id = a;
    }

}

public class java_24_dec {

    public static void main(String[] args) {

        // ACCESS MODIFIER

        MyEmployee omkar = new MyEmployee();
        omkar.setid(33);
        omkar.setname("omkar");
        System.out.println(omkar.getid());
        System.out.println(omkar.getname());
    }
}

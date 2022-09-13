public class Main {
    public static void main(String[] args) {

        Person p1= new Person("Youssef","1234",25);
        Person p2= new Person("Alaa","5678",22);
        Person p3=p2;
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

    }
}
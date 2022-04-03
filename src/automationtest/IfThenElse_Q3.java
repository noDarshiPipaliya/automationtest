package automationtest;

public class IfThenElse_Q3 {

    public  boolean isteen(int age ) {
        if (age < 20)
            System.out.println("person is teen ");

        else if  (age < 35)
            System.out.println("person is adult ");
        return false;
    }

    public static void main(String[] args) {
        IfThenElse_Q3 obj = new IfThenElse_Q3();
        System.out.println(obj.isteen(60));
        System.out.println(obj.isteen(25));
    }

}

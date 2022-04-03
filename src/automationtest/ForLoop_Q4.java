package automationtest;

public class ForLoop_Q4 {

    public boolean printMyName(String name, int howManyTime){

        for (int i = 1;i<=10;i++){
            System.out.println(i);
        }
        return false;
    }

    public static void main(String[] args) {
        ForLoop_Q4 obj = new ForLoop_Q4();
        System.out.println(obj.printMyName("Devanshi",10));
    }

}

package automationtest;

import java.util.ArrayList;

public class ArrayList_Q5 {

    public static void main(String[] args) {
        ArrayList<String> namelist = new ArrayList<>();
        namelist.add("Output");
        namelist.add("Scrum");
        namelist.add("Java");
        namelist.add("Jira");
        namelist.add("Selenium");
        namelist.add("Cucumber");
        namelist.add("Postman");
        namelist.add("Rest Assured");

        for (String name : namelist) {
            System.out.println(name);
        }


    }

}

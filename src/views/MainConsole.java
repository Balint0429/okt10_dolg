package views;

import java.util.ArrayList;
import models.Employee;
//import controller.Maincontroller;

public class MainConsole {
    public MainConsole(){
    }
    public void showData(ArrayList<Employee> empList) {
        System.out.println("Dolgozók adatai:");

        for (Employee emp : empList) {
            System.out.printf("%-20s %-20s %-20s %-10s %-10.2f%n",
                    emp.getNév(),
                    emp.getTelepülés(),
                    emp.getCím(),
                    emp.getSzületés(),
                    emp.getFizetés()
            );
        }
    }
    
}

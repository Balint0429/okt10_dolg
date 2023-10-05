package controller;

import java.util.ArrayList;

import models.Employee;
import models.Filereader;
import views.MainConsole;


public class Maincontroller {
    public Maincontroller() {

        ArrayList<Employee> empList =new Filereader().readFile();
        new MainConsole().showData(empList);
            
    }

    public static void main(String[] args) {
        new Maincontroller();
    }

}
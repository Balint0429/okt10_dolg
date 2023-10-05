package models;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Filereader {
    final String File="filbt.txt";
    ArrayList<Employee>empList=new ArrayList<>();

    public  ArrayList<Employee> readFile() {
        try {
            loadData();
        } catch (FileNotFoundException e) {
            System.err.println("Hiba! A fájl nem található!");
            System.err.println(e.getMessage());
        }
        return empList;
    }

    public  ArrayList<Employee> loadData() throws FileNotFoundException {
        File file = new File(File);
        Scanner sc = new Scanner(file, "utf-8");
        //sc.nextLine();

        while(sc.hasNext()) {
            String line = sc.nextLine();
            String lineFree = line.replace("-", "");
            // System.out.println(lineFree);
            String[] lineArray = lineFree.split(":") ;
            Employee emp = new Employee();
            emp.setNév(lineArray[0]);
            emp.setTelepülés(lineArray[1]);
            emp.setCím(lineArray[2]);
            emp.setSzületés(Integer.parseInt(lineArray[3]));
            emp.setFizetés(Double.parseDouble(lineArray[4]));
            this.empList.add(emp);
            //System.out.print(emp.getSzületés());
        }
        return empList;
    }
}

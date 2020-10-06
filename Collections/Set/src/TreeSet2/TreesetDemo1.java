package TreeSet2;

import java.util.TreeSet;

public class TreesetDemo1 {
    public static void main(String[] args){
        TreeSet<Employee> emp = new TreeSet<>(new CompareEmployee());
        emp.add(new Employee(45677,"Ram",455));
        emp.add(new Employee(45677,"Rag",555));
        emp.add(new Employee(45677,"aksak",453));
        emp.add(new Employee(45677,"anu",212));

        for(Employee e:emp){
            System.out.println(e.empId+ " " + e.name + " " + e.salary);
        }
    }
}

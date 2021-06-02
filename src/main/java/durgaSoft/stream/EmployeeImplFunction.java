package durgaSoft.stream;

import durgaSoft.stream.pojo.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class EmployeeImplFunction {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("GP","Netherland","Developer",3000.0f));
        employeeList.add(new Employee("Pammu","Netherland","Manager",3200.0f));
        employeeList.add(new Employee("Bhushan","Netherland","Client",2000.0f));
        employeeList.add(new Employee("Kishore","Netherland","Developer",3000.0f));
        employeeList.add(new Employee("Karan","Norway","Developer",2000.0f));

        // Create a function which segreagate employee grade
        Function<Employee,String> employeeFunction = emp ->{
            double salary =emp.getSalary();
            return salary>3100?"A":salary<=3000 && salary>2001?"B":"C";
        };
        // Iterating the employees and printing its standards
        employeeList.stream()
                .forEach(employee -> {
                            System.out.printf("%s,%.2f,%s",employee.getName(),employee.getSalary(),employeeFunction.apply(employee));
                            System.out.println();
                        }
                );
    }
}

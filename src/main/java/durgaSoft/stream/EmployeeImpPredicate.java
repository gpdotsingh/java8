package durgaSoft.stream;

import durgaSoft.stream.pojo.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeImpPredicate {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();


        employeeList.add(new Employee("GP","Netherland","Developer",3000.0f, Arrays.asList("+911122","+32344423"), Arrays.asList("abc1.com","cde1.com") ));
        employeeList.add(new Employee("Pammu","Netherland","Manager",3200.0f, Arrays.asList("+911342","+32434423"), Arrays.asList("abc2.com","cde2.com") ));
        employeeList.add(new Employee("Bhushan","Netherland","Client",2000.0f, Arrays.asList("+911122","+31344423"), Arrays.asList("abc3.com","cde3.com") ));
        employeeList.add(new Employee("Kishore","Netherland","Developer",3000.0f, Arrays.asList("+2254122","+35344423"), Arrays.asList("abc4.com","cde4.com") ));
        employeeList.add(new Employee("Karan","Norway","Developer",2000.0f, Arrays.asList("+911122","+31344423"), Arrays.asList("abc5.com","cde.com5") ));


        Predicate<Employee> managerCondition = e->e.getDesignation().equals("Manager");
        Predicate<Employee> countryNorway = e->e.getAdd().equals("Norway");
        Predicate<Employee> salaryGt2000 = e->e.getSalary()>2000;

        displayEmployee(managerCondition,employeeList);
        System.out.println("****************");
        displayEmployee(countryNorway,employeeList);
        System.out.println("****************");
        displayEmployee(salaryGt2000,employeeList);
        System.out.println("****************");
        displayEmployee(salaryGt2000.and(managerCondition),employeeList);
        System.out.println("****************");
        displayEmployee(salaryGt2000.negate(),employeeList);

        List<String> emails = getAllDistinctMailIds(employeeList);
        emails.stream()
                .forEach(System.out::println);

    }

    private static List<String> getAllDistinctMailIds(List<Employee> employeeList) {

return employeeList.stream()
                .flatMap(employee -> employee.getEmails().stream())
                .distinct()
                .collect(Collectors.toList());

    }

    public static void displayEmployee(Predicate<Employee> p, List<Employee> e)
    {
        e.forEach(employee -> {
            if(p.test(employee))
                System.out.println(employee);
        });
    }
}

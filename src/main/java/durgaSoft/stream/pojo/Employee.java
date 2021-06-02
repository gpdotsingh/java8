package durgaSoft.stream.pojo;

import java.util.List;

public class Employee {

    private String name;
    private String add;
    private String designation;
    private Float salary;
    private List<String> mobileNumber;
    private List<String> emails;

    public void setName(String name) {
        this.name = name;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public List<String> getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(List<String> mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public String getName() {
        return name;
    }

    public String getAdd() {
        return add;
    }

    public String getDesignation() {
        return designation;
    }

    public Float getSalary() {
        return salary;
    }

    public Employee(String name, String add, String designation, Float salary) {
        this.name = name;
        this.add = add;
        this.designation = designation;
        this.salary = salary;
    }


    public Employee(String name, String add, String designation, Float salary, List<String> mobileNumber, List<String> emails) {
        this.name = name;
        this.add = add;
        this.designation = designation;
        this.salary = salary;
        this.mobileNumber = mobileNumber;
        this.emails = emails;
    }

    @Override
    public String toString() {
        return  String.format("%s,%s,%s,%.2f",name,add,designation,salary);
    }
}

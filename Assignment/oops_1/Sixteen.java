package oops_1;
// 16. Create a subclass called FactoryEmployee, for all factory employees we need to store
//  bus_no, emp_boards.Create a super class related to this subclass.

public class Sixteen {
    public static void main(String[] args) {
        FactoryEmployee f = new FactoryEmployee("sai", "ece", 01, "company");
        f.getBus_no();
        
    }
    
}
class Employee{
    String name;
    String dept;
    Employee(String name,String dept){
        this.name=name;
        this.dept=dept;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    
}
class FactoryEmployee extends Employee{
    int bus_no;
    String emp_boards;
    public FactoryEmployee(String name, String dept, int bus_no, String emp_boards) {
        super(name, dept);
        this.bus_no = bus_no;
        this.emp_boards = emp_boards;
    }
    public int getBus_no() {
        return bus_no;
    }
    public void setBus_no(int bus_no) {
        this.bus_no = bus_no;
    }
    public String getEmp_boards() {
        return emp_boards;
    }
    public void setEmp_boards(String emp_boards) {
        this.emp_boards = emp_boards;
    }
    public void display(){
        System.out.println(name);
        System.out.println(dept);
        System.out.println(bus_no);
        System.out.println(emp_boards);
    }
    
}
package academy.MyTests.tests2.domain;

public class Manager extends Employee{
    private String department;

    public Manager(String name, double salary, String department){
        super(name, salary);
        this.department = department;
    }

    @Override
    public void report(){
        super.report();
        System.out.println("Personnel action: " + this.department);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String deprtment) {
        this.department = department;
    }
}

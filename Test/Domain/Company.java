package academy.MyTests.tests2.domain;

public class Company {
    private String companyName;
    private Employee[] staff;

    public Company(){

    }
    public Company(String companyName, Employee[] staff){
        this.companyName = companyName;
        this.staff = staff;
    }

    public void showStaff(){
        System.out.println(" --- " + this.companyName + " --- ");
        if(staff == null) return;
        for(Employee staffs: staff){
            staffs.report();
            System.out.println("------------");
        }
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Employee[] getStaff() {
        return staff;
    }

    public void setStaff(Employee[] staff) {
        this.staff = staff;
    }
}

package academy.MyTests.tests2.domain;

public class Developer extends Employee{
    private String mainLanguage;

    public Developer(String name, double salary, String mainLanguage) {
        super(name, salary);
        this.mainLanguage = mainLanguage;
    }

    @Override
    public void report(){
        super.report();
        System.out.println("Main Language Programming workout: " +  this.mainLanguage);
    }

    public String getMainLanguage() {
        return mainLanguage;
    }

    public void setMainLanguage(String mainLanguage) {
        this.mainLanguage = mainLanguage;
    }
}

package academy.MyTests.tests2.test;

import academy.MyTests.tests2.domain.Company;
import academy.MyTests.tests2.domain.Developer;
import academy.MyTests.tests2.domain.Employee;
import academy.MyTests.tests2.domain.Manager;

import java.util.Locale;
import java.util.Scanner;

public class CompanyTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);

        Company company;

        System.out.println("Tell us the name of your company:");
        String nameCompany = in.nextLine();

        System.out.println("--------------------------------------");
        System.out.println(" --- Welcome to " + nameCompany + " Registration --- ");

        System.out.println("Type how many employees it has:");
        int numbEmp = in.nextInt();

        Employee[] staff = new Employee[numbEmp];

        for(int i = 0;i < numbEmp; i++){
            System.out.println("Is the employee registered as a Developer(1) or a Manager(non-1)?");
            int choice = in.nextInt();

            in.nextLine();
            if(choice == 1){
                System.out.println("Type employee name:");
                String nameEmp = in.nextLine();

                System.out.println("Type employee salary:");
                double salEmp = in.nextDouble();

                in.nextLine();

                System.out.println("Type employee main functionality:");
                String progLang = in.nextLine();

                staff[i] = new Developer(nameEmp, salEmp, progLang);
            }
            else{
                System.out.println("Type employee name:");
                String nameEmp = in.nextLine();

                System.out.println("Type employee salary:");
                double salEmp = in.nextDouble();

                in.nextLine();

                System.out.println("Type employee department:");
                String depEmp = in.nextLine();

                staff[i] = new Manager(nameEmp, salEmp, depEmp);
            }

            System.out.println("-------------------");
        }
        company = new Company(nameCompany, staff);
        company.showStaff();
    }
}

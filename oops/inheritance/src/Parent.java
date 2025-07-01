public class Parent extends GrandParent{
    String empCity;
    float empSalary;

    Parent(){
        System.out.println("Default constructor of Parent class");
    }

    Parent(String empCity, float empSalary){
        super("Ved", 3);
        super.getExCompanyName("MI");
        super.getEmpQualification("M.S.");
        this.empCity = empCity;
        this.empSalary = empSalary;
        System.out.println("Parameterized constructor of Parent class giving Emp City: " + this.empCity);
        System.out.println("Parameterized constructor of Parent class giving Emp Salary: " + this.empSalary);
    }

    void getNoOfProjectsHandled(int noOfProjects){
        System.out.println("Parent class: This specifies the number of projects handled by: " + super.empName);
        System.out.println("Parent class: No. of Projects: " + noOfProjects);
    }

    void getEmployeeBirthplace(String birthplace){
        System.out.println("Parent class: The employee's birthplace is " + birthplace);
    }

}

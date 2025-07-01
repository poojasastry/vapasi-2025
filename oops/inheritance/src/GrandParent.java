public class GrandParent {
    String empName;
    int age;

    GrandParent(){
        System.out.println("Default constructor of GrandParent");
    }

    GrandParent(String empName,int age){
        this();
        this.empName = empName;
        this.age = age;
        System.out.println("Parametrized constructor of GrandParent giving Employee name: " + this.empName);
        System.out.println("Parametrized constructor of GrandParent giving Employee age: "+ this.age);
    }

    void getExCompanyName(String companyName){
        System.out.println("GrandParent class: The employee's ex-company is: " + companyName);
    }

    void getEmpQualification(String qualification){
        System.out.println("GrandParent class: The employee's educational qualification is: " + qualification);
    }


}

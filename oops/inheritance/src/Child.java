public class Child extends Parent{
    String empDesignation;
    int empTenure;

    Child(){
        System.out.println("Default constructor of Child class");
    }

    Child(String empDesignation, int empTenure){
        super("Bangalore",25.5f);
        super.getNoOfProjectsHandled(4);
        super.getEmployeeBirthplace("Bangalore");
        this.empDesignation = empDesignation;
        this.empTenure = empTenure;
        System.out.println("Parameterized constructor of child giving Emp Designation: " + this.empDesignation);
        System.out.println("Parameterized constructor of child giving Emp tenure: " + this.empTenure);
        this.getEmpModeOfTransport("Auto");
        this.getEmpOtherDetails("Singing", Boolean.TRUE);
    }

    void getEmpModeOfTransport(String mode){
        System.out.println("Child class: Employee's Mode of transport is: " + mode);
        if(mode == "cab"){
            System.out.println("Employee is availing office cab facility");
        }else{
            System.out.println("Employee is using his own transport");
        }
    }

    void getEmpOtherDetails(String hobby,Boolean usingChildCare){
        System.out.println("Employee's name from GP class: " + super.empName);
        System.out.println("Employee's age from GP class: " + super.age);
        System.out.println("Child class: Employee's hobby is: " + hobby);
        System.out.println("Child class: Employee uses Child care facility (True/False): " + usingChildCare);
    }

}

package AggegationInheritance;

public class EmployeeInfo {
    int id;
    Name names;

    public EmployeeInfo(int id, Name names){
        this.id = id;
        this.names = names;
    }

    public String display(){
        return "Employee: " + names.firstName + " " + names.lastName + " has ID # " + this.id;
    }
    public static void main(String[] args) {
        Name name = new Name("Alexandrea", "Brown");
        EmployeeInfo newStaff = new EmployeeInfo(1,name);
        System.out.println(newStaff.display());

    }
}

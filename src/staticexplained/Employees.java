package staticexplained;

public class Employees {
    final static String company = "Sale Traders";
    int salary;
    int id;

    public Employees(int s, int i){
        salary=s;
        id=i;
    }

    protected void info(){
        System.out.println("ID: " + id + "\nSalary: " + salary + "\nCompany: " + company);
    }

    public static void main(String[] args) {
        Employees sam = new Employees(75000, 2);
        sam.info();
    }
}

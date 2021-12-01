package thisKeyword;

public class ClassInfo {

    int rollNo;
    String name;

    public ClassInfo(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    public String display(){
        return this.name +" 's roll number is" + rollNo;
    }
    public static void main(String[] args) {
        ClassInfo maggie = new ClassInfo("Maggie", 1);
        System.out.println(maggie.display());
    }
}

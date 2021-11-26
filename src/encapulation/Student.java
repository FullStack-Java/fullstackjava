package encapulation;

public class Student {

    //Have to make it private, we are hiding the properties from the outside classes
    private String name;
    private int age;
    private String address;

//    The Constuctor
    public Student(String name, int age, String address ){
        this.name = name;
        this .age = age;
        this.address = address;
    }

//    Since these properties are private, we need a way to access them
//    We do this by way of Getters and Setters allow for


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}

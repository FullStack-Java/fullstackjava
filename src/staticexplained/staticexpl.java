package staticexplained;

public class staticexpl {

    public void nonstaticTest(){
        System.out.println("When it's a non-static method, an instance of the class has to be made to access the method");
    }

    public static void staticTest(){
        System.out.println("When it's a static method, the method is just called.");

    }

    public static void main(String[] args) {
        staticexpl nstic = new staticexpl();
        nstic.nonstaticTest();

        staticTest();
    }
}

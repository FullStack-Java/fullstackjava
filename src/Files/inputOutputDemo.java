package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class inputOutputDemo {
    public static void main(String[] args) throws FileNotFoundException {
        File emloyeeFile = new File("C:\\Users\\ellisac\\Documents\\FullStackJava\\fullstackjava\\src\\inputoutputFiles\\EmployeeInfo.txt");
        inputOutputDemo demo = new inputOutputDemo();
        demo.writeToFile(emloyeeFile);

        demo.readFile(emloyeeFile);

    }

    public void writeToFile(File fileToWrite){

        PrintWriter employeeWriter =null;
        try {
            employeeWriter = new PrintWriter(fileToWrite);
            employeeWriter.println("Anna");
            employeeWriter.println("100");
        }catch (FileNotFoundException e) {
            System.out.println("the file was not found on the local disk" + fileToWrite.getName());
            throw new RuntimeException();
        }finally {
            employeeWriter.close();
        }

    }

    public void readFile(File fileToRead) throws FileNotFoundException {
        Scanner input = new Scanner(fileToRead);
        while(input.hasNext()){
            System.out.println("Line read from the input file : " + input.nextLine());
        }
    }

}

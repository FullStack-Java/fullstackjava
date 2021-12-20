package Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

    public static void main(String[] args) throws IOException {
        FileWriterDemo fileWriterDemo = new FileWriterDemo();
        File bikeInfo = new File("C:\\Users\\ellisac\\Documents\\FullStackJava\\fullstackjava\\src\\Files\\bikerGuys.txt");
        fileWriterDemo.writeToFile(bikeInfo);

    }

    private void writeToFile(File fileToWrite) throws IOException {

//        FileWriter infoWriter = null;
//        try {
//            infoWriter = new FileWriter(fileToWrite);
//            infoWriter.write("Hey Anna");
//            infoWriter.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            infoWriter.close();
//        }

//        Alternate Method

        FileWriter infoWriter = infoWriter = new FileWriter(fileToWrite);
        infoWriter.write("Hey Anna New");
        infoWriter.write("boob goop");

        infoWriter.flush();
        infoWriter.close();
    }
}

package serialization;

import java.io.*;

public class ObjectStreamDemo {


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Vehicle vehicle = new Vehicle("bmw",4,0);
        File fileName = new File("C:\\Users\\ellisac\\Documents\\FullStackJava\\fullstackjava\\src\\serialization\\serialzeFile.txt");
        new ObjectStreamDemo().serialize(fileName,vehicle);
        new ObjectStreamDemo().deserialize(fileName);
    }

    /**
     * When we serialze we use ObjectOutputStream
     * When we deserialize we use ObjectInput Stream
     * @param file
     * @param vehicleInstance
     * @throws FileNotFoundException
     * @throws IOException
     */
    private void serialize(File file, Vehicle vehicleInstance) throws FileNotFoundException,IOException {
        FileOutputStream fileStream = new FileOutputStream(file);
        ObjectOutputStream objectSteam = new ObjectOutputStream(fileStream);
        objectSteam.writeObject(vehicleInstance);
        objectSteam.flush();
        objectSteam.close();
    }

    private void deserialize(File file) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fileStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileStream);
        Vehicle deserializedObj = (Vehicle) objectInputStream.readObject();
        System.out.println("Name of the Vehicle  in the serialized file" + deserializedObj.getNameOfVehicle());
        System.out.println("Vehicle - NUmber of Wheels" + deserializedObj.getNumberOfWheels());
        System.out.println("Vehicle's Mileage " + deserializedObj.getMileage());

    }
}

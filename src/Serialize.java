import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialize {
    void serializeObject() {
        Car car = new Car("Honda", 2004);

        try {
            ObjectOutputStream object = new ObjectOutputStream(new FileOutputStream("serializa.ser"));
            object.writeObject(car);
            System.out.println("object serialize succesfully");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    void deserializeObject(){
        try{
            ObjectInputStream object = new ObjectInputStream(new FileInputStream("serializa.ser"));
            // Read object

            Car car = (Car) object.readObject();
            System.out.println(car.getCarName());

        }catch(Exception e){
            e.printStackTrace();
        }
    }

}

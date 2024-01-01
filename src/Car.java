import java.io.Serializable;

public class Car implements Serializable {
    String carName;

    int carYear;

    Car(String carName, int carYear) {
        this.carName = carName;
        this.carYear = carYear;
    }
    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }



    final int DEFAULT_SPEED = 300;



}

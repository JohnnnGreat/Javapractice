public class Car implements CarUtils{

    final int DEFAULT_SPEED = 300;

    @Override
    public int calculateSpeed(String carModel, String chaosis) {
        return 0;
    }

    @Override
    public void applyForNewCar() {

    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    private String carName;
    private String carModel;
    private String carColor;

    /*public Car(String carName, String carModel, String carColor){
        this.carName = carName;
        this.carModel= carModel;
        this.carColor = carColor;
    }*/

    public void setCarName(String carName){
        this.carName = carName;
    }

    public String getCarName(){
        return this.carName;
    }
}

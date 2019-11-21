package car;

public class CarFactory {

    public static Car CreateCar(Class aClass) throws Exception{
        return (Car) aClass.newInstance();
    }


}

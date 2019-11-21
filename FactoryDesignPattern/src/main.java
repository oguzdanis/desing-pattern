import car.Car;
import car.CarFactory;
import car.impl.Hatchback;
import car.impl.Sedan;

public class main {

    public static void main(String[] args) {

        try {
            Car vwGolf = (Car) CarFactory.CreateCar(Hatchback.class);
            System.out.println("Vw Golf :"+vwGolf.bagajCamlaMiAciliyor());;

            Car vwPassat = (Car) CarFactory.CreateCar(Sedan.class);
            System.out.println("Vw Passat :"+vwPassat.bagajCamlaMiAciliyor());;

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}

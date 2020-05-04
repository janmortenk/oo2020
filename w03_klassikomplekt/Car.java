public class Car{
    Info car;
    int finalAmount;

    public Car(Info updated_car){
        car = updated_car;
    }

    public int addAmount(int newAmount){
        finalAmount = (car.getAmount() + newAmount);
        return finalAmount;
    }

    public String specs(){
        return car.kere + ", " + car.brand + ", " + car.mudel + ", " + car.kutus + ", " + car.hind + "€";
    }
}
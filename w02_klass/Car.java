public class Car {

    private String name;
    CarType carType;
    CarColorType carColorType;

    public Car(String name, CarType carType, CarColorType carColorType){
        this.name = name;
        this.carType = carType;
        this.carColorType = carColorType;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        if(carType == CarType.MAASTUR){
            return "Maastur";
        }else if(carType == CarType.SEDAAN){
            return "Sedaan";
        }else{
            return "Universaal";
        }
    }
    
    public String getColor(){
        if(carColorType == CarColorType.RED){
            return "Punane";
        }else if(carColorType == CarColorType.WHITE){
            return "Valge";
        }else if(carColorType == CarColorType.GREEN){
            return "Roheline";
        }else{
            return "Sinine";
        }
    }

    public void action(){
        if(carType == CarType.MAASTUR){
            System.out.println("Mägistel teedel");
        }else if(carType == CarType.SEDAAN){
            System.out.println("Linna teedel");
        }
    }
}
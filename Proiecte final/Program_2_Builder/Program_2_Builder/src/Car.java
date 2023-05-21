public class Car {
    private String brand;
    private String model;
    private String color;
    private int speed;
    private int noSeats;
    private String engine;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public int getNoSeats() {
        return noSeats;
    }

    public String getEngine() {
        return engine;
    }

    private Car(Builder build)
    {
        this.brand=build.brand;
        this.model=build.model;
        this.engine=build.engine;
        this.color=build.color;
        this.speed=build.speed;
        this.noSeats=build.noSeats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                ", noSeats=" + noSeats +
                ", engine='" + engine + '\'' +
                '}';
    }

    public static class Builder
    {
        private String brand;
        private String model;
        private String color;
        private int speed;
        private int noSeats;
        private String engine;
        public Builder(String brand,String model,String color,String engine)
        {
            this.brand=brand;
            this.model=model;
            this.color=color;
            this.engine=engine;
            this.speed=120;
            noSeats=5;
        }
        public Builder setSpeed(int speed)
        {
            this.speed=speed;
            return this;
        }
        public Builder setNoSeats(int noSeats) {
            if(speed>200)
                this.noSeats=2;
            else
                this.noSeats = noSeats;
            return this;
        }
        public Car buildCar()
        {
            return new Car(this);
        }
    }
}

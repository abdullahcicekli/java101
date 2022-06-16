class Car{
    String type;
    String model;
    String color;
    int speed;
    int speedLimit = 180;

    void increaseSpeed(int increment){
        if(speed+increment < speedLimit){
            speed += increment;
        }
    }

    void decreaseSpeed(int decrease){
        if(speed-decrease > 0){
            speed -= decrease;
        }
    }

    void printSpeed(){
        System.out.println("Hızınız : "+ speed);
    }
}
package pratice;
class inheritance{
    public static void main(String[] args) {
        Car c=new Car();
        c.e.start();
        c.drive();
        c.e.stop();
    }
}
class Engine {
    void start()
    {
        System.out.println("engine startted");
    }
    void stop()
    {
        System.out.println("Engine stopped");
    }
}
class Car{
    Engine e=new Engine();
    void drive()
    {
        System.out.println("car is started");
    }
}
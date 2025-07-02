public class Consumers {
    public static void main(String[] args) {
        Processor processor1 = new Processor("fourth", 3);
        Ram ram1 = new Ram(250, "third");
        Hdd hdd1 = new Hdd(200, "SSD");
        Laptop laptopForConsumer1 = new Laptop("Mac", processor1, ram1, hdd1);

        Processor processor2 = new Processor("fifth", 4.5f);
        Ram ram2 = new Ram(350, "second");
        Hdd hdd2 = new Hdd(100, "SSD");
        Laptop laptopForConsumer2 = new Laptop("Windows", processor2, ram2, hdd2);

        System.out.println(laptopForConsumer1);
        System.out.println(laptopForConsumer2);
    }
}
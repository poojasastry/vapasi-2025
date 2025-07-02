class Laptop {
    private String logo;
    private Processor processor;
    private Ram ram;
    private Hdd hdd;

    public Laptop(String logo, Processor processor, Ram ram, Hdd hdd) {
        this.logo = logo;
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "logo='" + logo + '\'' +
                ", processor=" + processor +
                ", ram=" + ram +
                ", hdd=" + hdd +
                '}';
    }
}

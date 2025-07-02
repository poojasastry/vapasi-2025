public class Hdd {
    private int hddSize;
    private String hddType;

    public Hdd(int hddSize, String hddType) {
        this.hddSize = hddSize;
        this.hddType = hddType;
    }

    @Override
    public String toString() {
        return "{" +
                "size=" + hddSize +
                ", hdType='" + hddType + '\'' +
                '}';
    }
}

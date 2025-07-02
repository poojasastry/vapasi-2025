public class Ram {
    private float ramSize;
    private String generationOfRam;

    public Ram(float ramSize, String generationOfRam) {
        this.ramSize = ramSize;
        this.generationOfRam = generationOfRam;
    }

    @Override
    public String toString() {
        return "{" +
                "size=" + ramSize +
                ", generationOfRam='" + generationOfRam + '\'' +
                '}';
    }
}

public class Processor {

    private String generationOfProcessor;
    private float ghz;

    public Processor(String generationOfProcessor, float ghz) {
        this.generationOfProcessor = generationOfProcessor;
        this.ghz = ghz;
    }

    @Override
    public String toString() {
        return "{" +
                "generation='" + generationOfProcessor + '\'' +
                ", ghz=" + ghz +
                '}';
    }
}

package Exercise3_Builder;

public class Main {

    static class Laptop {

        private String ram;
        private String ssd;
        private String processor;

        public Laptop(String ram, String ssd, String processor) {
            this.ram = ram;
            this.ssd = ssd;
            this.processor = processor;
        }

        public void display() {
            System.out.println("Laptop Configuration:");
            System.out.println("RAM: " + ram);
            System.out.println("SSD: " + ssd);
            System.out.println("Processor: " + processor);
        }
    }

    static class LaptopBuilder {

        private String ram;
        private String ssd;
        private String processor;

        public LaptopBuilder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public LaptopBuilder setSsd(String ssd) {
            this.ssd = ssd;
            return this;
        }

        public LaptopBuilder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public Laptop build() {
            return new Laptop(ram, ssd, processor);
        }
    }

    public static void main(String[] args) {

        Laptop laptop = new LaptopBuilder()
                .setRam("16 GB")
                .setSsd("512 GB")
                .setProcessor("Intel i7")
                .build();

        laptop.display();
    }
}
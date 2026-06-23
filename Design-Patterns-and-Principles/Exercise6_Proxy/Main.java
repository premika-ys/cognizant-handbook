package Exercise6_Proxy;



public class Main {

    interface Image {
        void display();
    }

    static class RealImage implements Image {

        private String fileName;

        public RealImage(String fileName) {
            this.fileName = fileName;
            loadFromDisk();
        }

        private void loadFromDisk() {
            System.out.println("Loading image: " + fileName);
        }

        public void display() {
            System.out.println("Displaying image: " + fileName);
        }
    }

    static class ProxyImage implements Image {

        private RealImage realImage;
        private String fileName;

        public ProxyImage(String fileName) {
            this.fileName = fileName;
        }

        public void display() {

            if(realImage == null) {
                realImage = new RealImage(fileName);
            }

            realImage.display();
        }
    }

    public static void main(String[] args) {

        Image image = new ProxyImage("CTS_Logo.jpg");

        System.out.println("First Call:");
        image.display();

        System.out.println();

        System.out.println("Second Call:");
        image.display();
    }
}

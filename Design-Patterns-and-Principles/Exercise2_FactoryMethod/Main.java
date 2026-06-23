package Exercise2_FactoryMethod;

public class Main {

    interface Document {
        void open();
    }

    static class WordDocument implements Document {
        public void open() {
            System.out.println("Opening Word Document");
        }
    }

    static class PdfDocument implements Document {
        public void open() {
            System.out.println("Opening PDF Document");
        }
    }

    static class ExcelDocument implements Document {
        public void open() {
            System.out.println("Opening Excel Document");
        }
    }

    static class DocumentFactory {

        public static Document createDocument(String type) {

            if(type.equalsIgnoreCase("word")) {
                return new WordDocument();
            }
            else if(type.equalsIgnoreCase("pdf")) {
                return new PdfDocument();
            }
            else if(type.equalsIgnoreCase("excel")) {
                return new ExcelDocument();
            }

            return null;
        }
    }

    public static void main(String[] args) {

        Document doc1 = DocumentFactory.createDocument("word");
        doc1.open();

        Document doc2 = DocumentFactory.createDocument("pdf");
        doc2.open();

        Document doc3 = DocumentFactory.createDocument("excel");
        doc3.open();
    }
}

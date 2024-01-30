package interfacesegregation;

// Client code
public class DocumentProcessingClient {
    public static void main(String[] args) {
        PrintableDocument printableDocument = new SimplePrintableDocument();
        printableDocument.open();
        printableDocument.print();
        printableDocument.save();
        printableDocument.close();

        ScannableDocument scannableDocument = new SimpleScannableDocument();
        scannableDocument.open();
        scannableDocument.scan();
        scannableDocument.save();
        scannableDocument.close();
    }
}

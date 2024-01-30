package interfacesegregation;

// Concrete class implementing a printable document
class SimplePrintableDocument implements PrintableDocument {
    @Override
    public void open() {
        System.out.println("SimplePrintableDocument - Open");
    }

    @Override
    public void close() {
        System.out.println("SimplePrintableDocument - Close");
    }

    @Override
    public void save() {
        System.out.println("SimplePrintableDocument - Save");
    }

    @Override
    public void print() {
        System.out.println("SimplePrintableDocument - Print");
    }
}

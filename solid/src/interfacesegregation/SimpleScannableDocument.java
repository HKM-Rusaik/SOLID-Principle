package interfacesegregation;

// Concrete class implementing a scannable document
class SimpleScannableDocument implements ScannableDocument {
    @Override
    public void open() {
        System.out.println("SimpleScannableDocument - Open");
    }

    @Override
    public void close() {
        System.out.println("SimpleScannableDocument - Close");
    }

    @Override
    public void save() {
        System.out.println("SimpleScannableDocument - Save");
    }

    @Override
    public void scan() {
        System.out.println("SimpleScannableDocument - Scan");
    }
}

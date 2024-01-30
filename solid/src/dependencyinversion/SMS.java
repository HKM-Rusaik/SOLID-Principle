package dependencyinversion;

// Low-level module representing a SMS
class SMS implements Message {
    private String content;

    public SMS(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}

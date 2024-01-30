package dependencyinversion;

// Low-level module representing an Email
class Email implements Message {
    private String content;

    public Email(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}

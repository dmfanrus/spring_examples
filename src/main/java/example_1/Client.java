package example_1;

public class Client {
    private String id;
    private String fullname;

    public Client(String id, String fullname) {
        this.id = id;
        this.fullname = fullname;
    }

    public String getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }
}

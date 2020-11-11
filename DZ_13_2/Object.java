import java.util.Objects;

public class Object {
    String firstName;
    String secondName;

    public Object(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondnName() {
        return secondName;
    }

    public void setSecondnName(String secondnName) {
        this.secondName = secondnName;
    }
}

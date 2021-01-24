package parsing;

public class Currency {

    private int code;
    private int id;
    private String name;
    private float rate;
    private boolean visible;

    public Currency(int code, int id, String name, float rate, boolean visible) {
        this.code = code;
        this.id = id;
        this.name = name;
        this.rate = rate;
        this.visible = visible;
    }

    public int getCode() {
        return code;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getRate() {
        return rate;
    }

    public boolean isVisible() {
        return visible;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "code=" + code +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", rate=" + rate +
                ", visible=" + visible +
                '}';
    }
}
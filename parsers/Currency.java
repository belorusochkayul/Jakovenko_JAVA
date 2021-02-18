package parsers;

public class Currency {
    private int code;
    private int id;
    private String name;
    private double rate;
    private boolean visible;

    public Currency() {
    }

    public Currency(int code, int id, String name, double rate, boolean visible) {
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

    public double getRate() {
        return rate;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
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
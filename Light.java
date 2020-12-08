import java.util.ArrayList;
import java.util.List;

public class Light implements Describe {
    private int lampLight;

    public Light(int lampLight) {
        this.lampLight = lampLight;
    }

    public int getLampLight() {
        return lampLight;
    }

    public void setLampLight(int lampLight) {
        this.lampLight = lampLight;
    }

    @Override
    public void printDescribe() {
        System.out.println(getLampLight() + " лк");
    }
}
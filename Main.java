import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        try {
            Class classFruit = fruit.getClass();

            Field fieldString = classFruit.getDeclaredField("fruitName");
            fieldString.setAccessible(true);
            fieldString.set(fruit, "mango");

            Field fieldFloat = classFruit.getDeclaredField("weight");
            fieldFloat.setAccessible(true);
            fieldFloat.setFloat(fruit, (float) 220.45);

            Field fieldInt = classFruit.getDeclaredField("calories");
            fieldInt.setAccessible(true);
            fieldInt.setInt(fruit, 145);

            System.out.println("Информация о фрукте: " + fieldString.getName() + ":" + fruit.getFruitName() + " " + fieldInt.getName() + "=" + fruit.getWeight() + " " + fieldFloat.getName() + "=" + fruit.getCalories());

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
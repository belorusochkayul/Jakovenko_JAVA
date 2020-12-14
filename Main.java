import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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

            Method privateStringMethod = Fruit.class.getDeclaredMethod("getFruitName", null);
            privateStringMethod.setAccessible(true);
            String returnStringValue = (String) privateStringMethod.invoke(fruit, null);

            Method privateIntMethod = Fruit.class.getDeclaredMethod("getCalories", null);
            privateIntMethod.setAccessible(true);
            int returnIntValue = (int) privateIntMethod.invoke(fruit, null);

            Method privateFloatMethod = Fruit.class.getDeclaredMethod("getWeight", null);
            privateFloatMethod.setAccessible(true);
            float returnFloatValue = (float) privateFloatMethod.invoke(fruit, null);

            System.out.println("Информация о фрукте: " + fieldString.getName() + ":" + returnStringValue + " " + fieldInt.getName() + "=" + returnIntValue + " " + fieldFloat.getName() + "=" + returnFloatValue);

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
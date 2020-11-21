public class MyExaptionDivision extends Exception {
    @Override
    public String getMessage() {
        return "Деление на ноль запрещено";
    }
}
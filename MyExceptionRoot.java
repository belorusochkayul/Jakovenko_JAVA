public class MyExceptionRoot extends Exception {
    @Override
    public String getMessage() {
        return "Подкорневое выражение не может быть меньше нуля";
    }
}
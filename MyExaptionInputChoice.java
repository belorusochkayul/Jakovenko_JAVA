public class MyExaptionInputChoice extends Exception{
    @Override
    public String getMessage() {
        return "Вы ввели строку, а не число, повторите попытку ";
    }
}
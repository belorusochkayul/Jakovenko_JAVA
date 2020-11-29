public class SpaceUsageTooMuchException extends Exception {
    @Override
    public String getMessage() {
        return "Превышено 70% площади";
    }
}
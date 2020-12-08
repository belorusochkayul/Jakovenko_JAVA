public class SpaceUsageTooMuchException extends Exception {
    @Override
    public String getMessage() {
        return "Превышено " + Room.PERCENT + "%" + " площади";
    }
}
package kiparo.by;

public class IlluminanceTooLowException extends Exception {
    @Override
    public String getMessage() {
        return "Недостаточно освещенности. Освещенность не должна быть меньше 300 лк";
    }
}
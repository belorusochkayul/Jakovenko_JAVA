package kiparo.by;

public class IlluminanceTooMuchException extends Exception {
    @Override
    public String getMessage() {
        return "Попытка превысить освещённость. Освещенность не должна выходить за пределы 300-4000 лк";
    }
}
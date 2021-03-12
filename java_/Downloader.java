import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Downloader {

    //метод для скачивания файла из интернета при помощи HttpURLConnection
    public static String load(String URL) {

        InputStream inputStream = null;
        try (OutputStream outputStream = new ByteArrayOutputStream()) {

            URL url = new URL(URL);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                inputStream = httpURLConnection.getInputStream();
                int byteRead = -1;
                byte[] buffer = new byte[1024 * 10];
                while ((byteRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, byteRead);
                }
                return outputStream.toString();
            }
        } catch (IOException e) {
            System.out.println("Internet connection error");
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
            }
        }
        return null;
    }
}
package parsers;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class JacksonParser implements Variables, ParserStratedgy, DownloadStratedgy, UrlJsonUtils {

    DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
    ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String load() {
        InputStream inputStream = null;
        try (OutputStream outputStream = new ByteArrayOutputStream()) {

            java.net.URL url = new URL(URL);
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
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public Root parse(String stringToParse) {
        objectMapper.setDateFormat(df);
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

        try {
            Root root = objectMapper.readValue(stringToParse, Root.class);
            System.out.println("Вы выбрали Jackson-парсер");
            return root;

        } catch (Exception e) {
            System.out.println("Parsing error" + e.toString());
        }
        return null;
    }
}
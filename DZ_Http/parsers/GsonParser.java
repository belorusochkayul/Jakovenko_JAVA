package parsers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class GsonParser implements Variables, ParserStratedgy, DownloadStratedgy, UrlJsonUtils {

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

        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss Z").create();

        try {
            Root root = gson.fromJson(stringToParse, Root.class);
            System.out.println("Вы выбрали Gson-парсер");

            return root;

        } catch (Exception e) {
            System.out.println("Parsing error" + e.toString());
        }
        return null;
    }
}
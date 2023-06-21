import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class WeatherAPI {
    private static final String API_KEY = "58c0a39b1c92a8e77fa61061a0896332\n";
    private static final String API_URL = "https://api.openweathermap.org/data/2.5/forecast?q=%s&appid=%s";

    public static String getWeatherForecast(String city) throws IOException {
        String url = String.format(API_URL, city, API_KEY);
        URL apiUrl = new URL(url);
        BufferedReader reader = new BufferedReader(new InputStreamReader(apiUrl.openStream()));
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();
        return response.toString();
    }
}

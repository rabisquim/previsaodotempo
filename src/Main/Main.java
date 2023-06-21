import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String city = "Belo Horizonte";
        city = city.replace(" ", "%20");

        try {
            String weatherForecast = WeatherAPI.getWeatherForecast(city);
            System.out.println(weatherForecast);
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao obter a previsão do tempo");
            e.printStackTrace();
        }
    }
}
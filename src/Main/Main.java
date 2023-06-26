package Main;

import API.WeatherAPI;

import Modelos.WeatherTradutor;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;


import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a cidade:");
        String city = scanner.nextLine();
        city = city.toLowerCase();
        city = city.replace(" ", "%20");


        String weatherForecast = WeatherAPI.getWeatherForecast(city);
        String json = weatherForecast;
        //ystem.out.println(json);

        try {
            Gson gson = new Gson();

            JsonParser parser = new JsonParser();
            JsonObject jsonObject = parser.parse(json).getAsJsonObject();
            WeatherTradutor weatherTradutor = new WeatherTradutor();
            weatherTradutor.setName(jsonObject.get("location").getAsJsonObject().get("name").getAsString());
            weatherTradutor.setTemp_c(jsonObject.get("current").getAsJsonObject().get("temp_c").getAsDouble());
            weatherTradutor.setConditionText(jsonObject.get("current").getAsJsonObject().get("condition").getAsJsonObject().get("text").getAsString());

            System.out.println("Cidade: " + weatherTradutor.getName());
            System.out.println("Temperatura: " + weatherTradutor.getTemp_c() + "°C");
            System.out.println("Condição: " + weatherTradutor.getConditionText());

        } catch (JsonSyntaxException e) {
            System.out.println("Erro na conversão");
            System.out.println(e.getMessage());
        }


    }
}

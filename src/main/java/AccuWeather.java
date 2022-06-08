public class AccuWeather {
  AccuWeatherAPI apiClima = new AccuWeatherAPI();
  apiClima.getWeather("Buenos Aires, Argentina");
  estadoDelTiempo.get(0).get("Temperature");
}

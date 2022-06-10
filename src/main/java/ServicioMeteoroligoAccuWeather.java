import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServicioMeteoroligoAccuWeather {
  private String direccion;
  private LocalDateTime proximaExpiracion;
  private String ciudad = "Buenos Aires, Argentina";
  private AccuWeatherAPI apiClima = new AccuWeatherAPI();
  private List<Map<String,Object>> condicionesClimaticas = apiClima.getWeather(ciudad);

  public AccuWeatherAPI getApiClima() {
    return apiClima;
  }

  public ServicioMeteoroligoAccuWeather(String ciudad) {
    this.ciudad = ciudad;
  }

  public Double getTemperaturaActual(String ciudad){
    List<Map<String,Object>> condicionesClimaticas = this.getApiClima().getWeather(ciudad);
    HashMap<String,Object> horaCero = (HashMap<String,Object>)condicionesClimaticas.get(0);
    HashMap<String,Object> temperature = (HashMap<String, Object>)horaCero.get("Temperature");
    return ((Double) temperature.get("Value"));
  }

  private double temperaturaEnCelsius(Integer temperatura){
    return (temperatura-32) * 5/9;
  }



  }


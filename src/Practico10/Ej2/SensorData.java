package Practico10.Ej2;

public class SensorData {
    private Double temperatura;
    private Double viento;
    private Double humedad;
    private Double precipitaciones;

    public SensorData(Double temperatura, Double viento, Double humedad, Double precipitaciones) {
        this.temperatura = temperatura;
        this.viento = viento;
        this.humedad = humedad;
        this.precipitaciones = precipitaciones;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public Double getViento() {
        return viento;
    }

    public Double getHumedad() {
        return humedad;
    }

    public Double getPrecipitaciones() {
        return precipitaciones;
    }
}

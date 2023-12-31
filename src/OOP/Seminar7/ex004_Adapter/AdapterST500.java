package OOP.Seminar7.ex004_Adapter;

import java.time.LocalDateTime;

public class  AdapterST500 implements MeteoSensor{

    private SensorTemperature sensor;

    public AdapterST500(SensorTemperature sensor) {
        this.sensor = sensor;
    }

    @Override
    public int getId() {
        return sensor.getIdentifier();
    }

    @Override
    public LocalDateTime getDateTime() {
        return LocalDateTime.now();
    }

    @Override
    public double getTemperature() {
        return sensor.temperature();
    }

    @Override
    public double getHumidity() {
        return 0;
    }

    @Override
    public double getPressure() {
        return 0;
    }
}

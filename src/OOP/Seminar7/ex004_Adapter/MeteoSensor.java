package OOP.Seminar7.ex004_Adapter;

import java.time.LocalDateTime;

public interface MeteoSensor {

    int getId(); // Уникальный идентификатор датчика

    LocalDateTime getDateTime(); // Дата и время

    double getTemperature(); // Средняя температура

    double getHumidity(); // Влажность

    double getPressure(); // Давление

}

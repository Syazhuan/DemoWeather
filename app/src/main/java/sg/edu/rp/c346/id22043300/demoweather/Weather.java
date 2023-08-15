package sg.edu.rp.c346.id22043300.demoweather;

public class Weather {

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getForecast() {
        return forecast;
    }

    public void setForecast(String forecast) {
        this.forecast = forecast;
    }

    public Weather(String area, String forecast) {
        this.area = area;
        this.forecast = forecast;
    }

    private String area;

    @Override
    public String toString() {
        return "Weather{" +
                "area='" + area + '\'' +
                ", forecast='" + forecast + '\'' +
                '}';
    }

    private String forecast;


}

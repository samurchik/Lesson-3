public class WeatherForecast {
    private String[] daysOfWeek;
    private String[] weatherConditions;
    private String[] ratings;

    public WeatherForecast(String[] daysOfWeek, String[] weatherConditions, String[] ratings) {
        this.daysOfWeek = daysOfWeek;
        this.weatherConditions = weatherConditions;
        this.ratings = ratings;
    }

    public void printForecast() {
        for (int i = 0; i < daysOfWeek.length; i++) {
            System.out.println("День недели: " + daysOfWeek[i]);
            System.out.println("Погода: " + weatherConditions[i]);
            System.out.println("Оценка погоды: " + ratings[i]);
            System.out.println();
        }
    }
}

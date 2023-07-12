public class Main {
    public static void main(String[] args) {
        String[] daysOfWeek = {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};
        String[] weatherConditions = {"Солнечно", "Дождь", "Дождь", "Пасмурно", "Солнечно", "Солнечно", "Облачно"};
        String[] ratings = {"Оценка погоды хорошая но минус в том что это Понедельник :(", "Средняя так как привык к такой погоде ", "Плохая слишком много дождя", "Средняя Ну хоть не Дожды", "Хорошая Супер теперь смогу выйти с друзьями в кино ;)", "Хорошая Суббота самый крутой день )", "Средняя Так как завтра Понедельник :( "};

        WeatherForecast forecast = new WeatherForecast(daysOfWeek, weatherConditions, ratings);
        forecast.printForecast();
    }
}
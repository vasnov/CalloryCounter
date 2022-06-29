import java.util.Scanner;

public class StepTracker {

    MonthData[] monthToData;
    Scanner scanner=new Scanner(System.in);
    String year = "0-ЯНВ, 1-ФЕВ, 2-МАРТ, 3-АПР, 4-МАЙ, 5-ИЮНЬ, 6-ИЮЛЬ, 7-АВГ, 8-СЕН, 9-ОКТ, 10-НОЯ, 11-ДЕК";

    public StepTracker() {
        monthToData = new MonthData[12];
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    class MonthData {
         int[] days;

        public MonthData() {
            days = new int[30];

        }
        // Заполните класс самостоятельно
    }int addSteps(){
        System.out.println("За какой месяц вы хотите внести данные?" + year);
        System.out.println();
        int month=scanner.nextInt();
        while (month<0 && month>11){
            System.out.println("Неправильно выбран месяц. Введите от 0 до 11 (ノ°益°)ノ ");
        }
        System.out.println("Какой день?");
        int days =scanner.nextInt();
        while (days<0 && days>30) {
            System.out.println("Неправильно выбран день. Введите от 1 до 30 (ノ°益°)ノ");
        }
        System.out.println("Введите количество пройденных шагов");
        int steps=scanner.nextInt();
        while (steps<0){
            System.out.println("Количество шагов не может быть отрицательным (ノ°益°)ノ");
        }
        monthToData[month].days[days-1]=steps;
        System.out.println("Шаги сохранены! (^◔ᴥ◔^)");
        return monthToData[month].days[days-1];

    }void statistic() {
        System.out.println("За какой месяц показать статистику?" + year);
        int month = scanner.nextInt();
        System.out.println();

        for (int i = 0; i < monthToData[month].days.length; i++) {
            System.out.println("День " + (i + 1) + ". Пройдено " + monthToData[month].days.length[i] + " шагов");

        }
        int stepsSum = 0;
        for (int i = 0; i < monthToData[month].days.length; i++) {
            stepsSum = monthToData[month].days[i - 1] + monthToData[month].days[i];
        }
        System.out.println("Общее количество шагов за месяц" + stepsSum);
        int maxSteps = 0;
        for (int i = 0; monthToData[month].days.length; i++) {
            if( monthToData[month].days[i]>maxSteps){
                maxSteps=monthToData[month].days[i];
            }
            System.out.println("Максимальное количество шагов"+maxSteps);
        }
    }
}
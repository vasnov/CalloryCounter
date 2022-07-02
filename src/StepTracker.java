import java.util.Scanner;

public class StepTracker {

    MonthData[] monthToData;
    Scanner scanner=new Scanner(System.in);

    void year(){
        System.out.println("0-ЯНВ, 1-ФЕВ, 2-МАРТ, 3-АПР, 4-МАЙ, 5-ИЮНЬ, 6-ИЮЛЬ, 7-АВГ, 8-СЕН, 9-ОКТ, 10-НОЯ, 11-ДЕК");
    }

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
    }int addSteps(int month, int days, int steps){

        monthToData[month].days[days-1]=steps;
        System.out.println("Шаги сохранены! (^◔ᴥ◔^)");
        return monthToData[month].days[days-1];

    }


    void statOfMonth(int month) { //Выводим статистику за месяц


            for (int i = 0; i < monthToData[month].days.length; i++) {
            System.out.println("День " + (i + 1) + ". Пройдено " + monthToData[month].days[i] + " шагов");
    }
    }int stepSum(int month) { //считаем сумму всем шагов
        int stepsSum = 0;
        for (int i = 0; i < monthToData[month].days.length; i++) {
            stepsSum += monthToData[month].days[i];

        }System.out.println("Общее количество шагов за месяц" + stepsSum);
        return stepsSum;
    }
    void maxSteps(int month) { //находим максимальное значение за месяц
        int maxSteps = 0;
        for (int i = 0;i < monthToData[month].days.length; i++) {
            if (monthToData[month].days[i] > maxSteps) {
                maxSteps = monthToData[month].days[i];
                System.out.println("Максимальное количество шагов" + maxSteps);
            }
        }
    }void middleSteps(int stepSum){ //находим среднее арифметическое
        int middleSteps=stepSum/30;
        System.out.println("Среднее количество шагов за месяц"+middleSteps);

    }int stepsRow(int month, int goalOfDay){
        int maxSeries =0;
        int currentSeries =0;
        for (int i=0; i<monthToData[month].days.length; i++){
            if (monthToData[month].days[i]<=goalOfDay){
                if(currentSeries>=maxSeries){
                    maxSeries=currentSeries;
                }currentSeries=0;
                continue;
            }currentSeries++;
            }
            System.out.println("Максимальная серия "+maxSeries+" дней.(^◔ᴥ◔^)");
            return maxSeries;
        }
        int goalOfDay() {
            System.out.println("Сколько шагов в день мы будем делать?");
            int goalOfDay = scanner.nextInt();

            System.out.println("Наша цель " + goalOfDay + " шагов в день. Мы справимся! (^=◕ᴥ◕=^)");
            return goalOfDay;
        }

    }
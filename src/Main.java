import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printMenu();
        int userInput = scanner.nextInt();
        StepTracker stepTracker = new StepTracker();
        Converter converter= new Converter();
        int goalOgDay=1;
        int stepsSum=0;


        while (userInput != 0) {
            // обработка разных случаев
            if(userInput==1){
                System.out.println("За какой месяц вы хотите внести данные?");
                stepTracker.year();
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
                stepTracker.addSteps(month, days, steps);

            } else if (userInput==2) {
                System.out.println("За какой месяц показать статистику?");
                stepTracker.year();
                int month = scanner.nextInt();
                stepTracker.statOfMonth(month);
                stepsSum=stepTracker.stepSum(month);
                stepTracker.middleSteps(stepsSum);
                converter.distance(month, stepsSum);
                converter.calloryCount(month,stepsSum);

                stepTracker.stepsRow(month, goalOgDay);

            } else if (userInput==3) {
                goalOgDay=stepTracker.goalOfDay();

            }else {
                System.out.println("Такой команды пока нет (×﹏×)");

            }

            printMenu(); // печатаем меню ещё раз перед завершением предыдущего действия
            userInput = scanner.nextInt(); // повторное считывание данных от пользователя
        }
        System.out.println("Программа завершена");
    }

    private static void printMenu() {
        System.out.println("Что вы хотите сделать?");
        System.out.println("1 - Ввести количество шагов");
        System.out.println("2 - Напечатать статистику");
        System.out.println("3 - Изменить цель по количеству шагов в день");
        System.out.println("0 - Выход");
    }
}

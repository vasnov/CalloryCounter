public class Converter {

    void distance(int month,int stepsSum){ //считаем кол-во пройденых км
        double monthDistance=(stepsSum*0.75)/1000;
        System.out.println("Дистанция за месяц"+monthDistance+"километров");
    }void calloryCount(int month,int stepsSum){
        double callory=(stepsSum*50)/1000; //Считаем каллории
        System.out.println("Сгорело килокаллорий за месяц"+callory);
    }
}

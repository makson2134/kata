import java.util.Scanner;

public class StepTracker {
    private final MonthData[] monthData = new MonthData[12];
    private final Scanner scanner;
    private final Converter converter = new Converter(75, 50);

    private int goalsByStepsPerDay = 10000;
    public static final int daysInMonth = 30;

    StepTracker(Scanner scanner){
        this.scanner = scanner;
        for ( int i = 0; i < monthData.length; i++){
            monthData[i] = new MonthData();
        }
    }

    public void addNewNumberStepsPerDay(){
        System.out.println("Введите номер месяца: ");
        int monthInd = scanner.nextInt();
        if (monthInd < 1 || monthInd > 12){
            System.out.println("Ошибка: неверный номер месяца");
            return;
        }

        System.out.println("Введите номер дня: ");
        int dayInd = scanner.nextInt();
        if (dayInd < 1 || dayInd > 30){
            System.out.println("Ошибка: неверный номер дня");
            return;
        }

        System.out.println("Введите количество шагов: ");
        int stepsNum = scanner.nextInt();
        if (stepsNum < 1){
            System.out.println("Ошибка: неверное количество шагов");
            return;
        }
        monthData[monthInd-1].setDay(dayInd-1, stepsNum);
    }

    public void setGoalsByStepsPerDay(int goalsByStepsPerDay){
        this.goalsByStepsPerDay = goalsByStepsPerDay;
    }

    public int getGoalsByStepsPerDay(){
        return this.goalsByStepsPerDay;
    }

    public void printStatistics(){
        System.out.println("Введите число месяца: ");
        int monthNum = scanner.nextInt();
        if (monthNum > 12 || monthNum < 1){
            System.out.println("Ошибка! Попробуйте ещё раз");
            return;
        }
        monthNum--;
        System.out.printf("Максимальное количество шагов за день: %d\n", monthData[monthNum].maxSteps());
        System.out.printf("Сумма шагов за месяц: %d\n", monthData[monthNum].calcSum());
        System.out.printf("Лучшая серия: %d\n", monthData[monthNum].bestSeries(this.goalsByStepsPerDay));
        System.out.printf("Среднее количество шагов за день: %d\n", monthData[monthNum].calcSum()/daysInMonth);
        monthData[monthNum].printDaysAndSteps();

        System.out.printf("Количество сожённых килокалороий: %.3f\n", converter.convertStepsToKilocalories(monthData[monthNum].calcSum()));
        System.out.printf("Количество пройденных км: %.3f\n", converter.convertToKm(monthData[monthNum].calcSum()));
    }
}

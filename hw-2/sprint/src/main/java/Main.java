import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);

        while (true){
            printMenu();
            if (parseAnswer(scanner, stepTracker) == 1){
                return;
            }
        }
    }

    public static void printMenu(){
        System.out.println("=================Меню=================");
        System.out.println("1. Ввести количество шагов за определённый день");
        System.out.println("2. Изменить цель по количеству шагов в день");
        System.out.println("3. Напечатать статистику за определённый месяц");
        System.out.println("4. Выйти из приложения");
    }

    public static int parseAnswer(Scanner scanner, StepTracker stepTracker){
        switch(scanner.nextInt()){
            case 1:
                stepTracker.addNewNumberStepsPerDay();
                break;
            case 2:
                System.out.println("Введите новое значение цели шагов в день: ");
                stepTracker.setGoalsByStepsPerDay(scanner.nextInt());
                break;
            case 3:
                stepTracker.printStatistics();
                break;
            case 4:
                scanner.close();
                System.out.println("Пока!");
                return 1;
            default:
                System.out.println("Ошибка! такой команды нет! Попробуйте ещё раз");
        }
        return 0;
    }
}


import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws RuntimeException {
        System.out.println("привет пользователь");
        String[] listWork = {
                "1. Добавить задачу",
                "2. Вывести список задач",
                "3. Удалить задачу",
                "0. Выход"
        };
        List<String> list = new ArrayList<>();

        while (true) {
            System.out.println("выбите задачу");
            for (int i = 0; i < listWork.length; i++) {
                System.out.println(listWork[i]);
            }
            try {
                Scanner scanner = new Scanner(System.in);
                String input = scanner.nextLine();
                if (input.equals("0")) {
                    System.out.println("досвидания");
                    break;
                } else {
                    int listWorks = Integer.parseInt(input);
                    switch (listWorks) {
                        case 1:
                            System.out.println("введи задачу");
                            String works = scanner.nextLine();
                            list.add(works);
                            break;
                        case 2:
                            if (list.isEmpty() == true) {
                                System.out.println("список пуст");
                            } else {
                                for (String s : list) {
                                    System.out.println(list.indexOf(s) + 1 + ". "+ s);
                                }
                            }
                            break;
                        case 3:
                            System.out.println("выбери задачу для удаления");
                            works = scanner.nextLine();
                            list.remove(works);
                            break;
                        default:
                            System.out.println("нет такой задачи");
                    }
                }
            } catch (RuntimeException e) {
                System.out.println("вы ввели не число попробуй еще раз");
            }
        }
    }
}
package com.example.list;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println(" 1. Добавить задачу \n 2. вывести список задач \n 3. удалить задачу\n" + " 0. выход");
            String input = scan.nextLine();
            if (input.equals("0")) {
                break;
            }
            switch (input) {
                case "1" -> {
                    System.out.println("Введите задачу для планирования:");
                    list.add(scan.nextLine());
                }
                case "2" -> {
                    for (int i = 0; i < list.size(); i++) {
                        System.out.printf("%s. %s \n", i + 1, list.get(i));
                    }
                }
                case "3" -> {
                    System.out.println("Введите номер задачи которую хотите удалить");
                    list.remove(scan.nextInt() - 1);
                }

            }
        }
        scan.close();
    }
}

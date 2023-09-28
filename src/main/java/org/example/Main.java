package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

//1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//        2. Создать множество ноутбуков.
//        3. Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
//        Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
//        1 - ОЗУ
//        2 - Объем ЖД
//        3 - Операционная система
//        4 - Цвет …
//        Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//        Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям. https://javarush.com/groups/posts/1939-comparator-v-java



public class Main {
    static String Name;
    static String Ram;
    static String Os;
    static String HDD;
    static String Colour;
    static HashMap<Integer, String> name = new HashMap<>();
     static HashMap<Integer, String> ram = new HashMap<>();
     static HashMap<Integer, String> hdd = new HashMap<>();
     static HashMap<Integer, String> colour = new HashMap<>();
     static HashMap<Integer, String> os = new HashMap<>();
    static HashMap<Integer, Notebook> Notebooks = new HashMap<>();
    //static HashSet< Notebook> NotebooksSorted = new HashSet<>();
    ArrayList<Notebook> NotebooksSorted = new ArrayList<>();



    public static void filter(int a , String type){
        ArrayList<Notebook> NotebooksSorted = new ArrayList<>();

        if (Objects.equals(type, Name)){

            for (int i = 1; i <Notebooks.size()+1 ; i++) {
                if(Notebooks.get(i).getName().equals(name.get(a))){
                    NotebooksSorted.add(Notebooks.get(i));

                }
            }
        }

        else if (Objects.equals(type, Os)) {

            for (int i = 1; i < Notebooks.size() + 1; i++) {
                if (Notebooks.get(i).getOs().equals(os.get(a))) {
                    NotebooksSorted.add(Notebooks.get(i));
                }
            }
        }
        else if (Objects.equals(type, Ram)) {
            for (int i = 1; i < Notebooks.size() + 1; i++) {
                if (Notebooks.get(i).getRam().equals(ram.get(a))) {
                    NotebooksSorted.add(Notebooks.get(i));
                }
            }
        }

        else if (Objects.equals(type, HDD)) {
            for (int i = 1; i < Notebooks.size() + 1; i++) {
                if (Notebooks.get(i).getHdd().equals(hdd.get(a))) {
                    NotebooksSorted.add(Notebooks.get(i));
                }
            }
        }
        else if (Objects.equals(type, Colour)) {
            for (int i = 1; i < Notebooks.size() + 1; i++) {
                if (Notebooks.get(i).getColour().equals(colour.get(a))) {
                    NotebooksSorted.add(Notebooks.get(i));
                }
            }
        }




        System.out.println(" Выберите из отсортированных ") ;
        for (int i = 0; i < NotebooksSorted.size(); i++) {
            System.out.println(i +1+"- "+NotebooksSorted.get(i));
        }
        Scanner scanner = new Scanner(System.in);
         int userIn = scanner.nextInt();
        System.out.println("Ваш выбор : "+NotebooksSorted.get(userIn-1));



    }

    public static void main(String[] args) {
        name.put(1, "Lenovo");
        name.put(2, "Aser");
        name.put(3, "Asus");
        name.put(4, "HP");

        os.put(1, "Windows");
        os.put(2, "Linux");
        os.put(3, "Не установлена");

        colour.put(1, "black");
        colour.put(2, "blue");
        colour.put(3, "white");
        colour.put(4, "pink");

        hdd.put(1, "500 Gb");
        hdd.put(2, "1 Tb");
        hdd.put(3, "1.5 Tb");
        hdd.put(4, "2 Tb");

        ram.put(1, "8 Gb");
        ram.put(2, "16 Gb");
        ram.put(3, "32 Gb");
        ram.put(4, "64 Gb");

        Notebook Lenovo1 = new Notebook(name.get(1), ram.get(1), hdd.get(1), os.get(1), colour.get(1));
        Notebook Lenovo2 = new Notebook(name.get(2), ram.get(2), hdd.get(4), os.get(2), colour.get(3));
        Notebook Lenovo3 = new Notebook(name.get(3), ram.get(3), hdd.get(4), os.get(3), colour.get(2));
        Notebook Lenovo4 = new Notebook(name.get(4), ram.get(1), hdd.get(3), os.get(1), colour.get(2));

        Notebooks.put(1, Lenovo1);
        Notebooks.put(2, Lenovo2);
        Notebooks.put(3, Lenovo3);
        Notebooks.put(4, Lenovo4);


        System.out.println(
                """
                                      
                         Выберите тип сортировки  : \s
                         1 - name
                         2 - ram
                         3 - hdd
                         4 - os
                         5 - colour\
                        """
        );
        Scanner scanner = new Scanner(System.in);
        int userIn1 = scanner.nextInt();
        sortedType(userIn1);
    }

    private static void sortedType(int userIn1) {

        if(userIn1 == 1){
            System.out.println(
                    """
                     Выберите название : \s
                    1- Lenovo
                    2- Aser
                    3- Asus
                    4- HP\
                    """
            );
            Scanner scanner = new Scanner(System.in);
            int userInName = scanner.nextInt();

            filter(userInName,Name);

        }
        if(userIn1 == 2){
            System.out.println(
                    """
                     Выберите обьем оперативной памяти : \s
                    1-8 Gb
                    2-16 Gb
                    3-32 Gb
                    4-64 Gb \
                    """
            );
            Scanner scanner = new Scanner(System.in);
            int userInName = scanner.nextInt();
            filter(userInName,Ram);

        }
        if(userIn1 == 3){
            System.out.println(
                    """
                     Выберите обьем жесткого диска : \s
                    1-500 Gb
                    2-1 Tb
                    3-1.5 Tb
                    4-2 Tb\
                    """
            );
            Scanner scanner = new Scanner(System.in);
            int userInName = scanner.nextInt();
            filter(userInName,HDD);

        }
        if(userIn1 == 4){
            System.out.println(
                    """
                     Выберите название : \s
                    1-Windows
                    2-Linux
                    3-Не установлена \
                    """
            );
            Scanner scanner = new Scanner(System.in);
            int userInName = scanner.nextInt();
            filter(userInName,Os);

        }
        if(userIn1 == 5){
            System.out.println(
                    """
                     Выберите название : \s
                    1-"black
                    2-"blue
                    3-"white
                    4-"pink \
                    """
            );
            Scanner scanner = new Scanner(System.in);
            int userInName = scanner.nextInt();
            filter(userInName,Colour);

        }

    }

}
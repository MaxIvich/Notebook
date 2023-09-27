package org.example;


import java.util.HashMap;
import java.util.Map;

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

    public static void main(String[] args) {
        HashMap<Integer, String> ram = new HashMap<>();
        ram.put(1,"8 Gb");
        ram.put(2,"16 Gb");
        ram.put(3,"32 Gb");
        ram.put(4,"64 Gb");

        HashMap<Integer, String> hdd = new HashMap<>();
        hdd.put(1,"500 Gb");
        hdd.put(2,"1 Tb");
        hdd.put(3,"1.5 Tb");
        hdd.put(4,"2 Tb");

        HashMap<Integer, String> colour = new HashMap<>();
        colour.put(1,"black");
        colour.put(2,"blue");
        colour.put(3,"white");
        colour.put(4,"pink");

        HashMap<Integer, String> os = new HashMap<>();
        os.put(1,"Windows");
        os.put(2,"Linux");
        os.put(3,"Не установлена");

        Notebook Lenovo1 = new Notebook(ram.get(1),hdd.get(1),os.get(1),colour.get(1));
        Notebook Lenovo2 = new Notebook(ram.get(2),hdd.get(4),os.get(2),colour.get(3));
        Notebook Lenovo3 = new Notebook(ram.get(3),hdd.get(4),os.get(3),colour.get(2));
        Notebook Lenovo4 = new Notebook(ram.get(4),hdd.get(3),os.get(1),colour.get(2));

        HashMap<Integer, Notebook> Notebooks = new HashMap<>();
        Notebooks.put(1,Lenovo1);
        Notebooks.put(2,Lenovo2);
        Notebooks.put(3,Lenovo3);
        Notebooks.put(4,Lenovo4);




    }

}
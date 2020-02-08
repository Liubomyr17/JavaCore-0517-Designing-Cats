package com.company;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

/*

0517 Конструируем котиков
Создать класс Cat (кот) с пятью конструкторами:
— Имя, — Имя, вес, возраст —
Имя, возраст (вес стандартный) — вес, цвет, (имя, адрес и возраст – неизвестные.
Кот — бездомный) — вес, цвет, адрес (чужой домашний кот)
Задача конструктора – сделать объект валидным.
Например, если вес не известен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить. То же касательно возраста.
А вот имени может и не быть (null). То же касается адреса: null.

Требования: 1.У класса Cat должна быть переменная name с типом String.
2.У класса Cat должна быть переменная age с типом int.
3.У класса Cat должна быть переменная weight с типом int.
4.У класса Cat должна быть переменная address с типом String.
5.У класса Cat должна быть переменная color с типом String.
6.У класса должен быть конструктор, принимающий в качестве параметра имя,
но инициализирующий все переменные класса, кроме адреса.
7.У класса должен быть конструктор, принимающий в качестве параметров имя,
вес, возраст и инициализирующий все переменные класса, кроме адреса.
8.У класса должен быть конструктор, принимающий в качестве параметров имя,
возраст и инициализирующий все переменные класса, кроме адреса.
9.У класса должен быть конструктор, принимающий в качестве параметров вес,
цвет и инициализирующий все переменные класса, кроме имени и адреса.
10.У класса должен быть конструктор, принимающий в качестве параметров вес,
цвет, адрес и инициализирующий все переменные класса, кроме имени.


*/

// public class Cat
public class Main {
    String name = null;
    int age = 5;
    int weight = 1;
    String address = null;
    String color = "red";

      public Main(String name) {
          this.name = name;
    }

    public Main(String name, int age) {
          this.name = name;
          this.age = age;
    }

    public Main(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Main(String name, int age, int weight, String address) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = address;
    }

    public Main(String name, int age, int weight, String address, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }

    public static void main(String[] args) {
    }
}





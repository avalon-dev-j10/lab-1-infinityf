package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.models.Person;
import ru.avalon.java.dev.j10.labs.models.Passport;
import ru.avalon.java.dev.j10.labs.commons.Address;

public class Main {

    public static void main (String[] args) {

     Person ivanov;
     Person smith;
     

    ivanov = new Person(new Address("Санкт-Петербург", "Ленина", 10, 15), 
            new Passport(576383, "Иван", "Иванов", "Иванович", null, "15091994", "18092014", "Выдан отделением УФМС № 333"));
   
    smith = new Person(new Address("Москва", "Волгодонская", 6, 24), 
            new Passport(475652, "John", "Smith", null, "Edvard", "12.01.1978", "16.02.18", "Выдан МВД №6"));
    
        
    
    System.out.println(ivanov.getFullName());
    System.out.println(smith.getFullName());
    System.out.println(ivanov.getAddress());
    System.out.println(smith.getAddress());
    
       /*
         * TODO(Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */

      
        /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */

        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
    }
} 

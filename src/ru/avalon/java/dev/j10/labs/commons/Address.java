package ru.avalon.java.dev.j10.labs.commons;
        
public class Address{
        String city;
        String street;
        int house;
        int flat;
        
        public Address(String city, String street, int house, int flat){
        this.city = city;
        this.street = street;
        this.house = house;
        this.flat = flat;
        }
        
        public void setCity (String city){
        this.city = city;
        }
        public String getCity(){
        return city;
        }
        public void setStreet (String city){
        this.street = street;
        }
        public String getStreet(){
        return street;
        }
        public void setHouse (int house){
        this.house = house;
        }
        public int getHouse(){
        return house;
        }
        public void setFlat (int flat){
        this.flat = flat;
        }
        public int getFlat(){
        return flat;
        }
        
public String toString(){
        return "city=" + city +
                ", street=" + street +
                ", house=" + house +
                ", flat=" + flat;}


}
/*
 * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.
 *
 * 2. Создайте класс, видимый из пакета. Подумайте о том
 *    Какое имя должен иметь класс, если он объявленн в этом
 *    файле.
 *
 * 3. Подумайте над тем, какие переменные должены быть
 *    определены в классе.
 *
 * 4. Подумайте над тем, какие методы должны быть объявлены
 *    в классе.
 */
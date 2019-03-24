package ru.avalon.java.dev.j10.labs.models;

public class Passport {
        private int serial;
        private String name;
        private String surname;
        private String patronymic;
        private String secondName;
        private String daybirth;
        private String dateIssue;
        private String ufms;


        public Passport(int serial, String name, String surname, String patronymic, String secondName, String daybirth, String dateIssue, String ufms)
        {
            this.serial = serial;
            this.name = name;
            this.surname = surname;
            this.patronymic = patronymic;
            this.secondName = secondName;
            this.daybirth = daybirth;
            this.dateIssue = dateIssue;
            this.ufms = ufms;
        }


public void setSerial (int serial){
        this.serial = serial;
    }

public int getSerial() {
    return serial;
}
public void setName (String name){
        this.name = name;
    }
public String getName() {
    return name;
}
public void setSurname (String surname){
        this.surname = surname;
    }
public String getSurname() {
    return surname;
}
public void setPatronymic (String patronymic){
        this.patronymic = patronymic;
    }
public String getPatronymic() {
    return patronymic;
}
public void setSecondName (String secondName){
        this.secondName = secondName;
    }
public String getSecondName() {
    return secondName;
}
public void setDaybirth (String daybirth){
        this.daybirth = daybirth;
}

public String getDaybirth() {
    return daybirth;
}
public void setdateIssue (String dateIssue){
        this.dateIssue = dateIssue;
}
        
public String getDateIssue() {
    return dateIssue;
}

public void setUfms (String ufms){
        this.ufms = ufms;
}

public String getUfms() {
    return ufms;
}

@Override

public String toString() {
    return "name=" + name + ' ' +
            "secondName='" + secondName + ' ' +
            "',patronymic='" + patronymic + ' ' +
            "surname='" + surname + ',' +
            " serial='" + serial + '/' +
            " daybirth'" + serial + '/' +
            " dateIssue'" + dateIssue + '/' +
            " ufms'" + ufms + '}' ;



}











        /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */
}

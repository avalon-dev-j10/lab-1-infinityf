package ru.avalon.java.dev.j10.labs.models;
import ru.avalon.java.dev.j10.labs.commons.Address;
public class Person{
    Address address;
    Passport passport;
    public Person(Address address, Passport passport){
        this.address = address;
        this.passport = passport;
    }

     /**
     * Возврвщает полное имя человека.
     * 
     * Если у человека есть Имя, Фамилия и Отчество, то
     * возвращет Имя, Фимилию и Отчество, разделённые пробелом.
     * 
     * Если у человека нет Отчества, но есть второе имя, то
     * возвращает Имя, Первую букву второго имени, и Фамилию,
     * разделённые пробелом. После Инициала второго имени
     * должна стоять точка. Например, "Джером К. Джером".
     * 
     * Если у человека нет ни Отчества ни Второго имени, а
     * есть только Имя и Фамилия, то возвращает их, разделённые
     * пробелом.
     * 
     * @return имя человека в виде строки.
     */
    public String getFullName() {
        if (passport.getName() !=null && passport.getSurname()!=null && passport.getPatronymic() !=null){
            return (passport.getName() + " " + passport.getSurname() + " " + passport.getPatronymic());
        }
        else if (passport.getPatronymic() == null && passport.getSecondName()!=null){
            return (passport.getName() + " " + passport.getSecondName().substring(0,1)+ "." + " " + passport.getSurname());
        }
        else if (passport.getPatronymic() == null && passport.getSecondName()==null){
             return passport.getName() + " " + passport.getSecondName();
        }
        return null;
    }
    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */
    public String getAddress() {
        /*
         * TODO(Студент): Закончить определение метода 'getAddress()' класса 'Person'
         */
        return address.toString();
    }
}
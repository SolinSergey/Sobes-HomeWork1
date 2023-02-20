package ru.gb.homework1.task1;

public class Task1 {
    public static void main(String[] args) {
        Person person= new Person.PersonBuilder()
                .setAge(10)
                .setAddress("123")
                .setCountry("234")
                .setFirstName("aaa")
                .setGender("ququ")
                .setPhone("131313131")
                .setLastName("dfgsdgg")
                .setMiddleName("safafafaf")
                .build();
        System.out.println(person);
    }

}

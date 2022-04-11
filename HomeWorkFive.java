/**
* Java 1. Homework 5
*
* @ author Elena Zavarzina
* @ version 11.04.2022
*/
class HomeWorkFive {

    public static void main(String[] args) {
        Employee[] emplArr = new Employee[5]; 
        emplArr[0] = new Employee("Vasiliy", "senior QA Engineer", "vas@yandex.ru", "56-56-56", 150000, 42);
        emplArr[1] = new Employee("Victor", "midlle QA Engineer", "vict@yandex.ru", "99999999", 800000, 35);
        emplArr[2] = new Employee("Vasgen", "Lower", "vasvas@mail.ru", "787878", 120000, 45);
        emplArr[3] = new Employee("Avrora", "Economist", "ava@mail.ru", "123456", 65000, 33);
        emplArr[4] = new Employee("Slava", "Manager", "ivanovslava@gmail.com", "11223344", 50000, 24);
        
    for (Employee employee : emplArr)
        if (employee.getAge()>40)
        employee.info();
    }
}

class Employee {
    private String name;
    private String profession;
    private String email;
    private String phone;
    private int salary;
    private int age;
        
    public Employee(String name, String profession, String email, String phone, int salary, int age) {
        this.name = name;
        this.profession = profession;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
        
    public int getAge() {
        return age;
    }
        
    public void info() {
        System.out.println(this.name);
        System.out.println(this.profession);
        System.out.println(this.email);
        System.out.println(this.phone);
        System.out.println(this.salary);
        System.out.println(this.age);
    }
}
    




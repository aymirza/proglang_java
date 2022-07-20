package _4_type_peremennih;

public class Peremennie_ekzempliyara {
    // Переменная экземпляра открыта для любого дочернего класса
    public String name;
    // Переменная salary видна только в Employee
    public double salary;

    // Имя переменной присвайвается в конструкторе
    public Peremennie_ekzempliyara(String empName) {
        name=empName;
    }

    // Переменной salary присвайвается значение.


    public void setSalary(double empSal) {
        salary = empSal;
    }

    // Этот метод выводит на экран данные сотруников
    public void printEmp(){
        System.out.println("имя:" +name);
        System.out.println("зарплата: "+salary);
    }

    public static void main(String[] args) {
        Peremennie_ekzempliyara empOne = new Peremennie_ekzempliyara("Олег");
        empOne.setSalary(10000);
        empOne.printEmp();

    }
}

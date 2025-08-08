//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека " + age + " то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека " + age + " он не достиг совершеннолетия, нужно подождать");
        }

        System.out.println("Задание 2");
        int degree = 6;
        if (degree < 5) {
            System.out.println("На улице " + degree + " градусов нужно надеть шапку.");
        } else if (degree > 5){
            System.out.println("На улице " + degree + " градусов можно идти без шапки.");
        }

        System.out.println("Задание 3");
        int maximumSpeed = 60;
        int driverSpeed = 70;
        if (driverSpeed > maximumSpeed) {
            System.out.println("Если скорость " + driverSpeed + " то придеться заплатить штраф.");
        } else  {
            System.out.println("Если скорость " + driverSpeed + " можно ездить спокойно.");
        }

        System.out.println("Задача 4");
        int humanAge = 8;
        if (humanAge >= 2 && humanAge <= 6) {
            System.out.println("Если возраст человека равен " + humanAge + " , то ему нужно ходить в десткий сад.");
        } else if (humanAge >= 7 && humanAge <= 17) {
            System.out.println("Если возраст человека равен " + humanAge + " , то ему нужно ходить в школу.");
        } else if (humanAge >= 18 && humanAge <= 24) {
            System.out.println("Если возраст человека равен " + humanAge + " , то ему нужно ходить в университет.");
        } else if (humanAge > 24) {
            System.out.println("Если возраст человека равен " + humanAge + " , то ему пора ходить на работу");
        }

        System.out.println("Задача 5");
        int childAge = 15;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + " , то он не может кататься на аттракционе.");
        } else if (childAge > 5 && childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge + " , то он может кататься на аттракционе в сопровождении взрослого.");
        } else if (childAge > 14) {
            System.out.println("Если возраст ребенка равен " + childAge + " , то он может кататься на аттракцион без сопровождения взрослого.");
        }

        System.out.println("Задача 6");
        int peopleInCarriage = 50;
        if (peopleInCarriage < 60) {
            System.out.println("Остались сидячие места в вагоне");
        } else if (peopleInCarriage > 60 && peopleInCarriage < 102) {
            System.out.println("Остались стоячие места в вагоне");
        } else {
            System.out.println("В вагоне мест не осталось");
        }

        System.out.println("Задание 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Первое число самое большое");
        } else if (two > one && two > three) {
            System.out.println("Второе число самое большое");
        } else {
            System.out.println("Третье число самое большое");
        }
    }
}
import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //#Task#1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);

        System.out.println();
        //Task#2

        System.out.println(fullName.toUpperCase());

        System.out.println();
        //Task#3

        String fullNameLastTask = "Иванов Семён Семёнович";
        System.out.println("Данные Ф.И.О. сотрудника - " + fullNameLastTask.replace("ё", "е"));
    }
}
public class Main {
    public static void main(String[] args) {
//        Задание 1
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
//        Задание 2
        System.out.println("Задание 2");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
//        Задание 3
        System.out.println("Задание 3");
        String firstName2 = "Семён";
        String middleName2 = "Семёнович";
        String fullName2 = lastName + ' ' + firstName2 + ' ' + middleName2;
        fullName2 = fullName2.replace("ё","е");
        System.out.println("Данные ФИО сотрудника — " + fullName2);
    }
}
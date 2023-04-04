import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(" Иванов      ", " Иван      ", " Иванович      ", " Специалист по сетевому обеспечению ", 2_000);
        Employee employee2 = new Employee(" Сергеев     ", " Сергей    ", " Сергеевич     ", " Системный аналитик                 ", 2_200);
        Employee employee3 = new Employee(" Алексеев    ", " Алексей   ", " Алексеевич    ", " Программист                        ", 2_500);
        Employee employee4 = new Employee(" Александров ", " Александр ", " Александрович ", " Обеспечение работоспособности в IT ", 2_300);
        Employee employee5 = new Employee(" Иванов      ", " Иван      ", " Иванович      ", " Системный администратор            ", 2_400);

        employee1.displayId();    // Id = 1
        employee2.displayId();    // Id = 2
        employee3.displayId();    // Id = 3
        employee4.displayId();    // Id = 4
        employee5.displayId();    // Id = 5

        Employee[] vaults = new Employee[10];
        vaults[0] = employee1;
        vaults[1] = employee2;
        vaults[2] = employee3;
        vaults[3] = employee4;
        vaults[4] = employee5;

        System.out.println(vaults[0]);
        System.out.println(vaults[1]);
        System.out.println(vaults[2]);
        System.out.println(vaults[3]);
        System.out.println(vaults[4]);

        int[] arr = {employee1.getSalary(), employee2.getSalary(), employee3.getSalary(), employee4.getSalary(), employee5.getSalary(),};
        int totalAmount = 0;
        for (int i = 0; i < arr.length; i++) {
            totalAmount += arr[i];
        }
        System.out.println("Общая сумма затрат= " + totalAmount + " $");

        int maximum = -1;
        int minimum = arr[0];
        Arrays.sort(arr);
        for (int i : arr) {
            maximum = i;
            minimum = arr[0];
        }
        System.out.println("Максимальная зарплата= " + maximum + " $");
        System.out.println("Минимальной зарплата= " + minimum + " $");

        double average;
        double sum = Arrays.stream(arr).sum();

        average = sum / arr.length;
        System.out.println("Средняя зарплата= " + average + " $");
    }
}
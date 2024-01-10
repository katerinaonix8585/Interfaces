public class Main {
    public static void main(String[] args) {
       Employee[] employee = new Employee[6];
       employee[0] = new Programmer("Петров", "Петр", 144, 23.0);
       employee[1] = new Programmer("Иванов", "Иван", 144, 19.5);
       employee[2] = new Programmer("Семенов", "Семен", 138.5, 20.0);
       employee[3] = new Manager("Калитина", "Снежана", 144, 18.0);
       employee[4] = new Manager("Лапин", "Иван", 144, 19.3);
       employee[5] = new Manager("Семенова", "Арина", 120, 20.0);

       double result = employee[0].calculationSalary();
       int index = 0;
       for (int i = 0; i < employee.length; i++) {
           if (employee[i].calculationSalary() > result) {
               result = employee[i].calculationSalary();
               index = i;
           }
       }
        System.out.printf("Наибольшая зарплата %.2f. %s.", result, employee[index].info());
    }
}
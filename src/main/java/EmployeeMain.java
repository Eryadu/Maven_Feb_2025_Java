public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp = new Employee("Abc", "abc@gmail.com");
        System.out.println(emp);
        System.out.println(emp.getName());
        System.out.println(emp.getEmail());
        emp.setEmail("bcd@gmail.com");
        emp.setName("BCD");
        System.out.println(emp.getName());
        System.out.println(emp.getEmail());
    }
}

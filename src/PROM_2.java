public class PROM_2 {
    public class Main {
        public static void main(String[] args) {
            class Employee {

                private String name;
                private double salary;

                public Employee(String name, double salary) {
                    this.name = name;
                    this.salary = salary;
                }

                public String getName() {
                    return name;
                }

                public double getSalary() {
                    return salary;
                }
                /*
                \\\\\\\\\\\\\\\\\\\\\\\///////////////////\\\\\\\\\\\\\\\\\\\\\\\//////////////////////
                ///////////////////////\\\\\\\\\\\\\\\\\\\///////////////////////\\\\\\\\\\\\\\\\\\\\\\
                */

                class calculateSalary {
                    public double calculateNetSalary(Employee employee) {
                        return employee.getSalary() * 0.80;
                    }
                }

                class printEmployeeDetails {
                    public void printEmployeeDetails(Employee employee, calculateSalary calculateSalary) {
                        System.out.println("Employee Name: " + name);
                        System.out.println("Net Salary: " + calculateSalary.calculateNetSalary(employee));
                    }
                }
            }
        }
    }
}

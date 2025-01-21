public class Programmer {
    private int salary = 1000;

    public int getSalary(){
        return salary;
    }
    public void setSalary(int newSalary) {
        if (newSalary > salary) {
            this.salary = newSalary;
        }
    }

    public static void main(String[] args){
        Programmer programmer=new Programmer();
        System.out.println("Current salary: "+programmer.getSalary());
        programmer.setSalary(1500);
        System.out.println("Updated salary: "+programmer.getSalary());
    }
}

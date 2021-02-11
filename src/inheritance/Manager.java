package inheritance;

public class Manager extends PermanentEmployee {
    String teamName;

    void printTeamName(){
        System.out.println("Manages team " + teamName);
    }

    public static void main(String[] args) {
        Manager empManager = new Manager();
        empManager.empId = 101;
        empManager.name = "Sharath";
        empManager.salary = 10000;
        empManager.teamName = "DevTeam";

        empManager.printEmployeeDetails();
        empManager.printTeamName();
    }
}

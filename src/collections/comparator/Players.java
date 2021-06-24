package collections.comparator;

public class Players {

    int age;
    String name;
    String teamName;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Players(int age, String name, String teamName) {
        this.age = age;
        this.name = name;
        this.teamName = teamName;
    }

    public Players() {

    }

    @Override
    public String toString(){
        return this.name + " : " + this.age + " : " + this.teamName;
    }
}

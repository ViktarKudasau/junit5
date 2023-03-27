public class Worker {

    public  String name;
    public String profession;
    public int age;
    public String activity;

    public Worker(String name, String profession, int age, String activity) {
        this.name = name;
        this.profession = profession;
        this.age = age;
        this.activity = activity;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", profession='" + profession + '\'' +
                ", age=" + age +
                ", activity='" + activity + '\'' +
                '}';
    }
}

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return age == worker.age && Objects.equals(name, worker.name) && Objects.equals(profession, worker.profession) && Objects.equals(activity, worker.activity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, profession, age, activity);
    }
}

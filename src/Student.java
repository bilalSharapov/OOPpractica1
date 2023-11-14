public class Student {
    String name ;
    int age ;
    String grp ;

    public Student(String name,int age,String grp){
        this.name = name;
        this.age = age;
        this.grp = grp;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grp='" + grp + '\'' +
                '}';
    }
}

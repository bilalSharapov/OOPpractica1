public class Main {
    public static void main(String[] args) {
        Passport passport = new Passport(234546,"bili","sharapov",17,"m","batken");
        System.out.println(passport);

        Student student = new Student("bili", 17, "java");
        Student student1 = new Student("myktar", 17, "java");
        Student student2 = new Student("gigit", 20, "java");
        Student student3 = new Student("mystva", 18, "js");
        Student student4 = new Student("jarkun", 22, "js");

        System.out.println("");
        Student[] students = new Student[]{student, student1, student2, student3, student4};
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        int s = 0;
        int v = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].grp.contains("java")) {
                s++;
            } else {
                v++;
            }
        }
        System.out.println("java gr :" + s + " student");
        System.out.println("js gr   :" + v + " student");
        int e = 0;


        for (Student student5 : students) {
            e+=student5.age;
        }
        System.out.println(e/students.length);


//        Set<Integer>countres = new TreeSet<>();
//      countres.add(2);
//      countres.add(45);
//      countres.add(3);
//        System.out.println(countres);
//
//        Set < String > number = new TreeSet<>();
//        number.add("Ad");
//        number.add("H bv");
//        number.add("Bt");
//        System.out.println(number);

    }

}
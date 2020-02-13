public class Application {

    public static void main(String[] args) {
        Student stu1 = new Student("Cindy", 80);
        Student stu2 = new Student("Mary", 95);

        Teacher tea1 = new Teacher("Solider", "Mary");
        Teacher tea2 = new Teacher("Bob", "Cindy");

        stu1.addScore(stu1.getScore());
        stu2.addScore(stu2.getScore());

        System.out.println("老师名：" + tea1.getName() + "，名下有学生：" + tea1.getStudent());
        System.out.println("学生名：" + stu1.getName() + "，分数为：" + stu1.getScore());
        System.out.println("老师名：" + tea2.getName() + "，名下有学生：" + tea2.getStudent());
        System.out.println("学生名：" + stu2.getName() + "，分数为：" + stu2.getScore());


    }


}

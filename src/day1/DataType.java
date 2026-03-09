package day1;

public class DataType {
    public static void main(String[] args) {
        String name="张三";
        int age=20;
        double height=1.75;
        boolean student=true;
        System.out.println("姓名："+name+"  "+"年龄："+age+"  "+"身高："+height+"  "+"是否学生："+student);
        System.out.printf("姓名：%s  年龄：%d  身高:%.2f  是否是学生：%b",name,age,height,student);
    }
}

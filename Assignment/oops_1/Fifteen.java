package oops_1;
// 15. Create a class Student that stores the details like admin_no, stu_name, course_joined and fees_paid.
// —> Courses are: JAVA, PYTHON.
// —> The total fees for java is 10k and for python is 7.5k.
// —> Provide a constructor to take required details.The default course is JAVA.
// —> Provide the following methods: getTotalFee(), getDue(), getFeePaid(), payment(amount).

public class Fifteen {
    public static void main(String[] args) {
        Student s = new Student(1, "sai", "java");
        s.display();
        s.setFees_paid(5000);
        s.display();
        
    }
    
}
class Student{
    int admin_no;
    String stu_name;
    String course_joined="java";
    int fees_paid;
    int totalfee;
    Student(int admin_no,String stu_name,String course_joined){
        this.admin_no=admin_no;
        this.stu_name=stu_name;
        this.course_joined=course_joined;
        if(course_joined.equalsIgnoreCase("java")){
            this.totalfee=10000;
        }
        else if(course_joined.equalsIgnoreCase("python")){
            this.totalfee=7500;
        }
    }
    
    public int getAdmin_no() {
        return admin_no;
    }
    public void setAdmin_no(int admin_no) {
        this.admin_no = admin_no;
    }
    public String getStu_name() {
        return stu_name;
    }
    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }
    public String getCourse_joined() {
        return course_joined;
    }
    public void setCourse_joined(String course_joined) {
        this.course_joined = course_joined;
    }
    public int getFees_paid() {
        return fees_paid;
    }
    public void setFees_paid(int fees_paids) {
        if(fees_paids<totalfee-fees_paid){
            this.fees_paid = fees_paids;

        }
        
    }
    public int getTotalfee() {
        return totalfee;
    }
    public void getDue(){
        System.out.println(totalfee-fees_paid);
    }
    public void display(){
        System.out.println(stu_name);
        System.out.println(course_joined);
        System.out.println(totalfee);
        System.out.println(fees_paid);
        
    }

    
   
}

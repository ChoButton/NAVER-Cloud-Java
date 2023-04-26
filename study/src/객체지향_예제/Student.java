package 객체지향_예제;

public class Student {
	    private String name;
	    private int age;
	    private String major;
	    private int studentId;

	    public Student(String name, int age, String major, int studentId) {
	        this.name = name;
	        this.age = age;
	        this.major = major;
	        this.studentId = studentId;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public String getMajor() {
	        return major;
	    }

	    public int getStudentId() {
	        return studentId;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public void setMajor(String major) {
	        this.major = major;
	    }

	    public void setStudentId(int studentId) {
	        this.studentId = studentId;
	    }

	    public void displayStudentInfo() {
	        System.out.println("Student Name: " + name);
	        System.out.println("Student Age: " + age);
	        System.out.println("Student Major: " + major);
	        System.out.println("Student ID: " + studentId);
	    }
	}

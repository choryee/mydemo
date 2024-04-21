package ex13_ChatGPT.StudentManagementSystem;

import java.util.*;

class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

enum Department{
    COMPUTER_SCIENCE("컴퓨터과학", 100),
    ENGINEERING("공학", 150),
    MATHEMATICS("수학", 50);

    private String name;
    private int capacity;

    Department(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}

class StudentDatabase<T extends Enum<T>>{
    private Map<T, List<Student>> departmentStudentMap;
    // T, List<Student>  >> COMPUTER_SCIENCE, List<Student>
    StudentDatabase( Class<T> enumClass ){
   //     departmentStudentMap=new HashMap<>();
        departmentStudentMap=new EnumMap<>(enumClass);
//        List<Student> students=new ArrayList<>();
//        students.add(new Student("Alice", 20));
//        students.add(new Student("park", 24));
//
////        Class<Department> departmentClass =  Department.class;
////        Department[] departments = departmentClass.getEnumConstants();
//        T[] ts = enumClass.getEnumConstants();
//        for(T t : ts){
//            departmentStudentMap.put(t, students);
//        }

    }

    public void addStudent(T department, Student student){
      //  departmentStudentMap.computeIfAbsent(department, k -> new ArrayList<>()).add(student);
       List<Student> students = departmentStudentMap.get(department); // 해당 department의 리스트
       if(students ==null){ // students 리스트가 없다면,
           students=new ArrayList<>();
           departmentStudentMap.put(department, students);
       }
       students.add(student); // students 리스트가 있을때,
       departmentStudentMap.put(department, students);
    }

    public void show(){
       // Map.Entry<T, List<Student>> entry = null;
        for( Map.Entry<T, List<Student>> entry : departmentStudentMap.entrySet()){
            Department departmentName = (Department) entry.getKey(); // getKey()가 Department
                
            System.out.println("전공영문은 "+entry.getKey()+ ", 전공 한글명은 "+departmentName.getName() + ", 학생은 "+entry.getValue());
        }
    }
}
public class StudentManagementSystem {
    public static void main(String[] args) {
       // StudentDatabase sd=new StudentDatabase(Department.class);
        StudentDatabase<Department> sd=new StudentDatabase<>(Department.class);
        sd.addStudent(Department.MATHEMATICS, new Student("lee", 23));
        sd.addStudent(Department.ENGINEERING, new Student("Alice", 55));
        sd.addStudent(Department.ENGINEERING, new Student("choi", 15));
        sd.show();
    }
}

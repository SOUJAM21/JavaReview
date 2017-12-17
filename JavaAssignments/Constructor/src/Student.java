
public class Student {
	int gradeLevel;
	String name;
	
	Student(int selectGradeLevel){
		gradeLevel = selectGradeLevel;
	}
	
	void displayStudentInfo(){
        System.out.println(name + " is currently enrolled in grade level " + gradeLevel );
    }
}

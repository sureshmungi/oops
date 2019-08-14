package capgemini.oops;

class Student {
	// field..
	int rollNo;
	String name;
	float marks;
	final float OUT_OF_MARKS = 300;

	// constructor...
	public Student(int rollNo,String name, float marks) {
		this.rollNo = rollNo;
		this.name =name;
		this.marks = marks;
		System.out.println("student marks");
	}

	// method...
	public void display() {

		System.out.println("RollNo:"+rollNo +"\tName:"+name+ "\tMarks:"+marks);
	}

	public double calPerc() {
		
	double perc=((marks/300)*100);
		return perc;
	}

	public String calGrade() {
		
	double perc=calPerc();
	if(perc>80){
		return "Grade:A";
	}
		else if(perc<=80 && perc>60){
			return "Grade:B";
		}
		else if(perc<=60 && perc>40){
			return "Grade:C";
		}
		else if(perc<=40&& perc>35){
			return "Grade:D";
		}
		else{
			return "Grade:E";
		}
	}
	//override
	@Override
	public String toString()
	{
	return"RollNo"+rollNo +"Name"+name+"Marks"+marks;	
	}
	@Override
	public boolean equals(Object obj)
	{
		Student d = (Student) obj;
		if(this.marks == d.marks){
			return true;
		}else{
			return false;
		}
	}
}
public class Student_Test {
	public static void main (String[] args) {
		
		// declaration..
		Student s1,s2;
		// instantiation...
		s1 = new Student(1,"java",276.0f);
		s2 = new Student(2,"python",270.0f);

		// calling methods..
		s1.display();
		double percentage1 = s1.calPerc();
		System.out.println("percentage="+percentage1);
		System.out.println(s1.calGrade());
		System.out.println(s1.toString());
		
		s2.display();
		double percentage2 = s2.calPerc();
		System.out.println("percentage="+percentage2);
		System.out.println(s2.calGrade());
		System.out.println(s2.toString());
		//calling Overriding methods
		System.out.println(s1.calGrade());
		
		System.out.println(s1.equals(s2));
	}
}


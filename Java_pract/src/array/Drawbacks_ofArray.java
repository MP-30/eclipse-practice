package array;

	class Student{
		int rollno;
		String name;
		int marks;
	
	}
public class Drawbacks_ofArray {

	
	public static void main(String[]aditya) {

//		int nums[] = new int[6];
//		Fixed size is the drawback of array
//		nums[0] = 15;
//		nums[1] = 85;
//		nums[2] = 57;
//		nums[3] = 56;
//		
//		for (int i = 0; i <nums.length;i++) {
//			System.out.println(nums[i]);
//		}

		Student s1 = new Student();
		s1.rollno = 235;
		s1.name = "Rakesh";
		s1.marks = 896;

		Student s2 = new Student();
		s2.rollno = 485;
		s2.name = "Vivek";
		s2.marks = 86;

		Student s3 = new Student();
		s3.rollno = 745;
		s3.name = "Rohit";
		s3.marks = 586;

		Student students[] = new Student[3];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		for (int i = 0; i < students.length; i++) {
		System.out.println(students[i].name+ ": " + students[i].marks);
		}
	}
}

//	Write a program to Show the multilevel and hierarchical inheritance for a student class.

class student
{
      int rollno;
      String name;
      student(int r, String n)
      {
            rollno = r;
            name = n;
      }
      void show()
      {
            System.out.println("Student Roll no : " + rollno);
            System.out.println("Student Name    : " + name);
      }
}

class course extends student
{
   String course;
   course(int r, String n, String course){
	   super(r,n);
	   this.course=course;
   }
   void showCourse()
   {
       show();
       System.out.println("Course           : " + course);
 }
   
}

class marks extends student
{
      int s1, s2, s3, s4, s5, sum1;
      marks(int r, String n, int m1, int m2, int m3, int m4, int m5)
      {
            super(r,n);
            s1 = m1;
            s2 = m2;
            s3 = m3;
            s4 = m4;
            s5 = m5;
      }
      void showmarks()
      {
            show();
            sum1 = s1 + s2 + s3 + s4 + s5;
            System.out.println("Total marks 	: " + sum1);
      }
}
class percent extends marks
{
      float per;
      percent(int r, String n, int m1, int m2, int m3, int m4, int m5, float p)
      {
            super(r,n,m1,m2,m3,m4,m5);
            per=p;
      }
      void showper()
      {
            showmarks();
            per = sum1 / 5;
            System.out.println("Percentage 	: " + per);
      }
} 
  class a11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		percent p = new percent(111, "Deepthi", 99, 75, 95, 60, 80, 60);
        p.showper();
        
        course c = new course(111,"Deepthi","MCA");
        c.showCourse();
	}

}


// Student Roll no - 111
// Student Name    - Deepthi
// Total marks = 409
// Percentage = 81.0
// Student Roll no - 111
// Student Name    - Deepthi
// Course           - MCA



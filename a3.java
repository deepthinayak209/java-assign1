// Write a program to demonstrate the method of creating and using anonymous object.

interface usn
	{
 		String usn="20mcaa21";
 		void getusn();
	}
class a3 
	{
 		public static void main(String[] args)
 		{
 			usn obj1=new usn()
 			{
 				@Override
 				public void getusn() 
 				{
 					System.out.println("The USN is " +usn);
 				}
 			};
 			obj1.getusn();
 		}
	} 

	// The USN is 20mcaa21
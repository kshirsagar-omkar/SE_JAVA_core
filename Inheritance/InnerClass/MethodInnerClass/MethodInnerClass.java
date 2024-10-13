import java.lang.*;


class OuterClass
{
	private int i=11;

	public void disp()
	{
		System.out.println("disp() : " + this.i);
	}


	public class InnerClass
	{
		private int j = 22;

		void show()
		{
			System.out.println("show() : " + j);
		}
	} 

}




public class MethodInnerClass
{
	public static void main(String[] args) {
		
		OuterClass oc = new OuterClass();			//Object of Outer Class

		oc.disp();

		
		OuterClass.InnerClass ic = new OuterClass().new InnerClass();			//Object of Inner Class
		ic.show();


	}
}
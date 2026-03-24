class E_Exception_Handling {

	public static void main(String args[]){

		try{
			System.out.println("Open Files !!");
			int n = args.length ;
			System.out.println("n = " + n);
			int a = 45/n ;
			System.out.println("a = " + a);
			int b[] = {10,20,30,40,50,60,70,80} ;
			b[50] = 100;
		}
		catch(ArithmeticException ae){

			System.out.println(ae);
			System.out.println("pls type data while executing the program !");
		}
		catch(ArrayIndexOutOfBoundsException aie){

			System.out.println(aie);
			System.out.println("Pleae see that the array index is not out of the bound .");

		}
		finally{

			System.out.println("Close File");
		}

	}
}
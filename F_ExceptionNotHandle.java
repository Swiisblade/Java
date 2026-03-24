import java.io.*;  ///throws clause
class Sample{
	void accept( )throws IOException {
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		System.out.print ("enter ur name: ");
		String name=br.readLine ( );
		System.out.println ("Hai "+name);
	}
}
class F_ExceptionNotHandle {
	public static void main (String args[])throws IOException{
		Sample s=new Sample ( );
		s.accept ( );
	}
}
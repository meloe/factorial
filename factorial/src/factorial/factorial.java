package factorial;

public class factorial {
	public static double factorial (double numero) {
		
		if (numero==0)
			return 1;
		else
		{
			double resultat = numero * factorial (numero-1);
			return resultat;
		}
	}
	//-commit no vaa
	public static void main(String[] args) {
		System.out.println(factorial(0));
	}

}

public class FatorialRecursivo {

	public static int calculoFatorialRecursivo(int n) throws IllegalArgumentException{

		if(n == 0)
			return 1;
		return n * calculoFatorialRecursivo(n-1)
	}
	
	public static void main(String []args){
		System.out.prinlt(calculoFatorialRecursivo(5));
	}
}

public class Main {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

		int terfogat = a * b * c;
		int felszin = 2 * (a * b + a * c + b * c);
		
		System.out.println("Térfogat: " + terfogat);
		System.out.println("Felszín: " + felszin);
	}

}

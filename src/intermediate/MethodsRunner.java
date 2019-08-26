package intermediate;

public class MethodsRunner {

	public static void main(String[] args) {
		Methods met1 = new Methods();
		int results = met1.calc(45, 45);
		float results1 = met1.calc(45.45f, 45.45f);
		double results2 = met1.calc(30, 45, 88);
		System.out.print(results);
	}

}

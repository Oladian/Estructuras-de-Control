public class TablaMultiplicar {
	public static void main(String[] args) {
		for (int i=1;i<11;i++) {
			System.out.println();
			System.out.println("---------------------------");
			System.out.println("Tabla de multiplicar del "+i);
			System.out.println("---------------------------");
			System.out.println();
			for (int j=1;j<11;j++) {
				System.out.println(i+"x"+j+"="+(i*j));
			}
		}
	}
}
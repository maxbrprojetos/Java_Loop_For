public class Laco_For {
	public static void main(String [] arg){
		int y = 0;
		int x = 0;
		System.out.println("Laço For");
		
		for(int i = x; i < y; i++)
			if(i % 19 == 0){
				System.out.println("Achei um número divisível por 19 entre x e y");
				break;
			}
	}
}

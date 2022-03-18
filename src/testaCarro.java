
public class testaCarro {
		
		public static void main(String[] args) {
			Carro carro = new Carro(1998, "Palio", 15000);
			
			System.out.println(carro.getAno());
			System.out.println(carro.getModelo());
			System.out.println(carro.getPreco());
			
			Carro carro2 = new Carro(null, -10);
			
			//System.out.println(carro2.getAno());
		}
}


	public class Abacaxi extends AbstractBolo{
		
		public Abacaxi() {
			setNome("Abacaxi");
			setPreco(5);
			setTipo("Quadrado");
		}
		
		@Override
		public void receita() {
			System.out.println("Bolo quadrado de abacaxi.");
		}
	}


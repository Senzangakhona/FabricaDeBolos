
public class FlorestaNegra extends AbstractBolo{
	
	public FlorestaNegra() {
		setNome("Floresta Negra");
		setPreco(80);
		setTipo("Redondo de dois andares");
	}
	
	@Override
	public void receita() {
		System.out.println("Bolo floresta negra, redondo de dois andares.");
	}
}

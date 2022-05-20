
public class Choconinho extends AbstractBolo{
	
	public Choconinho() {
		setNome("Choconinho");
		setPreco(30);
		setTipo("Redondo");
	}
	
	@Override
	public void receita() {
		System.out.println("Bolo choconinho redondo.");
	}
}

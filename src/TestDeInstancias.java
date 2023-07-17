
public class TestDeInstancias {

	public static void main(String[] args) {
		
		Cuenta cuentaDeMarcela = new Cuenta(18,388);
		
		cuentaDeMarcela.setTitular(new Cliente());
		
		cuentaDeMarcela.getTitular().setNombre("Marcela");
		
		System.out.println(cuentaDeMarcela.getTitular().getNombre());
		
	}
	
}

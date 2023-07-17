
public class TestMetodos {

	public static void main(String[] args) {
		
		Cuenta miCuenta = new Cuenta(12,596);
		
		miCuenta.deposita(500);
		
		System.out.println(miCuenta.getSaldo());
		
		Cuenta otraCuenta = new Cuenta(24,899);
		
		otraCuenta.deposita(800); 
		
		miCuenta.transfiere(200, otraCuenta);
		
		System.out.println(miCuenta.getSaldo());
		System.out.println(otraCuenta.getSaldo());
		
		
		   System.out.println (Cuenta.getTotal ());
		
	}

}

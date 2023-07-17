
public class CrearCuenta {
	
 public static void main(String[] args) {
	
	 Cuenta primeraCuenta = new Cuenta(12,455);
	 
	//primeraCuenta.pais = "Peru"; No compila falta atributo pais en la clase Cuenta 
	 
	primeraCuenta.deposita(200); 
    System.out.println(primeraCuenta.getSaldo());
    primeraCuenta.deposita(100);
    System.out.println(primeraCuenta.getSaldo());

     Cuenta segundaCuenta = primeraCuenta;
     segundaCuenta.deposita(50); 
     
    System.out.println("primera cuenta tiene " + primeraCuenta.getSaldo());
     System.out.println("segunda cuenta tiene " + segundaCuenta.getSaldo());
  System.out.println(primeraCuenta);
     
   System.out.println (Cuenta.getTotal ());
     
}
}

  
/* se uma exce��o � filha de RuntimeException - ela � n�o-verificada
 * se uma exce��o � filha de Exception        - ela � verificada!
 */


public class IsiException extends Exception{
	public IsiException(String msg) {
		super(msg);
	}
}
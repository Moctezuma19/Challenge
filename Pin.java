import java.util.Random;
/**
* Clase que genera un pin aleatorio
* @author The Elite Four
*/
public class Pin {
	public String generaPin(){
		Random r = new Random();
		String pin = null;
		int aux = 0;
		char s = 0;
		for(int i = 0; i<8;i++){

			while(pin <= 65){
				aux = r.nextInt(123);
			}
			char s = pin;
			pin += s;
		}

		return generaPin;
	}
}
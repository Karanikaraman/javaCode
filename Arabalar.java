/**
 * 
 */

/**
 * @author Karani
 *
 */
public enum Arabalar {
	ADUI(210, "KIRMIZI", "SEDAN"), MERCEDES(200, "BEYAZ", "HATBACK"), BMW(240, "S�YAH", "SEDAN");

	public String renk;
	public int h�z;
	public String kasatipi;

	private Arabalar( int h�z,String renk, String kasatipi) {
		this.renk = renk;
		this.h�z = h�z;
		this.kasatipi = kasatipi;
	}
	
	public void Display() {
		System.out.println(Arabalar.ADUI);
	}
	
	
	

}

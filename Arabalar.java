/**
 * 
 */

/**
 * @author Karani
 *
 */
public enum Arabalar {
	ADUI(210, "KIRMIZI", "SEDAN"), MERCEDES(200, "BEYAZ", "HATBACK"), BMW(240, "SÝYAH", "SEDAN");

	public String renk;
	public int hýz;
	public String kasatipi;

	private Arabalar( int hýz,String renk, String kasatipi) {
		this.renk = renk;
		this.hýz = hýz;
		this.kasatipi = kasatipi;
	}
	
	public void Display() {
		System.out.println(Arabalar.ADUI);
	}
	
	
	

}

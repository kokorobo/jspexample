package Trpg.DB;

public class armor {
	public int amac(String name) {
		if(name.equals("´©´õ±â")) {
			return 8;
		}if(name.equals("³Õ¸¶")) {
			return 8;
		}if(name.equals("Ã¶°©¿Ê")) {
			return 14;
		}if(name.equals("°¡Á×°©¿Ê")) {
			return 12;
		}if(name.equals("ÁË¼öº¹")) {
			return 8;
		}if(name.equals("·Îºê")) {
			return 8;
		}if(name.equals("´ÑÀÚ¿Ê")) {
			return 10;
		}if(name.equals("µµº¹")) {
			return 10;
		}if(name.equals("»çÁ¦º¹")) {
			return 10;
		}if(name.equals("¾Ë¸ö")) {
			return 4;
		}
		else {
			return 6;
		}
	}
}

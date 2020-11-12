package Trpg.DB;

public class weapon {
	
	public int wpacc(String wn) {
		if(wn.equals("³´")) {
			return 2;
		}else if(wn.equals("Çã¼ö¾Æºñ")) {
			return 10;
		}else if(wn.equals("ÇÑ¼Õ°Ë")) {
			return 1;
		}else if(wn.equals("ÀÏº»µµ")) {
			return 2;
		}else if(wn.equals("´Ü°Ë")) {
			return -1;
		}else if(wn.equals("ÁöÆÎÀÌ")) {
			return 0;
		}else if(wn.equals("Ã¥")) {
			return 2;
		}else if(wn.equals("Ç¥Ã¢")) {
			return 3;
		}else if(wn.equals("È°")) {
			return 2;
		}else if(wn.equals("°ÇÆ²·¿")) {
			return 0;
		}else if(wn.equals("±Û·¯ºê")) {
			return 2;
		}else if(wn.equals("¸ð´×½ºÅ¸")) {
			return -2;
		}else if(wn.equals("ÇØ°ñ")) {
			return -2;
		}else if(wn.equals("¸Ç¼Õ")) {
			return 0;
		}
		else{
			return 0;
		}
	}
	public int wpdice(String wn) {
		if(wn.equals("³´")) {
			return 8;
		}else if(wn.equals("Çã¼ö¾Æºñ")) {
			return 3;
		}else if(wn.equals("ÇÑ¼Õ°Ë")) {
			return 6;
		}else if(wn.equals("ÀÏº»µµ")) {
			return 4;
		}else if(wn.equals("´Ü°Ë")) {
			return 6;
		}else if(wn.equals("ÁöÆÎÀÌ")) {
			return 6;
		}else if(wn.equals("Ã¥")) {
			int ran = (int)(Math.random()*2)+1;
			if(ran == 1){return 20;}
			else if(ran == 2) {return 4;}
			else {return 4;}
		}else if(wn.equals("Ç¥Ã¢")) {
			return 4;
		}else if(wn.equals("È°")) {
			return 6;
		}else if(wn.equals("°ÇÆ²·¿")) {
			return 8;
		}else if(wn.equals("±Û·¯ºê")) {
			return 4;
		}else if(wn.equals("¸ð´×½ºÅ¸")) {
			return 12;
		}else if(wn.equals("ÇØ°ñ")) {
			return 1;
		}else if(wn.equals("¸Ç¼Õ")) {
			return 4;
		}
		else {
			return 3;
		}
	}
	public int wpdcr(String wn) {
		if(wn.equals("³´")) {
			return 1;
		}else if(wn.equals("Çã¼ö¾Æºñ")) {
			return 3;
		}else if(wn.equals("ÇÑ¼Õ°Ë")) {
			int ran = (int)(Math.random()*2)+1;
			return ran;
		}else if(wn.equals("ÀÏº»µµ")) {
			return 2;
		}else if(wn.equals("´Ü°Ë")) {
			return 2;
		}else if(wn.equals("ÁöÆÎÀÌ")) {
			return 1;
		}else if(wn.equals("Ã¥")) {
			return 1;
		}else if(wn.equals("Ç¥Ã¢")) {
			return 3;
		}else if(wn.equals("È°")) {
			return 1;
		}else if(wn.equals("°ÇÆ²·¿")) {
			return 2;
		}else if(wn.equals("±Û·¯ºê")) {
			return 3;
		}else if(wn.equals("¸ð´×½ºÅ¸")) {
			return 1;
		}else if(wn.equals("ÇØ°ñ")) {
			return 1;
		}else if(wn.equals("¸Ç¼Õ")) {
			return 1;
		}
		else {return 1;}
	}
	public String wpty(String wn){
		if(wn.equals("³´")) {
			return "¹ÎÃ¸";
		}else if(wn.equals("Çã¼ö¾Æºñ")) {
			return "¸Å·Â";
		}else if(wn.equals("ÇÑ¼Õ°Ë")) {
			return "¹ÎÃ¸";
		}else if(wn.equals("ÀÏº»µµ")) {
			return "¹ÎÃ¸";
		}else if(wn.equals("´Ü°Ë")) {
			return "¹ÎÃ¸";
		}else if(wn.equals("ÁöÆÎÀÌ")) {
			return "Áö´É";
		}else if(wn.equals("Ã¥")) {
			return "¹ÎÃ¸";
		}else if(wn.equals("Ç¥Ã¢")) {
			return "¹ÎÃ¸";
		}else if(wn.equals("È°")) {
			return "¹ÎÃ¸";
		}else if(wn.equals("°ÇÆ²·¿")) {
			return "±Ù·Â";
		}else if(wn.equals("±Û·¯ºê")) {
			return "¹ÎÃ¸";
		}else if(wn.equals("¸ð´×½ºÅ¸")) {
			return "±Ù·Â";
		}else if(wn.equals("ÇØ°ñ")) {
			return "Áö´É";
		}else if(wn.equals("¸Ç¼Õ")) {
			return "¹ÎÃ¸";
		}
		else {return "¾øÀ½";}
	}

}

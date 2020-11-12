package Trpg;

public class weapon {
	
	int wpacc(String wn) {
		if(wn.equals("낫")) {
			return 2;
		}else if(wn.equals("허수아비")) {
			return 10;
		}else if(wn.equals("한손검")) {
			return 1;
		}else if(wn.equals("일본도")) {
			return 2;
		}else if(wn.equals("단검")) {
			return -1;
		}else if(wn.equals("지팡이")) {
			return 0;
		}else if(wn.equals("책")) {
			return 2;
		}else if(wn.equals("표창")) {
			return 3;
		}else if(wn.equals("활")) {
			return 2;
		}else if(wn.equals("건틀렛")) {
			return 0;
		}else if(wn.equals("글러브")) {
			return 2;
		}else if(wn.equals("모닝스타")) {
			return -2;
		}else if(wn.equals("해골")) {
			return -2;
		}else if(wn.equals("맨손")) {
			return 0;
		}
		else{
			return 0;
		}
	}
	int wpdice(String wn) {
		if(wn.equals("낫")) {
			return 8;
		}else if(wn.equals("허수아비")) {
			return 3;
		}else if(wn.equals("한손검")) {
			return 6;
		}else if(wn.equals("일본도")) {
			return 4;
		}else if(wn.equals("단검")) {
			return 6;
		}else if(wn.equals("지팡이")) {
			return 6;
		}else if(wn.equals("책")) {
			int ran = (int)(Math.random()*2)+1;
			if(ran == 1){return 20;}
			else if(ran == 2) {return 4;}
			else {return 4;}
		}else if(wn.equals("표창")) {
			return 4;
		}else if(wn.equals("활")) {
			return 6;
		}else if(wn.equals("건틀렛")) {
			return 8;
		}else if(wn.equals("글러브")) {
			return 4;
		}else if(wn.equals("모닝스타")) {
			return 12;
		}else if(wn.equals("해골")) {
			return 1;
		}else if(wn.equals("맨손")) {
			return 4;
		}
		else {
			return 3;
		}
	}
	int wpdcr(String wn) {
		if(wn.equals("낫")) {
			return 1;
		}else if(wn.equals("허수아비")) {
			return 3;
		}else if(wn.equals("한손검")) {
			int ran = (int)(Math.random()*2)+1;
			return ran;
		}else if(wn.equals("일본도")) {
			return 2;
		}else if(wn.equals("단검")) {
			return 2;
		}else if(wn.equals("지팡이")) {
			return 1;
		}else if(wn.equals("책")) {
			return 1;
		}else if(wn.equals("표창")) {
			return 3;
		}else if(wn.equals("활")) {
			return 1;
		}else if(wn.equals("건틀렛")) {
			return 2;
		}else if(wn.equals("글러브")) {
			return 3;
		}else if(wn.equals("모닝스타")) {
			return 1;
		}else if(wn.equals("해골")) {
			return 1;
		}else if(wn.equals("맨손")) {
			return 1;
		}
		
		else {return 1;}
	}


}

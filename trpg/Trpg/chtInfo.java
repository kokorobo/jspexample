package Trpg;

import java.util.ArrayList;

public class chtInfo {
	public static String country = null;
	public static String sejob = null;
	public static String job = null;
	public static String name = null;
	public static int lv = 1;
	public static int need = 500;
	public static int hp = 0;
	public static int maxhp = 0;
	public static int ac = 0;
	public static int str = 0;
	public static int dex = 0;
	public static int hel = 0;
	public static int intel = 0;
	public static int wis = 0;
	public static int chr = 0;
	public static int luc = 0;
	public static int kar = 0;
	public static int sin = 0;
	public static int exp = 0;
	public static int wpacc = 0;
	public static int wpdice = 0;
	public static int wpdcr = 0;
	public static int player = 0;
	public static String getCountry() {
		return country;
	}
	public static void setCountry(String country) {
		chtInfo.country = country;
	}
	public static String getSejob() {
		return sejob;
	}
	public static void setSejob(String sejob) {
		chtInfo.sejob = sejob;
	}
	public static String getJob() {
		return job;
	}
	public static void setJob(String job) {
		chtInfo.job = job;
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		chtInfo.name = name;
	}
	public static int getLv() {
		return lv;
	}
	public static void setLv(int lv) {
		chtInfo.lv = lv;
	}
	public static int getNeed() {
		return need;
	}
	public static void setNeed(int need) {
		chtInfo.need = need;
	}
	public static int getHp() {
		return hp;
	}
	public static void setHp(int hp) {
		chtInfo.hp = hp;
	}
	public static int getMaxhp() {
		return maxhp;
	}
	public static void setMaxhp(int maxhp) {
		chtInfo.maxhp = maxhp;
	}
	public static int getAc() {
		return ac;
	}
	public static void setAc(int ac) {
		chtInfo.ac = ac;
	}
	public static int getStr() {
		return str;
	}
	public static void setStr(int str) {
		chtInfo.str = str;
	}
	public static int getDex() {
		return dex;
	}
	public static void setDex(int dex) {
		chtInfo.dex = dex;
	}
	public static int getHel() {
		return hel;
	}
	public static void setHel(int hel) {
		chtInfo.hel = hel;
	}
	public static int getIntel() {
		return intel;
	}
	public static void setIntel(int intel) {
		chtInfo.intel = intel;
	}
	public static int getWis() {
		return wis;
	}
	public static void setWis(int wis) {
		chtInfo.wis = wis;
	}
	public static int getChr() {
		return chr;
	}
	public static void setChr(int chr) {
		chtInfo.chr = chr;
	}
	public static int getLuc() {
		return luc;
	}
	public static void setLuc(int luc) {
		chtInfo.luc = luc;
	}
	public static int getKar() {
		return kar;
	}
	public static void setKar(int kar) {
		chtInfo.kar = kar;
	}
	public static int getSin() {
		return sin;
	}
	public static void setSin(int sin) {
		chtInfo.sin = sin;
	}
	public static int getExp() {
		return exp;
	}
	public static void setExp(int exp) {
		chtInfo.exp = exp;
	}
	public static int getWpacc() {
		return wpacc;
	}
	public static void setWpacc(int wpacc) {
		chtInfo.wpacc = wpacc;
	}
	public static int getWpdice() {
		return wpdice;
	}
	public static void setWpdice(int wpdice) {
		chtInfo.wpdice = wpdice;
	}
	public static int getWpdcr() {
		return wpdcr;
	}
	public static void setWpdcr(int wpdcr) {
		chtInfo.wpdcr = wpdcr;
	}
	public static int getPlayer() {
		return player;
	}
	public static void setPlayer(int player) {
		chtInfo.player = player;
	}
	public boolean searchch(ArrayList<chtInfo> arr, int player) {
		for(chtInfo m:arr){
			if(m.getPlayer() == player){
				setPlayer(player);
			    setName(name);
			    setCountry(country);
			    setSejob(sejob);
			    setJob(job);
			    setHp(maxhp);
			    setMaxhp(maxhp);
			    setStr(str);
			    setDex(dex);
			    setAc(ac);
			    setHel(hel);
			    setIntel(intel);
			    setWis(wis);
			    setChr(chr);
			    setLuc(luc);
			    setKar(kar);
			    setSin(sin);
				return true;
			}
		}
		return false;
	}

}

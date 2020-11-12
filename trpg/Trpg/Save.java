package Trpg;

import java.io.*;
import java.util.Scanner;

public class Save {
	
	public void save(String name) throws IOException {
		FileOutputStream fos = new FileOutputStream("c:\\test\\"+name+".txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		Plaing pl = new Plaing();
		dos.writeUTF(pl.name);
		dos.writeUTF(pl.country);
		dos.writeUTF(pl.sejob);
		dos.writeUTF(pl.job);
		dos.writeInt(pl.lv);
		dos.writeInt(pl.hp);
		dos.writeInt(pl.maxhp);
		dos.writeInt(pl.ac);
		dos.writeInt(pl.str);
		dos.writeInt(pl.dex);
		dos.writeInt(pl.hel);
		dos.writeInt(pl.intel);
		dos.writeInt(pl.wis);
		dos.writeInt(pl.chr);
		dos.writeInt(pl.luc);
		dos.writeInt(pl.kar);
		dos.writeInt(pl.sin);
		dos.writeInt(pl.exp);
		dos.writeInt(pl.need);
		dos.writeInt(pl.money);
		dos.writeUTF(pl.eqwp);
		dos.writeUTF(pl.eqam);
		dos.writeInt(pl.clrc);
		dos.flush();
		dos.close();
	}
}

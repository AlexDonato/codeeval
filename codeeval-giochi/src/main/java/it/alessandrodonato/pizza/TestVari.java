package it.alessandrodonato.pizza;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestVari {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MyBean bean = new MyBean();
		bean.setNome("Pietrino");
		bean.setValore(100000L);
		
		XMLEncoder encoder = new XMLEncoder(new FileOutputStream("c:/tmp/mio-bean.xml"));
		encoder.writeObject(bean);
		encoder.close();
		
		System.out.println("scritto ....");
		
		XMLDecoder decoder = new XMLDecoder (new FileInputStream("c:/tmp/mio-bean.xml"));
		Object o = decoder.readObject();
		decoder.close();
		if (o instanceof MyBean) {
			 System.out.println("Nome " + ((MyBean)o).getNome());
		}
		
		System.out.println(o);
	}
}



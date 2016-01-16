package com.weibao.user.action;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Random;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
import com.weibao.test.action.BaseAction;

public class ImageCodeAction extends BaseAction{
	

	private InputStream is;
	  
	public  String execute() throws Exception{
		
		byte[]bs=genereter();
		this.is=new ByteArrayInputStream(bs);
		return super.execute();
		 
	}
	
	 public byte[]genereter()throws Exception{
		 
		 BufferedImage  image=new BufferedImage(50, 20, 4);
		 Random r=new Random();
		 Graphics g=image.getGraphics();
		 g.setColor(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
		 
		 g.fillRect(0, 0, 60, 60);
		 g.setColor(new Color(254,253,252));
		 
		 String number=String.valueOf(r.nextInt(9999));
		 g.drawString(number, 5, 15);
		 System.out.println(number.toString());
		 
		 this.session.put("IMAGE_CODE", number.toString());
		 
		 
		 ByteArrayOutputStream os=new ByteArrayOutputStream();
		 JPEGImageEncoder encoder=JPEGCodec.createJPEGEncoder(os);
		 encoder.encode(image);
		  
		return os.toByteArray();

	 }

	public InputStream getIs() {
		return is;
	}

	public void setIs(InputStream is) {
		this.is = is;
	}
	   
	 
}
    
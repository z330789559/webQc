package com.weibao.util;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;



public class ExportUtil {
	
	public static void main(String[] args) {
		
		
		Configuration c=new Configuration().configure();
		SchemaExport schema=new SchemaExport(c);
		schema.create(true, true);
		System.out.println("≥…π¶¡À----");
	}

}

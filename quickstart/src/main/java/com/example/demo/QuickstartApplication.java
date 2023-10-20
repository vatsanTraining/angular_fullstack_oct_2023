package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.model.Vendor;
import com.training.ifaces.CrudRepository;
import com.training.service.VendorService;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo","com.training"})
public class QuickstartApplication {

	public static void main(String[] args) {
	 ConfigurableApplicationContext	 ctx=SpringApplication.run(QuickstartApplication.class, args);
	 
	 System.out.println(ctx.getBean("vendor",Vendor.class));
	 
        VendorService service =ctx.getBean(VendorService.class);
	 
	 service.add(ctx.getBean("gmr",Vendor.class));
	 service.add(ctx.getBean("ggr",Vendor.class));
	 
	 service.findAll().forEach(System.out::println);

	    ctx.close();
	}

	
	
	@Bean
	public Vendor gmr() {
		
	
		return new Vendor(1020, "GMR", "Facilities", 3939223L,"www.gmr.com" );
	}
	
	@Bean
	public Vendor ggr() {
		
	
		return new Vendor(2020, "GGR", "Food", 2939223L,"www.ggr.in" );
	}
	
	
}

package vn.edu.hcmuaf.nvtt.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class TechnologyShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechnologyShopApplication.class, args);
	}

}

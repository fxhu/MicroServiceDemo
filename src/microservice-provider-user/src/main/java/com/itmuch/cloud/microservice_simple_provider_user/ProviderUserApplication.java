package com.itmuch.cloud.microservice_simple_provider_user;

/**
 * Hello world!
 *
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@SpringBootApplication


//public class ProviderUserApplication
//{
//    public static void main( String[] args )
//    {
//    	SpringApplication.run(ProviderUserApplication.class, args);
//        
//    }
//}

@EnableDiscoveryClient
@SpringBootApplication
public class ProviderUserApplication{
	public static void main(String[] args) {
		SpringApplication.run(ProviderUserApplication.class, args);
	}
}
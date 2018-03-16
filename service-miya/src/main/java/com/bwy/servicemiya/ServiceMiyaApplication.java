package com.bwy.servicemiya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;



@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ServiceMiyaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceMiyaApplication.class, args);
	}

//	private static final Logger LOG = Logger.getLogger(ServiceMiyaApplication.class.getName());
//
//
//	@RequestMapping("/hi")
//	public String home(){
//		LOG.log(Level.INFO, "hi is being called");
//		return "hi i'm miya!";
//	}
//
//	@RequestMapping("/miya")
//	public String info(){
//		LOG.log(Level.INFO, "info is being called");
//		return restTemplate.getForObject("http://localhost:8988/info",String.class);
//	}
//
//	@Autowired
//	private RestTemplate restTemplate;
//
//	@Bean
//	public RestTemplate getRestTemplate(){
//		return new RestTemplate();
//	}
}

package wei.com.spring.cloud.eureka.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer//开启游里卡注解
@SpringBootApplication
public class DiscoveryEurekaAdminApplication {


    public static void main(String[] args) {
        SpringApplication.run(DiscoveryEurekaAdminApplication.class,args);
    }
}

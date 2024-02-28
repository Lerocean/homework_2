package wrongPackage;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WrongConfig {

    @Bean
    public WrongService getWrongService() {
        return new WrongService();
    }
}

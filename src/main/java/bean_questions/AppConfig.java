package bean_questions;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public QuestionService questionService() {
        return new QuestionServiceImpl();
    }
}


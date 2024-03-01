package bean_questions.config;

import bean_questions.service.QuestionService;
import bean_questions.service.QuestionServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public QuestionService questionService() {
        return new QuestionServiceImpl();
    }
}


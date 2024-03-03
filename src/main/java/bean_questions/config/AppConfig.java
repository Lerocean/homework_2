package bean_questions.config;

import bean_questions.dao.QuestionDao;
import bean_questions.service.QuestionService;
import bean_questions.service.QuestionServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public QuestionService questionService(QuestionDao questionDao) {
        return new QuestionServiceImpl(questionDao);
    }

    @Bean
    public QuestionDao questionDao() {
        return new QuestionDao();
    }
}

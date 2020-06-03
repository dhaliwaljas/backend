package com.weaver.taskservice.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.weaver.taskservice.models.Task;
import com.weaver.taskservice.repository.TaskRepository;

@EnableMongoRepositories(basePackageClasses = TaskRepository.class)
@Configuration
public class MongoDBConfig {

	@Bean
	CommandLineRunner commandLineRunner(TaskRepository taskRepo) {
		return strings -> {
			taskRepo.save(new Task("Dishes", "Do dishes", 1, "id_jas", "id_jas", "id_aman", 1591073606, 1591073606,
					1591073606, 1591073606, 1591073606, 1591073606));
			taskRepo.save(new Task("Garbage", "Take out garbage", 1, "id_aman", "id_aman", "id_jas", 1591073606,
					1591073606, 1591073606, 1591073606, 1591073606, 1591073606));

		};
	}

}

package com.weaver.taskservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.weaver.taskservice.model.enitity.Task;

//@Resource
public interface TaskRepository extends MongoRepository<Task, String> {
	
	
//	@Override
//	default List<Task> findAll() {
//		System.out.println("00000000000000");
//		return null;
//		// TODO Auto-generated method stub
////		return null super();
//	}
}

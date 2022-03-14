package com.genertor.jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.genertor.jpa.entityes.Teacher;
import com.genertor.jpa.repository.TeacherRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		TeacherRepository bean = context.getBean(TeacherRepository.class);

		Teacher teacher = new Teacher();
		teacher.setTeacherDepartment("History");
		teacher.setTeacherName("Keshav");
		teacher.setTeacherLecture(3);
		teacher.setTeacherSubject("Modern History");
		
		Teacher save = bean.save(teacher);
		
		if(save  == null  ) {
			System.out.println("failed ");
		}else {
			System.out.println("Ok");	
		}
		

	

	}

}

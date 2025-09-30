package com.Rohit.SpringData_Jpa;

import com.Rohit.SpringData_Jpa.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);



//		s1.setRollNo(58);
//		s1.setName("Rohit");
//		s1.setMarks(78);
//
//		s2.setRollNo(37);
//		s2.setName("Rahul");
//		s2.setMarks(87);
//
		s3.setRollNo(36);
		s3.setName("Ritu");
		s3.setMarks(95);
//
//		repo.save(s1);
//		repo.save(s2);
		repo.save(s3);
//		System.out.println(repo.findAll());

	}

}

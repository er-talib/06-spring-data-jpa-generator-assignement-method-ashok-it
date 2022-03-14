package com.genertor.jpa.entityes;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "teacher_details")
@Data
public class Teacher {
	
	@Id
//	@SequenceGenerator(name = "teacherSequence" ,sequenceName = "" , allocationSize = 1 ) create custom sequence
//	@GeneratedValue(generator = "teacherSequence" , strategy = GenerationType.SEQUENCE)
	@GeneratedValue
	private int teacherId ;
	private String teacherName ;
	private String teacherSubject ;
	private String teacherDepartment ;
	private int teacherLecture ;
	
	
	

}

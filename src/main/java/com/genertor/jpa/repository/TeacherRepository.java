package com.genertor.jpa.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.genertor.jpa.entityes.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Serializable> {

}

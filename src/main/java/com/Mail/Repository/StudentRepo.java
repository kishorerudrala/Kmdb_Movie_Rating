package com.Mail.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Student.Entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long>
{

}

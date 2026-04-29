package com.example.courseManagement2.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.courseManagement2.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, int> {
    // Example custom query
    // List<Student> findByCourseId(Long courseId);
}

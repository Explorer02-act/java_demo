package com.example.courseManagement2.service;


import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.example.courseManagement2.entity.Student;
import com.example.courseManagement2.repository.StudentRepository;


@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(int id) {
        return studentRepository.findById(id).orElse(null);
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public String updateStudent(int id, Student updatedStudent) {
        if(studentRepository.existsById(id)) {
            updatedStudent.setId(id);
            studentRepository.save(updatedStudent);
            return "Student updated successfully";
        }
        return "Student not found";
    }

    // public String deleteStudent(int id) {
    //     if(studentRepository.existsById(id)) {
    //         studentRepository.deleteById(id);
    //         return "Student deleted successfully";
    //     }
    //     return "Student not found";
    // }

    public String deleteStudent(int id) {
    studentRepository.deleteById(id);
    return "Student removed with id: " + id;
}


    public Student saveStudent(Student student) {
    return studentRepository.save(student);
}

}
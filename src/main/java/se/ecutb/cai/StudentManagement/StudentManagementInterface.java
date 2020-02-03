package se.ecutb.cai.StudentManagement;

import se.ecutb.cai.models.Student;

import java.util.List;

public interface StudentManagementInterface {

    Student create();
    Student save(Student student);
    Student find(int id);
    Student remove(int id);
    List<Student> findAll();
    Student edit(Student student);
}

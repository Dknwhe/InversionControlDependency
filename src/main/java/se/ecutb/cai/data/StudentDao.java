package se.ecutb.cai.data;

import se.ecutb.cai.models.Student;

import java.util.List;

public interface StudentDao {

    Student save(Student student);
    Student find(int id);
    List<Student> findAll();
    void delete(int id);
}

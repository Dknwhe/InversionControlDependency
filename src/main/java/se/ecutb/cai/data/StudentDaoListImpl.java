package se.ecutb.cai.data;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import se.ecutb.cai.models.Student;

import java.util.List;


@Component
public class StudentDaoListImpl implements StudentDao {

    List<Student>students;

    @Override
    public Student save(Student student) {
       
        return student;
    }

    @Override
    public Student find(int id) {

        return null;
    }

    @Override
    public List<Student> findAll() {

        return students;
    }

    @Override
    public void delete(int id) {

    }
}

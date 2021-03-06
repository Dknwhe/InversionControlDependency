package se.ecutb.cai.StudentManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import se.ecutb.cai.Input.UserInputService;
import se.ecutb.cai.data.StudentDao;
import se.ecutb.cai.models.Student;

import java.util.List;


@Component
public class StudentManagementConsoleImpl implements StudentManagementInterface{

    UserInputService scannerService;
    StudentDao studentDao;


    @Autowired
    public StudentManagementConsoleImpl(UserInputService scannerService, StudentDao studentDao) {
        this.scannerService = scannerService;
        this.studentDao = studentDao;
    }

    @Override
    public Student create() {
        return null;
    }

    @Override
    public Student save(Student student) {
        return null;
    }

    @Override
    public Student find(int id) {
        return null;
    }

    @Override
    public Student remove(int id) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student edit(Student student) {
        return null;
    }
}

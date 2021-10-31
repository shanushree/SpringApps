package net.javaguides.sms.impl;

import java.util.List;

import net.javaguides.sms.entity.Student;
import net.javaguides.sms.repository.StudentRepository;
import net.javaguides.sms.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService 
{

	private StudentRepository studentRepository; 
	
	public StudentServiceImpl(StudentRepository studentRepository)
	{
		super();
		this.studentRepository=studentRepository;
	}
	
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}
	
	@Override
	public Student getStudentById(Long id)
	{
		return studentRepository.findById(id).get();
	}
	
	@Override
	public Student updateStudent(Student student)
	{
		return studentRepository.save(student);
	}
	
	@Override
	public void deleteStudentById(Long id)
	{
		studentRepository.deleteById(id); 
	}

}

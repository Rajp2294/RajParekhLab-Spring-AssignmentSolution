package com.greatlearning.studentManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.studentManagement.entity.Student;
import com.greatlearning.studentManagement.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> findAll() {

		// find all records from the database table
		List<Student> students = studentRepository.findAll();
		return students;
	}

	@Override
	public Student findById(int id) {
		// find record with Id from the database table
		return studentRepository.findById(id).get();
	}

	@Override
	public void save(Student thestudent) {
		studentRepository.save(thestudent);
	}

	@Override
	public void deleteById(int id) {
		// delete record
		studentRepository.deleteById(id);
	}
}

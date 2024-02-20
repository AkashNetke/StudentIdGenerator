package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StudentInfoRepository;
import com.model.StudentInfo;

import jakarta.websocket.server.ServerEndpoint;

@Service
public class StudentInfoServiceImpl implements StudentInfoService{

	@Autowired
	StudentInfoRepository studentRepo;

	@Override
	public StudentInfo saveStudent(StudentInfo studentInfo) {
		// TODO Auto-generated method stub
		return studentRepo.save(studentInfo);
	}
	
}

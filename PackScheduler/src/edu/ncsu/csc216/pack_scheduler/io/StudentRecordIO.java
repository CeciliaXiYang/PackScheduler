package edu.ncsu.csc216.pack_scheduler.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

import edu.ncsu.csc216.pack_scheduler.user.Student;

public class StudentRecordIO {

	public static ArrayList<Student> readStudentRecords(String fileName) throws FileNotFoundException {
		
		Scanner fileReader = new Scanner(new FileInputStream(fileName));
		ArrayList<Student> students = new ArrayList<Student>();
		
		while (fileReader.hasNextLine()) {
			Student student = readStudent(fileReader.nextLine());
			System.out.println(student.toString());
			students.add(student);
			}
		
		fileReader.close();
		return students;
	}	

	private static Student readStudent(String nextLine) {
		
		String[] studentInfoList = nextLine.split(", ");
		int argNum = studentInfoList.length; 
		
		if(argNum == 6) {
			Student student = new Student(studentInfoList[0], studentInfoList[1], studentInfoList[2],
					studentInfoList[3], studentInfoList[4], Integer.parseInt(studentInfoList[5])); 
			return student; 
		}
		else if(argNum == 5) {
			Student student  = new Student(studentInfoList[0], studentInfoList[1], studentInfoList[2],
					studentInfoList[3], studentInfoList[4]); 
			return student; 
		}
		else {
			throw new IllegalArgumentException();
		}
	}

	public static void writeStudentRecords(String fileName, ArrayList<Student> studentDirectory) throws IOException {
		
		PrintStream fileWriter = new PrintStream(new File(fileName));

		for (int i = 0; i < studentDirectory.size(); i++) {
		    fileWriter.println(studentDirectory.get(i).toString());
		}

		fileWriter.close();
		
	}

}

package cn.com.hand.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortTest {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		Student student = new Student();
		student.setName("b");
		student.setAge(18);
		student.setHeight(170);
		student.setAddress("ddd");
		list.add(student);
		
		student = new Student();
		student.setName("a");
		student.setAge(19);
		student.setHeight(168);
		student.setAddress("xxx");
		list.add(student);
		
		student = new Student();
		student.setName("a");
		student.setAge(19);
		student.setHeight(168);
		student.setAddress("zzz");
		list.add(student);
		
		student = new Student();
		student.setName("a");
		student.setAge(19);
		student.setHeight(168);
		student.setAddress("yyy");
		list.add(student);
		
		student = new Student();
		student.setName("d");
		student.setAge(17);
		student.setHeight(175);
		student.setAddress("sss");
		list.add(student);
		
		student = new Student();
		//student.setName("c");
		student.setAge(17);
		student.setHeight(173);
		student.setAddress("www");
		list.add(student);
		
		testSort(list);
		//testTwoSort(list);
	}
	
	private static void testSort(List<Student> list) {
		Collections.sort(list, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				if(o1.getName() != null && o2.getName() != null) {
					return o1.getName().compareTo(o2.getName());
				}
				return 1;
			}
		});
		for(Student student : list) {
			System.out.println(student.getName());
		}
	}
	
	private static void testTwoSort(List<Student> list) {
		Collections.sort(list, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				 if(o1.getName().compareTo(o2.getName()) <= 0){
					 return o1.getAddress().compareTo(o2.getAddress());
				 }
				 return 0;
			}
		});
		for(Student student : list) {
			System.out.print(student.getName()+":");
			System.out.println(student.getAddress());
		}
	}
}

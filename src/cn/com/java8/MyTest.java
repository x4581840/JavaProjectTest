package cn.com.java8;

public interface MyTest {
	default String getName(String name){
		return "MyTest";
	};
	//String getName(String name);
}

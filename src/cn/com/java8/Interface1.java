package cn.com.java8;

@FunctionalInterface
public interface Interface1 {
	String getName();
	default String getAge(){
		return "12";
	}
}

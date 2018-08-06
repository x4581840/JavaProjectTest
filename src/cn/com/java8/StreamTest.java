package cn.com.java8;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.IntSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
	public static void main(String[] args) throws IOException {
		/*List<Integer> list = Arrays.asList(1,2,3);
		Stream<Integer> stream1 = list.stream();*/		
		/*
		Map<String,String> map = new HashMap();
		Stream<Entry<String,String>> stream2 = map.entrySet().stream();
		stream2.filter(entry -> entry.getValue().equals("3"))
		.collect(Collectors.toList());
		
		Set<String> set = new HashSet<>();
		Stream<String> stream3 = set.stream();
		
		String[] arr = new String[]{"a", "b", "c"};
		Stream<String> stream4 = Arrays.stream(arr);
		
		Stream<Integer> stream5 = Stream.of(1, 2, 3);
		
		//Stream<String> stream6 = Files.lines(Paths.get("data.txt"), Charset.defaultCharset());
		
		Stream.iterate(0, n -> n + 2)
	      .limit(10)
	      .forEach(System.out::println);
		
		IntSupplier fib = new IntSupplier() {
		    private int previous = 0;
		    private int current = 1;

		    @Override
		    public int getAsInt() {
		        int oldPrevious = this.previous;
		        int nextValue = this.previous + this.current;
		        this.previous = this.current;
		        this.current = nextValue;
		        return oldPrevious;
		    }
		};
		IntStream.generate(fib).limit(10).forEach(System.out::println);*/
		
		/*List<Student> list = Arrays.asList(
				new Student(1, "a", 15, "address1"),
				new Student(2, "b", 16, "address2"),
				new Student(3, "c", 17, "address3"),
				new Student(4, "d", 18, "address4"));
		list.stream().filter(s -> s.getAddress().equals("address2")).distinct().collect(Collectors.toList());*/
		
		//String words = "[\"Hello\",\"World\"]";
		/*List<String> words = Arrays.asList("Hello","World");
		System.out.println(words.stream().count());
		System.out.println(words.stream().map(str -> str.split("")).count());
		System.out.println(words.stream().map(str -> str.split("")).flatMap(str->Arrays.stream(str)).count());
		
		List<String> list = words.stream().map(str -> str.split(""))
					.flatMap(str->Arrays.stream(str))
					.collect(Collectors.toList());
		list.stream().forEach(System.out::println);*/
		
		/*String[] strs = {"java8", "is", "easy", "to", "use"};
		System.out.println(Arrays.stream(strs).map(str -> str.split("")).count());
		System.out.println(Arrays.stream(strs).map(str -> str.split(""))
				.flatMap(Arrays::stream).count());*/
		
		List<Student> list = new ArrayList<>();
		list.add(new Student(1, "a", 18, "a"));
		list.add(new Student(2, "b", 19, "b"));
		list.add(new Student(3, "c", 20, "c"));
		System.out.println(list.stream().mapToInt(Student::getAge).sum());
	}
}

package chapter1.exercise3;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class FilenameFilterLambda {

	public static void main(String args[]){
		
		final File dirToSearch = new File("/home/rasthana");
		
		final File[] files = dirToSearch.listFiles((dir, name) -> dir.isDirectory() && name.toLowerCase().contains("do"));
		
		final List<File> textFiles = Arrays.asList(files);
		
		textFiles.forEach(System.out::println);
	}
}

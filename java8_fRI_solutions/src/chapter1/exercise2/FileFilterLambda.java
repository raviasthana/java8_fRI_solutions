package chapter1.exercise2;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.List;

public class FileFilterLambda {

	public static void main(String args[]){
		
		final File dirToSearch = new File("/home/rasthana");
		
		/*
		//list of files returned using the file filter
		File[] files = dirToSearch.listFiles(new SubDirectoryFilter());
		
		List<File> subDirs = Arrays.asList(files);
		*/
		
		//list of files returned using the file filter
		//final FileFilter fileFiler = (dir) -> dir.isDirectory();
		//File[] files = dirToSearch.listFiles(fileFiler);
		final File[] files = dirToSearch.listFiles((dir) -> dir.isDirectory());
		
		final List<File> subDirs = Arrays.asList(files);		
		
		subDirs.forEach(System.out::println);
	}
}

class SubDirectoryFilter implements FileFilter{

	@Override
	public boolean accept(File file) {
		return file.isDirectory();
	}
	
}

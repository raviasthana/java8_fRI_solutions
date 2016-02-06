package chapter1.exercise2;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileFilterLambdaNIO {

	public static void main(String args[]){
		
		final Path p = Paths.get("/home/rasthana");
		
		final DirectoryStream.Filter<Path> f = path -> Files.isDirectory(path);
		
		try (final DirectoryStream<Path> stream = Files.newDirectoryStream(p, f)) {
		    stream.forEach(System.out::println);
		}catch(IOException ex){
			ex.printStackTrace();
		}
	}
}


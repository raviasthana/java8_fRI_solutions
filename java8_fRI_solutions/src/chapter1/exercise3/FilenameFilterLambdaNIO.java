package chapter1.exercise3;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class FilenameFilterLambdaNIO {

	public static void main(String args[]){
		
		final Path p = Paths.get("/home/rasthana");
		
		final DirectoryStream.Filter<Path> f = path -> Files.isDirectory(path)
				&& path.getFileName().toString().toLowerCase().contains("do");
		
		try(final DirectoryStream<Path> stream = Files.newDirectoryStream(p,f)){
			
			stream.forEach(System.out::println);
			
		}catch(IOException ioEx){
			ioEx.printStackTrace();
		}
	}
}


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class prac_part5_3 {
	public static void main(String[] args) {
		String rootDir = "Documents";
		String workDir = "Work";
		String personalDir = "Personal";
		String[] workFiles = {"project1.txt", "project2.txt"};
		String[] personalFiles = {"weekendPlan.txt", "summerTrip.txt"};
		// Create the root directory
		Path rootPath = Paths.get(rootDir);
		try
		{
			Files.createDirectories(rootPath); // Create the root directory 
			// Create work subdirectory and files
			Path workPath = rootPath.resolve(workDir);
			Files.createDirectories(workPath);
			for (String file : workFiles)
			{
				Path filePath = workPath.resolve(file);
				Files.createFile(filePath);
			} 

			Path personalPath = rootPath.resolve(personalDir);
			Files.createDirectories(personalPath);
			for (String file : personalFiles)
			{
				Path filePath = personalPath.resolve(file);
				Files.createFile(filePath);
			} 
		}
		catch(IOException ex)
		{
			//hello :) 
			System.out.println("error : " + ex);
		}
		
	}
}

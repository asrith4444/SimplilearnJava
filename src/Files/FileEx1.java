package Files;

import java.io.File;

public class FileEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("E:\\Files\\Hello.txt");
		System.out.println(f.exists());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.length());
		System.out.println(f.list());
		System.out.println(f.canExecute());
		System.out.println(f.getParent());
		System.out.println(f.isHidden());
	}

}

import java.util.Scanner;

public class HelloJava {
	public static void main(String args[]) {
		System.out.println("이름, 학번, 전공 학과를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		System.out.println("이름:" + name);
		
		String number = scanner.next();
		System.out.println("학번:" + number);
		
		String major = scanner.next();
		System.out.println("전공학과:" + major);
		
		scanner.close();
	}
	

}

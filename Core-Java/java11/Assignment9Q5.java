package java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Assignment9Q5 {
	public static void display() {
		System.out.println("Select the option");
		System.out.println("1: Insert New Price");
		System.out.println("2: View Purchase total");
		System.out.println("3: Exit");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		var file1 = "F:\\Add.txt";
		var file2 = "F:\\total.txt";
		int sum = 0;
		int z = 0;
		while (z == 0) {
			display();
			int a = s.nextInt();
			if (a == 1) {
				System.out.println("Enter 1 st price");
				int b = s.nextInt();
				String str = Integer.toString(b);
				try {
					Files.writeString(Path.of(file1), "\n" + str, StandardOpenOption.APPEND);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				int count = 1;
				System.out.println("Do you want to enter price for more items?(yes or no)");
				String str1 = s.next();
				while (str1.equals("yes")) {
					count++;
					System.out.println("Enter" + " " + count + ")" + "price");
					int b1 = s.nextInt();
					String str2 = Integer.toString(b1);
					try {
						Files.writeString(Path.of(file1), "\n" + str2, StandardOpenOption.APPEND);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Do you to enter price for more items?(yes or no)");
					str1 = s.next();
				}
				if (str1.equals("no")) {
					z = 0;
				}
				else {
					z=0;
					System.out.println("Please Enter valid value");
				}
			} else if (a == 2)

			{
				String tot;
				try {
					tot = Files.readString(Path.of(file1));
					List<String> f = tot.lines().collect(Collectors.toList());
					for (String string : f) {
						if (string.isBlank()) {
						} else {
							Integer number = Integer.valueOf(string);
							sum = sum + number;
						}
					}
					System.out.println(sum);
					String str = Integer.toString(sum);
					try {
						Files.writeString(Path.of(file2), "\n" + str, StandardOpenOption.APPEND);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				z = 0;
			} else if (a == 3) {
				System.out.println("Exit programm...");
				z = 1;
			}
		}
	}

}
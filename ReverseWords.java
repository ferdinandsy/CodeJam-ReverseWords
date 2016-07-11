import java.io.*;
import java.util.*;

public class ReverseWords {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int N = in.nextInt();
		in.nextLine(); // get extra newline
		StringBuilder output = new StringBuilder();
		for (int i = 1; i <= N; ++i)
		{
			String input = in.nextLine();
			String[] inputArr = input.split(" ");
			
			output.append("Case #" + i + ":");
			for (int j = inputArr.length - 1; j >= 0; j--) {
				output.append(" " + inputArr[j]);
			}
			output.append("\n");
		}
		in.close();
		System.out.println(output);
	}
}
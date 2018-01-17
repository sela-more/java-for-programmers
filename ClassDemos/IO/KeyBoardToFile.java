import java.io.*;


public class KeyBoardToFile {
	public static void main(String args[]) {
		File outFile = new File(args[0]);
		String line;
		try {
			BufferedReader stdin = new BufferedReader(new InputStreamReader(
					System.in));
			BufferedWriter out = new BufferedWriter(new FileWriter(outFile));
			while ((line = stdin.readLine()) != null) {
				if ("exit".equals(line)) {
					break;
				}
				out.write(line, 0, line.length());
				System.out.println(line);
				out.newLine();
			}

			out.flush();
			stdin.close();
			out.close();
		} catch (IOException io) {
			io.printStackTrace();
		}
	}

}

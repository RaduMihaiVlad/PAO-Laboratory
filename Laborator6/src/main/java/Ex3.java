import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ex3 {

    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/clienti.txt");
        FileReader fileReader = new FileReader(file);

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String currentLine = bufferedReader.readLine();
        int minorCnt = 0;
        int majorCnt = 0;
        List<String> majorString = new ArrayList<String>();
        while (currentLine != null) {
            String[] line = currentLine.split(" ");
            if (Integer.parseInt(line[2]) >= 18) {
                majorCnt ++;
                majorString.add(line[0]);
            } else {
                minorCnt ++;
            }
            currentLine = bufferedReader.readLine();
        }
        
        for (int i = 0; i < majorString.size(); ++i) {
            System.out.println(majorString.get(i));
        }

        System.out.println(majorCnt);
        System.out.println(minorCnt);

    }
}

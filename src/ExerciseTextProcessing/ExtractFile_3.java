package ExerciseTextProcessing;

import java.util.Scanner;

public class ExtractFile_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//C:\Internal\training-internal\Template.pptx
        String[] str = sc.nextLine().split("\\\\");

        String fullStr = str[str.length -1];

        String fileName = fullStr.split("\\.")[0];
        String extension = fullStr.split("\\.")[1];
        System.out.printf("File name: %s%n", fileName);
        System.out.printf("File extension: %s", extension);

    }
}

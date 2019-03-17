package pl.derezinski.design_patterns.decorator_pattern.input_output;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {

    public static void main(String[] args) throws IOException {

        int c;

        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("D:\\Programowanie\\Własne programy\\design_patterns\\src\\main\\java\\pl\\derezinski\\design_patterns\\decorator_pattern\\input_output\\test.txt")));
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

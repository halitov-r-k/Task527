import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Program {
    public static void main(String[] args) {
        System.out.println("Программа");

        byte[] input = {22, 2, 3, 4};
        InputStream inputStream = new ByteArrayInputStream(input);
        try {
            System.out.println(sumOfStream(inputStream));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    static public int sumOfStream(InputStream inputStream) throws IOException {
       int sum = 0;
       int b;
        try {
            while ((b = inputStream.read()) != -1) {
                sum += b;
            }
        } catch (IOException e) {
            throw new IOException();
        }
        return sum;
    }
}

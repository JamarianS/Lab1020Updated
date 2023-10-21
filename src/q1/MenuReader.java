/**Class: MenuReader
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: October 20, 2023
 *
 * This class – Reads a file named "sample.txt" using a BufferedReader and the prints it out to the
 * compilier
 *
 */
package q1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MenuReader {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("sample.txt"))){
        String line;
        while((line = reader.readLine()) != null) {
            System.out.println(line);
        }
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }

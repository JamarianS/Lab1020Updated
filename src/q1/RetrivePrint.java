/**Class: RetrivePrint
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: October 20, 2023
 *
 * This class – reads a file named "input.txt" and then prints the info that is stored in "input.txt"
 * into a file named "output.txt"
 */
package q1;

import java.io.*;

public class RetrivePrint {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             FileWriter writer = new FileWriter("output.txt")) {

            String line;
            while ((line = reader.readLine()) != null) {

                writer.write(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

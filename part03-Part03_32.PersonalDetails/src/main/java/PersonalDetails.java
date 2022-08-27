
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int birthYear = 0;
        int nameLength = 0;
        int count = 0;
        String name = "";
        int temp = 0;

        
        while(true){

            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            
            String[] parts = input.split(",");
            sum += Integer.valueOf(parts[1]);
            count++;
            nameLength = parts[0].length();
            
            if(temp < nameLength){
                temp = nameLength;
                name = parts[0];
            }
            
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth year: " + 1.0*sum/count);


    }
}

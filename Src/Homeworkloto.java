import java.util.Arrays;
import java.util.Scanner;
public class Homeworkloto {
    public static void main(String[] args) {
        int first[] = new int[9];
        for(int i = 0; i < first.length; i++) {
            first[i] = (int)(Math.random() * 10);
        }
        Arrays.sort(first);
        System.out.println("Enter 7 digits from 0 to 9: ");
        Scanner sc = new Scanner(System.in);
        int second[] = new int[7];
        for(int i=0; i< second.length;i++){
            second[i] = sc.nextInt();
        }
        Arrays.sort(second);
        System.out.print(Arrays.toString(first));
        System.out.println("");
        System.out.print(Arrays.toString(second));
        int count = 3;
        for(int i=0;i<second.length;i++){
            if(first[i]==second[i]) count++;
        }
        System.out.println("Сoincidences: "+count);
    }
}


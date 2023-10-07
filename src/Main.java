import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=3;
        String txt="";
        String reverse = "";
        for (int i=0;i<n;i++){
            char symbol=scanner.next().charAt(0);
            txt= (txt+" "+symbol);

        }   for (int j = txt.length() - 1; j >= 0; j--) {
            reverse = reverse + txt.charAt(j);
        }
        System.out.println(reverse);
        }
    }
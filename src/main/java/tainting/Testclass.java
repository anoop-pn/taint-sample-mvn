// package tainting;
// import java.io.IOException;
// import java.util.Scanner;

// public class Testclass {

//     public void getInputFromUser() {
//         Scanner sc=new Scanner(System.in);
//         String command=sc.nextLine();
//         executeCommand(command);
//     }

//     public void executeCommand(String command) {
//         ProcessBuilder pb = new ProcessBuilder(command);
//         try {
//             Process p = pb.start();
//         } catch (IOException e) {
//             // Do nothing
//         }
//     }
// }
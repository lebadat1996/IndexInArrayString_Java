package TimGiaTriTrongARRAY;


import java.util.Scanner;

public class IndexInArray {
    public static void main(String[] args) {
        String[] student = {"Christian", "Michael", "Camila",
                "Sienna", "Tanya", "Connor",
                "Zachariah", "Mallory", "Zoe", "Emily"};

        Scanner scanner = new Scanner(System.in);
        String NameInput = scanner.nextLine();
        boolean isExit = false;
        for (String s : student) {
            if (NameInput.equals(s)) {
                isExit = true;
                break;
            }
        }
        if (isExit){
            System.out.println("In student");
        }else {
            System.out.println("Out student");
        }

    }
}

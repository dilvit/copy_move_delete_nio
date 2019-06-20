import copy.Copy;
import delete.Delete;
import move.Move;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Copy copy = new Copy();
        Move move = new Move();
        Delete delete = new Delete();

        Scanner sc = new Scanner(System.in);

        System.out.println("1.Copy File");
        System.out.println("2.Remove File");
        System.out.println("3.Delete File");

        int variant = sc.nextInt();
        if(variant == 1){
            copy.copyFile();
        }
        else if(variant == 2){
            move.moveFile();
        }
        else if(variant == 3){
            delete.deleteFile();
        }
        else if(variant > 3 && variant < 1){
            System.out.println("Invalid command");
        }
    }
}

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chuoi: ");
        String str = scanner.nextLine();
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            LinkedList<Character>linkedList = new LinkedList<>();
            linkedList.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) > linkedList.getLast()){
                    linkedList.add(str.charAt(j));

                }
            }
            if (linkedList.size() > list.size()){
                list.clear();
                list.addAll(linkedList);
            }
            linkedList.clear();
        }
        for (Character ch:
             list) {
            System.out.print(ch);
        }
        System.out.println();
    }
}

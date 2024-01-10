import java.util.LinkedList;
import java.util.Scanner;

public class j91_LinkedList_CollectionFramework {
    public static void main(String[] args) {

        // Q-1

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(3);
        for (int ele: list){
            System.out.print(ele + ", ");
        }
        System.out.println("\n" + list.indexOf(7));

        /////////////////////

        // Q-2

        LinkedList<Integer> list2 = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.println("element " + i+1);
            int input = sc.nextInt();
            list2.add(input);
        }

        for (int ele: list2){
            System.out.print(ele + ", ");
        }
        System.out.println();

        for(int i=0; i<n; i++){
            if(list2.get(i)>25){
                list2.remove(i);
            }
        }

        for (int ele: list2){
            System.out.print(ele + ", ");
        }
        System.out.println();
    }
}

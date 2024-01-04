import java.util.Scanner;
class Library{
    Scanner sc = new Scanner(System.in);
    String [] book;
    String name;
    String[] issue;

    public void addBook(String ...arr){
        book = new String[arr.length];
        for(int i = 0; i<arr.length;i++ ){
            book[i] = arr[i];
        }
    }
    public void listBooks(){

        System.out.println("Here's the list of all books available: ");
        for(String ele: book){
            System.out.println(ele);
            //System.out.println();
            }
    }

    public void issueBook(){
        System.out.println("Enter the number of books you want to issue: ");
        int num = sc.nextInt();
        issue = new String[num];
        //System.out.println("NOTE - Enter in the same format as that of adding books.");
        for(int i=1; i<=num; i++ ){

            System.out.printf("Book %d: ", i);
            name = sc.nextLine();
            issue[i-1] = name;
            for (String ele : book) {
                if (ele.equals(name)) {
                    ele = null;
                }
            }

        }
        //name = sc.nextLine();
    }
    public void returnBook(){
        System.out.println("Which book you want to return: ");
        String wapas = sc.nextLine();

        for(String ele: book){
            if(ele==""){
                ele = wapas;
                break;
            }
        }
        System.out.println("The book has been returned.");

    }

    public void listIssued(){
        System.out.println("Here is the list of all the issued books: ");
        for (String ele: issue){
            System.out.println(ele);
        }
    }

}

public class j76_CWH_LibraryProject {
    public static void main(String[] args) {
        boolean play=true;
        Scanner scanner = new Scanner(System.in);
        Scanner sCanner = new Scanner(System.in);

        Library lib = new Library();

        System.out.println("/////////////////////////////////");
        System.out.println("WELCOME TO THE DTU LIBRARY");
        System.out.println("(Press the respective keys of the given options to use them)");
        System.out.println("1. List all the books");
        System.out.println("2. Add Books");
        System.out.println("3. Issue Books");
        System.out.println("4. List of Issued Books");
        System.out.println("5. Return Books");
        System.out.println("6. Exit");
        System.out.println("/////////////////////////////////");

        while(play){
            int choice = scanner.nextInt();
            if(choice==2){
                System.out.println("Enter the name of the books (use the following syntax-> harry potter, wieckfield, rajaramn): ");
                String addBook = sCanner.nextLine();
                String[] bookTitles = addBook.split(",\\s*");
                lib.addBook(bookTitles);
                lib.listBooks();

            } else if (choice==1) {
                lib.listBooks();
            } else if (choice==3) {
                lib.issueBook();
            } else if (choice == 4) {
                lib.listIssued();
            } else if (choice==5) {
                lib.returnBook();
            } else if (choice==6) {
                play=false;
                break;
            } else {
                System.out.println("hello");
            }

        }




}

package OOP.inheritance2_withstaticmethod;

public class Notebook extends Book {
     int numberofPages;
    public static int getNumberofpage() {
        return 500;

        }


    public static void main(String[] args) {
        Book book=new Book();
        System.out.println(book.getNumberofpage());
        Notebook notebook=new Notebook();
        System.out.println(notebook.getNumberofpage());
    }
}

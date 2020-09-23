package library;
import javax.swing.*;

public class Library {
    //The library will contain books stored in an array

    private Book[] libBooks;

    public Library() {
        fillBooks();
    }

    public void fillBooks() {
        //Ask how many books to fill
        String myInput = JOptionPane.showInputDialog(
                "How many books would you like to create?");
        int numBooks = Integer.parseInt(myInput);

        libBooks = new Book[numBooks];

        String title, author;

        for (int i = 0; i < numBooks; i++) {
            title = JOptionPane.showInputDialog("Book " + (i + 1)
                    + " Title");
            author = JOptionPane.showInputDialog("Book " + (i + 1)
                    + " Author");
            //Create the individual book object
            libBooks[i] = new Book(title, author);
        }
        //Finished creating the books
    }

    public void checkOutBook(int num, String name) {
        if (libBooks[num].isOut()) {
            JOptionPane.showMessageDialog(null,
                    "This book is already out!");
        } else {
            libBooks[num].setIsOut(true);
            libBooks[num].setCheckOutName(name);
        }
    }

    public void returnBook(int num) {
        if (!libBooks[num].isOut()) {
            JOptionPane.showMessageDialog(null,
                    "This book is already returned!");
        } else {
            libBooks[num].setIsOut(false);
            libBooks[num].setCheckOutName("");
        }
    }

    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("Library Contains:\n");
        //print each book out
        for (int i = 0; i < libBooks.length; i++) {
            output.append("Book #").append(i).append("\n");
            output.append(libBooks[i].toString()).append("\n");
        }
        return output.toString();
    }
}

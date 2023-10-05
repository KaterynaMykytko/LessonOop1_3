package org.courses.ex2;

import java.util.Scanner;

public class Book {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter book's title");
        String name1 = scanner1.nextLine();
        Title title = new Title(name1);

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter author's name");
        String name2 = scanner2.nextLine();
        Author author = new Author(name2);

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter context");
        String text = scanner3.nextLine();
        Content content = new Content(text);

        title.show();
        author.show();
        content.show();

    }
}

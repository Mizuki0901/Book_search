package org.example;

import static org.example.Library.bookList;

import java.util.Scanner;

public class Search {

  public static void search() {
    //番号で検索
    Scanner scanner1 = new Scanner(System.in);
    System.out.println("書籍番号を入力");
    int searchNumber = Integer.parseInt(scanner1.nextLine());

    boolean found;
    found = false;

    for (Book book : bookList) {
      if (searchNumber == book.getNumber()) {
        System.out.println(
            "お探しの本: " + book.getNumber() + ",「" + book.getTitle() + "」," + book.getAuthor());
        found = true;
        break;
      }
    }
    if (!found) {
      System.out.println("該当書籍はありません。");
    }

    //タイトルで検索
    Scanner scanner2 = new Scanner(System.in);
    System.out.println("タイトルを入力");
    String searchTitle = scanner2.nextLine();

    boolean found2;
    found2 = false;

    for (Book book : bookList) {
      if (searchTitle.equals(book.getTitle())) {
        System.out.println(
            "お探しの本: " + book.getNumber() + ",「" + book.getTitle() + "」," + book.getAuthor());
        found2 = true;
        break;
      }
    }
    if (!found2) {
      System.out.println("該当書籍はありません。");
    }

    //著者で検索
    Scanner scanner3 = new Scanner(System.in);
    System.out.println("著者を入力");
    String searchAuthor = scanner3.nextLine();

    boolean found3;
    found3 = false;

    for (Book book : bookList) {
      if (searchAuthor.equals(book.getAuthor())) {
        System.out.println(
            "お探しの本: " + book.getNumber() + ",「" + book.getTitle() + "」," + book.getAuthor());
        found3 = true;
        break;
      }
    }
    if (!found3) {
      System.out.println("該当書籍はありません。");
    }
  }
}

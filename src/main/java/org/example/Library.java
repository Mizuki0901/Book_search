package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {

  //Bookクラスのインスタンスを生成
  Book book1 = new Book(1, "クスノキの女神", "東野圭吾");
  Book book2 = new Book(2, "ガソリン生活", "伊坂幸太郎");
  Book book3 = new Book(3, "星の子", "今村夏子");
  Book book4 = new Book(4, "変な家", "雨穴");
  Book book5 = new Book(5, "正体", "染井為人");


  static List<Book> bookList = new ArrayList<>();

  //上記インスタンスを実行するメソッド
  public Library() {
    bookList.add(book1);
    bookList.add(book2);
    bookList.add(book3);
    bookList.add(book4);
    bookList.add(book5);

  }


}

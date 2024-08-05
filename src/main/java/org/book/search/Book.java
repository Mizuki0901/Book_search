package org.example;

public class Book {

  //書籍番号
  int number;

  //タイトル
  String title;

  //著者
  String author;

  //コンストラクタ
  public Book(int number, String title, String author) {
    this.number = number;
    this.title = title;
    this.author = author;
  }

  //書籍番号を取得
  public int getNumber() {
    return number;
  }

  //タイトルを取得
  public String getTitle() {
    return title;
  }

  //著者を取得
  public String getAuthor() {
    return author;
  }
}

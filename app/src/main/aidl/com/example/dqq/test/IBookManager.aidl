
package com.example.dqq.test;
import com.example.dqq.test.Book;

interface IBookManager {
    List<Book> getBookList();
    void addBook(in Book book);
}

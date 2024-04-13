package com.example.priyanshu.bookrestapi.Controller;

import com.example.priyanshu.bookrestapi.BookService.BookDaofake;
import com.example.priyanshu.bookrestapi.Entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mybooks")
public class Bookcontroller {

    @Autowired
    private BookDaofake bookDao;

    @GetMapping("/author")
    public Book MyBooks(){

        return this.bookDao;
////        return "My Books";
//        Book b = new Book();
//        b.setTitle("Book Title");
//        b.setAuthor("Book Author");
//        b.setId(123);
//
//        return b;

    }

}
package com.example.demo.controller;

import com.example.demo.entity.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class BookController {

    private List<Book> bookList = new ArrayList<>();

    @PostMapping("/book")
    public ResponseEntity<List<Book>> addBook(@RequestBody Book book){
        bookList.add(book);
        System.out.println("书籍增加成功，bookList："+bookList);
        return ResponseEntity.ok(bookList);
    }

    @DeleteMapping("/book/{id}")
    public ResponseEntity deleteBookById(@PathVariable("id") int id){
        bookList.remove(id);
        return ResponseEntity.ok(bookList);
    }

    @GetMapping("/book")
    public ResponseEntity getBookByName(@RequestParam("name") String name){
        List<Book> results = bookList.stream().filter(book -> book.getName().equals(name)).collect(Collectors.toList());
        return ResponseEntity.ok(results);
    }

}

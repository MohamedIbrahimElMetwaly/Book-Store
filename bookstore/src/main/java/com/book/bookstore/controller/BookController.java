package com.book.bookstore.controller;

import com.book.bookstore.Dto.BookDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/books")
public class BookController {

    @GetMapping
    public ResponseEntity<List<BookDto>> getBooks() {
        BookDto book = BookDto.builder()
                .title("My First book title")
                .build();

        BookDto book2 = BookDto.builder()
                .title("My Second book title 1")
                .build();

        List<BookDto> books = new ArrayList<>();
        books.add(book);
        books.add(book2);
        return ResponseEntity.ok(books);

    }
}

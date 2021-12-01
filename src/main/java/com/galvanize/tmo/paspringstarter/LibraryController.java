package com.galvanize.tmo.paspringstarter;

import com.galvanize.tmo.paspringstarter.models.Book;
import com.galvanize.tmo.paspringstarter.models.Library;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;

@RestController
public class LibraryController {

    Library library = new Library(new ArrayList<>());

    @GetMapping("/health")
    public void health() {

    }

    @PostMapping("/api/books")
    @ResponseStatus(HttpStatus.CREATED)
    public Book addBook(@RequestBody Book book) {
        book.setId(library.getBooks().size() + 1);
        library.addBooks(book);
        return book;
    }

    @GetMapping("/api/books")
    public Library getBooks() {
        library.sortBooks();
        return library;
    }
}

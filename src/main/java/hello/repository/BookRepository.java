package hello.repository;

import hello.model.Book;

public interface BookRepository {

    Book getByIsbn(String isbn);
}

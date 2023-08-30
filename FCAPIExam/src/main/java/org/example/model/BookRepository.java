package org.example.model;
// Spring Data JPA --> CrudRepository, JpaRepository
//                     delete(), save() --> insert, update, findAll, ..

import java.util.List;

public interface BookRepository {
    // CRUD method 정의
    public int bookDelete(int num);
    public List<Book> getLinkeBooks(String serach);
}

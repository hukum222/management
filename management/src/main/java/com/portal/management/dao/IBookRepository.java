package com.portal.management.dao;

import com.portal.management.model.Book;
import com.portal.management.model.Laptop;
import com.portal.management.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBookRepository  extends JpaRepository<Book, Integer> {
    List<Book> findAllBookByStudent(Student student);

}

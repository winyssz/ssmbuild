package com.sz.dao;

import com.sz.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    int addBook(Books books);
    int deleteBookById(@Param("bookId") int id);
    int updateBook(Books books);
    Books queryBookById(@Param("bookId") int id);
    List<Books> queryAllBook();
    //根据id查询,返回一个Book
    Books queryBookByName(String bookName);
}
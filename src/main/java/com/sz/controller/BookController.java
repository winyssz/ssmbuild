package com.sz.controller;

import com.sz.pojo.Books;
import com.sz.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.print.Book;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> list=bookService.queryAllBook();
        model.addAttribute("list",list);
        return "allBook";
    }
}

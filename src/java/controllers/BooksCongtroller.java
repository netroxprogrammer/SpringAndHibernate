/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import Interfaces.BookService;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import model.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


/**
 *
 * @author mac
 */
@Controller
public class BooksCongtroller {
    @Autowired
    private BookService bookService;
    @RequestMapping("/")
    public ModelAndView homePage(HttpServletResponse response) throws IOException{
        return new  ModelAndView("home","booksForm",new Books());
    }
    @RequestMapping("/AddBook")
    @ResponseBody
    public String addBook(@ModelAttribute("booksForm") Books books ){
        return bookService.addBooks(books);
    }
    @RequestMapping("/bookList")
    public ModelAndView getSongList(){
        ModelAndView  model = new ModelAndView("bookList");
        model.addObject("books",bookService.getBookList());
        return  model;
    }
    
}

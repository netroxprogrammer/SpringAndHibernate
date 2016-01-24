/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;


import java.util.List;
import model.Books;

/**
 *
 * @author mac
 */
public interface BookService {
    public String addBooks(Books books);
    public List getBookList();
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesImplementation;

import Interfaces.BookDao;
import Interfaces.BookService;
import java.util.List;
import model.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author mac
 */
@Service
public class BookServiceImp implements BookService{
    @Autowired
    private BookDao bookDao;
    @Override
    public String addBooks(Books books) {
        return bookDao.addSong(books);
    }

    @Override
    public List getBookList() {
      return  bookDao.getBookList();
    }
    
}

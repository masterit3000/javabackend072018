/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojdbc_mvc.controller;

import java.util.List;

/**
 *
 * @author Admin
 */
public interface IController<T extends MyDTO> {

    T addNew(T T);

    T updateByID(T T);

    List<T> getAll();

    T findByID(T t);

}

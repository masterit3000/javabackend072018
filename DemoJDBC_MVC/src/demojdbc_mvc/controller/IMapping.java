/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojdbc_mvc.controller;

import demojdbc_mvc.dao.model.SinhVien;

/**
 *
 * @author Admin
 */
public interface IMapping<D, M> {

    D modelToDTO(M sv);

    M dTOTomodel(D sv);

}

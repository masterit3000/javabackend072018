/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojpaquanhe;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "lophoc")
@NamedQueries({
    @NamedQuery(name = "Lophoc.findAll", query = "SELECT l FROM Lophoc l")})
public class Lophoc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ma")
    private Integer ma;
    
    @Basic(optional = false)
    @Column(name = "ten")
    private String ten;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lophoc")
    private List<Sinhvien> sinhvienList;

    public Lophoc() {
    }

    public Lophoc(Integer ma) {
        this.ma = ma;
    }

    public Lophoc(Integer ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public Integer getMa() {
        return ma;
    }

    public void setMa(Integer ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public List<Sinhvien> getSinhvienList() {
        return sinhvienList;
    }

    public void setSinhvienList(List<Sinhvien> sinhvienList) {
        this.sinhvienList = sinhvienList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ma != null ? ma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lophoc)) {
            return false;
        }
        Lophoc other = (Lophoc) object;
        if ((this.ma == null && other.ma != null) || (this.ma != null && !this.ma.equals(other.ma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demojpaquanhe.Lophoc[ ma=" + ma + " ]";
    }
    
}

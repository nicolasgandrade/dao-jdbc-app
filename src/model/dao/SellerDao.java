package model.dao;

import model.entities.Seller;

import java.util.List;

public interface SellerDao {

    //Métodos que operam o banco de dados
    void insert(Seller obj);
    void update(Seller obj);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();

}

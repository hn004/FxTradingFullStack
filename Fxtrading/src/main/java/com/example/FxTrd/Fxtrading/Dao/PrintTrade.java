package com.example.FxTrd.Fxtrading.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.FxTrd.Fxtrading.Entity.BookTradeEntity;

@Repository
public interface PrintTrade extends JpaRepository<BookTradeEntity, Integer>{

}

package com.example.community.dao;


import org.springframework.stereotype.Repository;

@Repository("alphaHibernate")
public class AlphaDaohibernaeImpl implements AlphaDao {

    @Override
    public String select() {
        return "Hibernate";
    }
}

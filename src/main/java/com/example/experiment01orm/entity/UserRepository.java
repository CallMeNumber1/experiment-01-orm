package com.example.experiment01orm.entity;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository                                 // 持久化组件
@Transactional
public class UserRepository {
    @PersistenceContext
    private EntityManager em;               // 实体管理器
    public void addUserAddress() {
        User u1 = new User("BO1");
        em.persist(u1);
        Address a1 = new Address("956", u1);
        em.persist(a1);
        Address a2 = new Address("925", u1);
        em.persist(a2);
    }

}

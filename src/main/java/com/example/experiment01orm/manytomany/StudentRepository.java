package com.example.experiment01orm.manytomany;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository             // 持久化组件
@Transactional          // 类中所有方法都是事务的
public class StudentRepository {
    @PersistenceContext
    private EntityManager em;
    public void elect() {
        Student s1 = new Student("BO");
        em.persist(s1);
        Student s2 = new Student("Chong");
        em.persist(s2);
        Course c1 = new Course("System Program Design");
        em.persist(c1);
        Course c2 = new Course("Java");
        em.persist(c2);
        Course c3 = new Course("Web");
        em.persist(c3);
        Elective e1 = new Elective(s1, c1);
        em.persist(e1);
        Elective e2 = new Elective(s1, c3);
        em.persist(e2);
        Elective e3 = new Elective(s2, c1);
        em.persist(e3);
        Elective e4 = new Elective(s2, c2);
        em.persist(e4);
    }


}

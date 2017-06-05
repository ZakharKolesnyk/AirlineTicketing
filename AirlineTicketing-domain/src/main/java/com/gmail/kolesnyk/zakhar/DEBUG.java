package com.gmail.kolesnyk.zakhar;


import com.gmail.kolesnyk.zakhar.configurations.DataSourceConfig;
import com.gmail.kolesnyk.zakhar.dao.seat.EnumSeat;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Component
public class DEBUG {
    @Autowired
    private SessionFactory sessionFactory;
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(DataSourceConfig.class);
//        DEBUG debug=new DEBUG();
        DEBUG debug=context.getBean(DEBUG.class);
//        System.out.println(debug.sessionFactory.getAllCollectionMetadata());
        debug.list().forEach(System.out::println);



    }

    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
    private List<EnumSeat> list(){
        return sessionFactory.openSession().createCriteria(EnumSeat.class).list();
    }
}

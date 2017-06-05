package com.gmail.kolesnyk.zakhar;


import com.gmail.kolesnyk.zakhar.config.WebServiceConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@Service
public class DEBUG {
    //    @Autowired
//    private SessionFactory sessionFactory;
//
//    @Autowired
//    private UserDao userDao;
    public static void main(String[] args) {
        /*ApplicationContext context =*/
        new AnnotationConfigApplicationContext(WebServiceConfig.class);
//        DEBUG debug=new DEBUG();
//        DEBUG debug=context.getBean(DEBUG.class);
//        System.out.println(debug.sessionFactory.getAllCollectionMetadata());
////        debug.listEnumSets().forEach(System.out::println);
//        debug.listUser().forEach(System.out::println);


    }

//    @Transactional(readOnly = true)
//    @SuppressWarnings("unchecked")
//    private List<User> listUser(){
//        return userDao.list();
//    }
//
//    @Transactional(readOnly = true)
//    @SuppressWarnings("unchecked")
//    private List<EnumSeat> listEnumSets(){
//        return sessionFactory.openSession().createCriteria(EnumSeat.class).list();
//    }
}

package com.gmail.kolesnyk.zakhar.dao.passenger;

import com.gmail.kolesnyk.zakhar.dao.AbstractDao;
import org.springframework.stereotype.Repository;


/**
 * class implements and extends methods that need to ORM relations with {@link Passenger} class
 */
@Repository
public class PassengerDaoImpl extends AbstractDao<Passenger, Integer> implements PassengerDao {

//    @Override
//    public Passenger selectByPhone(String phone) {
//        return (Passenger) sessionFactory.getCurrentSession().createCriteria(Passenger.class).add(Restrictions.eq("phone", phone)).uniqueResult();
//    }
//
//    @Override
//    public Passenger selectByEmail(String email) {
//        return (Passenger) sessionFactory.getCurrentSession().createCriteria(Passenger.class).add(Restrictions.eq("email", email)).uniqueResult();
//    }
//
//    @Override
//    public Passenger selectByLogin(String login) {
//        return (Passenger) sessionFactory.getCurrentSession().createCriteria(Passenger.class).add(Restrictions.eq("login", login)).uniqueResult();
//    }
//
//
//    @Override
//    @SuppressWarnings("unchecked")
//    public List<Passenger> friendList(Integer idUser) {
//        return sessionFactory.getCurrentSession().createSQLQuery("SELECT * FROM users WHERE id_user IN (SELECT id_friend FROM friends WHERE id_user = :idUser)")
//                .addEntity(Passenger.class).setParameter("idUser", idUser).list();
//    }
//
//    @Override
//    @SuppressWarnings("unchecked")
//    public Integer amountFriends(Integer idUser) {
//        return ((BigInteger) sessionFactory.getCurrentSession().createSQLQuery("SELECT count(*) FROM friends WHERE id_user = :idUser")
//                .setParameter("idUser", idUser).uniqueResult()).intValue();
//    }
//
//    @Override
//    @SuppressWarnings("unchecked")
//    public List<Passenger> friendSublist(Integer idUser, int offset, int amount) {
//        return sessionFactory.getCurrentSession().createSQLQuery
//                ("SELECT * FROM users WHERE id_user IN (SELECT id_friend FROM friends WHERE id_user = :idUser) ORDER BY id_user ASC LIMIT :offset, :amount ")
//                .addEntity(Passenger.class).setParameter("idUser", idUser).setParameter("offset", offset).setParameter("amount", amount).list();
//    }
//
//    @Override
//    public void saveHashForEmail(String hashForEmail, Integer idUser) {
//        sessionFactory.getCurrentSession().createSQLQuery
//                ("INSERT INTO confirm_emails (id_user, hashed_email) VALUES (:idUser , :hashedEmail );")
//                .setParameter("idUser", idUser).setParameter("hashedEmail", hashForEmail).executeUpdate();
//    }
//
//    @Override
//    public Boolean removeUserByHashForEmail(String hashForEmail) {
//        return sessionFactory.getCurrentSession().createSQLQuery
//                ("DELETE FROM users WHERE id_user IN (SELECT confirm_emails.id_user FROM confirm_emails WHERE hashed_email = :hashedEmail);")
//                .setParameter("hashedEmail", hashForEmail).executeUpdate() != 0;
//    }
//
//    @Override
//    public Passenger byHashForEmail(String hashForEmail) {
//        return (Passenger) sessionFactory.getCurrentSession().createSQLQuery
//                ("SELECT * FROM users WHERE id_user IN (SELECT confirm_emails.id_user FROM confirm_emails WHERE hashed_email = :hashedEmail)")
//                .addEntity(Passenger.class).setParameter("hashedEmail", hashForEmail).uniqueResult();
//    }
//
//    @Override
//    public Boolean removeHashForEmail(String hashForEmail) {
//        return sessionFactory.getCurrentSession().createSQLQuery
//                ("DELETE FROM confirm_emails WHERE hashed_email = :hashedEmail ;")
//                .setParameter("hashedEmail", hashForEmail).executeUpdate() != 0;
//    }
//
//    @Override
//    public Boolean saveHashForPassword(String hashForPassword, Integer idUser) {
//        return sessionFactory.getCurrentSession().createSQLQuery
//                ("INSERT INTO restore_password (id_user, hashed_password) VALUES (:idUser , :hashForPassword );")
//                .setParameter("idUser", idUser).setParameter("hashForPassword", hashForPassword).executeUpdate() != 0;
//    }
//
//    @Override
//    public Boolean removeRestorePassword(String hashForPassword) {
//        return sessionFactory.getCurrentSession().createSQLQuery
//                ("DELETE FROM restore_password WHERE restore_password.hashed_password = :hashForPassword ;")
//                .setParameter("hashForPassword", hashForPassword).executeUpdate() != 0;
//    }
//
//    @Override
//    @SuppressWarnings("unchecked")
//    public List<Passenger> searchByName(String search) {
//        String[] split = search.split(" ");
//        String firstName = split[0].trim().toLowerCase();
//        String lastName = "";
//        if (split.length > 1) {
//            lastName = split[1].trim().toLowerCase();
//        }
//        return sessionFactory.getCurrentSession().createSQLQuery("SELECT * FROM users WHERE (first_name LIKE lower(:firstName) AND last_name LIKE lower(:lastName)) OR (first_name LIKE lower(:lastName) AND last_name LIKE lower(:firstName));")
//                .addEntity(Passenger.class).setParameter("firstName", "%" + firstName + "%").setParameter("lastName", "%" + lastName + "%").list();
//    }
//
//    @Override
//    public Boolean isFriends(int idCurrentUser, int idUser) {
//        return ((BigInteger) sessionFactory.getCurrentSession()
//                .createSQLQuery("SELECT count(*) FROM friends WHERE (id_user = :idUser AND id_friend = :idFriend) OR (id_user = :idFriend AND id_friend = :idUser)")
//                .setParameter("idUser", idCurrentUser).setParameter("idFriend", idUser).uniqueResult()).intValue() == 2;
//    }
//
//    @Override
//    public void addFriend(int idCurrentUser, int idUser) {
//        sessionFactory.getCurrentSession().createSQLQuery("INSERT INTO friends (id_user, id_friend) VALUES (:idCurrentUser, :idUser)")
//                .setParameter("idCurrentUser", idCurrentUser).setParameter("idUser", idUser).executeUpdate();
//        sessionFactory.getCurrentSession().createSQLQuery("INSERT INTO friends (id_user, id_friend) VALUES (:idUser, :idCurrentUser)")
//                .setParameter("idCurrentUser", idCurrentUser).setParameter("idUser", idUser).executeUpdate();
//        removeInvitationForFriendship(idCurrentUser, idUser);
//    }
//
//    @Override
//    public void removeFriendship(int idCurrentUser, int idUser) {
//        sessionFactory.getCurrentSession().createSQLQuery("DELETE FROM friends WHERE (id_user = :idCurrentUser AND id_friend = :idUser) OR (id_user = :idUser AND id_friend = :idCurrentUser)")
//                .setParameter("idCurrentUser", idCurrentUser).setParameter("idUser", idUser).executeUpdate();
//    }
//
//    @Override
//    public Boolean isInvitedForFriendship(int idCurrentUser, int idUser) {
//        return ((BigInteger) sessionFactory.getCurrentSession()
//                .createSQLQuery("SELECT count(*) FROM inviting_for_friendship WHERE id_user = :idCurrentUser AND id_friend = :idUser")
//                .setParameter("idCurrentUser", idCurrentUser).setParameter("idUser", idUser).uniqueResult()).intValue() == 1;
//    }
//
//    @Override
//    public void inviteForFriendship(int idCurrentUser, int idUser) {
//        sessionFactory.getCurrentSession().createSQLQuery("INSERT INTO inviting_for_friendship (id_user, id_friend) VALUES (:idCurrentUser, :idUser)")
//                .setParameter("idCurrentUser", idCurrentUser).setParameter("idUser", idUser).executeUpdate();
//    }
//
//    @Override
//    public Integer amountOfInvitations(int idUser) {
//        return ((BigInteger) sessionFactory.getCurrentSession()
//                .createSQLQuery("SELECT count(*) FROM inviting_for_friendship WHERE id_friend = :idUser")
//                .setParameter("idUser", idUser).uniqueResult()).intValue();
//    }
//
//    @Override
//    @SuppressWarnings("unchecked")
//    public List<Passenger> listInvitationsForFriendship(int idUser) {
//        return sessionFactory.getCurrentSession()
//                .createSQLQuery("SELECT * FROM users WHERE id_user IN (SELECT inviting_for_friendship.id_user FROM inviting_for_friendship WHERE id_friend = :idUser)")
//                .addEntity(Passenger.class).setParameter("idUser", idUser).list();
//    }
//
//    @Override
//    public void removeInvitationForFriendship(int idCurrentUser, int idUser) {
//        sessionFactory.getCurrentSession().createSQLQuery("DELETE FROM inviting_for_friendship WHERE (id_user = :idCurrentUser AND id_friend = :idUser) OR (id_user = :idUser AND id_friend = :idCurrentUser)")
//                .setParameter("idCurrentUser", idCurrentUser).setParameter("idUser", idUser).executeUpdate();
//    }
//
//    @Override
//    public Integer amountFoundUsers(String search) {
//        String[] split = search.split(" ");
//        String firstName = split[0].trim().toLowerCase();
//        String lastName = "";
//        if (split.length > 1) {
//            lastName = split[1].trim().toLowerCase();
//        }
//        return ((BigInteger) sessionFactory.getCurrentSession().createSQLQuery("SELECT count(*) FROM users WHERE (first_name LIKE lower(:firstName) AND last_name LIKE lower(:lastName)) OR (first_name LIKE lower(:lastName) AND last_name LIKE lower(:firstName))")
//                .setParameter("firstName", "%" + firstName + "%").setParameter("lastName", "%" + lastName + "%").uniqueResult()).intValue();
//    }
//
//    @Override
//    @SuppressWarnings("unchecked")
//    public List<Passenger> searchByNameSublist(String search, int offset, int amount) {
//        String[] split = search.split(" ");
//        String firstName = split[0].trim().toLowerCase();
//        String lastName = "";
//        if (split.length > 1) {
//            lastName = split[1].trim().toLowerCase();
//        }
//        return sessionFactory.getCurrentSession().createSQLQuery("SELECT * FROM users WHERE (first_name LIKE lower(:firstName) AND last_name LIKE lower(:lastName)) OR (first_name LIKE lower(:lastName) AND last_name LIKE lower(:firstName)) LIMIT :offset, :amount")
//                .addEntity(Passenger.class).setParameter("firstName", "%" + firstName + "%").setParameter("lastName", "%" + lastName + "%")
//                .setParameter("offset", offset).setParameter("amount", amount).list();
//    }
//
//    @Override
//    public Boolean hasPrivateBlog(int idUser) {
//        return ((Byte) sessionFactory.getCurrentSession().createSQLQuery("SELECT visibility FROM users WHERE id_user = :idUser")
//                .setParameter("idUser", idUser).uniqueResult()).intValue() == PRIVATE.ordinal();
//    }
}

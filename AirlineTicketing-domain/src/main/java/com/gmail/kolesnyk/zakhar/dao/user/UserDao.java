package com.gmail.kolesnyk.zakhar.dao.user;

import com.gmail.kolesnyk.zakhar.dao.BaseDao;
import com.gmail.kolesnyk.zakhar.dao.AbstractDao;

import java.util.List;

/**
 * The {@code UserDao} class DAO for entity {@link User}
 *
 * @author Kolesnyk Zakhar
 * @see AbstractDao
 * @see com.gmail.kolesnyk.zakhar.dao.user.UserDaoImpl
 * @since JDK1.8
 */
public interface UserDao extends BaseDao<User, Integer> {

//    /**
//     * method allow to get example of user {@link User} by it phone number
//     *
//     * @param phone phone number
//     * @return {@link User} example of user
//     */
//    User selectByPhone(String phone);
//
//    /**
//     * method allow to get example of user {@link User} by it email address
//     *
//     * @param email email address
//     * @return {@link User} example of user
//     */
//    User selectByEmail(String email);
//
//    /**
//     * method allow to get example of user {@link User} by unique hash string for confirming email address
//     *
//     * @param hashForEmail hash for confirming email
//     * @return {@link User} example of user
//     */
//    User byHashForEmail(String hashForEmail);
//
//    /**
//     * method allow to get example of user {@link User} by it login
//     *
//     * @param login logn of User
//     * @return {@link User} example of user
//     */
//    User selectByLogin(String login);
//
//    /**
//     * method allow to get list of all Friends {@link User} by ID of User
//     *
//     * @param idUser ID User
//     * @return {@link List<User>} list of Friends
//     */
//    List<User> friendList(Integer idUser);
//
//    /**
//     * method allow to get amount of Friends {@link User} by ID of User
//     *
//     * @param idUser ID User
//     * @return {@link Integer} amount of Friends
//     */
//    Integer amountFriends(Integer idUser);
//
//    /**
//     * method allow to get sublist of Friends {@link User} by ID of User
//     *
//     * @param idUser ID User
//     * @return {@link List<User>} list of Friends
//     */
//    List<User> friendSublist(Integer idUser, int offset, int amount);
//
//    /**
//     * method allow to save hash string for confirming email address by ID of User and hash string
//     *
//     * @param hashForEmail hash String
//     * @param idUser       ID User
//     */
//    void saveHashForEmail(String hashForEmail, Integer idUser);
//
//    /**
//     * method allow to remove {@link User} User that discard confirming email,
//     * by hash string for confirming email address
//     *
//     * @param hashForEmail hash String
//     * @return {@link Boolean} true if removing User successful, and false if removing not happens
//     */
//    Boolean removeUserByHashForEmail(String hashForEmail);
//
//    /**
//     * method allow to remove hash string for confirming email address by hash string
//     *
//     * @param hashForEmail hash String
//     * @return {@link Boolean} true if removing hash string successful, and false if removing not happens
//     */
//    Boolean removeHashForEmail(String hashForEmail);
//
//    /**
//     * method allow to save hash string for restoring password by hash string and ID User
//     *
//     * @param hashForPassword hash string for restoring password
//     * @param idUser          ID User
//     * @return {@link Boolean} true if saving hash string successful, and false if removing not happens
//     */
//    Boolean saveHashForPassword(String hashForPassword, Integer idUser);
//
//    /**
//     * method allow to remove hash string for restoring password by hash string
//     *
//     * @param hashForPassword hash for restoring password
//     * @return {@link Boolean} true if removing hash string successful, and false if removing not happens
//     */
//    Boolean removeRestorePassword(String hashForPassword);
//
//    /**
//     * method allow to find users {@link User} by it first and last names.
//     * means: expected character sequence of first name and last name separated by space,
//     * ticket of names (first or last) not important
//     *
//     * @param search string for searching
//     * @return {@link List<User>} list of founded users
//     * @see UserDao#amountFoundUsers(String)
//     * @see UserDao#searchByNameSublist(String, int, int)
//     */
//    List<User> searchByName(String search);
//
//    /**
//     * method allow to know that two users friends or not
//     *
//     * @param idCurrentUser ID User
//     * @param idUser        ID assumed Friend
//     * @return {@link Boolean} true if two users is friends, false if it not
//     */
//    Boolean isFriends(int idCurrentUser, int idUser);
//
//    /**
//     * method allow to add Friend to User by their IDs
//     *
//     * @param idCurrentUser ID User
//     * @param idUser        ID future Friend
//     */
//    void addFriend(int idCurrentUser, int idUser);
//
//    /**
//     * method allow to remove friendship between two users by their IDs
//     *
//     * @param idCurrentUser ID User
//     * @param idUser        ID future Friend
//     */
//    void removeFriendship(int idCurrentUser, int idUser);
//
//    /**
//     * method allow to know that current user invited second user for friendship
//     *
//     * @param idCurrentUser ID User
//     * @param idUser        ID second User
//     * @return {@link Boolean} true if current User has invite second User for friendship, false if it not
//     */
//    Boolean isInvitedForFriendship(int idCurrentUser, int idUser);
//
//    /**
//     * method allow save inviting of current User for second User
//     *
//     * @param idCurrentUser ID User
//     * @param idUser        ID second User
//     */
//    void inviteForFriendship(int idCurrentUser, int idUser);
//
//    /**
//     * method allow get amount of invitations for User
//     *
//     * @param idUser ID User
//     * @return {@link Integer} amount of invitations
//     */
//    Integer amountOfInvitations(int idUser);
//
//    /**
//     * method allow get list of Users {@link User} that invited for friendship current User
//     *
//     * @param idUser ID User
//     * @return {@link List<User>} list of Users
//     */
//    List<User> listInvitationsForFriendship(int idUser);
//
//    /**
//     * method allow get remove of invitation for friendship from current User to second User
//     *
//     * @param idCurrentUser ID User
//     * @param idUser        ID second User
//     */
//    void removeInvitationForFriendship(int idCurrentUser, int idUser);
//
//    /**
//     * method allow get amount of founded Users by string for search
//     * means: expected character sequence of first name and last name separated by space,
//     * ticket of names (first or last) not important
//     *
//     * @param search String for search users
//     * @return {@link Integer} amount of founded users
//     * @see UserDao#searchByName(String)
//     * @see UserDao#searchByNameSublist(String, int, int)
//     */
//    Integer amountFoundUsers(String search);
//
//    /**
//     * method allow get sublist of founded Users by string for search, offset and amount
//     * means: expected character sequence of first name and last name separated by space,
//     * ticket of names (first or last) not important
//     *
//     * @param search String for search users
//     * @param offset offset
//     * @param amount amount of users
//     * @return {@link Integer} sublist of founded Users
//     * @see UserDao#searchByName(String)
//     * @see UserDao#amountFoundUsers(String)
//     */
//    List<User> searchByNameSublist(String search, int offset, int amount);
//
//    /**
//     * method allow know that User has private blog
//     *
//     * @param idUser ID User
//     * @return {@link Integer} true if User has private blog, and false if user has public blog
//     */
//    Boolean hasPrivateBlog(int idUser);
}

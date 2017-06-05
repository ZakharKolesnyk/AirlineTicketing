package com.gmail.kolesnyk.zakhar.dao.passenger;

import com.gmail.kolesnyk.zakhar.dao.BaseDao;
import com.gmail.kolesnyk.zakhar.dao.AbstractDao;

/**
 * The {@code PassengerDao} class DAO for entity {@link Passenger}
 *
 * @author Kolesnyk Zakhar
 * @see AbstractDao
 * @see com.gmail.kolesnyk.zakhar.dao.passenger.PassengerDao
 * @since JDK1.8
 */
public interface PassengerDao extends BaseDao<Passenger, Integer> {

//    /**
//     * method allow to get example of passenger {@link Passenger} by it phone number
//     *
//     * @param phone phone number
//     * @return {@link Passenger} example of passenger
//     */
//    Passenger selectByPhone(String phone);
//
//    /**
//     * method allow to get example of passenger {@link Passenger} by it email address
//     *
//     * @param email email address
//     * @return {@link Passenger} example of passenger
//     */
//    Passenger selectByEmail(String email);
//
//    /**
//     * method allow to get example of passenger {@link Passenger} by unique hash string for confirming email address
//     *
//     * @param hashForEmail hash for confirming email
//     * @return {@link Passenger} example of passenger
//     */
//    Passenger byHashForEmail(String hashForEmail);
//
//    /**
//     * method allow to get example of passenger {@link Passenger} by it login
//     *
//     * @param login logn of Passenger
//     * @return {@link Passenger} example of passenger
//     */
//    Passenger selectByLogin(String login);
//
//    /**
//     * method allow to get list of all Friends {@link Passenger} by ID of Passenger
//     *
//     * @param idUser ID Passenger
//     * @return {@link List<Passenger>} list of Friends
//     */
//    List<Passenger> friendList(Integer idUser);
//
//    /**
//     * method allow to get amount of Friends {@link Passenger} by ID of Passenger
//     *
//     * @param idUser ID Passenger
//     * @return {@link Integer} amount of Friends
//     */
//    Integer amountFriends(Integer idUser);
//
//    /**
//     * method allow to get sublist of Friends {@link Passenger} by ID of Passenger
//     *
//     * @param idUser ID Passenger
//     * @return {@link List<Passenger>} list of Friends
//     */
//    List<Passenger> friendSublist(Integer idUser, int offset, int amount);
//
//    /**
//     * method allow to save hash string for confirming email address by ID of Passenger and hash string
//     *
//     * @param hashForEmail hash String
//     * @param idUser       ID Passenger
//     */
//    void saveHashForEmail(String hashForEmail, Integer idUser);
//
//    /**
//     * method allow to remove {@link Passenger} Passenger that discard confirming email,
//     * by hash string for confirming email address
//     *
//     * @param hashForEmail hash String
//     * @return {@link Boolean} true if removing Passenger successful, and false if removing not happens
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
//     * method allow to save hash string for restoring password by hash string and ID Passenger
//     *
//     * @param hashForPassword hash string for restoring password
//     * @param idUser          ID Passenger
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
//     * method allow to find users {@link Passenger} by it first and last names.
//     * means: expected character sequence of first name and last name separated by space,
//     * ticket of names (first or last) not important
//     *
//     * @param search string for searching
//     * @return {@link List<Passenger>} list of founded users
//     * @see PassengerDao#amountFoundUsers(String)
//     * @see PassengerDao#searchByNameSublist(String, int, int)
//     */
//    List<Passenger> searchByName(String search);
//
//    /**
//     * method allow to know that two users friends or not
//     *
//     * @param idCurrentUser ID Passenger
//     * @param idUser        ID assumed Friend
//     * @return {@link Boolean} true if two users is friends, false if it not
//     */
//    Boolean isFriends(int idCurrentUser, int idUser);
//
//    /**
//     * method allow to add Friend to Passenger by their IDs
//     *
//     * @param idCurrentUser ID Passenger
//     * @param idUser        ID future Friend
//     */
//    void addFriend(int idCurrentUser, int idUser);
//
//    /**
//     * method allow to remove friendship between two users by their IDs
//     *
//     * @param idCurrentUser ID Passenger
//     * @param idUser        ID future Friend
//     */
//    void removeFriendship(int idCurrentUser, int idUser);
//
//    /**
//     * method allow to know that current passenger invited second passenger for friendship
//     *
//     * @param idCurrentUser ID Passenger
//     * @param idUser        ID second Passenger
//     * @return {@link Boolean} true if current Passenger has invite second Passenger for friendship, false if it not
//     */
//    Boolean isInvitedForFriendship(int idCurrentUser, int idUser);
//
//    /**
//     * method allow save inviting of current Passenger for second Passenger
//     *
//     * @param idCurrentUser ID Passenger
//     * @param idUser        ID second Passenger
//     */
//    void inviteForFriendship(int idCurrentUser, int idUser);
//
//    /**
//     * method allow get amount of invitations for Passenger
//     *
//     * @param idUser ID Passenger
//     * @return {@link Integer} amount of invitations
//     */
//    Integer amountOfInvitations(int idUser);
//
//    /**
//     * method allow get list of Users {@link Passenger} that invited for friendship current Passenger
//     *
//     * @param idUser ID Passenger
//     * @return {@link List<Passenger>} list of Users
//     */
//    List<Passenger> listInvitationsForFriendship(int idUser);
//
//    /**
//     * method allow get remove of invitation for friendship from current Passenger to second Passenger
//     *
//     * @param idCurrentUser ID Passenger
//     * @param idUser        ID second Passenger
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
//     * @see PassengerDao#searchByName(String)
//     * @see PassengerDao#searchByNameSublist(String, int, int)
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
//     * @see PassengerDao#searchByName(String)
//     * @see PassengerDao#amountFoundUsers(String)
//     */
//    List<Passenger> searchByNameSublist(String search, int offset, int amount);
//
//    /**
//     * method allow know that Passenger has private blog
//     *
//     * @param idUser ID Passenger
//     * @return {@link Integer} true if Passenger has private blog, and false if passenger has public blog
//     */
//    Boolean hasPrivateBlog(int idUser);
}

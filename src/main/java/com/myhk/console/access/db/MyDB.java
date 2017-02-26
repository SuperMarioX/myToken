package com.myhk.console.access.db;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.util.StringUtils;

import java.util.Date;

/**
 * Created by Victor on 26/02/2017.
 */

public class MyDB {

    private SessionFactory factory;
    private Session session;

    // 1 check aksk
    public AKSKState getAKSKState(String userId) {
        if (!StringUtils.isEmpty(userId)) {
            AKSKInfo akskInfo = (AKSKInfo) session.get(AKSKInfo.class, userId);
            if (akskInfo != null) {
                if (akskInfo.getExpired().getTime() < new Date().getTime()) {
                    return AKSKState.AKSK_EXIST;
                } else {
                    return AKSKState.AKSK_EXPIRED;
                    // update the old one
                    // generate a new
                }
            } else {
                return AKSKState.AKSK_NOT_EXIST;
            }

        }

        return null;
    }


    // 2 generate aksk
    public String generateAKSK(String payload) {
        return null;
    }

    // 3 handle aksk
    private void handleAKSKData(AKSKState state) {
        if (state != null) {
            switch (state) {
                case AKSK_EXIST:
                    break;
                case AKSK_EXPIRED:
                    generateAKSK("dd");
                    //update aksk
                    break;
                case AKSK_NOT_EXIST:
                    generateAKSK("dd");
                    //insert aksk
                    break;

            }

        } else {

        }

    }


    // 4 update aksk
    private void updateAKSK() {
        IOlmsDao personDao;
        personDao.update(AKSKInfo);

    }

    // 5 insert aksk
    private void insertAKSK() {
        IOlmsDao personDao;
        personDao.create();
    }



    //
    session.beginTransaction();
    Query query = session.createQuery("update Teacher t set t.name='Toms' where t.id=5");
    query.executeUpdate();
    session.getTransaction().commit();











    

    private AKSKInfo queryAKSKByUserId(String userId) {
        if (!StringUtils.isEmpty(userId)) {
            AKSKInfo akskInfo = (AKSKInfo) session.get(AKSKInfo.class, userId);
            return akskInfo;
        }
    }

    private Session getSession() {
        return factory.getCurrentSession();
    }
}

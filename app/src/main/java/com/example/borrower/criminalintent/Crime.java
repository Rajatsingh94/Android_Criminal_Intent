package com.example.borrower.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by borrower on 12/4/17.
 */

public class Crime {

    private UUID id;
    private String mtitle;
    private boolean mcrimesolvedcheckbox;

    public boolean isMcrimesolvedcheckbox() {
        return mcrimesolvedcheckbox;
    }

    public void setMcrimesolvedcheckbox(boolean mcrimesolvedcheckbox) {
        this.mcrimesolvedcheckbox = mcrimesolvedcheckbox;
    }

    public Date getMdate() {
        return mdate;
    }

    public void setMdate(Date mdate) {
        this.mdate = mdate;
    }

    private Date mdate;

    public Crime() {
        id= UUID.randomUUID();
        mdate= new Date();


    }

    public UUID getId() {

        return id;
    }



    public String getMtitle() {
        return mtitle;
    }

    public void setMtitle(String mtitle) {
        this.mtitle = mtitle;
    }
}

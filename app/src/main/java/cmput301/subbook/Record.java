package cmput301.subbook;

import java.util.Date;

/**
 * Record
 * Version 1.0
 * Copyright © 2018 CMPUT301, University of Alberta - All Rights Reserved.
 * You may use distribute or modify this code under terms and conditions of the code of Student Behaviour.
 * at University of Alberta.
 * @name: Shardul Shah
 * You can find a copy of the license in this project. Otherwise please contact shardul@ualberta.ca*
 * @date:  2/4/2018
 */

public class Record {
    private String name;
    private String date;
    private Double monthly_charge;
    private String comment;

    /**
     * this is the class constructor
     * @param name: name of the subscription
     * @param monthly_charge: monthly charge of the subscription
     * @param comment: comment associated with the subscription
     * @param date: date of subscription
     */
    Record(String name, Double monthly_charge, String comment, String date)
    {
        this.name = name;
        this.monthly_charge = monthly_charge;
        this.comment = comment;
        this.date = date;
    }

    /**
     * getsName
     * @returns Name of a subscription
     */
    public String getName()
    {
        return name;
    }

    /**
     * getsDate
     * @returns Date of a subscription
     */

    public String getDate()
    {
        return date;
    }

    /**
     * getsMonthlyCharge
     * @returns Monthly charge of a subscription
     */

    public Double getMonthlyCharge()
    {
        return monthly_charge;
    }

    /**
     * getsComment
     * @returns Comment associated with a subscription
     */

    public String getComment()
    {
        return comment;
    }

    /**
     * recommend format of date entry: YYYY/MM/DD
     * @param: Date of subscription to be set to
     */
    public void setDate(String date)
    {
        this.date = date;
    }

    /**
     * length of name can only be 19 characters or less.
     * @param: the new name of subscription to be set to
     */
    public void setName(String name)
    {
        if (name.length() < 20)
        {
            this.name = name;
        }

        else
        {
            //do nothing and throw an exception
            // throw new NameTooLongException;
        }

    }

    /**
     * length of comment can only be 29 characters or less
     * @param comment: the new comment to be added to the subscription
     */
    public void setComment(String comment)
    {
        if (comment.length() < 30)
        {
            this.comment = comment;
        }

        else
        {
            //throw new Exception
        }
    }

    /**
     *
     * @param amnt: amnt is simply the monthly_charge; amnt = new monthly_charge of subs.
     */

    public void setMonthly_charge(Double amnt)
    {
        this.monthly_charge = amnt;
    }

}

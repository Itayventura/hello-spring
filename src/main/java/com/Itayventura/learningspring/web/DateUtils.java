/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.Itayventura.learningspring.web;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//do not mimic this class
public class DateUtils {
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-mm-dd");
    static Date createDateFromDateString(String dateString){
        Date date = null;
        if (dateString != null){
            try{
                date = DATE_FORMAT.parse(dateString);
            } catch (ParseException pr){
                date = new Date();
            }
        } else{
            date = new Date();
        }
        return date;
    }
}

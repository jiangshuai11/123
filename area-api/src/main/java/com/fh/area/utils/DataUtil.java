package com.fh.area.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {

    public static final String Y_D_M="yyyy-MM-dd";

    public static String dataToString(Date data,String format){
        SimpleDateFormat sim = new SimpleDateFormat(format);
        String stringData = sim.format(data);
        return stringData;
    }

    public static Date StringToData(String str,String format){
        SimpleDateFormat sim = new SimpleDateFormat(format);
        try {
            Date parse = sim.parse(str);
            return parse;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

}

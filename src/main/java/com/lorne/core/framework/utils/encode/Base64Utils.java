package com.lorne.core.framework.utils.encode;


import java.util.Base64;

/**
 * Created by yuliang on 2015/11/13.
 */
public class Base64Utils {



    public static String encode(byte[] bs){
        return Base64.getEncoder().encodeToString(bs);
    }

    public static byte[] decode(String str){
        return Base64.getDecoder().decode(str);
    }


}

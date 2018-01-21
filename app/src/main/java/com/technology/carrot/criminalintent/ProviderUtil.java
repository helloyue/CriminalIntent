package com.technology.carrot.criminalintent;

import android.content.Context;

/**
 * Created by Administrator on 2018/1/21.
 */

public class ProviderUtil {

        public static String getFileProviderName(Context context){
            return context.getPackageName()+".provider";
        }

}

package com.example.testlibrary;

import android.content.Context;
import android.widget.Toast;

public class Util {
    public static void print(Context context,String msg){
        Toast.makeText(context,msg,Toast.LENGTH_SHORT).show();
    }
}

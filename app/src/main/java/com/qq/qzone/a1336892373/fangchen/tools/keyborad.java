package com.qq.qzone.a1336892373.fangchen.tools;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;

public class keyborad {

    public static void kai(Button button){
        InputMethodManager imm = (InputMethodManager) button.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(0, InputMethodManager.SHOW_FORCED);
    }

    public static void close(Button button){
        InputMethodManager inputMethodManager = (InputMethodManager)button.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(button.getWindowToken(), 0);
    }

}

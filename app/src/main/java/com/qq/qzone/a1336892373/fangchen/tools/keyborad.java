package com.qq.qzone.a1336892373.fangchen.tools;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public class keyborad {

    public static void kai(EditText editText){
        editText.requestFocus();
        InputMethodManager imm = (InputMethodManager) editText.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(0, InputMethodManager.SHOW_FORCED);
    }

}

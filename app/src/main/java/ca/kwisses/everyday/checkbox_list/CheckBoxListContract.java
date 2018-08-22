package ca.kwisses.everyday.checkbox_list;

import android.widget.CheckBox;

import java.util.List;

public interface CheckBoxListContract {

    interface Handler {

        List<CheckBox> getCheckBoxList();

        void setCheckBoxList(List<CheckBox> checkBoxList);

    }
}

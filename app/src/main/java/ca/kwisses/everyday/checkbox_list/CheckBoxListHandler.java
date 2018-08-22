package ca.kwisses.everyday.checkbox_list;

import android.view.View;
import android.widget.CheckBox;

import java.util.ArrayList;
import java.util.List;

import ca.kwisses.everyday.R;

import static android.view.View.INVISIBLE;

public class CheckBoxListHandler implements CheckBoxListContract.Handler {

    private View view;
    private List<CheckBox> checkBoxList;

    private final int SIZE_LIMIT = 5;

    public CheckBoxListHandler(View view) {
        checkBoxList = new ArrayList<>();
        initCheckBoxList(view);
        setInvisible();
    }

    @Override
    public void initCheckBoxList(View view) {
        checkBoxList.add((CheckBox) view.findViewById(R.id.checkBox1));
        checkBoxList.add((CheckBox) view.findViewById(R.id.checkBox2));
        checkBoxList.add((CheckBox) view.findViewById(R.id.checkBox3));
        checkBoxList.add((CheckBox) view.findViewById(R.id.checkBox4));
        checkBoxList.add((CheckBox) view.findViewById(R.id.checkBox5));
    }

    @Override
    public void setInvisible() {
        for(CheckBox checkBox: checkBoxList) {
            checkBox.setVisibility(INVISIBLE);
        }
    }

    @Override
    public boolean hasInvisibleCheckBox() {
        for (CheckBox checkBox: checkBoxList) {
            if(!checkBox.isOpaque()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public CheckBox getNextInvisibleCheckBox() {
        for (CheckBox checkBox: checkBoxList) {
            if(checkBox.getVisibility() == INVISIBLE) {
                return checkBox;
            }
        }
        return null;
    }

    @Override
    public List<CheckBox> getCheckBoxList() {
        return checkBoxList;
    }

}

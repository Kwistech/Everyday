package ca.kwisses.everyday.listeners;

import android.content.Context;
import android.view.View;

public interface ListenerContract {

    interface Header extends View.OnClickListener{
        void onOptionsMenuClick(View view, Context context);
        Context getContext();
        void setContext(Context context);
    }

    interface _List extends View.OnClickListener{
        void onCheckBoxClick(View view);
    }

    interface Menu extends View.OnClickListener{
        void onMenuChoiceClick(View view);
    }

    interface OptionsMenu extends View.OnClickListener{
        void onOptionsMenuChoiceClick(View view);
    }

}

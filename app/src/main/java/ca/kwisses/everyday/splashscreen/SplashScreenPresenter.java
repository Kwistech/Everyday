package ca.kwisses.everyday.splashscreen;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import ca.kwisses.everyday.R;
import ca.kwisses.everyday.main.MainActivity;

public class SplashScreenPresenter extends Thread implements SplashscreenContract.Presenter {

    private Context context;

    SplashScreenPresenter(Context context) {
        this.context = context;
    }

    @Override
    public int getContentView() {
        return R.layout.activity_splashscreen;
    }

    @Override
    public Intent getIntent() {
        return new Intent(context, MainActivity.class);
    }

    @Override
    public void run() {
        Intent intent = getIntent();

        try {
            sleep(1000); // shows splashscreen
            context.startActivity(intent);
            Activity activity = (Activity) context;
            activity.finish();
        } catch(ClassCastException e) {
            throw new ClassCastException();
        } catch(NullPointerException e) {
            throw new NullPointerException();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

package com.ngyb.newfeaturesfive.action.cutto;

import android.animation.Animator;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.ColorRes;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.transition.ArcMotion;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;

import com.ngyb.newfeaturesfive.R;

/**
 * 作者：南宫燚滨
 * 描述：
 * 邮箱：nangongyibin@gmail.com
 * 日期：2020/2/27 18:17
 */
public class ShareElementActivity extends AppCompatActivity {

    private FrameLayout root;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_element);
        root = findViewById(R.id.root);
        ChangeBounds changeBounds = null;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                changeBounds = new ChangeBounds();
                changeBounds.setPathMotion(new ArcMotion());
                changeBounds.addListener(transitionListener);
                getWindow().setSharedElementEnterTransition(changeBounds);
            }
        }
    }

    private Transition.TransitionListener transitionListener = new Transition.TransitionListener() {
        @Override
        public void onTransitionStart(Transition transition) {

        }

        @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
        @Override
        public void onTransitionEnd(Transition transition) {
            animateRevealColorFromCoordinates(root,R.color.colorAccent);
        }

        @Override
        public void onTransitionCancel(Transition transition) {

        }

        @Override
        public void onTransitionPause(Transition transition) {

        }

        @Override
        public void onTransitionResume(Transition transition) {

        }
    };

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private Animator animateRevealColorFromCoordinates(ViewGroup viewGroup, @ColorRes int color){
        float finalRadius = Math.max(root.getWidth(), root.getHeight());
        int x =root.getWidth() /2;
        int y = root.getHeight()/2;
        Animator anim = ViewAnimationUtils.createCircularReveal(root, x, y, 0, finalRadius);
        viewGroup.setBackgroundColor(ContextCompat.getColor(this,color));
        anim.setDuration(1000);
        anim.setInterpolator(new AccelerateDecelerateInterpolator());
        anim.start();
        return anim;
    }
}

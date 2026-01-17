package com.daimajia.androidanimations.library.attention;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import com.daimajia.androidanimations.library.BaseViewAnimator;

public class SwingAnimator extends BaseViewAnimator {
    public void prepare(View view) {
        getAnimatorAgent().playTogether(new Animator[]{ObjectAnimator.ofFloat(view, "rotation", new float[]{0.0f, 10.0f, -10.0f, 6.0f, -6.0f, 3.0f, -3.0f, 0.0f})});
    }
}

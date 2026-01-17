package com.daimajia.androidanimations.library.attention;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import com.daimajia.androidanimations.library.BaseViewAnimator;

public class WobbleAnimator extends BaseViewAnimator {
    public void prepare(View view) {
        float width = (float) (((double) ((float) view.getWidth())) / 100.0d);
        float f = width * 0.0f;
        getAnimatorAgent().playTogether(new Animator[]{ObjectAnimator.ofFloat(view, "translationX", new float[]{f, -25.0f * width, 20.0f * width, -15.0f * width, 10.0f * width, width * -5.0f, f, 0.0f}), ObjectAnimator.ofFloat(view, "rotation", new float[]{0.0f, -5.0f, 3.0f, -3.0f, 2.0f, -1.0f, 0.0f})});
    }
}

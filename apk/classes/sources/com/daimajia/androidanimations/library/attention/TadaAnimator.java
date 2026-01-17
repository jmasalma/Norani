package com.daimajia.androidanimations.library.attention;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import com.daimajia.androidanimations.library.BaseViewAnimator;

public class TadaAnimator extends BaseViewAnimator {
    public void prepare(View view) {
        getAnimatorAgent().playTogether(new Animator[]{ObjectAnimator.ofFloat(view, "scaleX", new float[]{1.0f, 0.9f, 0.9f, 1.1f, 1.1f, 1.1f, 1.1f, 1.1f, 1.1f, 1.0f}), ObjectAnimator.ofFloat(view, "scaleY", new float[]{1.0f, 0.9f, 0.9f, 1.1f, 1.1f, 1.1f, 1.1f, 1.1f, 1.1f, 1.0f}), ObjectAnimator.ofFloat(view, "rotation", new float[]{0.0f, -3.0f, -3.0f, 3.0f, -3.0f, 3.0f, -3.0f, 3.0f, -3.0f, 0.0f})});
    }
}

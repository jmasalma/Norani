package com.daimajia.androidanimations.library.rotating_exits;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import com.daimajia.androidanimations.library.BaseViewAnimator;

public class RotateOutAnimator extends BaseViewAnimator {
    public void prepare(View view) {
        getAnimatorAgent().playTogether(new Animator[]{ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f}), ObjectAnimator.ofFloat(view, "rotation", new float[]{0.0f, 200.0f})});
    }
}

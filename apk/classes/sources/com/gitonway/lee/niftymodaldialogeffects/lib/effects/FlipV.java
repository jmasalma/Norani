package com.gitonway.lee.niftymodaldialogeffects.lib.effects;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;

public class FlipV extends BaseEffects {
    /* access modifiers changed from: protected */
    public void setupAnimation(View view) {
        getAnimatorSet().playTogether(new Animator[]{ObjectAnimator.ofFloat(view, "rotationX", new float[]{-90.0f, 0.0f}).setDuration(this.mDuration)});
    }
}

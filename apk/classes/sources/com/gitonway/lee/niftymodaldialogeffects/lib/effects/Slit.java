package com.gitonway.lee.niftymodaldialogeffects.lib.effects;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;

public class Slit extends BaseEffects {
    /* access modifiers changed from: protected */
    public void setupAnimation(View view) {
        getAnimatorSet().playTogether(new Animator[]{ObjectAnimator.ofFloat(view, "rotationY", new float[]{90.0f, 88.0f, 88.0f, 45.0f, 0.0f}).setDuration(this.mDuration), ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 0.4f, 0.8f, 1.0f}).setDuration((this.mDuration * 3) / 2), ObjectAnimator.ofFloat(view, "scaleX", new float[]{0.0f, 0.5f, 0.9f, 0.9f, 1.0f}).setDuration(this.mDuration), ObjectAnimator.ofFloat(view, "scaleY", new float[]{0.0f, 0.5f, 0.9f, 0.9f, 1.0f}).setDuration(this.mDuration)});
    }
}

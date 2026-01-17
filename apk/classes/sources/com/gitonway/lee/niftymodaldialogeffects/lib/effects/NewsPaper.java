package com.gitonway.lee.niftymodaldialogeffects.lib.effects;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;

public class NewsPaper extends BaseEffects {
    /* access modifiers changed from: protected */
    public void setupAnimation(View view) {
        getAnimatorSet().playTogether(new Animator[]{ObjectAnimator.ofFloat(view, "rotation", new float[]{1080.0f, 720.0f, 360.0f, 0.0f}).setDuration(this.mDuration), ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f}).setDuration((this.mDuration * 3) / 2), ObjectAnimator.ofFloat(view, "scaleX", new float[]{0.1f, 0.5f, 1.0f}).setDuration(this.mDuration), ObjectAnimator.ofFloat(view, "scaleY", new float[]{0.1f, 0.5f, 1.0f}).setDuration(this.mDuration)});
    }
}

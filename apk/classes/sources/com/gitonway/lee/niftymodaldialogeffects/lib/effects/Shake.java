package com.gitonway.lee.niftymodaldialogeffects.lib.effects;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;

public class Shake extends BaseEffects {
    /* access modifiers changed from: protected */
    public void setupAnimation(View view) {
        getAnimatorSet().playTogether(new Animator[]{ObjectAnimator.ofFloat(view, "translationX", new float[]{0.0f, 0.1f, -25.0f, 0.26f, 25.0f, 0.42f, -25.0f, 0.58f, 25.0f, 0.74f, -25.0f, 0.9f, 1.0f, 0.0f}).setDuration(this.mDuration)});
    }
}

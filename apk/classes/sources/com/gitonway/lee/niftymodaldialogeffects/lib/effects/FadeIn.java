package com.gitonway.lee.niftymodaldialogeffects.lib.effects;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;

public class FadeIn extends BaseEffects {
    /* access modifiers changed from: protected */
    public void setupAnimation(View view) {
        getAnimatorSet().playTogether(new Animator[]{ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f}).setDuration(this.mDuration)});
    }
}

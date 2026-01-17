package com.gitonway.lee.niftymodaldialogeffects.lib.effects;

import android.animation.AnimatorSet;
import android.view.View;

public abstract class BaseEffects {
    private static final int DURATION = 700;
    private AnimatorSet mAnimatorSet = new AnimatorSet();
    protected long mDuration = 700;

    /* access modifiers changed from: protected */
    public abstract void setupAnimation(View view);

    public void start(View view) {
        reset(view);
        setupAnimation(view);
        this.mAnimatorSet.start();
    }

    private void reset(View view) {
        view.setPivotX(((float) view.getMeasuredWidth()) / 2.0f);
        view.setPivotY(((float) view.getMeasuredHeight()) / 2.0f);
    }

    public AnimatorSet getAnimatorSet() {
        return this.mAnimatorSet;
    }

    public void setDuration(long j) {
        this.mDuration = j;
    }
}

package com.daimajia.easing.back;

import com.daimajia.easing.BaseEasingMethod;

public class BackEaseInOut extends BaseEasingMethod {
    private float s;

    public BackEaseInOut(float f) {
        super(f);
        this.s = 1.70158f;
    }

    public BackEaseInOut(float f, float f2) {
        this(f);
        this.s = f2;
    }

    public Float calculate(float f, float f2, float f3, float f4) {
        float f5 = f / (f4 / 2.0f);
        if (f5 < 1.0f) {
            float f6 = this.s;
            return Float.valueOf(((f3 / 2.0f) * f5 * f5 * (((1.0f + f6) * f5) - f6)) + f2);
        }
        float f7 = f5 - 2.0f;
        float f8 = this.s;
        return Float.valueOf(((f3 / 2.0f) * ((f7 * f7 * (((1.0f + f8) * f7) + f8)) + 2.0f)) + f2);
    }
}

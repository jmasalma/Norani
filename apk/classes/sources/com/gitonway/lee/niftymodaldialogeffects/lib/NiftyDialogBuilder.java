package com.gitonway.lee.niftymodaldialogeffects.lib;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.gitonway.lee.niftymodaldialogeffects.lib.effects.BaseEffects;

public class NiftyDialogBuilder extends Dialog implements DialogInterface {
    private static NiftyDialogBuilder instance = null;
    private static int mOrientation = 1;
    private static Context tmpContext;
    private final String defDialogColor = "#FFE74C3C";
    private final String defDividerColor = "#11000000";
    private final String defMsgColor = "#FFFFFFFF";
    private final String defTextColor = "#FFFFFFFF";
    /* access modifiers changed from: private */
    public boolean isCancelable = true;
    private Button mButton1;
    private Button mButton2;
    private View mDialogView;
    private View mDivider;
    private int mDuration = -1;
    private FrameLayout mFrameLayoutCustomView;
    private ImageView mIcon;
    private LinearLayout mLinearLayoutMsgView;
    private LinearLayout mLinearLayoutTopView;
    /* access modifiers changed from: private */
    public LinearLayout mLinearLayoutView;
    private TextView mMessage;
    private RelativeLayout mRelativeLayoutView;
    private TextView mTitle;
    /* access modifiers changed from: private */
    public Effectstype type = null;

    public NiftyDialogBuilder(Context context) {
        super(context);
        init(context);
    }

    public NiftyDialogBuilder(Context context, int i) {
        super(context, i);
        init(context);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.height = -1;
        attributes.width = -1;
        getWindow().setAttributes(attributes);
    }

    public static NiftyDialogBuilder getInstance(Context context) {
        return new NiftyDialogBuilder(context, R.style.dialog_untran);
    }

    private void init(Context context) {
        View inflate = View.inflate(context, R.layout.dialog_layout, (ViewGroup) null);
        this.mDialogView = inflate;
        this.mLinearLayoutView = (LinearLayout) inflate.findViewById(R.id.parentPanel);
        this.mRelativeLayoutView = (RelativeLayout) this.mDialogView.findViewById(R.id.main);
        this.mLinearLayoutTopView = (LinearLayout) this.mDialogView.findViewById(R.id.topPanel);
        this.mLinearLayoutMsgView = (LinearLayout) this.mDialogView.findViewById(R.id.contentPanel);
        this.mFrameLayoutCustomView = (FrameLayout) this.mDialogView.findViewById(R.id.customPanel);
        this.mTitle = (TextView) this.mDialogView.findViewById(R.id.alertTitle);
        this.mMessage = (TextView) this.mDialogView.findViewById(R.id.message);
        this.mIcon = (ImageView) this.mDialogView.findViewById(R.id.icon);
        this.mDivider = this.mDialogView.findViewById(R.id.titleDivider);
        this.mButton1 = (Button) this.mDialogView.findViewById(R.id.button1);
        this.mButton2 = (Button) this.mDialogView.findViewById(R.id.button2);
        setContentView(this.mDialogView);
        setOnShowListener(new DialogInterface.OnShowListener() {
            public void onShow(DialogInterface dialogInterface) {
                NiftyDialogBuilder.this.mLinearLayoutView.setVisibility(0);
                if (NiftyDialogBuilder.this.type == null) {
                    Effectstype unused = NiftyDialogBuilder.this.type = Effectstype.Slidetop;
                }
                NiftyDialogBuilder niftyDialogBuilder = NiftyDialogBuilder.this;
                niftyDialogBuilder.start(niftyDialogBuilder.type);
            }
        });
        this.mRelativeLayoutView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (NiftyDialogBuilder.this.isCancelable) {
                    NiftyDialogBuilder.this.dismiss();
                }
            }
        });
    }

    public void toDefault() {
        this.mTitle.setTextColor(Color.parseColor("#FFFFFFFF"));
        this.mDivider.setBackgroundColor(Color.parseColor("#11000000"));
        this.mMessage.setTextColor(Color.parseColor("#FFFFFFFF"));
        this.mLinearLayoutView.setBackgroundColor(Color.parseColor("#FFE74C3C"));
    }

    public NiftyDialogBuilder withDividerColor(String str) {
        this.mDivider.setBackgroundColor(Color.parseColor(str));
        return this;
    }

    public NiftyDialogBuilder withDividerColor(int i) {
        this.mDivider.setBackgroundColor(i);
        return this;
    }

    public NiftyDialogBuilder withTitle(CharSequence charSequence) {
        toggleView(this.mLinearLayoutTopView, charSequence);
        this.mTitle.setText(charSequence);
        return this;
    }

    public NiftyDialogBuilder withTitleColor(String str) {
        this.mTitle.setTextColor(Color.parseColor(str));
        return this;
    }

    public NiftyDialogBuilder withTitleColor(int i) {
        this.mTitle.setTextColor(i);
        return this;
    }

    public NiftyDialogBuilder withMessage(int i) {
        toggleView(this.mLinearLayoutMsgView, Integer.valueOf(i));
        this.mMessage.setText(i);
        return this;
    }

    public NiftyDialogBuilder withMessage(CharSequence charSequence) {
        toggleView(this.mLinearLayoutMsgView, charSequence);
        this.mMessage.setText(charSequence);
        return this;
    }

    public NiftyDialogBuilder withMessageColor(String str) {
        this.mMessage.setTextColor(Color.parseColor(str));
        return this;
    }

    public NiftyDialogBuilder withMessageColor(int i) {
        this.mMessage.setTextColor(i);
        return this;
    }

    public NiftyDialogBuilder withDialogColor(String str) {
        this.mLinearLayoutView.getBackground().setColorFilter(ColorUtils.getColorFilter(Color.parseColor(str)));
        return this;
    }

    public NiftyDialogBuilder withDialogColor(int i) {
        this.mLinearLayoutView.getBackground().setColorFilter(ColorUtils.getColorFilter(i));
        return this;
    }

    public NiftyDialogBuilder withIcon(int i) {
        this.mIcon.setImageResource(i);
        return this;
    }

    public NiftyDialogBuilder withIcon(Drawable drawable) {
        this.mIcon.setImageDrawable(drawable);
        return this;
    }

    public NiftyDialogBuilder withDuration(int i) {
        this.mDuration = i;
        return this;
    }

    public NiftyDialogBuilder withEffect(Effectstype effectstype) {
        this.type = effectstype;
        return this;
    }

    public NiftyDialogBuilder withButtonDrawable(int i) {
        this.mButton1.setBackgroundResource(i);
        this.mButton2.setBackgroundResource(i);
        return this;
    }

    public NiftyDialogBuilder withButton1Text(CharSequence charSequence) {
        this.mButton1.setVisibility(0);
        this.mButton1.setText(charSequence);
        return this;
    }

    public NiftyDialogBuilder withButton2Text(CharSequence charSequence) {
        this.mButton2.setVisibility(0);
        this.mButton2.setText(charSequence);
        return this;
    }

    public NiftyDialogBuilder setButton1Click(View.OnClickListener onClickListener) {
        this.mButton1.setOnClickListener(onClickListener);
        return this;
    }

    public NiftyDialogBuilder setButton2Click(View.OnClickListener onClickListener) {
        this.mButton2.setOnClickListener(onClickListener);
        return this;
    }

    public NiftyDialogBuilder setCustomView(int i, Context context) {
        View inflate = View.inflate(context, i, (ViewGroup) null);
        if (this.mFrameLayoutCustomView.getChildCount() > 0) {
            this.mFrameLayoutCustomView.removeAllViews();
        }
        this.mFrameLayoutCustomView.addView(inflate);
        this.mFrameLayoutCustomView.setVisibility(0);
        return this;
    }

    public NiftyDialogBuilder setCustomView(View view, Context context) {
        if (this.mFrameLayoutCustomView.getChildCount() > 0) {
            this.mFrameLayoutCustomView.removeAllViews();
        }
        this.mFrameLayoutCustomView.addView(view);
        this.mFrameLayoutCustomView.setVisibility(0);
        return this;
    }

    public NiftyDialogBuilder isCancelableOnTouchOutside(boolean z) {
        this.isCancelable = z;
        setCanceledOnTouchOutside(z);
        return this;
    }

    public NiftyDialogBuilder isCancelable(boolean z) {
        this.isCancelable = z;
        setCancelable(z);
        return this;
    }

    private void toggleView(View view, Object obj) {
        if (obj == null) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
        }
    }

    public void show() {
        super.show();
    }

    /* access modifiers changed from: private */
    public void start(Effectstype effectstype) {
        BaseEffects animator = effectstype.getAnimator();
        int i = this.mDuration;
        if (i != -1) {
            animator.setDuration((long) Math.abs(i));
        }
        animator.start(this.mRelativeLayoutView);
    }

    public void dismiss() {
        super.dismiss();
        this.mButton1.setVisibility(8);
        this.mButton2.setVisibility(8);
    }
}

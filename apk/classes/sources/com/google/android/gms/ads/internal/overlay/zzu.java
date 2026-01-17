package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzbde;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzu extends FrameLayout implements View.OnClickListener {
    /* access modifiers changed from: private */
    public final ImageButton zza;
    private final zzah zzb;

    public zzu(Context context, zzt zzt, zzah zzah) {
        super(context);
        this.zzb = zzah;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.zza = imageButton;
        zzc();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        zzbb.zzb();
        int zzC = zzf.zzC(context, zzt.zza);
        zzbb.zzb();
        int zzC2 = zzf.zzC(context, 0);
        zzbb.zzb();
        int zzC3 = zzf.zzC(context, zzt.zzb);
        zzbb.zzb();
        imageButton.setPadding(zzC, zzC2, zzC3, zzf.zzC(context, zzt.zzc));
        imageButton.setContentDescription("Interstitial close button");
        zzbb.zzb();
        int zzC4 = zzf.zzC(context, zzt.zzd + zzt.zza + zzt.zzb);
        zzbb.zzb();
        addView(imageButton, new FrameLayout.LayoutParams(zzC4, zzf.zzC(context, zzt.zzd + zzt.zzc), 17));
        long longValue = ((Long) zzbd.zzc().zzb(zzbde.zzbp)).longValue();
        if (longValue > 0) {
            zzs zzs = ((Boolean) zzbd.zzc().zzb(zzbde.zzbq)).booleanValue() ? new zzs(this) : null;
            imageButton.setAlpha(0.0f);
            imageButton.animate().alpha(1.0f).setDuration(longValue).setListener(zzs);
        }
    }

    private final void zzc() {
        String str = (String) zzbd.zzc().zzb(zzbde.zzbo);
        if (!PlatformVersion.isAtLeastLollipop() || TextUtils.isEmpty(str) || "default".equals(str)) {
            this.zza.setImageResource(17301527);
            return;
        }
        Resources zze = zzv.zzp().zze();
        if (zze != null) {
            Drawable drawable = null;
            try {
                if ("white".equals(str)) {
                    drawable = zze.getDrawable(R.drawable.admob_close_button_white_circle_black_cross);
                } else if ("black".equals(str)) {
                    drawable = zze.getDrawable(R.drawable.admob_close_button_black_circle_white_cross);
                }
            } catch (Resources.NotFoundException unused) {
                int i = zze.zza;
                zzo.zze("Close button resource not found, falling back to default.");
            }
            if (drawable == null) {
                this.zza.setImageResource(17301527);
                return;
            }
            ImageButton imageButton = this.zza;
            imageButton.setImageDrawable(drawable);
            imageButton.setScaleType(ImageView.ScaleType.CENTER);
            return;
        }
        this.zza.setImageResource(17301527);
    }

    public final void onClick(View view) {
        zzah zzah = this.zzb;
        if (zzah != null) {
            zzah.zzj();
        }
    }

    public final void zzb(boolean z) {
        if (z) {
            ImageButton imageButton = this.zza;
            imageButton.setVisibility(8);
            if (((Long) zzbd.zzc().zzb(zzbde.zzbp)).longValue() > 0) {
                imageButton.animate().cancel();
                imageButton.clearAnimation();
                return;
            }
            return;
        }
        this.zza.setVisibility(0);
    }
}

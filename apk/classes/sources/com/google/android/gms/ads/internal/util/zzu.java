package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbde;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public class zzu extends zzt {
    static final boolean zze(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    public final boolean zzd(Activity activity, Configuration configuration) {
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzfo)).booleanValue()) {
            return false;
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzfq)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        zzbb.zzb();
        int zzC = zzf.zzC(activity, configuration.screenHeightDp);
        int zzC2 = zzf.zzC(activity, configuration.screenWidthDp);
        zzv.zzr();
        DisplayMetrics zzu = zzs.zzu((WindowManager) activity.getApplicationContext().getSystemService("window"));
        int i = zzu.heightPixels;
        int i2 = zzu.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int round = ((int) Math.round(((double) activity.getResources().getDisplayMetrics().density) + 0.5d)) * ((Integer) zzbd.zzc().zzb(zzbde.zzfm)).intValue();
        if (!zze(i, zzC + dimensionPixelSize, round)) {
            return true;
        }
        if (zze(i2, zzC2, round)) {
            return false;
        }
        return true;
    }
}

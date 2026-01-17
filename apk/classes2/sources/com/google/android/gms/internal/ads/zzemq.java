package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzemq implements zzeuc {
    private final zzeuc zza;
    private final zzfcw zzb;
    private final Context zzc;
    private final zzbzs zzd;

    zzemq(zzeou zzeou, zzfcw zzfcw, Context context, zzbzs zzbzs) {
        this.zza = zzeou;
        this.zzb = zzfcw;
        this.zzc = context;
        this.zzd = zzbzs;
    }

    public static /* synthetic */ zzemr zzc(zzemq zzemq, zzeul zzeul) {
        boolean z;
        String str;
        String str2;
        int i;
        int i2;
        float f;
        int i3;
        Insets insets;
        int i4;
        Insets insets2;
        DisplayMetrics displayMetrics;
        zzemq zzemq2 = zzemq;
        zzfcw zzfcw = zzemq2.zzb;
        zzr zzr = zzfcw.zze;
        zzr[] zzrArr = zzr.zzg;
        if (zzrArr != null) {
            str = null;
            boolean z2 = false;
            boolean z3 = false;
            z = false;
            for (zzr zzr2 : zzrArr) {
                boolean z4 = zzr2.zzi;
                if (!z4 && !z2) {
                    str = zzr2.zza;
                    z2 = true;
                }
                if (z4) {
                    if (!z3) {
                        z3 = true;
                        z = true;
                    } else {
                        z3 = true;
                    }
                }
                if (z2 && z3) {
                    break;
                }
            }
        } else {
            str = zzr.zza;
            z = zzr.zzi;
        }
        Context context = zzemq2.zzc;
        Resources resources = context.getResources();
        Insets insets3 = Build.VERSION.SDK_INT >= 29 ? Insets.NONE : null;
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            str2 = null;
            f = 0.0f;
            i2 = 0;
            i = 0;
        } else {
            zzbzs zzbzs = zzemq2.zzd;
            float f2 = displayMetrics.density;
            int i5 = displayMetrics.widthPixels;
            int i6 = displayMetrics.heightPixels;
            str2 = zzbzs.zzi().zzj();
            f = f2;
            int i7 = i5;
            i = i6;
            i2 = i7;
        }
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zznH)).booleanValue() || Build.VERSION.SDK_INT < 35) {
            i3 = i;
            insets = insets3;
        } else {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager == null || f == 0.0f) {
                i3 = i;
                insets2 = Insets.NONE;
            } else {
                Insets insets4 = windowManager.getCurrentWindowMetrics().getWindowInsets().getInsets(WindowInsets.Type.statusBars() | WindowInsets.Type.displayCutout() | WindowInsets.Type.navigationBars() | WindowInsets.Type.captionBar());
                i3 = i;
                insets2 = Insets.of((int) Math.ceil((double) (((float) insets4.left) / f)), (int) Math.ceil((double) (((float) insets4.top) / f)), (int) Math.ceil((double) (((float) insets4.right) / f)), (int) Math.ceil((double) (((float) insets4.bottom) / f)));
            }
            insets = insets2;
        }
        StringBuilder sb = new StringBuilder();
        if (zzrArr != null) {
            boolean z5 = false;
            for (zzr zzr3 : zzrArr) {
                if (zzr3.zzi) {
                    z5 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    int i8 = zzr3.zze;
                    if (i8 == -1) {
                        i8 = f != 0.0f ? (int) (((float) zzr3.zzf) / f) : -1;
                    }
                    sb.append(i8);
                    sb.append("x");
                    int i9 = zzr3.zzb;
                    if (i9 == -2) {
                        i9 = f != 0.0f ? (int) (((float) zzr3.zzc) / f) : -2;
                    }
                    sb.append(i9);
                }
            }
            if (z5) {
                if (sb.length() != 0) {
                    i4 = 0;
                    sb.insert(0, "|");
                } else {
                    i4 = 0;
                }
                sb.insert(i4, "320x50");
            }
        }
        return new zzemr(zzr, str, z, sb.toString(), f, i2, i3, str2, zzfcw.zzq, insets);
    }

    public final int zza() {
        return 7;
    }

    public final ListenableFuture zzb() {
        return zzgdn.zzm(this.zza.zzb(), new zzemp(this), zzcaf.zzg);
    }
}

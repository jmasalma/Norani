package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzqu {
    private final Context zza;
    private Boolean zzb;

    public zzqu() {
        this((Context) null);
    }

    public zzqu(Context context) {
        this.zza = context == null ? null : context.getApplicationContext();
    }

    public final zzps zza(zzz zzz, zze zze) {
        int i;
        boolean z;
        zzz.getClass();
        zze.getClass();
        if (Build.VERSION.SDK_INT < 29 || (i = zzz.zzH) == -1) {
            return zzps.zza;
        }
        Context context = this.zza;
        Boolean bool = this.zzb;
        boolean z2 = false;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = zzcj.zzc(context).getParameters("offloadVariableRateSupported");
                this.zzb = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.zzb = false;
            }
            z = this.zzb.booleanValue();
        }
        String str = zzz.zzo;
        str.getClass();
        String str2 = str;
        int zza2 = zzay.zza(str, zzz.zzk);
        if (zza2 == 0 || Build.VERSION.SDK_INT < zzex.zzh(zza2)) {
            return zzps.zza;
        }
        int zzi = zzex.zzi(zzz.zzG);
        if (zzi == 0) {
            return zzps.zza;
        }
        try {
            AudioFormat zzx = zzex.zzx(i, zzi, zza2);
            if (Build.VERSION.SDK_INT >= 31) {
                int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(zzx, zze.zza().zza);
                if (playbackOffloadSupport == 0) {
                    return zzps.zza;
                }
                zzpq zzpq = new zzpq();
                if (Build.VERSION.SDK_INT > 32 && playbackOffloadSupport == 2) {
                    z2 = true;
                }
                zzpq.zza(true);
                zzpq.zzb(z2);
                zzpq.zzc(z);
                return zzpq.zzd();
            } else if (!AudioManager.isOffloadedPlaybackSupported(zzx, zze.zza().zza)) {
                return zzps.zza;
            } else {
                zzpq zzpq2 = new zzpq();
                zzpq2.zza(true);
                zzpq2.zzc(z);
                return zzpq2.zzd();
            }
        } catch (IllegalArgumentException unused) {
            return zzps.zza;
        }
    }
}

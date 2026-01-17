package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfdt {
    public static void zza(Context context, boolean z) {
        if (z) {
            int i = zze.zza;
            zzo.zzi("This request is sent from a test device.");
            return;
        }
        zzbb.zzb();
        int i2 = zze.zza;
        zzo.zzi("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + zzf.zzD(context) + "\")) to get test ads on this device.");
    }

    public static void zzb(int i, Throwable th, String str) {
        int i2 = zze.zza;
        zzo.zzi("Ad failed to load : " + i);
        zze.zzb(str, th);
        if (i != 3) {
            zzv.zzp().zzv(th, str);
        }
    }
}

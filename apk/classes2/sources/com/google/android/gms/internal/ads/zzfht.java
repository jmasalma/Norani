package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfht {
    public static void zza(ListenableFuture listenableFuture, zzfhu zzfhu, zzfhj zzfhj) {
        zzg(listenableFuture, zzfhu, zzfhj, false);
    }

    public static void zzb(ListenableFuture listenableFuture, zzfhu zzfhu, zzfhj zzfhj) {
        zzg(listenableFuture, zzfhu, zzfhj, true);
    }

    public static void zzc(ListenableFuture listenableFuture, zzfhu zzfhu, zzfhj zzfhj) {
        if (((Boolean) zzbex.zzc.zze()).booleanValue()) {
            zzgdn.zzr(zzgde.zzw(listenableFuture), new zzfhs(zzfhu, zzfhj), zzcaf.zzg);
        }
    }

    public static void zzd(ListenableFuture listenableFuture, zzfhj zzfhj) {
        if (((Boolean) zzbex.zzc.zze()).booleanValue()) {
            zzgdn.zzr(zzgde.zzw(listenableFuture), new zzfhq(zzfhj), zzcaf.zzg);
        }
    }

    public static boolean zze(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) zzbd.zzc().zzb(zzbde.zzji), str);
    }

    public static int zzf(zzfcw zzfcw) {
        int zzg = zzaa.zzg(zzfcw) - 1;
        return (zzg == 0 || zzg == 1) ? 7 : 23;
    }

    private static void zzg(ListenableFuture listenableFuture, zzfhu zzfhu, zzfhj zzfhj, boolean z) {
        if (((Boolean) zzbex.zzc.zze()).booleanValue()) {
            zzgdn.zzr(zzgde.zzw(listenableFuture), new zzfhr(zzfhu, zzfhj, z), zzcaf.zzg);
        }
    }
}

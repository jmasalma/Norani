package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdxt implements zzdyw {
    /* access modifiers changed from: private */
    public static final Pattern zza = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzdwu zzb;
    private final zzgdy zzc;
    private final zzfcw zzd;
    private final ScheduledExecutorService zze;
    /* access modifiers changed from: private */
    public final zzeaw zzf;
    private final zzfhu zzg;
    private final Context zzh;

    zzdxt(Context context, zzfcw zzfcw, zzdwu zzdwu, zzgdy zzgdy, ScheduledExecutorService scheduledExecutorService, zzeaw zzeaw, zzfhu zzfhu) {
        this.zzh = context;
        this.zzd = zzfcw;
        this.zzb = zzdwu;
        this.zzc = zzgdy;
        this.zze = scheduledExecutorService;
        this.zzf = zzeaw;
        this.zzg = zzfhu;
    }

    public final ListenableFuture zzc(zzbvq zzbvq) {
        Context context = this.zzh;
        ListenableFuture zzc2 = this.zzb.zzc(zzbvq);
        zzfhj zza2 = zzfhi.zza(context, 11);
        zzfht.zzd(zzc2, zza2);
        ListenableFuture zzn = zzgdn.zzn(zzc2, new zzdxq(this), this.zzc);
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzfR)).booleanValue()) {
            zzbcv zzbcv = zzbde.zzfS;
            Class<TimeoutException> cls = TimeoutException.class;
            zzn = zzgdn.zzf(zzgdn.zzo(zzn, (long) ((Integer) zzbd.zzc().zzb(zzbcv)).intValue(), TimeUnit.SECONDS, this.zze), cls, new zzdxr(), zzcaf.zzg);
        }
        zzfht.zza(zzn, this.zzg, zza2);
        zzgdn.zzr(zzn, new zzdxs(this), zzcaf.zzg);
        return zzn;
    }
}

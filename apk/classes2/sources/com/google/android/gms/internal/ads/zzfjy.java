package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.client.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfjy {
    private final Context zza;
    private final Executor zzb;
    private final zzgdz zzc;
    /* access modifiers changed from: private */
    public final zzu zzd;
    private final zzfjq zze;
    /* access modifiers changed from: private */
    public final zzfhx zzf;

    zzfjy(Context context, Executor executor, zzgdz zzgdz, zzu zzu, zzfjq zzfjq, zzfhx zzfhx) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzgdz;
        this.zzd = zzu;
        this.zze = zzfjq;
        this.zzf = zzfhx;
    }

    public final void zzd(String str, zzv zzv, zzfhu zzfhu, zzcyi zzcyi) {
        ListenableFuture listenableFuture;
        zzfhj zzfhj = null;
        if (zzfhx.zza() && ((Boolean) zzbex.zzd.zze()).booleanValue()) {
            zzfhj = zzfhi.zza(this.zza, 14);
            zzfhj.zzi();
        }
        if (zzv != null) {
            listenableFuture = new zzfjp(zzv.zzb(), this.zzd, this.zzc, this.zze).zzd(str);
        } else {
            listenableFuture = this.zzc.zzb(new zzfjw(this, str));
        }
        zzgdn.zzr(listenableFuture, new zzfjx(this, zzfhj, zzfhu, zzcyi), this.zzb);
    }

    public final void zze(List list, zzv zzv) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzd((String) it.next(), zzv, (zzfhu) null, (zzcyi) null);
        }
    }
}

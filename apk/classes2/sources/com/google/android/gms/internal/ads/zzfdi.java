package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfdi {
    private final zzfca zza;
    private final zzfcd zzb;
    private final zzfjy zzc;
    private final zzfjq zzd;
    private final zzfhu zze;
    private final zzcmq zzf;

    public zzfdi(zzfjy zzfjy, zzfjq zzfjq, zzfca zzfca, zzfcd zzfcd, zzcmq zzcmq, zzfhu zzfhu) {
        this.zza = zzfca;
        this.zzb = zzfcd;
        this.zzc = zzfjy;
        this.zzd = zzfjq;
        this.zzf = zzcmq;
        this.zze = zzfhu;
    }

    public final void zza(List list, zzcyi zzcyi) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), 2, zzcyi);
        }
    }

    public final void zzb(String str, int i, zzcyi zzcyi) {
        zzfca zzfca = this.zza;
        if (!zzfca.zzai) {
            this.zzc.zzd(str, zzfca.zzax, this.zze, zzcyi);
            return;
        }
        this.zzd.zza(str, this.zzb.zzb, i);
    }

    public final void zzc(List list, int i) {
        ListenableFuture listenableFuture;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!((Boolean) zzbd.zzc().zzb(zzbde.zzkx)).booleanValue() || !zzcmq.zzj(str)) {
                listenableFuture = zzgdn.zzh(str);
            } else {
                listenableFuture = this.zzf.zze(str, zzbb.zze());
            }
            zzgdn.zzr(listenableFuture, new zzfdh(this, i), zzcaf.zza);
        }
    }
}

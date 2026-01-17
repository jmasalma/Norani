package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfdg implements zzgdj {
    final /* synthetic */ zzcfg zza;
    final /* synthetic */ zzcmq zzb;
    final /* synthetic */ zzfjy zzc;
    final /* synthetic */ zzeca zzd;

    zzfdg(zzcfg zzcfg, zzcmq zzcmq, zzfjy zzfjy, zzeca zzeca) {
        this.zza = zzcfg;
        this.zzb = zzcmq;
        this.zzc = zzfjy;
        this.zzd = zzeca;
    }

    public final void zza(Throwable th) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcmq zzcmq;
        String str = (String) obj;
        zzcfg zzcfg = this.zza;
        zzfca zzD = zzcfg.zzD();
        if (zzD == null || zzD.zzai) {
            zzfcd zzR = zzcfg.zzR();
            if (zzR == null) {
                zzv.zzp().zzw(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingClickGmsgHandler");
                return;
            }
            long currentTimeMillis = zzv.zzD().currentTimeMillis();
            boolean zzA = zzv.zzp().zzA(zzcfg.getContext());
            boolean z = false;
            boolean z2 = ((Boolean) zzbd.zzc().zzb(zzbde.zzgx)).booleanValue() && zzD != null && zzD.zzS;
            if (!(zzD == null || zzD.zzad == null)) {
                z = true;
            }
            this.zzd.zzd(new zzecc(currentTimeMillis, zzR.zzb, str, (zzA || z2 || z) ? 2 : 1));
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzv zzv = zzD.zzax;
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzkx)).booleanValue() || (zzcmq = this.zzb) == null || !zzcmq.zzj(str)) {
            this.zzc.zzd(str, zzv, (zzfhu) null, (zzcyi) null);
        } else {
            zzcmq.zzi(str, this.zzc, zzbb.zze(), zzv);
        }
    }
}

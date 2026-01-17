package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzenw implements zzeuc {
    final Context zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final zzcsq zze;
    private final zzfed zzf;
    private final zzfcw zzg;
    private final zzg zzh = zzv.zzp().zzi();
    private final zzdsd zzi;
    private final zzcte zzj;

    public zzenw(Context context, String str, String str2, zzcsq zzcsq, zzfed zzfed, zzfcw zzfcw, zzdsd zzdsd, zzcte zzcte, long j) {
        this.zza = context;
        this.zzb = str;
        this.zzc = str2;
        this.zze = zzcsq;
        this.zzf = zzfed;
        this.zzg = zzfcw;
        this.zzi = zzdsd;
        this.zzj = zzcte;
        this.zzd = j;
    }

    public final int zza() {
        return 12;
    }

    public final ListenableFuture zzb() {
        String str;
        Bundle bundle = new Bundle();
        zzdsd zzdsd = this.zzi;
        Map zzb2 = zzdsd.zzb();
        String str2 = this.zzb;
        zzb2.put("seq_num", str2);
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcq)).booleanValue()) {
            zzdsd.zzd("tsacc", String.valueOf(zzv.zzD().currentTimeMillis() - this.zzd));
            zzv.zzr();
            if (true != zzs.zzH(this.zza)) {
                str = "1";
            } else {
                str = "0";
            }
            zzdsd.zzd("foreground", str);
        }
        zzcsq zzcsq = this.zze;
        zzfcw zzfcw = this.zzg;
        zzcsq.zzk(zzfcw.zzd);
        bundle.putAll(this.zzf.zzb());
        Context context = this.zza;
        String str3 = this.zzc;
        zzg zzg2 = this.zzh;
        zzcte zzcte = this.zzj;
        return zzgdn.zzh(new zzenx(context, bundle, str2, str3, zzg2, zzfcw.zzf, zzcte));
    }
}

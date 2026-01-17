package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import java.util.Objects;
import java.util.regex.Matcher;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzdxs implements zzgdj {
    final /* synthetic */ zzdxt zza;

    zzdxs(zzdxt zzdxt) {
        Objects.requireNonNull(zzdxt);
        this.zza = zzdxt;
    }

    public final void zza(Throwable th) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzgv)).booleanValue()) {
            Matcher matcher = zzdxt.zza.matcher(th.getMessage());
            if (matcher.matches()) {
                this.zza.zzf.zzi(Integer.parseInt(matcher.group(1)));
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfcn zzfcn = (zzfcn) obj;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzgv)).booleanValue()) {
            zzdxt zzdxt = this.zza;
            zzeaw zza2 = zzdxt.zzf;
            zzfcd zzfcd = zzfcn.zzb.zzb;
            zza2.zzi(zzfcd.zzf);
            zzdxt.zzf.zzj(zzfcd.zzg);
        }
    }
}

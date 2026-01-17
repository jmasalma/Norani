package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzdum extends zzbmg {
    final /* synthetic */ Object zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfhj zzd;
    final /* synthetic */ zzcak zze;
    final /* synthetic */ zzdun zzf;

    zzdum(zzdun zzdun, Object obj, String str, long j, zzfhj zzfhj, zzcak zzcak) {
        this.zza = obj;
        this.zzb = str;
        this.zzc = j;
        this.zzd = zzfhj;
        this.zze = zzcak;
        Objects.requireNonNull(zzdun);
        this.zzf = zzdun;
    }

    public final void zze(String str) {
        synchronized (this.zza) {
            zzdun zzdun = this.zzf;
            String str2 = this.zzb;
            zzdun.zzv(str2, false, str, (int) (zzv.zzD().elapsedRealtime() - this.zzc));
            zzdun.zzl.zzb(str2, "error");
            zzdun.zzo.zzb(str2, "error");
            zzfhx zze2 = zzdun.zzp;
            zzfhj zzfhj = this.zzd;
            zzfhj.zzc(str);
            zzfhj.zzg(false);
            zze2.zzc(zzfhj.zzm());
            this.zze.zzc(false);
        }
    }

    public final void zzf() {
        synchronized (this.zza) {
            zzdun zzdun = this.zzf;
            String str = this.zzb;
            zzdun.zzv(str, true, "", (int) (zzv.zzD().elapsedRealtime() - this.zzc));
            zzdun.zzl.zzd(str);
            zzdun.zzo.zzd(str);
            zzfhx zze2 = zzdun.zzp;
            zzfhj zzfhj = this.zzd;
            zzfhj.zzg(true);
            zze2.zzc(zzfhj.zzm());
            this.zze.zzc(true);
        }
    }
}

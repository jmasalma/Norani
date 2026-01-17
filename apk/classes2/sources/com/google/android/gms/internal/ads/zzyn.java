package com.google.android.gms.internal.ads;

import kotlin.jvm.internal.IntCompanionObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzyn extends zzyp implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;

    public zzyn(int i, zzbm zzbm, int i2, zzyi zzyi, int i3, String str, String str2) {
        super(i, zzbm, i2);
        zzfyq zzfyq;
        int i4;
        int i5;
        int i6 = 0;
        this.zzf = zzmb.zza(i3, false);
        int i7 = this.zzd.zze;
        int i8 = zzyi.zzy;
        this.zzg = 1 == (i7 & 1);
        this.zzh = (i7 & 2) != 0;
        if (str2 != null) {
            zzfyq = zzfyq.zzo(str2);
        } else if (zzyi.zzv.isEmpty()) {
            zzfyq = zzfyq.zzo("");
        } else {
            zzfyq = zzyi.zzv;
        }
        int i9 = 0;
        while (true) {
            if (i9 >= zzfyq.size()) {
                i9 = IntCompanionObject.MAX_VALUE;
                i4 = 0;
                break;
            }
            boolean z = zzyi.zzz;
            i4 = zzyu.zzc(this.zzd, (String) zzfyq.get(i9), false);
            if (i4 > 0) {
                break;
            }
            i9++;
        }
        this.zzi = i9;
        this.zzj = i4;
        if (str2 != null) {
            i5 = 1088;
        } else {
            int i10 = zzyi.zzw;
            i5 = 0;
        }
        int zzb = zzyu.zzb(this.zzd.zzf, i5);
        this.zzk = zzb;
        this.zzm = (1088 & this.zzd.zzf) != 0;
        int zzc = zzyu.zzc(this.zzd, str, zzyu.zzh(str) == null);
        this.zzl = zzc;
        boolean z2 = i4 > 0 || (zzyi.zzv.isEmpty() && zzb > 0) || this.zzg || (this.zzh && zzc > 0);
        if (zzmb.zza(i3, zzyi.zzR) && z2) {
            i6 = 1;
        }
        this.zze = i6;
    }

    /* renamed from: zza */
    public final int compareTo(zzyn zzyn) {
        zzgab zzgab;
        zzfyf zzc = zzfyf.zzj().zzd(this.zzf, zzyn.zzf).zzc(Integer.valueOf(this.zzi), Integer.valueOf(zzyn.zzi), zzgab.zzc().zza());
        int i = this.zzj;
        zzfyf zzb = zzc.zzb(i, zzyn.zzj);
        int i2 = this.zzk;
        zzfyf zzd = zzb.zzb(i2, zzyn.zzk).zzd(this.zzg, zzyn.zzg);
        Boolean valueOf = Boolean.valueOf(this.zzh);
        Boolean valueOf2 = Boolean.valueOf(zzyn.zzh);
        if (i == 0) {
            zzgab = zzgab.zzc();
        } else {
            zzgab = zzgab.zzc().zza();
        }
        zzfyf zzb2 = zzd.zzc(valueOf, valueOf2, zzgab).zzb(this.zzl, zzyn.zzl);
        if (i2 == 0) {
            zzb2 = zzb2.zze(this.zzm, zzyn.zzm);
        }
        return zzb2.zza();
    }

    public final int zzb() {
        return this.zze;
    }

    public final /* bridge */ /* synthetic */ boolean zzc(zzyp zzyp) {
        zzyn zzyn = (zzyn) zzyp;
        return false;
    }
}

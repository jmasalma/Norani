package com.google.android.gms.internal.ads;

import com.google.common.primitives.Ints;
import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzajc {
    public final zzafb zza;
    public final zzajr zzb = new zzajr();
    public final zzen zzc = new zzen();
    public zzajs zzd;
    public zzaiy zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private final String zzj;
    private final zzen zzk = new zzen(1);
    private final zzen zzl = new zzen();
    /* access modifiers changed from: private */
    public boolean zzm;

    public zzajc(zzafb zzafb, zzajs zzajs, zzaiy zzaiy, String str) {
        this.zza = zzafb;
        this.zzd = zzajs;
        this.zze = zzaiy;
        this.zzj = str;
        zzh(zzajs, zzaiy);
    }

    public final int zza() {
        int i;
        if (!this.zzm) {
            i = this.zzd.zzg[this.zzf];
        } else {
            i = this.zzb.zzj[this.zzf] ? 1 : 0;
        }
        return zzf() != null ? i | Ints.MAX_POWER_OF_TWO : i;
    }

    public final int zzb() {
        if (!this.zzm) {
            return this.zzd.zzd[this.zzf];
        }
        return this.zzb.zzh[this.zzf];
    }

    public final int zzc(int i, int i2) {
        zzen zzen;
        zzajq zzf2 = zzf();
        if (zzf2 == null) {
            return 0;
        }
        int i3 = zzf2.zzd;
        if (i3 != 0) {
            zzen = this.zzb.zzn;
        } else {
            byte[] bArr = zzf2.zze;
            String str = zzex.zza;
            zzen zzen2 = this.zzl;
            byte[] bArr2 = bArr;
            int length = bArr2.length;
            zzen2.zzJ(bArr2, length);
            zzen = zzen2;
            i3 = length;
        }
        zzajr zzajr = this.zzb;
        boolean zzb2 = zzajr.zzb(this.zzf);
        boolean z = zzb2 || i2 != 0;
        zzen zzen3 = this.zzk;
        zzen3.zzN()[0] = (byte) ((true != z ? 0 : 128) | i3);
        zzen3.zzL(0);
        zzafb zzafb = this.zza;
        zzafb.zzs(zzen3, 1, 1);
        zzafb.zzs(zzen, i3, 1);
        if (!z) {
            return i3 + 1;
        }
        if (!zzb2) {
            zzen zzen4 = this.zzc;
            zzen4.zzI(8);
            byte[] zzN = zzen4.zzN();
            zzN[0] = 0;
            zzN[1] = 1;
            zzN[2] = 0;
            zzN[3] = (byte) i2;
            zzN[4] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
            zzN[5] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            zzN[6] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            zzN[7] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
            zzafb.zzs(zzen4, 8, 1);
            return i3 + 9;
        }
        int i4 = i3 + 1;
        zzen zzen5 = zzajr.zzn;
        int zzq = zzen5.zzq();
        zzen5.zzM(-2);
        int i5 = (zzq * 6) + 2;
        if (i2 != 0) {
            zzen zzen6 = this.zzc;
            zzen6.zzI(i5);
            byte[] zzN2 = zzen6.zzN();
            zzen5.zzH(zzN2, 0, i5);
            int i6 = (((zzN2[2] & 255) << 8) | (zzN2[3] & 255)) + i2;
            zzN2[2] = (byte) ((i6 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            zzN2[3] = (byte) (i6 & KotlinVersion.MAX_COMPONENT_VALUE);
            zzen5 = zzen6;
        }
        zzafb.zzs(zzen5, i5, 1);
        return i4 + i5;
    }

    public final long zzd() {
        if (!this.zzm) {
            return this.zzd.zzc[this.zzf];
        }
        return this.zzb.zzf[this.zzh];
    }

    public final long zze() {
        if (!this.zzm) {
            return this.zzd.zzf[this.zzf];
        }
        zzajr zzajr = this.zzb;
        return zzajr.zzi[this.zzf];
    }

    public final zzajq zzf() {
        if (!this.zzm) {
            return null;
        }
        zzajr zzajr = this.zzb;
        zzaiy zzaiy = zzajr.zza;
        String str = zzex.zza;
        zzaiy zzaiy2 = zzaiy;
        int i = zzaiy.zza;
        zzajq zzajq = zzajr.zzm;
        if (zzajq == null) {
            zzajq = this.zzd.zza.zzb(i);
        }
        if (zzajq == null || !zzajq.zza) {
            return null;
        }
        return zzajq;
    }

    public final void zzh(zzajs zzajs, zzaiy zzaiy) {
        this.zzd = zzajs;
        this.zze = zzaiy;
        zzx zzb2 = zzajs.zza.zzg.zzb();
        zzb2.zzG(this.zzj);
        this.zza.zzm(zzb2.zzan());
        zzi();
    }

    public final void zzi() {
        zzajr zzajr = this.zzb;
        zzajr.zzd = 0;
        zzajr.zzp = 0;
        zzajr.zzq = false;
        zzajr.zzk = false;
        zzajr.zzo = false;
        zzajr.zzm = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzm = false;
    }

    public final void zzj(zzs zzs) {
        zzajp zzajp = this.zzd.zza;
        zzaiy zzaiy = this.zzb.zza;
        String str = zzex.zza;
        zzaiy zzaiy2 = zzaiy;
        zzajq zzb2 = zzajp.zzb(zzaiy.zza);
        zzs zzb3 = zzs.zzb(zzb2 != null ? zzb2.zzb : null);
        zzz zzz = this.zzd.zza.zzg;
        String str2 = this.zzj;
        zzx zzb4 = zzz.zzb();
        zzb4.zzG(str2);
        zzb4.zzL(zzb3);
        this.zza.zzm(zzb4.zzan());
    }

    public final boolean zzl() {
        this.zzf++;
        if (!this.zzm) {
            return false;
        }
        int i = this.zzg + 1;
        this.zzg = i;
        int[] iArr = this.zzb.zzg;
        int i2 = this.zzh;
        if (i != iArr[i2]) {
            return true;
        }
        this.zzh = i2 + 1;
        this.zzg = 0;
        return false;
    }
}

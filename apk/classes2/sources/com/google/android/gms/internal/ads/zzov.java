package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzov {
    final /* synthetic */ zzow zza;
    /* access modifiers changed from: private */
    public final String zzb;
    /* access modifiers changed from: private */
    public int zzc;
    /* access modifiers changed from: private */
    public long zzd;
    /* access modifiers changed from: private */
    public zzvh zze;
    /* access modifiers changed from: private */
    public boolean zzf;
    /* access modifiers changed from: private */
    public boolean zzg;

    public zzov(zzow zzow, String str, int i, zzvh zzvh) {
        Objects.requireNonNull(zzow);
        this.zza = zzow;
        this.zzb = str;
        this.zzc = i;
        this.zzd = zzvh == null ? -1 : zzvh.zzd;
        if (zzvh != null && zzvh.zzb()) {
            this.zze = zzvh;
        }
    }

    public final void zzg(int i, zzvh zzvh) {
        if (this.zzd == -1 && i == this.zzc && zzvh != null) {
            zzow zzow = this.zza;
            long j = zzvh.zzd;
            if (j >= zzow.zzl()) {
                this.zzd = j;
            }
        }
    }

    public final boolean zzj(int i, zzvh zzvh) {
        if (zzvh == null) {
            return i == this.zzc;
        }
        zzvh zzvh2 = this.zze;
        return zzvh2 == null ? !zzvh.zzb() && zzvh.zzd == this.zzd : zzvh.zzd == zzvh2.zzd && zzvh.zzb == zzvh2.zzb && zzvh.zzc == zzvh2.zzc;
    }

    public final boolean zzk(zzmp zzmp) {
        zzvh zzvh = zzmp.zzd;
        if (zzvh == null) {
            return this.zzc != zzmp.zzc;
        }
        long j = this.zzd;
        if (j == -1) {
            return false;
        }
        long j2 = zzvh.zzd;
        if (j2 > j) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        zzbl zzbl = zzmp.zzb;
        int zza2 = zzbl.zza(zzvh.zza);
        int zza3 = zzbl.zza(this.zze.zza);
        zzvh zzvh2 = this.zze;
        if (j2 < zzvh2.zzd || zza2 < zza3) {
            return false;
        }
        if (zza2 > zza3) {
            return true;
        }
        if (zzvh.zzb()) {
            int i = zzvh.zzb;
            int i2 = zzvh.zzc;
            int i3 = zzvh2.zzb;
            if (i > i3) {
                return true;
            }
            if (i == i3) {
                return i2 > zzvh2.zzc;
            }
            return false;
        }
        int i4 = zzvh.zze;
        return i4 == -1 || i4 > zzvh2.zzb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0 < r9.zzc()) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzl(com.google.android.gms.internal.ads.zzbl r8, com.google.android.gms.internal.ads.zzbl r9) {
        /*
            r7 = this;
            int r0 = r7.zzc
            int r1 = r8.zzc()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L_0x0013
            int r8 = r9.zzc()
            if (r0 >= r8) goto L_0x0011
            goto L_0x0044
        L_0x0011:
            r0 = r3
            goto L_0x0044
        L_0x0013:
            com.google.android.gms.internal.ads.zzow r1 = r7.zza
            com.google.android.gms.internal.ads.zzbk r4 = r1.zzc
            r5 = 0
            r8.zze(r0, r4, r5)
            com.google.android.gms.internal.ads.zzbk r0 = r1.zzc
            int r0 = r0.zzn
        L_0x0024:
            com.google.android.gms.internal.ads.zzbk r4 = r1.zzc
            int r4 = r4.zzo
            if (r0 > r4) goto L_0x0011
            java.lang.Object r4 = r8.zzf(r0)
            int r4 = r9.zza(r4)
            if (r4 == r3) goto L_0x0041
            com.google.android.gms.internal.ads.zzbj r8 = r1.zzd
            com.google.android.gms.internal.ads.zzbj r8 = r9.zzd(r4, r8, r2)
            int r0 = r8.zzc
            goto L_0x0044
        L_0x0041:
            int r0 = r0 + 1
            goto L_0x0024
        L_0x0044:
            r7.zzc = r0
            if (r0 != r3) goto L_0x0049
            return r2
        L_0x0049:
            com.google.android.gms.internal.ads.zzvh r8 = r7.zze
            r0 = 1
            if (r8 != 0) goto L_0x004f
            return r0
        L_0x004f:
            java.lang.Object r8 = r8.zza
            int r8 = r9.zza(r8)
            if (r8 == r3) goto L_0x0058
            return r0
        L_0x0058:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzov.zzl(com.google.android.gms.internal.ads.zzbl, com.google.android.gms.internal.ads.zzbl):boolean");
    }
}

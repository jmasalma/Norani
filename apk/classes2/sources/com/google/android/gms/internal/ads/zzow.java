package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import kotlin.jvm.internal.LongCompanionObject;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzow implements zzpf {
    public static final zzfwh zza = new zzou();
    private static final Random zzb = new Random();
    /* access modifiers changed from: private */
    public final zzbk zzc;
    /* access modifiers changed from: private */
    public final zzbj zzd;
    private final HashMap zze;
    private zzpe zzf;
    private zzbl zzg;
    private String zzh;
    private long zzi;

    public zzow() {
        throw null;
    }

    public zzow(zzfwh zzfwh) {
        this.zzc = new zzbk();
        this.zzd = new zzbj();
        this.zze = new HashMap();
        this.zzg = zzbl.zza;
        this.zzi = -1;
    }

    /* access modifiers changed from: private */
    public final long zzl() {
        zzov zzov = (zzov) this.zze.get(this.zzh);
        return (zzov == null || zzov.zzd == -1) ? this.zzi + 1 : zzov.zzd;
    }

    private final zzov zzm(int i, zzvh zzvh) {
        int i2;
        HashMap hashMap = this.zze;
        long j = LongCompanionObject.MAX_VALUE;
        zzov zzov = null;
        for (zzov zzov2 : hashMap.values()) {
            zzov2.zzg(i, zzvh);
            if (zzov2.zzj(i, zzvh)) {
                long zzb2 = zzov2.zzd;
                if (zzb2 == -1 || zzb2 < j) {
                    zzov = zzov2;
                    j = zzb2;
                } else if (i2 == 0) {
                    String str = zzex.zza;
                    zzov zzov3 = zzov;
                    if (!(zzov.zze == null || zzov2.zze == null)) {
                        zzov = zzov2;
                    }
                }
            }
        }
        if (zzov != null) {
            return zzov;
        }
        String zzn = zzn();
        String str2 = zzn;
        zzov zzov4 = new zzov(this, zzn, i, zzvh);
        hashMap.put(zzn, zzov4);
        return zzov4;
    }

    /* access modifiers changed from: private */
    public static String zzn() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private final void zzo(zzov zzov) {
        if (zzov.zzd != -1) {
            this.zzi = zzov.zzd;
        }
        this.zzh = null;
    }

    @RequiresNonNull({"listener"})
    private final void zzp(zzmp zzmp) {
        if (zzmp.zzb.zzo()) {
            String str = this.zzh;
            if (str != null) {
                zzov zzov = (zzov) this.zze.get(str);
                zzov.getClass();
                zzov zzov2 = zzov;
                zzo(zzov);
                return;
            }
            return;
        }
        zzov zzov3 = (zzov) this.zze.get(this.zzh);
        int i = zzmp.zzc;
        zzvh zzvh = zzmp.zzd;
        zzov zzm = zzm(i, zzvh);
        this.zzh = zzm.zzb;
        zzi(zzmp);
        if (zzvh != null && zzvh.zzb()) {
            if (zzov3 != null) {
                if (zzov3.zzd == zzvh.zzd && zzov3.zze != null && zzov3.zze.zzb == zzvh.zzb && zzov3.zze.zzc == zzvh.zzc) {
                    return;
                }
            }
            String unused = zzm(i, new zzvh(zzvh.zza, zzvh.zzd)).zzb;
            String unused2 = zzm.zzb;
        }
    }

    public final synchronized String zze() {
        return this.zzh;
    }

    public final synchronized String zzf(zzbl zzbl, zzvh zzvh) {
        return zzm(zzbl.zzn(zzvh.zza, this.zzd).zzc, zzvh).zzb;
    }

    public final synchronized void zzg(zzmp zzmp) {
        zzpe zzpe;
        String str = this.zzh;
        if (str != null) {
            zzov zzov = (zzov) this.zze.get(str);
            if (zzov != null) {
                zzov zzov2 = zzov;
                zzo(zzov);
            } else {
                throw null;
            }
        }
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzov zzov3 = (zzov) it.next();
            it.remove();
            if (zzov3.zzf && (zzpe = this.zzf) != null) {
                zzpe.zzv(zzmp, zzov3.zzb, false);
            }
        }
    }

    public final void zzh(zzpe zzpe) {
        this.zzf = zzpe;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        if (com.google.android.gms.internal.ads.zzov.zza(r2) == r10.zzc) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b2, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzi(com.google.android.gms.internal.ads.zzmp r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.zzpe r0 = r9.zzf     // Catch:{ all -> 0x00b5 }
            if (r0 == 0) goto L_0x00b3
            com.google.android.gms.internal.ads.zzbl r0 = r10.zzb     // Catch:{ all -> 0x00b5 }
            boolean r1 = r0.zzo()     // Catch:{ all -> 0x00b5 }
            if (r1 == 0) goto L_0x000f
            goto L_0x00b1
        L_0x000f:
            com.google.android.gms.internal.ads.zzvh r1 = r10.zzd     // Catch:{ all -> 0x00b5 }
            if (r1 == 0) goto L_0x003b
            long r2 = r9.zzl()     // Catch:{ all -> 0x00b5 }
            long r4 = r1.zzd     // Catch:{ all -> 0x00b5 }
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x00b1
            java.util.HashMap r2 = r9.zze     // Catch:{ all -> 0x00b5 }
            java.lang.String r3 = r9.zzh     // Catch:{ all -> 0x00b5 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x00b5 }
            com.google.android.gms.internal.ads.zzov r2 = (com.google.android.gms.internal.ads.zzov) r2     // Catch:{ all -> 0x00b5 }
            if (r2 == 0) goto L_0x003b
            long r3 = r2.zzd     // Catch:{ all -> 0x00b5 }
            r5 = -1
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x003b
            int r2 = r2.zzc     // Catch:{ all -> 0x00b5 }
            int r3 = r10.zzc     // Catch:{ all -> 0x00b5 }
            if (r2 != r3) goto L_0x00b1
        L_0x003b:
            int r2 = r10.zzc     // Catch:{ all -> 0x00b5 }
            com.google.android.gms.internal.ads.zzov r3 = r9.zzm(r2, r1)     // Catch:{ all -> 0x00b5 }
            java.lang.String r4 = r9.zzh     // Catch:{ all -> 0x00b5 }
            if (r4 != 0) goto L_0x004b
            java.lang.String r4 = r3.zzb     // Catch:{ all -> 0x00b5 }
            r9.zzh = r4     // Catch:{ all -> 0x00b5 }
        L_0x004b:
            r4 = 1
            if (r1 == 0) goto L_0x0085
            boolean r5 = r1.zzb()     // Catch:{ all -> 0x00b5 }
            if (r5 == 0) goto L_0x0085
            java.lang.Object r5 = r1.zza     // Catch:{ all -> 0x00b5 }
            long r6 = r1.zzd     // Catch:{ all -> 0x00b5 }
            int r1 = r1.zzb     // Catch:{ all -> 0x00b5 }
            com.google.android.gms.internal.ads.zzvh r8 = new com.google.android.gms.internal.ads.zzvh     // Catch:{ all -> 0x00b5 }
            r8.<init>(r5, r6, r1)     // Catch:{ all -> 0x00b5 }
            com.google.android.gms.internal.ads.zzov r2 = r9.zzm(r2, r8)     // Catch:{ all -> 0x00b5 }
            boolean r6 = r2.zzf     // Catch:{ all -> 0x00b5 }
            if (r6 != 0) goto L_0x0085
            r2.zzf = true     // Catch:{ all -> 0x00b5 }
            com.google.android.gms.internal.ads.zzbj r6 = r9.zzd     // Catch:{ all -> 0x00b5 }
            r0.zzn(r5, r6)     // Catch:{ all -> 0x00b5 }
            r6.zzg(r1)     // Catch:{ all -> 0x00b5 }
            r0 = 0
            long r5 = com.google.android.gms.internal.ads.zzex.zzv(r0)     // Catch:{ all -> 0x00b5 }
            long r7 = com.google.android.gms.internal.ads.zzex.zzv(r0)     // Catch:{ all -> 0x00b5 }
            long r5 = r5 + r7
            java.lang.Math.max(r0, r5)     // Catch:{ all -> 0x00b5 }
            java.lang.String unused = r2.zzb     // Catch:{ all -> 0x00b5 }
        L_0x0085:
            boolean r0 = r3.zzf     // Catch:{ all -> 0x00b5 }
            if (r0 != 0) goto L_0x0091
            r3.zzf = true     // Catch:{ all -> 0x00b5 }
            java.lang.String unused = r3.zzb     // Catch:{ all -> 0x00b5 }
        L_0x0091:
            java.lang.String r0 = r3.zzb     // Catch:{ all -> 0x00b5 }
            java.lang.String r1 = r9.zzh     // Catch:{ all -> 0x00b5 }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x00b5 }
            if (r0 == 0) goto L_0x00b1
            boolean r0 = r3.zzg     // Catch:{ all -> 0x00b5 }
            if (r0 != 0) goto L_0x00b1
            r3.zzg = true     // Catch:{ all -> 0x00b5 }
            com.google.android.gms.internal.ads.zzpe r0 = r9.zzf     // Catch:{ all -> 0x00b5 }
            java.lang.String r1 = r3.zzb     // Catch:{ all -> 0x00b5 }
            r0.zzu(r10, r1)     // Catch:{ all -> 0x00b5 }
            monitor-exit(r9)
            return
        L_0x00b1:
            monitor-exit(r9)
            return
        L_0x00b3:
            r10 = 0
            throw r10     // Catch:{ all -> 0x00b5 }
        L_0x00b5:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00b5 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzow.zzi(com.google.android.gms.internal.ads.zzmp):void");
    }

    public final synchronized void zzj(zzmp zzmp, int i) {
        if (this.zzf != null) {
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzov zzov = (zzov) it.next();
                if (zzov.zzk(zzmp)) {
                    it.remove();
                    if (zzov.zzf) {
                        boolean equals = zzov.zzb.equals(this.zzh);
                        boolean z = false;
                        if (i == 0 && equals && zzov.zzg) {
                            z = true;
                        }
                        if (equals) {
                            zzo(zzov);
                        }
                        this.zzf.zzv(zzmp, zzov.zzb, z);
                    }
                }
            }
            zzp(zzmp);
        } else {
            throw null;
        }
    }

    public final synchronized void zzk(zzmp zzmp) {
        if (this.zzf != null) {
            zzbl zzbl = this.zzg;
            this.zzg = zzmp.zzb;
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzov zzov = (zzov) it.next();
                if (!zzov.zzl(zzbl, this.zzg) || zzov.zzk(zzmp)) {
                    it.remove();
                    if (zzov.zzf) {
                        if (zzov.zzb.equals(this.zzh)) {
                            zzo(zzov);
                        }
                        this.zzf.zzv(zzmp, zzov.zzb, false);
                    }
                }
            }
            zzp(zzmp);
        } else {
            throw null;
        }
    }
}

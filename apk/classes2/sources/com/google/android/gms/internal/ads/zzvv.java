package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzvv implements zzvf, zzve {
    private final zzvf[] zza;
    private final boolean[] zzb;
    private final IdentityHashMap zzc = new IdentityHashMap();
    private final ArrayList zzd = new ArrayList();
    private final HashMap zze = new HashMap();
    private zzve zzf;
    private zzxk zzg;
    private zzvf[] zzh;
    private zzxb zzi = new zzur(zzfyq.zzn(), zzfyq.zzn());

    public zzvv(zzus zzus, long[] jArr, zzvf... zzvfArr) {
        this.zza = zzvfArr;
        this.zzh = new zzvf[0];
        this.zzb = new boolean[zzvfArr.length];
        for (int i = 0; i < zzvfArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.zzb[i] = true;
                this.zza[i] = new zzxh(zzvfArr[i], j);
            }
        }
    }

    public final long zza(long j, zzmi zzmi) {
        zzvf[] zzvfArr = this.zzh;
        return (zzvfArr.length > 0 ? zzvfArr[0] : this.zza[0]).zza(j, zzmi);
    }

    public final long zzb() {
        return this.zzi.zzb();
    }

    public final long zzc() {
        return this.zzi.zzc();
    }

    public final long zzd() {
        long j = -9223372036854775807L;
        for (zzvf zzvf : this.zzh) {
            long zzd2 = zzvf.zzd();
            if (zzd2 != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    zzvf[] zzvfArr = this.zzh;
                    int length = zzvfArr.length;
                    int i = 0;
                    while (i < length) {
                        zzvf zzvf2 = zzvfArr[i];
                        if (zzvf2 == zzvf) {
                            break;
                        } else if (zzvf2.zze(zzd2) == zzd2) {
                            i++;
                        } else {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = zzd2;
                } else if (zzd2 != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (!(j == -9223372036854775807L || zzvf.zze(j) == j)) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    public final long zze(long j) {
        long zze2 = this.zzh[0].zze(j);
        int i = 1;
        while (true) {
            zzvf[] zzvfArr = this.zzh;
            if (i >= zzvfArr.length) {
                return zze2;
            }
            if (zzvfArr[i].zze(zze2) == zze2) {
                i++;
            } else {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long zzf(com.google.android.gms.internal.ads.zzyw[] r23, boolean[] r24, com.google.android.gms.internal.ads.zzwz[] r25, boolean[] r26, long r27) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r25
            int r3 = r1.length
            int[] r4 = new int[r3]
            int[] r3 = new int[r3]
            r5 = 0
            r6 = r5
        L_0x000d:
            int r7 = r1.length
            if (r6 >= r7) goto L_0x004a
            r7 = r2[r6]
            if (r7 != 0) goto L_0x0016
            r8 = 0
            goto L_0x001f
        L_0x0016:
            java.util.IdentityHashMap r8 = r0.zzc
            java.lang.Object r7 = r8.get(r7)
            r8 = r7
            java.lang.Integer r8 = (java.lang.Integer) r8
        L_0x001f:
            r7 = -1
            if (r8 != 0) goto L_0x0024
            r8 = r7
            goto L_0x0028
        L_0x0024:
            int r8 = r8.intValue()
        L_0x0028:
            r4[r6] = r8
            r8 = r1[r6]
            if (r8 == 0) goto L_0x0045
            com.google.android.gms.internal.ads.zzbm r7 = r8.zzc()
            java.lang.String r7 = r7.zzb
            java.lang.String r8 = ":"
            int r8 = r7.indexOf(r8)
            java.lang.String r7 = r7.substring(r5, r8)
            int r7 = java.lang.Integer.parseInt(r7)
            r3[r6] = r7
            goto L_0x0047
        L_0x0045:
            r3[r6] = r7
        L_0x0047:
            int r6 = r6 + 1
            goto L_0x000d
        L_0x004a:
            java.util.IdentityHashMap r6 = r0.zzc
            r6.clear()
            com.google.android.gms.internal.ads.zzvf[] r9 = r0.zza
            com.google.android.gms.internal.ads.zzwz[] r10 = new com.google.android.gms.internal.ads.zzwz[r7]
            com.google.android.gms.internal.ads.zzwz[] r15 = new com.google.android.gms.internal.ads.zzwz[r7]
            com.google.android.gms.internal.ads.zzyw[] r14 = new com.google.android.gms.internal.ads.zzyw[r7]
            java.util.ArrayList r13 = new java.util.ArrayList
            int r11 = r9.length
            r13.<init>(r11)
            r18 = r27
            r12 = r5
        L_0x0060:
            int r11 = r9.length
            if (r12 >= r11) goto L_0x010c
            r11 = r5
        L_0x0064:
            int r5 = r1.length
            if (r11 >= r5) goto L_0x00a5
            r5 = r4[r11]
            if (r5 != r12) goto L_0x006e
            r5 = r2[r11]
            goto L_0x006f
        L_0x006e:
            r5 = 0
        L_0x006f:
            r15[r11] = r5
            r5 = r3[r11]
            if (r5 != r12) goto L_0x009b
            r5 = r1[r11]
            r5.getClass()
            r16 = r5
            com.google.android.gms.internal.ads.zzyw r16 = (com.google.android.gms.internal.ads.zzyw) r16
            com.google.android.gms.internal.ads.zzbm r8 = r5.zzc()
            r16 = r13
            java.util.HashMap r13 = r0.zze
            java.lang.Object r8 = r13.get(r8)
            com.google.android.gms.internal.ads.zzbm r8 = (com.google.android.gms.internal.ads.zzbm) r8
            r8.getClass()
            r13 = r8
            com.google.android.gms.internal.ads.zzbm r13 = (com.google.android.gms.internal.ads.zzbm) r13
            com.google.android.gms.internal.ads.zzvu r13 = new com.google.android.gms.internal.ads.zzvu
            r13.<init>(r5, r8)
            r14[r11] = r13
            r5 = 0
            goto L_0x00a0
        L_0x009b:
            r16 = r13
            r5 = 0
            r14[r11] = r5
        L_0x00a0:
            int r11 = r11 + 1
            r13 = r16
            goto L_0x0064
        L_0x00a5:
            r16 = r13
            r5 = 0
            r11 = r9[r12]
            r8 = r12
            r12 = r14
            r5 = r16
            r13 = r24
            r20 = r14
            r14 = r15
            r21 = r15
            r15 = r26
            r16 = r18
            long r11 = r11.zzf(r12, r13, r14, r15, r16)
            if (r8 != 0) goto L_0x00c2
            r18 = r11
            goto L_0x00c6
        L_0x00c2:
            int r11 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r11 != 0) goto L_0x0104
        L_0x00c6:
            r11 = 0
            r12 = 0
        L_0x00c8:
            int r13 = r1.length
            if (r11 >= r13) goto L_0x00f3
            r13 = r3[r11]
            r14 = 1
            if (r13 != r8) goto L_0x00e3
            r12 = r21[r11]
            r12.getClass()
            r13 = r12
            com.google.android.gms.internal.ads.zzwz r13 = (com.google.android.gms.internal.ads.zzwz) r13
            r10[r11] = r12
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            r6.put(r12, r13)
            r12 = r14
            goto L_0x00f0
        L_0x00e3:
            r13 = r4[r11]
            if (r13 != r8) goto L_0x00f0
            r13 = r21[r11]
            if (r13 != 0) goto L_0x00ec
            goto L_0x00ed
        L_0x00ec:
            r14 = 0
        L_0x00ed:
            com.google.android.gms.internal.ads.zzdd.zzf(r14)
        L_0x00f0:
            int r11 = r11 + 1
            goto L_0x00c8
        L_0x00f3:
            if (r12 == 0) goto L_0x00fa
            r11 = r9[r8]
            r5.add(r11)
        L_0x00fa:
            int r12 = r8 + 1
            r13 = r5
            r14 = r20
            r15 = r21
            r5 = 0
            goto L_0x0060
        L_0x0104:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Children enabled at different positions."
            r1.<init>(r2)
            throw r1
        L_0x010c:
            r1 = r5
            r5 = r13
            java.lang.System.arraycopy(r10, r1, r2, r1, r7)
            com.google.android.gms.internal.ads.zzvf[] r1 = new com.google.android.gms.internal.ads.zzvf[r1]
            java.lang.Object[] r1 = r5.toArray(r1)
            com.google.android.gms.internal.ads.zzvf[] r1 = (com.google.android.gms.internal.ads.zzvf[]) r1
            r0.zzh = r1
            com.google.android.gms.internal.ads.zzvt r1 = new com.google.android.gms.internal.ads.zzvt
            r1.<init>()
            java.util.List r1 = com.google.android.gms.internal.ads.zzfzg.zzc(r5, r1)
            com.google.android.gms.internal.ads.zzur r2 = new com.google.android.gms.internal.ads.zzur
            r2.<init>(r5, r1)
            r0.zzi = r2
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvv.zzf(com.google.android.gms.internal.ads.zzyw[], boolean[], com.google.android.gms.internal.ads.zzwz[], boolean[], long):long");
    }

    public final void zzh(long j, boolean z) {
        for (zzvf zzh2 : this.zzh) {
            zzh2.zzh(j, false);
        }
    }

    public final void zzi() throws IOException {
        int i = 0;
        while (true) {
            zzvf[] zzvfArr = this.zza;
            if (i < zzvfArr.length) {
                zzvfArr[i].zzi();
                i++;
            } else {
                return;
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zzj(zzxb zzxb) {
        zzvf zzvf = (zzvf) zzxb;
        zzve zzve = this.zzf;
        zzve.getClass();
        zzve zzve2 = zzve;
        zzve.zzj(this);
    }

    public final void zzk(zzve zzve, long j) {
        this.zzf = zzve;
        ArrayList arrayList = this.zzd;
        zzvf[] zzvfArr = this.zza;
        Collections.addAll(arrayList, zzvfArr);
        for (zzvf zzk : zzvfArr) {
            zzk.zzk(this, j);
        }
    }

    public final void zzl(zzvf zzvf) {
        ArrayList arrayList = this.zzd;
        arrayList.remove(zzvf);
        if (arrayList.isEmpty()) {
            zzvf[] zzvfArr = this.zza;
            int i = 0;
            for (zzvf zzg2 : zzvfArr) {
                i += zzg2.zzg().zzb;
            }
            zzbm[] zzbmArr = new zzbm[i];
            int i2 = 0;
            for (int i3 = 0; i3 < zzvfArr.length; i3++) {
                zzxk zzg3 = zzvfArr[i3].zzg();
                int i4 = zzg3.zzb;
                int i5 = 0;
                while (i5 < i4) {
                    zzbm zzb2 = zzg3.zzb(i5);
                    int i6 = zzb2.zza;
                    zzz[] zzzArr = new zzz[i6];
                    for (int i7 = 0; i7 < i6; i7++) {
                        zzz zzb3 = zzb2.zzb(i7);
                        zzx zzb4 = zzb3.zzb();
                        String str = zzb3.zza;
                        if (str == null) {
                            str = "";
                        }
                        zzb4.zzS(i3 + ":" + str);
                        zzzArr[i7] = zzb4.zzan();
                    }
                    zzbm zzbm = new zzbm(i3 + ":" + zzb2.zzb, zzzArr);
                    this.zze.put(zzbm, zzb2);
                    zzbmArr[i2] = zzbm;
                    i5++;
                    i2++;
                }
            }
            this.zzg = new zzxk(zzbmArr);
            zzve zzve = this.zzf;
            zzve.getClass();
            zzve zzve2 = zzve;
            zzve.zzl(this);
        }
    }

    public final void zzm(long j) {
        this.zzi.zzm(j);
    }

    public final zzvf zzn(int i) {
        if (this.zzb[i]) {
            return ((zzxh) this.zza[i]).zzn();
        }
        return this.zza[i];
    }

    public final boolean zzo(zzla zzla) {
        ArrayList arrayList = this.zzd;
        if (arrayList.isEmpty()) {
            return this.zzi.zzo(zzla);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zzvf) arrayList.get(i)).zzo(zzla);
        }
        return false;
    }

    public final boolean zzp() {
        return this.zzi.zzp();
    }

    public final zzxk zzg() {
        zzxk zzxk = this.zzg;
        zzxk.getClass();
        zzxk zzxk2 = zzxk;
        return zzxk;
    }
}

package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaoj implements zzadv {
    private final int zza;
    /* access modifiers changed from: private */
    public final List zzb;
    private final zzen zzc;
    private final SparseIntArray zzd;
    /* access modifiers changed from: private */
    public final zzaom zze;
    private final zzakr zzf;
    /* access modifiers changed from: private */
    public final SparseArray zzg;
    /* access modifiers changed from: private */
    public final SparseBooleanArray zzh;
    /* access modifiers changed from: private */
    public final SparseBooleanArray zzi;
    private final zzaog zzj;
    private zzaof zzk;
    /* access modifiers changed from: private */
    public zzady zzl;
    /* access modifiers changed from: private */
    public int zzm;
    /* access modifiers changed from: private */
    public boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    /* access modifiers changed from: private */
    public int zzr;

    @Deprecated
    public zzaoj() {
        this(1, 1, zzakr.zza, new zzeu(0), new zzamw(0), 112800);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:90:0x019d, code lost:
        if (r4 == false) goto L_0x019f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(com.google.android.gms.internal.ads.zzadw r19, com.google.android.gms.internal.ads.zzaer r20) throws java.io.IOException {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            long r11 = r19.zzd()
            boolean r3 = r0.zzn
            r13 = -1
            r15 = 1
            r10 = 0
            if (r3 == 0) goto L_0x009e
            int r3 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r3 == 0) goto L_0x0026
            com.google.android.gms.internal.ads.zzaog r3 = r0.zzj
            boolean r4 = r3.zzd()
            if (r4 == 0) goto L_0x001f
            goto L_0x0026
        L_0x001f:
            int r4 = r0.zzr
            int r1 = r3.zza(r1, r2, r4)
            return r1
        L_0x0026:
            boolean r3 = r0.zzo
            r7 = 0
            if (r3 != 0) goto L_0x0075
            r0.zzo = r15
            com.google.android.gms.internal.ads.zzaog r3 = r0.zzj
            long r4 = r3.zzb()
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r4 == 0) goto L_0x0065
            com.google.android.gms.internal.ads.zzaof r9 = new com.google.android.gms.internal.ads.zzaof
            com.google.android.gms.internal.ads.zzeu r4 = r3.zzc()
            long r5 = r3.zzb()
            int r3 = r0.zzr
            r16 = 112800(0x1b8a0, float:1.58066E-40)
            r17 = r3
            r3 = r9
            r13 = r7
            r7 = r11
            r15 = r9
            r9 = r17
            r10 = r16
            r3.<init>(r4, r5, r7, r9, r10)
            r0.zzk = r15
            com.google.android.gms.internal.ads.zzady r3 = r0.zzl
            com.google.android.gms.internal.ads.zzaeu r4 = r15.zzb()
            r3.zzP(r4)
            goto L_0x0076
        L_0x0065:
            r13 = r7
            com.google.android.gms.internal.ads.zzady r4 = r0.zzl
            com.google.android.gms.internal.ads.zzaet r5 = new com.google.android.gms.internal.ads.zzaet
            long r6 = r3.zzb()
            r5.<init>(r6, r13)
            r4.zzP(r5)
            goto L_0x0076
        L_0x0075:
            r13 = r7
        L_0x0076:
            boolean r3 = r0.zzp
            if (r3 == 0) goto L_0x008d
            r3 = 0
            r0.zzp = r3
            r0.zzf(r13, r13)
            long r4 = r19.zzf()
            int r4 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r4 != 0) goto L_0x0089
            goto L_0x008e
        L_0x0089:
            r2.zza = r13
            r1 = 1
            return r1
        L_0x008d:
            r3 = 0
        L_0x008e:
            com.google.android.gms.internal.ads.zzaof r4 = r0.zzk
            if (r4 == 0) goto L_0x009f
            boolean r5 = r4.zze()
            if (r5 != 0) goto L_0x0099
            goto L_0x009f
        L_0x0099:
            int r1 = r4.zza(r1, r2)
            return r1
        L_0x009e:
            r3 = r10
        L_0x009f:
            com.google.android.gms.internal.ads.zzen r2 = r0.zzc
            byte[] r4 = r2.zzN()
            int r5 = r2.zzc()
            int r5 = 9400 - r5
            r6 = 188(0xbc, float:2.63E-43)
            if (r5 < r6) goto L_0x00b0
            goto L_0x00c0
        L_0x00b0:
            int r5 = r2.zza()
            if (r5 <= 0) goto L_0x00bd
            int r7 = r2.zzc()
            java.lang.System.arraycopy(r4, r7, r4, r3, r5)
        L_0x00bd:
            r2.zzJ(r4, r5)
        L_0x00c0:
            int r5 = r2.zza()
            r7 = -1
            if (r5 >= r6) goto L_0x0100
            int r5 = r2.zzd()
            int r8 = 9400 - r5
            int r8 = r1.zza(r4, r5, r8)
            if (r8 != r7) goto L_0x00fb
            r10 = r3
        L_0x00d4:
            android.util.SparseArray r1 = r0.zzg
            int r2 = r1.size()
            if (r10 >= r2) goto L_0x00fa
            java.lang.Object r1 = r1.valueAt(r10)
            com.google.android.gms.internal.ads.zzaoo r1 = (com.google.android.gms.internal.ads.zzaoo) r1
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.zzant
            if (r2 == 0) goto L_0x00f7
            com.google.android.gms.internal.ads.zzant r1 = (com.google.android.gms.internal.ads.zzant) r1
            boolean r2 = r1.zzd(r3)
            if (r2 == 0) goto L_0x00f7
            com.google.android.gms.internal.ads.zzen r2 = new com.google.android.gms.internal.ads.zzen
            r2.<init>()
            r4 = 1
            r1.zza(r2, r4)
        L_0x00f7:
            int r10 = r10 + 1
            goto L_0x00d4
        L_0x00fa:
            return r7
        L_0x00fb:
            int r5 = r5 + r8
            r2.zzK(r5)
            goto L_0x00c0
        L_0x0100:
            int r1 = r2.zzc()
            int r4 = r2.zzd()
            byte[] r5 = r2.zzN()
            int r5 = com.google.android.gms.internal.ads.zzaop.zza(r5, r1, r4)
            r2.zzL(r5)
            int r6 = r5 + 188
            if (r6 <= r4) goto L_0x011e
            int r4 = r0.zzq
            int r5 = r5 - r1
            int r4 = r4 + r5
            r0.zzq = r4
            goto L_0x0120
        L_0x011e:
            r0.zzq = r3
        L_0x0120:
            int r1 = r2.zzd()
            if (r6 <= r1) goto L_0x0127
            return r3
        L_0x0127:
            int r4 = r2.zzg()
            r5 = 8388608(0x800000, float:1.17549435E-38)
            r5 = r5 & r4
            if (r5 == 0) goto L_0x0134
            r2.zzL(r6)
            return r3
        L_0x0134:
            r5 = 4194304(0x400000, float:5.877472E-39)
            r5 = r5 & r4
            if (r5 == 0) goto L_0x013b
            r10 = 1
            goto L_0x013c
        L_0x013b:
            r10 = r3
        L_0x013c:
            int r5 = r4 >> 8
            r8 = r4 & 32
            r9 = r4 & 16
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            if (r9 == 0) goto L_0x014f
            android.util.SparseArray r9 = r0.zzg
            java.lang.Object r9 = r9.get(r5)
            com.google.android.gms.internal.ads.zzaoo r9 = (com.google.android.gms.internal.ads.zzaoo) r9
            goto L_0x0150
        L_0x014f:
            r9 = 0
        L_0x0150:
            if (r9 != 0) goto L_0x0156
            r2.zzL(r6)
            return r3
        L_0x0156:
            r4 = r4 & 15
            android.util.SparseIntArray r13 = r0.zzd
            int r14 = r4 + -1
            int r14 = r13.get(r5, r14)
            r13.put(r5, r4)
            if (r14 != r4) goto L_0x0169
            r2.zzL(r6)
            return r3
        L_0x0169:
            r13 = 1
            int r14 = r14 + r13
            r13 = r14 & 15
            if (r4 == r13) goto L_0x0172
            r9.zzc()
        L_0x0172:
            if (r8 == 0) goto L_0x0188
            int r4 = r2.zzm()
            int r8 = r2.zzm()
            r8 = r8 & 64
            if (r8 == 0) goto L_0x0182
            r8 = 2
            goto L_0x0183
        L_0x0182:
            r8 = r3
        L_0x0183:
            r10 = r10 | r8
            int r4 = r4 + r7
            r2.zzM(r4)
        L_0x0188:
            boolean r4 = r0.zzn
            if (r4 != 0) goto L_0x0194
            android.util.SparseBooleanArray r7 = r0.zzi
            boolean r5 = r7.get(r5, r3)
            if (r5 != 0) goto L_0x019f
        L_0x0194:
            r2.zzK(r6)
            r9.zza(r2, r10)
            r2.zzK(r1)
            if (r4 != 0) goto L_0x01ac
        L_0x019f:
            boolean r1 = r0.zzn
            if (r1 == 0) goto L_0x01ac
            r4 = -1
            int r1 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x01ac
            r1 = 1
            r0.zzp = r1
        L_0x01ac:
            r2.zzL(r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaoj.zzb(com.google.android.gms.internal.ads.zzadw, com.google.android.gms.internal.ads.zzaer):int");
    }

    public final /* synthetic */ zzadv zzc() {
        return this;
    }

    public final /* synthetic */ List zzd() {
        return zzfyq.zzn();
    }

    public final void zze(zzady zzady) {
        if (this.zza == 0) {
            zzady = new zzaku(zzady, this.zzf);
        }
        this.zzl = zzady;
    }

    public final void zzf(long j, long j2) {
        zzaof zzaof;
        List list = this.zzb;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            zzeu zzeu = (zzeu) list.get(i);
            if (zzeu.zzf() != -9223372036854775807L) {
                long zzd2 = zzeu.zzd();
                if (zzd2 != -9223372036854775807L) {
                    if (zzd2 != 0) {
                        if (zzd2 == j2) {
                        }
                    }
                }
            }
            zzeu.zzi(j2);
        }
        if (!(j2 == 0 || (zzaof = this.zzk) == null)) {
            zzaof.zzd(j2);
        }
        this.zzc.zzI(0);
        this.zzd.clear();
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.zzg;
            if (i2 < sparseArray.size()) {
                ((zzaoo) sparseArray.valueAt(i2)).zzc();
                i2++;
            } else {
                this.zzq = 0;
                return;
            }
        }
    }

    public final boolean zzi(zzadw zzadw) throws IOException {
        byte[] zzN = this.zzc.zzN();
        zzadl zzadl = (zzadl) zzadw;
        zzadl.zzm(zzN, 0, 940, false);
        int i = 0;
        while (i < 188) {
            int i2 = 0;
            while (i2 < 5) {
                if (zzN[(i2 * 188) + i] != 71) {
                    i++;
                } else {
                    i2++;
                }
            }
            zzadl.zzo(i, false);
            return true;
        }
        return false;
    }

    public zzaoj(int i, int i2, zzakr zzakr, zzeu zzeu, zzaom zzaom, int i3) {
        zzaom zzaom2 = zzaom;
        this.zze = zzaom;
        this.zza = i2;
        this.zzf = zzakr;
        this.zzb = Collections.singletonList(zzeu);
        this.zzc = new zzen(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzh = sparseBooleanArray;
        this.zzi = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzg = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzj = new zzaog(112800);
        this.zzl = zzady.zza;
        this.zzr = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray zza2 = zzaom.zza();
        int size = zza2.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.zzg.put(zza2.keyAt(i4), (zzaoo) zza2.valueAt(i4));
        }
        this.zzg.put(0, new zzaob(new zzaoh(this)));
    }
}

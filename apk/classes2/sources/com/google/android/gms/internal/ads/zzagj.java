package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzagj implements zzadv {
    private final zzen zza = new zzen(6);
    private zzady zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private long zzf = -1;
    private zzahm zzg;
    private zzadw zzh;
    private zzagm zzi;
    private zzajj zzj;

    private final int zza(zzadw zzadw) throws IOException {
        zzen zzen = this.zza;
        zzen.zzI(2);
        ((zzadl) zzadw).zzm(zzen.zzN(), 0, 2, false);
        return zzen.zzq();
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x018c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(com.google.android.gms.internal.ads.zzadw r24, com.google.android.gms.internal.ads.zzaer r25) throws java.io.IOException {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            int r3 = r0.zzc
            r4 = 4
            r5 = -1
            r7 = 2
            r8 = 1
            r9 = 0
            if (r3 == 0) goto L_0x01b4
            if (r3 == r8) goto L_0x019c
            r10 = -1
            if (r3 == r7) goto L_0x00e2
            r5 = 5
            if (r3 == r4) goto L_0x004f
            if (r3 == r5) goto L_0x0024
            r1 = 6
            if (r3 != r1) goto L_0x001e
            return r10
        L_0x001e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0024:
            com.google.android.gms.internal.ads.zzagm r3 = r0.zzi
            if (r3 == 0) goto L_0x002c
            com.google.android.gms.internal.ads.zzadw r3 = r0.zzh
            if (r1 == r3) goto L_0x0037
        L_0x002c:
            r0.zzh = r1
            com.google.android.gms.internal.ads.zzagm r3 = new com.google.android.gms.internal.ads.zzagm
            long r4 = r0.zzf
            r3.<init>(r1, r4)
            r0.zzi = r3
        L_0x0037:
            com.google.android.gms.internal.ads.zzajj r1 = r0.zzj
            r1.getClass()
            r3 = r1
            com.google.android.gms.internal.ads.zzajj r3 = (com.google.android.gms.internal.ads.zzajj) r3
            com.google.android.gms.internal.ads.zzagm r3 = r0.zzi
            int r1 = r1.zzb(r3, r2)
            if (r1 != r8) goto L_0x004e
            long r3 = r2.zza
            long r5 = r0.zzf
            long r3 = r3 + r5
            r2.zza = r3
        L_0x004e:
            return r1
        L_0x004f:
            long r6 = r24.zzf()
            long r10 = r0.zzf
            int r3 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x00df
            com.google.android.gms.internal.ads.zzen r2 = r0.zza
            byte[] r2 = r2.zzN()
            boolean r2 = r1.zzm(r2, r9, r8, r8)
            if (r2 != 0) goto L_0x0069
            r23.zzg()
            goto L_0x00de
        L_0x0069:
            r24.zzj()
            com.google.android.gms.internal.ads.zzajj r2 = r0.zzj
            if (r2 != 0) goto L_0x007b
            com.google.android.gms.internal.ads.zzajj r2 = new com.google.android.gms.internal.ads.zzajj
            com.google.android.gms.internal.ads.zzakr r3 = com.google.android.gms.internal.ads.zzakr.zza
            r6 = 8
            r2.<init>(r3, r6)
            r0.zzj = r2
        L_0x007b:
            com.google.android.gms.internal.ads.zzagm r2 = new com.google.android.gms.internal.ads.zzagm
            long r6 = r0.zzf
            r2.<init>(r1, r6)
            r0.zzi = r2
            com.google.android.gms.internal.ads.zzajj r1 = r0.zzj
            boolean r1 = r1.zzi(r2)
            if (r1 == 0) goto L_0x00db
            com.google.android.gms.internal.ads.zzajj r1 = r0.zzj
            com.google.android.gms.internal.ads.zzago r2 = new com.google.android.gms.internal.ads.zzago
            long r6 = r0.zzf
            com.google.android.gms.internal.ads.zzady r3 = r0.zzb
            r3.getClass()
            r10 = r3
            com.google.android.gms.internal.ads.zzady r10 = (com.google.android.gms.internal.ads.zzady) r10
            r2.<init>(r6, r3)
            r1.zze(r2)
            com.google.android.gms.internal.ads.zzahm r1 = r0.zzg
            r1.getClass()
            r2 = r1
            com.google.android.gms.internal.ads.zzahm r2 = (com.google.android.gms.internal.ads.zzahm) r2
            com.google.android.gms.internal.ads.zzady r2 = r0.zzb
            r2.getClass()
            r3 = r2
            com.google.android.gms.internal.ads.zzady r3 = (com.google.android.gms.internal.ads.zzady) r3
            r3 = 1024(0x400, float:1.435E-42)
            com.google.android.gms.internal.ads.zzafb r2 = r2.zzw(r3, r4)
            com.google.android.gms.internal.ads.zzx r3 = new com.google.android.gms.internal.ads.zzx
            r3.<init>()
            java.lang.String r4 = "image/jpeg"
            r3.zzG(r4)
            com.google.android.gms.internal.ads.zzav r4 = new com.google.android.gms.internal.ads.zzav
            com.google.android.gms.internal.ads.zzau[] r6 = new com.google.android.gms.internal.ads.zzau[r8]
            r6[r9] = r1
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4.<init>(r7, r6)
            r3.zzaa(r4)
            com.google.android.gms.internal.ads.zzz r1 = r3.zzan()
            r2.zzm(r1)
            r0.zzc = r5
            goto L_0x00de
        L_0x00db:
            r23.zzg()
        L_0x00de:
            return r9
        L_0x00df:
            r2.zza = r10
            return r8
        L_0x00e2:
            int r2 = r0.zzd
            r3 = 65505(0xffe1, float:9.1792E-41)
            if (r2 != r3) goto L_0x0193
            com.google.android.gms.internal.ads.zzen r2 = new com.google.android.gms.internal.ads.zzen
            int r3 = r0.zze
            r2.<init>((int) r3)
            byte[] r3 = r2.zzN()
            int r4 = r0.zze
            r1.zzi(r3, r9, r4)
            com.google.android.gms.internal.ads.zzahm r3 = r0.zzg
            if (r3 != 0) goto L_0x0191
            java.lang.String r3 = r2.zzy(r9)
            java.lang.String r4 = "http://ns.adobe.com/xap/1.0/"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0191
            java.lang.String r2 = r2.zzy(r9)
            if (r2 == 0) goto L_0x0191
            long r3 = r24.zzd()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x011a
        L_0x0117:
            r8 = 0
            goto L_0x0188
        L_0x011a:
            com.google.android.gms.internal.ads.zzagl r1 = com.google.android.gms.internal.ads.zzagp.zza(r2)
            if (r1 != 0) goto L_0x0121
            goto L_0x0117
        L_0x0121:
            java.util.List r2 = r1.zzb
            int r11 = r2.size()
            if (r11 >= r7) goto L_0x012a
            goto L_0x0117
        L_0x012a:
            int r7 = r2.size()
            int r7 = r7 + r10
            r11 = r5
            r13 = r11
            r17 = r13
            r19 = r17
            r10 = r9
        L_0x0136:
            if (r7 < 0) goto L_0x016e
            java.lang.Object r15 = r2.get(r7)
            com.google.android.gms.internal.ads.zzagk r15 = (com.google.android.gms.internal.ads.zzagk) r15
            java.lang.String r8 = r15.zza
            java.lang.String r9 = "video/mp4"
            boolean r8 = r9.equals(r8)
            r8 = r8 | r10
            if (r7 != 0) goto L_0x014f
            long r9 = r15.zzc
            long r3 = r3 - r9
            r9 = 0
            goto L_0x0153
        L_0x014f:
            long r9 = r15.zzb
            long r9 = r3 - r9
        L_0x0153:
            r21 = r3
            r3 = r9
            r9 = r21
            if (r8 == 0) goto L_0x0163
            int r15 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r15 == 0) goto L_0x0163
            long r19 = r9 - r3
            r17 = r3
            r8 = 0
        L_0x0163:
            if (r7 != 0) goto L_0x0166
            r13 = r9
        L_0x0166:
            if (r7 != 0) goto L_0x0169
            r11 = r3
        L_0x0169:
            int r7 = r7 + -1
            r10 = r8
            r9 = 0
            goto L_0x0136
        L_0x016e:
            int r2 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0117
            int r2 = (r19 > r5 ? 1 : (r19 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0117
            int r2 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0117
            int r2 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x017f
            goto L_0x0117
        L_0x017f:
            long r1 = r1.zza
            com.google.android.gms.internal.ads.zzahm r8 = new com.google.android.gms.internal.ads.zzahm
            r10 = r8
            r15 = r1
            r10.<init>(r11, r13, r15, r17, r19)
        L_0x0188:
            r0.zzg = r8
            if (r8 == 0) goto L_0x0198
            long r1 = r8.zzd
            r0.zzf = r1
            goto L_0x0198
        L_0x0191:
            r2 = r9
            goto L_0x0199
        L_0x0193:
            int r2 = r0.zze
            r1.zzk(r2)
        L_0x0198:
            r2 = 0
        L_0x0199:
            r0.zzc = r2
            return r2
        L_0x019c:
            r2 = r9
            com.google.android.gms.internal.ads.zzen r3 = r0.zza
            r3.zzI(r7)
            byte[] r4 = r3.zzN()
            r1.zzi(r4, r2, r7)
            int r1 = r3.zzq()
            int r1 = r1 + -2
            r0.zze = r1
            r0.zzc = r7
            return r2
        L_0x01b4:
            r2 = r9
            com.google.android.gms.internal.ads.zzen r3 = r0.zza
            r3.zzI(r7)
            byte[] r9 = r3.zzN()
            r1.zzi(r9, r2, r7)
            int r1 = r3.zzq()
            r0.zzd = r1
            r2 = 65498(0xffda, float:9.1782E-41)
            if (r1 != r2) goto L_0x01d9
            long r1 = r0.zzf
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x01d5
            r0.zzc = r4
            goto L_0x01ea
        L_0x01d5:
            r23.zzg()
            goto L_0x01ea
        L_0x01d9:
            r2 = 65488(0xffd0, float:9.1768E-41)
            if (r1 < r2) goto L_0x01e3
            r2 = 65497(0xffd9, float:9.1781E-41)
            if (r1 <= r2) goto L_0x01ea
        L_0x01e3:
            r2 = 65281(0xff01, float:9.1478E-41)
            if (r1 == r2) goto L_0x01ea
            r0.zzc = r8
        L_0x01ea:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagj.zzb(com.google.android.gms.internal.ads.zzadw, com.google.android.gms.internal.ads.zzaer):int");
    }

    public final /* synthetic */ zzadv zzc() {
        return this;
    }

    public final /* synthetic */ List zzd() {
        return zzfyq.zzn();
    }

    public final void zze(zzady zzady) {
        this.zzb = zzady;
    }

    public final boolean zzi(zzadw zzadw) throws IOException {
        if (zza(zzadw) != 65496) {
            return false;
        }
        int zza2 = zza(zzadw);
        this.zzd = zza2;
        if (zza2 == 65504) {
            zzen zzen = this.zza;
            zzen.zzI(2);
            zzadl zzadl = (zzadl) zzadw;
            zzadl.zzm(zzen.zzN(), 0, 2, false);
            zzadl.zzl(zzen.zzq() - 2, false);
            zza2 = zza(zzadw);
            this.zzd = zza2;
        }
        if (zza2 == 65505) {
            zzadl zzadl2 = (zzadl) zzadw;
            zzadl2.zzl(2, false);
            zzen zzen2 = this.zza;
            zzen2.zzI(6);
            zzadl2.zzm(zzen2.zzN(), 0, 6, false);
            if (zzen2.zzu() == 1165519206 && zzen2.zzq() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void zzf(long j, long j2) {
        if (j == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzajj zzajj = this.zzj;
            zzajj.getClass();
            zzajj zzajj2 = zzajj;
            zzajj.zzf(j, j2);
        }
    }

    private final void zzg() {
        zzady zzady = this.zzb;
        zzady.getClass();
        zzady zzady2 = zzady;
        zzady.zzG();
        this.zzb.zzP(new zzaet(-9223372036854775807L, 0));
        this.zzc = 6;
    }
}

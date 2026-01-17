package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzwg implements zzzv, zzuw {
    final /* synthetic */ zzwl zza;
    /* access modifiers changed from: private */
    public final long zzb = zzuy.zza();
    private final Uri zzc;
    /* access modifiers changed from: private */
    public final zzhi zzd;
    private final zzwa zze;
    private final zzady zzf;
    private final zzdm zzg;
    private final zzaer zzh = new zzaer();
    private volatile boolean zzi;
    private boolean zzj = true;
    /* access modifiers changed from: private */
    public long zzk;
    /* access modifiers changed from: private */
    public zzgo zzl = zzi(0);
    private zzafb zzm;
    private boolean zzn;

    public zzwg(zzwl zzwl, Uri uri, zzgj zzgj, zzwa zzwa, zzady zzady, zzdm zzdm) {
        Objects.requireNonNull(zzwl);
        this.zza = zzwl;
        this.zzc = uri;
        this.zzd = new zzhi(zzgj);
        this.zze = zzwa;
        this.zzf = zzady;
        this.zzg = zzdm;
    }

    static /* bridge */ /* synthetic */ void zzf(zzwg zzwg, long j, long j2) {
        zzwg.zzh.zza = j;
        zzwg.zzk = j2;
        zzwg.zzj = true;
        zzwg.zzn = false;
    }

    private final zzgo zzi(long j) {
        zzgm zzgm = new zzgm();
        zzgm.zzd(this.zzc);
        zzgm.zzc(j);
        zzgm.zza(6);
        zzgm.zzb(zzwl.zzb);
        return zzgm.zze();
    }

    public final void zzg() {
        this.zzi = true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(20:59|60|63|64|(0)|68|(0)(0)|74|75|76|77|(0)|80|(0)(0)|88|(2:(0)(0)|129)|105|(0)(0)|112|(0)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x011e */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0212 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01d1 A[EDGE_INSN: B:130:0x01d1->B:105:0x01d1 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009c A[Catch:{ all -> 0x01f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a6 A[Catch:{ all -> 0x01f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b2 A[Catch:{ all -> 0x01f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bc A[Catch:{ all -> 0x01f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c8 A[Catch:{ all -> 0x01f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d2 A[Catch:{ all -> 0x01f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00de A[Catch:{ all -> 0x01f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ee A[Catch:{ all -> 0x01f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00fa A[Catch:{ all -> 0x01f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0130 A[Catch:{ all -> 0x01f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x014c A[Catch:{ all -> 0x01f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0166 A[Catch:{ all -> 0x01f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0182 A[Catch:{ all -> 0x01ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0189 A[Catch:{ all -> 0x01ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x019a A[SYNTHETIC, Splitter:B:90:0x019a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzh() throws java.io.IOException {
        /*
            r24 = this;
            r1 = r24
            java.lang.String r0 = "Invalid metadata interval: "
        L_0x0004:
            boolean r2 = r1.zzi
            if (r2 != 0) goto L_0x0212
            r2 = -1
            r5 = 0
            com.google.android.gms.internal.ads.zzaer r6 = r1.zzh     // Catch:{ all -> 0x01f2 }
            long r13 = r6.zza     // Catch:{ all -> 0x01f2 }
            com.google.android.gms.internal.ads.zzgo r6 = r1.zzi(r13)     // Catch:{ all -> 0x01f2 }
            r1.zzl = r6     // Catch:{ all -> 0x01f2 }
            com.google.android.gms.internal.ads.zzhi r7 = r1.zzd     // Catch:{ all -> 0x01f2 }
            long r8 = r7.zzb(r6)     // Catch:{ all -> 0x01f2 }
            boolean r6 = r1.zzi     // Catch:{ all -> 0x01f2 }
            if (r6 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.zzwa r0 = r1.zze
            long r4 = r0.zzb()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0031
            com.google.android.gms.internal.ads.zzaer r2 = r1.zzh
            long r3 = r0.zzb()
            r2.zza = r3
        L_0x0031:
            com.google.android.gms.internal.ads.zzhi r0 = r1.zzd
            com.google.android.gms.internal.ads.zzgl.zza(r0)
            return
        L_0x0037:
            int r6 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0041
            long r8 = r8 + r13
            com.google.android.gms.internal.ads.zzwl r6 = r1.zza     // Catch:{ all -> 0x01f2 }
            r6.zzq.post(new com.google.android.gms.internal.ads.zzwb(r6))     // Catch:{ all -> 0x01f2 }
        L_0x0041:
            r15 = r8
            com.google.android.gms.internal.ads.zzwl r6 = r1.zza     // Catch:{ all -> 0x01f2 }
            java.util.Map r7 = r7.zze()     // Catch:{ all -> 0x01f2 }
            java.lang.String r8 = "icy-br"
            java.lang.Object r8 = r7.get(r8)     // Catch:{ all -> 0x01f2 }
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x01f2 }
            java.lang.String r9 = "IcyHeaders"
            r10 = -1
            if (r8 == 0) goto L_0x008e
            java.lang.Object r8 = r8.get(r5)     // Catch:{ all -> 0x01f2 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x01f2 }
            int r11 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x007c }
            int r11 = r11 * 1000
            if (r11 <= 0) goto L_0x0067
            r18 = r11
            r2 = 1
            goto L_0x0091
        L_0x0067:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x007d }
            r12.<init>()     // Catch:{ NumberFormatException -> 0x007d }
            java.lang.String r2 = "Invalid bitrate: "
            r12.append(r2)     // Catch:{ NumberFormatException -> 0x007d }
            r12.append(r8)     // Catch:{ NumberFormatException -> 0x007d }
            java.lang.String r2 = r12.toString()     // Catch:{ NumberFormatException -> 0x007d }
            com.google.android.gms.internal.ads.zzea.zzf(r9, r2)     // Catch:{ NumberFormatException -> 0x007d }
            goto L_0x008e
        L_0x007c:
            r11 = r10
        L_0x007d:
            java.lang.String r2 = "Invalid bitrate header: "
            java.lang.String r3 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x01f2 }
            java.lang.String r2 = r2.concat(r3)     // Catch:{ all -> 0x01f2 }
            com.google.android.gms.internal.ads.zzea.zzf(r9, r2)     // Catch:{ all -> 0x01f2 }
            r2 = r5
            r18 = r11
            goto L_0x0091
        L_0x008e:
            r2 = r5
            r18 = r10
        L_0x0091:
            java.lang.String r3 = "icy-genre"
            java.lang.Object r3 = r7.get(r3)     // Catch:{ all -> 0x01f2 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x01f2 }
            r8 = 0
            if (r3 == 0) goto L_0x00a6
            java.lang.Object r2 = r3.get(r5)     // Catch:{ all -> 0x01f2 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x01f2 }
            r19 = r2
            r2 = 1
            goto L_0x00a8
        L_0x00a6:
            r19 = r8
        L_0x00a8:
            java.lang.String r3 = "icy-name"
            java.lang.Object r3 = r7.get(r3)     // Catch:{ all -> 0x01f2 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x01f2 }
            if (r3 == 0) goto L_0x00bc
            java.lang.Object r2 = r3.get(r5)     // Catch:{ all -> 0x01f2 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x01f2 }
            r20 = r2
            r2 = 1
            goto L_0x00be
        L_0x00bc:
            r20 = r8
        L_0x00be:
            java.lang.String r3 = "icy-url"
            java.lang.Object r3 = r7.get(r3)     // Catch:{ all -> 0x01f2 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x01f2 }
            if (r3 == 0) goto L_0x00d2
            java.lang.Object r2 = r3.get(r5)     // Catch:{ all -> 0x01f2 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x01f2 }
            r21 = r2
            r2 = 1
            goto L_0x00d4
        L_0x00d2:
            r21 = r8
        L_0x00d4:
            java.lang.String r3 = "icy-pub"
            java.lang.Object r3 = r7.get(r3)     // Catch:{ all -> 0x01f2 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x01f2 }
            if (r3 == 0) goto L_0x00ee
            java.lang.Object r2 = r3.get(r5)     // Catch:{ all -> 0x01f2 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x01f2 }
            java.lang.String r3 = "1"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x01f2 }
            r22 = r2
            r2 = 1
            goto L_0x00f0
        L_0x00ee:
            r22 = r5
        L_0x00f0:
            java.lang.String r3 = "icy-metaint"
            java.lang.Object r3 = r7.get(r3)     // Catch:{ all -> 0x01f2 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x01f2 }
            if (r3 == 0) goto L_0x012c
            java.lang.Object r3 = r3.get(r5)     // Catch:{ all -> 0x01f2 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x01f2 }
            int r7 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x011d }
            if (r7 <= 0) goto L_0x010a
            r23 = r7
            r2 = 1
            goto L_0x012e
        L_0x010a:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x011e }
            r11.<init>()     // Catch:{ NumberFormatException -> 0x011e }
            r11.append(r0)     // Catch:{ NumberFormatException -> 0x011e }
            r11.append(r3)     // Catch:{ NumberFormatException -> 0x011e }
            java.lang.String r11 = r11.toString()     // Catch:{ NumberFormatException -> 0x011e }
            com.google.android.gms.internal.ads.zzea.zzf(r9, r11)     // Catch:{ NumberFormatException -> 0x011e }
            goto L_0x012c
        L_0x011d:
            r7 = r10
        L_0x011e:
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x01f2 }
            java.lang.String r3 = r0.concat(r3)     // Catch:{ all -> 0x01f2 }
            com.google.android.gms.internal.ads.zzea.zzf(r9, r3)     // Catch:{ all -> 0x01f2 }
            r23 = r7
            goto L_0x012e
        L_0x012c:
            r23 = r10
        L_0x012e:
            if (r2 == 0) goto L_0x0137
            com.google.android.gms.internal.ads.zzagv r8 = new com.google.android.gms.internal.ads.zzagv     // Catch:{ all -> 0x01f2 }
            r17 = r8
            r17.<init>(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x01f2 }
        L_0x0137:
            r6.zzs = r8     // Catch:{ all -> 0x01f2 }
            com.google.android.gms.internal.ads.zzhi r2 = r1.zzd     // Catch:{ all -> 0x01f2 }
            com.google.android.gms.internal.ads.zzwl r3 = r1.zza     // Catch:{ all -> 0x01f2 }
            com.google.android.gms.internal.ads.zzagv r6 = r3.zzs     // Catch:{ all -> 0x01f2 }
            if (r6 == 0) goto L_0x0166
            com.google.android.gms.internal.ads.zzagv r6 = r3.zzs     // Catch:{ all -> 0x01f2 }
            int r6 = r6.zzf     // Catch:{ all -> 0x01f2 }
            if (r6 == r10) goto L_0x0166
            com.google.android.gms.internal.ads.zzux r6 = new com.google.android.gms.internal.ads.zzux     // Catch:{ all -> 0x01f2 }
            com.google.android.gms.internal.ads.zzagv r7 = r3.zzs     // Catch:{ all -> 0x01f2 }
            int r7 = r7.zzf     // Catch:{ all -> 0x01f2 }
            r6.<init>(r2, r7, r1)     // Catch:{ all -> 0x01f2 }
            com.google.android.gms.internal.ads.zzafb r7 = r3.zzv()     // Catch:{ all -> 0x01f2 }
            r1.zzm = r7     // Catch:{ all -> 0x01f2 }
            com.google.android.gms.internal.ads.zzz r8 = com.google.android.gms.internal.ads.zzwl.zzc     // Catch:{ all -> 0x01f2 }
            r7.zzm(r8)     // Catch:{ all -> 0x01f2 }
            r8 = r6
            goto L_0x0167
        L_0x0166:
            r8 = r2
        L_0x0167:
            com.google.android.gms.internal.ads.zzwa r6 = r1.zze     // Catch:{ all -> 0x01f2 }
            android.net.Uri r9 = r1.zzc     // Catch:{ all -> 0x01f2 }
            java.util.Map r10 = r2.zze()     // Catch:{ all -> 0x01f2 }
            com.google.android.gms.internal.ads.zzady r11 = r1.zzf     // Catch:{ all -> 0x01f2 }
            r7 = r6
            r17 = r11
            r11 = r13
            r4 = r13
            r13 = r15
            r15 = r17
            r7.zzd(r8, r9, r10, r11, r13, r15)     // Catch:{ all -> 0x01ef }
            com.google.android.gms.internal.ads.zzagv r7 = r3.zzs     // Catch:{ all -> 0x01ef }
            if (r7 == 0) goto L_0x0185
            r6.zzc()     // Catch:{ all -> 0x01ef }
        L_0x0185:
            boolean r7 = r1.zzj     // Catch:{ all -> 0x01ef }
            if (r7 == 0) goto L_0x0195
            long r7 = r1.zzk     // Catch:{ all -> 0x01ef }
            r6.zzf(r4, r7)     // Catch:{ all -> 0x01ef }
            r7 = 0
            r1.zzj = r7     // Catch:{ all -> 0x0192 }
            goto L_0x0196
        L_0x0192:
            r0 = move-exception
            goto L_0x01f4
        L_0x0195:
            r7 = 0
        L_0x0196:
            r13 = r4
            r4 = r7
        L_0x0198:
            if (r4 != 0) goto L_0x01d1
            boolean r5 = r1.zzi     // Catch:{ all -> 0x01ce }
            if (r5 != 0) goto L_0x01cc
            com.google.android.gms.internal.ads.zzdm r5 = r1.zzg     // Catch:{ InterruptedException -> 0x01c6 }
            r5.zza()     // Catch:{ InterruptedException -> 0x01c6 }
            com.google.android.gms.internal.ads.zzaer r8 = r1.zzh     // Catch:{ all -> 0x01ce }
            int r4 = r6.zza(r8)     // Catch:{ all -> 0x01ce }
            long r8 = r6.zzb()     // Catch:{ all -> 0x01ce }
            long r10 = r3.zzj     // Catch:{ all -> 0x01ce }
            long r10 = r10 + r13
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 <= 0) goto L_0x0198
            r5.zzd()     // Catch:{ all -> 0x01ce }
            android.os.Handler r5 = r3.zzq     // Catch:{ all -> 0x01ce }
            java.lang.Runnable r10 = r3.zzp     // Catch:{ all -> 0x01ce }
            r5.post(r10)     // Catch:{ all -> 0x01ce }
            r13 = r8
            goto L_0x0198
        L_0x01c6:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch:{ all -> 0x01ce }
            r0.<init>()     // Catch:{ all -> 0x01ce }
            throw r0     // Catch:{ all -> 0x01ce }
        L_0x01cc:
            r4 = r7
            goto L_0x01d1
        L_0x01ce:
            r0 = move-exception
            r5 = r4
            goto L_0x01f5
        L_0x01d1:
            r3 = 1
            if (r4 != r3) goto L_0x01d6
            r5 = r7
            goto L_0x01e9
        L_0x01d6:
            long r7 = r6.zzb()
            r9 = -1
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x01e8
            com.google.android.gms.internal.ads.zzaer r3 = r1.zzh
            long r5 = r6.zzb()
            r3.zza = r5
        L_0x01e8:
            r5 = r4
        L_0x01e9:
            com.google.android.gms.internal.ads.zzgl.zza(r2)
            if (r5 == 0) goto L_0x0004
            goto L_0x0212
        L_0x01ef:
            r0 = move-exception
            r7 = 0
            goto L_0x01f4
        L_0x01f2:
            r0 = move-exception
            r7 = r5
        L_0x01f4:
            r5 = r7
        L_0x01f5:
            r2 = 1
            if (r5 == r2) goto L_0x020c
            com.google.android.gms.internal.ads.zzwa r2 = r1.zze
            long r3 = r2.zzb()
            r5 = -1
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x020c
            com.google.android.gms.internal.ads.zzaer r3 = r1.zzh
            long r4 = r2.zzb()
            r3.zza = r4
        L_0x020c:
            com.google.android.gms.internal.ads.zzhi r2 = r1.zzd
            com.google.android.gms.internal.ads.zzgl.zza(r2)
            throw r0
        L_0x0212:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwg.zzh():void");
    }

    public final void zza(zzen zzen) {
        long j;
        if (!this.zzn) {
            j = this.zzk;
        } else {
            j = Math.max(this.zza.zzS(true), this.zzk);
        }
        int zza2 = zzen.zza();
        zzafb zzafb = this.zzm;
        zzafb.getClass();
        zzafb zzafb2 = zzafb;
        zzafb.zzr(zzen, zza2);
        zzafb.zzt(j, 1, zza2, 0, (zzafa) null);
        this.zzn = true;
    }
}

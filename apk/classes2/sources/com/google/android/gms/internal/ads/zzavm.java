package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbd;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzavm implements zzavp {
    private static zzavm zzb;
    volatile long zza = 0;
    private final Context zzc;
    private final zzfpv zzd;
    private final zzfqc zze;
    private final zzfqe zzf;
    private final zzawr zzg;
    /* access modifiers changed from: private */
    public final zzfoi zzh;
    private final Executor zzi;
    private final zzfqb zzj;
    private final CountDownLatch zzk;
    private final zzaxg zzl;
    private final zzawy zzm;
    private final zzawp zzn;
    /* access modifiers changed from: private */
    public final Object zzo = new Object();
    /* access modifiers changed from: private */
    public volatile boolean zzp;
    private volatile boolean zzq = false;
    private final int zzr;

    zzavm(Context context, zzfoi zzfoi, zzfpv zzfpv, zzfqc zzfqc, zzfqe zzfqe, zzawr zzawr, Executor executor, zzfod zzfod, int i, zzaxg zzaxg, zzawy zzawy, zzawp zzawp) {
        this.zzc = context;
        this.zzh = zzfoi;
        this.zzd = zzfpv;
        this.zze = zzfqc;
        this.zzf = zzfqe;
        this.zzg = zzawr;
        this.zzi = executor;
        this.zzr = i;
        this.zzl = zzaxg;
        this.zzm = zzawy;
        this.zzn = zzawp;
        this.zzq = false;
        this.zzk = new CountDownLatch(1);
        this.zzj = new zzavk(this, zzfod);
    }

    public static synchronized zzavm zza(Context context, zzarx zzarx, boolean z) {
        zzavm zzs;
        synchronized (zzavm.class) {
            zzfoj zzc2 = zzfok.zzc();
            zzc2.zza(zzarx.zzf());
            zzc2.zzg(zzarx.zzi());
            zzs = zzs(context, Executors.newCachedThreadPool(), zzc2.zzh(), z);
        }
        return zzs;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009b, code lost:
        if (r3.zzc().zzj().equals(r5.zzj()) != false) goto L_0x00f6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* bridge */ /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzavm r12) {
        /*
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1
            com.google.android.gms.internal.ads.zzfpu r3 = r12.zzu(r2)
            if (r3 == 0) goto L_0x001e
            com.google.android.gms.internal.ads.zzays r4 = r3.zza()
            java.lang.String r4 = r4.zzk()
            com.google.android.gms.internal.ads.zzays r3 = r3.zza()
            java.lang.String r3 = r3.zzj()
            r9 = r3
            r8 = r4
            goto L_0x0021
        L_0x001e:
            r4 = 0
            r8 = r4
            r9 = r8
        L_0x0021:
            android.content.Context r5 = r12.zzc     // Catch:{ zzgzw -> 0x011d }
            int r7 = r12.zzr     // Catch:{ zzgzw -> 0x011d }
            java.lang.String r10 = "1"
            com.google.android.gms.internal.ads.zzfoi r3 = r12.zzh     // Catch:{ zzgzw -> 0x011d }
            r6 = 1
            r11 = r3
            com.google.android.gms.internal.ads.zzfpz r4 = com.google.android.gms.internal.ads.zzfos.zza(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ zzgzw -> 0x011d }
            byte[] r5 = r4.zzb     // Catch:{ zzgzw -> 0x011d }
            if (r5 == 0) goto L_0x0110
            int r6 = r5.length     // Catch:{ zzgzw -> 0x011d }
            if (r6 != 0) goto L_0x0038
            goto L_0x0110
        L_0x0038:
            r3 = 0
            com.google.android.gms.internal.ads.zzgxz r3 = com.google.android.gms.internal.ads.zzgxz.zzv(r5, r3, r6)     // Catch:{ NullPointerException -> 0x0103 }
            com.google.android.gms.internal.ads.zzgyr r5 = com.google.android.gms.internal.ads.zzgyr.zza()     // Catch:{ NullPointerException -> 0x0103 }
            com.google.android.gms.internal.ads.zzayp r3 = com.google.android.gms.internal.ads.zzayp.zzb(r3, r5)     // Catch:{ NullPointerException -> 0x0103 }
            com.google.android.gms.internal.ads.zzays r5 = r3.zzc()     // Catch:{ zzgzw -> 0x011d }
            java.lang.String r5 = r5.zzk()     // Catch:{ zzgzw -> 0x011d }
            boolean r5 = r5.isEmpty()     // Catch:{ zzgzw -> 0x011d }
            if (r5 != 0) goto L_0x00f6
            com.google.android.gms.internal.ads.zzays r5 = r3.zzc()     // Catch:{ zzgzw -> 0x011d }
            java.lang.String r5 = r5.zzj()     // Catch:{ zzgzw -> 0x011d }
            boolean r5 = r5.isEmpty()     // Catch:{ zzgzw -> 0x011d }
            if (r5 != 0) goto L_0x00f6
            com.google.android.gms.internal.ads.zzgxz r5 = r3.zzd()     // Catch:{ zzgzw -> 0x011d }
            byte[] r5 = r5.zzA()     // Catch:{ zzgzw -> 0x011d }
            int r5 = r5.length     // Catch:{ zzgzw -> 0x011d }
            if (r5 != 0) goto L_0x006e
            goto L_0x00f6
        L_0x006e:
            com.google.android.gms.internal.ads.zzfpu r5 = r12.zzu(r2)     // Catch:{ zzgzw -> 0x011d }
            if (r5 != 0) goto L_0x0075
            goto L_0x009d
        L_0x0075:
            com.google.android.gms.internal.ads.zzays r5 = r5.zza()     // Catch:{ zzgzw -> 0x011d }
            com.google.android.gms.internal.ads.zzays r6 = r3.zzc()     // Catch:{ zzgzw -> 0x011d }
            java.lang.String r6 = r6.zzk()     // Catch:{ zzgzw -> 0x011d }
            java.lang.String r7 = r5.zzk()     // Catch:{ zzgzw -> 0x011d }
            boolean r6 = r6.equals(r7)     // Catch:{ zzgzw -> 0x011d }
            if (r6 == 0) goto L_0x009d
            com.google.android.gms.internal.ads.zzays r6 = r3.zzc()     // Catch:{ zzgzw -> 0x011d }
            java.lang.String r6 = r6.zzj()     // Catch:{ zzgzw -> 0x011d }
            java.lang.String r5 = r5.zzj()     // Catch:{ zzgzw -> 0x011d }
            boolean r5 = r6.equals(r5)     // Catch:{ zzgzw -> 0x011d }
            if (r5 != 0) goto L_0x00f6
        L_0x009d:
            com.google.android.gms.internal.ads.zzfqb r5 = r12.zzj     // Catch:{ zzgzw -> 0x011d }
            int r4 = r4.zzc     // Catch:{ zzgzw -> 0x011d }
            com.google.android.gms.internal.ads.zzbcv r6 = com.google.android.gms.internal.ads.zzbde.zzcD     // Catch:{ zzgzw -> 0x011d }
            com.google.android.gms.internal.ads.zzbdc r7 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ zzgzw -> 0x011d }
            java.lang.Object r6 = r7.zzb(r6)     // Catch:{ zzgzw -> 0x011d }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ zzgzw -> 0x011d }
            boolean r6 = r6.booleanValue()     // Catch:{ zzgzw -> 0x011d }
            if (r6 == 0) goto L_0x00c7
            r6 = 3
            if (r4 != r6) goto L_0x00bd
            com.google.android.gms.internal.ads.zzfqc r4 = r12.zze     // Catch:{ zzgzw -> 0x011d }
            boolean r3 = r4.zza(r3)     // Catch:{ zzgzw -> 0x011d }
            goto L_0x00cd
        L_0x00bd:
            r6 = 4
            if (r4 != r6) goto L_0x00cf
            com.google.android.gms.internal.ads.zzfqc r4 = r12.zze     // Catch:{ zzgzw -> 0x011d }
            boolean r3 = r4.zzb(r3, r5)     // Catch:{ zzgzw -> 0x011d }
            goto L_0x00cd
        L_0x00c7:
            com.google.android.gms.internal.ads.zzfpv r4 = r12.zzd     // Catch:{ zzgzw -> 0x011d }
            boolean r3 = r4.zza(r3, r5)     // Catch:{ zzgzw -> 0x011d }
        L_0x00cd:
            if (r3 != 0) goto L_0x00dc
        L_0x00cf:
            com.google.android.gms.internal.ads.zzfoi r2 = r12.zzh     // Catch:{ zzgzw -> 0x011d }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ zzgzw -> 0x011d }
            long r3 = r3 - r0
            r5 = 4009(0xfa9, float:5.618E-42)
            r2.zzd(r5, r3)     // Catch:{ zzgzw -> 0x011d }
            goto L_0x012a
        L_0x00dc:
            com.google.android.gms.internal.ads.zzfpu r3 = r12.zzu(r2)     // Catch:{ zzgzw -> 0x011d }
            if (r3 == 0) goto L_0x012a
            com.google.android.gms.internal.ads.zzfqe r4 = r12.zzf     // Catch:{ zzgzw -> 0x011d }
            boolean r3 = r4.zzc(r3)     // Catch:{ zzgzw -> 0x011d }
            if (r3 == 0) goto L_0x00ec
            r12.zzq = r2     // Catch:{ zzgzw -> 0x011d }
        L_0x00ec:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ zzgzw -> 0x011d }
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            r12.zza = r2     // Catch:{ zzgzw -> 0x011d }
            goto L_0x012a
        L_0x00f6:
            com.google.android.gms.internal.ads.zzfoi r2 = r12.zzh     // Catch:{ zzgzw -> 0x011d }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ zzgzw -> 0x011d }
            long r3 = r3 - r0
            r5 = 5010(0x1392, float:7.02E-42)
            r2.zzd(r5, r3)     // Catch:{ zzgzw -> 0x011d }
            goto L_0x012a
        L_0x0103:
            com.google.android.gms.internal.ads.zzfoi r2 = r12.zzh     // Catch:{ zzgzw -> 0x011d }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ zzgzw -> 0x011d }
            long r3 = r3 - r0
            r5 = 2030(0x7ee, float:2.845E-42)
            r2.zzd(r5, r3)     // Catch:{ zzgzw -> 0x011d }
            goto L_0x012a
        L_0x0110:
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ zzgzw -> 0x011d }
            long r4 = r4 - r0
            r2 = 5009(0x1391, float:7.019E-42)
            r3.zzd(r2, r4)     // Catch:{ zzgzw -> 0x011d }
            goto L_0x012a
        L_0x011b:
            r0 = move-exception
            goto L_0x0130
        L_0x011d:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzfoi r3 = r12.zzh     // Catch:{ all -> 0x011b }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x011b }
            long r4 = r4 - r0
            r0 = 4002(0xfa2, float:5.608E-42)
            r3.zzc(r0, r4, r2)     // Catch:{ all -> 0x011b }
        L_0x012a:
            java.util.concurrent.CountDownLatch r12 = r12.zzk
            r12.countDown()
            return
        L_0x0130:
            java.util.concurrent.CountDownLatch r12 = r12.zzk
            r12.countDown()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzavm.zzj(com.google.android.gms.internal.ads.zzavm):void");
    }

    private static synchronized zzavm zzs(Context context, Executor executor, zzfok zzfok, boolean z) {
        zzavm zzavm;
        zzawp zzawp;
        zzfok zzfok2;
        Context context2 = context;
        Executor executor2 = executor;
        synchronized (zzavm.class) {
            if (zzb == null) {
                zzfoi zza2 = zzfoi.zza(context2, executor2, z);
                zzawa zzc2 = ((Boolean) zzbd.zzc().zzb(zzbde.zzdG)).booleanValue() ? zzawa.zzc(context) : null;
                zzaxg zzd2 = ((Boolean) zzbd.zzc().zzb(zzbde.zzdH)).booleanValue() ? zzaxg.zzd(context, executor) : null;
                zzawy zzawy = ((Boolean) zzbd.zzc().zzb(zzbde.zzcV)).booleanValue() ? new zzawy() : null;
                if (((Boolean) zzbd.zzc().zzb(zzbde.zzdd)).booleanValue()) {
                    zzawp = new zzawp();
                    zzfok2 = zzfok;
                } else {
                    zzfok2 = zzfok;
                    zzawp = null;
                }
                zzfoz zzc3 = zzfoz.zzc(context2, executor2, zza2, zzfok2);
                zzawq zzawq = new zzawq(context2);
                zzawr zzawr = new zzawr(zzfok, zzc3, new zzaxe(context2, zzawq), zzawq, zzc2, zzd2, zzawy, zzawp);
                int zzb2 = zzfpi.zzb(context2, zza2);
                zzfod zzfod = new zzfod();
                zzavm zzavm2 = new zzavm(context, zza2, new zzfpv(context2, zzb2), new zzfqc(context2, zzb2, new zzavj(zza2), ((Boolean) zzbd.zzc().zzb(zzbde.zzcF)).booleanValue()), new zzfqe(context, zzawr, zza2, zzfod, false), zzawr, executor, zzfod, zzb2, zzd2, zzawy, zzawp);
                zzb = zzavm2;
                zzavm2.zzm();
                zzb.zzp();
            }
            zzavm = zzb;
        }
        return zzavm;
    }

    private final void zzt() {
        zzaxg zzaxg = this.zzl;
        if (zzaxg != null) {
            zzaxg.zzh();
        }
    }

    private final zzfpu zzu(int i) {
        if (!zzfpi.zza(this.zzr)) {
            return null;
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcD)).booleanValue()) {
            return this.zze.zzc(1);
        }
        return this.zzd.zzc(1);
    }

    public final String zzd(Context context, String str, View view) {
        return zze(context, str, view, (Activity) null);
    }

    public final String zze(Context context, String str, View view, Activity activity) {
        zzt();
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcV)).booleanValue()) {
            this.zzm.zzi();
        }
        zzp();
        zzfol zza2 = this.zzf.zza();
        if (zza2 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zza3 = zza2.zza(context, (String) null, str, view, activity);
        this.zzh.zzf(5000, System.currentTimeMillis() - currentTimeMillis, zza3, (Map) null);
        return zza3;
    }

    public final String zzf(Context context) {
        zzt();
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcV)).booleanValue()) {
            this.zzm.zzj();
        }
        zzp();
        zzfol zza2 = this.zzf.zza();
        if (zza2 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zzc2 = zza2.zzc(context, (String) null);
        this.zzh.zzf(5001, System.currentTimeMillis() - currentTimeMillis, zzc2, (Map) null);
        return zzc2;
    }

    public final String zzg(Context context) {
        return "19";
    }

    public final String zzh(Context context, View view, Activity activity) {
        zzt();
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcV)).booleanValue()) {
            this.zzm.zzk(context, view);
        }
        zzp();
        zzfol zza2 = this.zzf.zza();
        if (zza2 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zzb2 = zza2.zzb(context, (String) null, view, activity);
        this.zzh.zzf(5002, System.currentTimeMillis() - currentTimeMillis, zzb2, (Map) null);
        return zzb2;
    }

    public final void zzk(MotionEvent motionEvent) {
        zzfol zza2 = this.zzf.zza();
        if (zza2 != null) {
            try {
                zza2.zzd((String) null, motionEvent);
            } catch (zzfqd e) {
                this.zzh.zzc(e.zza(), -1, e);
            }
        }
    }

    public final void zzl(int i, int i2, int i3) {
        DisplayMetrics displayMetrics;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzmt)).booleanValue() && (displayMetrics = this.zzc.getResources().getDisplayMetrics()) != null) {
            float f = (float) i;
            float f2 = (float) i2;
            MotionEvent obtain = MotionEvent.obtain(0, 0, 0, f * displayMetrics.density, f2 * displayMetrics.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            zzk(obtain);
            obtain.recycle();
            MotionEvent obtain2 = MotionEvent.obtain(0, 0, 2, f * displayMetrics.density, f2 * displayMetrics.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            zzk(obtain2);
            obtain2.recycle();
            MotionEvent obtain3 = MotionEvent.obtain(0, (long) i3, 1, f * displayMetrics.density, f2 * displayMetrics.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            zzk(obtain3);
            obtain3.recycle();
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zzm() {
        long currentTimeMillis = System.currentTimeMillis();
        zzfpu zzu = zzu(1);
        if (zzu == null) {
            this.zzh.zzd(4013, System.currentTimeMillis() - currentTimeMillis);
        } else if (this.zzf.zzc(zzu)) {
            this.zzq = true;
            this.zzk.countDown();
        }
    }

    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzawp zzawp = this.zzn;
        if (zzawp != null) {
            zzawp.zzb(Arrays.asList(stackTraceElementArr));
        }
    }

    public final void zzo(View view) {
        this.zzg.zzd(view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzp() {
        /*
            r5 = this;
            boolean r0 = r5.zzp
            if (r0 != 0) goto L_0x0042
            java.lang.Object r0 = r5.zzo
            monitor-enter(r0)
            boolean r1 = r5.zzp     // Catch:{ all -> 0x003f }
            if (r1 != 0) goto L_0x003d
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x003f }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            long r3 = r5.zza     // Catch:{ all -> 0x003f }
            long r1 = r1 - r3
            r3 = 3600(0xe10, double:1.7786E-320)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x001d
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x001d:
            com.google.android.gms.internal.ads.zzfqe r1 = r5.zzf     // Catch:{ all -> 0x003f }
            com.google.android.gms.internal.ads.zzfpu r1 = r1.zzb()     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x002b
            boolean r1 = r1.zzd(r3)     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003d
        L_0x002b:
            int r1 = r5.zzr     // Catch:{ all -> 0x003f }
            boolean r1 = com.google.android.gms.internal.ads.zzfpi.zza(r1)     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003d
            java.util.concurrent.Executor r1 = r5.zzi     // Catch:{ all -> 0x003f }
            com.google.android.gms.internal.ads.zzavl r2 = new com.google.android.gms.internal.ads.zzavl     // Catch:{ all -> 0x003f }
            r2.<init>(r5)     // Catch:{ all -> 0x003f }
            r1.execute(r2)     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x003f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r1
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzavm.zzp():void");
    }

    public final synchronized boolean zzr() {
        return this.zzq;
    }
}

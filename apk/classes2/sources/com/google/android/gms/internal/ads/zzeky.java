package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzcv;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzt;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeky implements AppEventListener, zzcza, zzcxm, zzcwb, zzcws, zza, zzcvy, zzcyk, zzcwo, zzded {
    final zzdsj zza;
    final BlockingQueue zzb = new ArrayBlockingQueue(((Integer) zzbd.zzc().zzb(zzbde.zzjm)).intValue());
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicBoolean zzh = new AtomicBoolean(true);
    private final AtomicBoolean zzi = new AtomicBoolean(false);
    private final AtomicBoolean zzj = new AtomicBoolean(false);

    public zzeky(zzdsj zzdsj) {
        this.zza = zzdsj;
    }

    private final void zzo() {
        if (this.zzi.get() && this.zzj.get()) {
            BlockingQueue<Pair> blockingQueue = this.zzb;
            for (Pair zzekj : blockingQueue) {
                zzezf.zza(this.zzd, new zzekj(zzekj));
            }
            blockingQueue.clear();
            this.zzh.set(false);
        }
    }

    public final void onAdClicked() {
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzli)).booleanValue()) {
            zzezf.zza(this.zzc, new zzekw());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onAppEvent(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.zzh     // Catch:{ all -> 0x0049 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x003d
            java.util.concurrent.BlockingQueue r0 = r3.zzb     // Catch:{ all -> 0x0049 }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x0049 }
            r1.<init>(r4, r5)     // Catch:{ all -> 0x0049 }
            boolean r0 = r0.offer(r1)     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x003b
            int r0 = com.google.android.gms.ads.internal.util.zze.zza     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = "The queue for app events is full, dropping the new event."
            com.google.android.gms.ads.internal.util.client.zzo.zze(r0)     // Catch:{ all -> 0x0049 }
            com.google.android.gms.internal.ads.zzdsj r0 = r3.zza     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x003b
            com.google.android.gms.internal.ads.zzdsi r0 = r0.zza()     // Catch:{ all -> 0x0049 }
            java.lang.String r1 = "action"
            java.lang.String r2 = "dae_action"
            r0.zzb(r1, r2)     // Catch:{ all -> 0x0049 }
            java.lang.String r1 = "dae_name"
            r0.zzb(r1, r4)     // Catch:{ all -> 0x0049 }
            java.lang.String r4 = "dae_data"
            r0.zzb(r4, r5)     // Catch:{ all -> 0x0049 }
            r0.zzj()     // Catch:{ all -> 0x0049 }
            monitor-exit(r3)
            return
        L_0x003b:
            monitor-exit(r3)
            return
        L_0x003d:
            java.util.concurrent.atomic.AtomicReference r0 = r3.zzd     // Catch:{ all -> 0x0049 }
            com.google.android.gms.internal.ads.zzekq r1 = new com.google.android.gms.internal.ads.zzekq     // Catch:{ all -> 0x0049 }
            r1.<init>(r4, r5)     // Catch:{ all -> 0x0049 }
            com.google.android.gms.internal.ads.zzezf.zza(r0, r1)     // Catch:{ all -> 0x0049 }
            monitor-exit(r3)
            return
        L_0x0049:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0049 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeky.onAppEvent(java.lang.String, java.lang.String):void");
    }

    public final void zza() {
        zzezf.zza(this.zzc, new zzekg());
        zzezf.zza(this.zzg, new zzekh());
    }

    public final void zzb() {
        zzezf.zza(this.zzc, new zzekr());
    }

    public final void zzc() {
        zzezf.zza(this.zzc, new zzekt());
        zzeku zzeku = new zzeku();
        AtomicReference atomicReference = this.zzg;
        zzezf.zza(atomicReference, zzeku);
        zzezf.zza(atomicReference, new zzekv());
    }

    public final void zzdD(zze zze2) {
        zzekk zzekk = new zzekk(zze2);
        AtomicReference atomicReference = this.zzc;
        zzezf.zza(atomicReference, zzekk);
        zzezf.zza(atomicReference, new zzekl(zze2));
        zzezf.zza(this.zzf, new zzekm(zze2));
        this.zzh.set(false);
        this.zzb.clear();
    }

    public final void zzdH() {
        zzezf.zza(this.zzc, new zzeks());
    }

    public final void zzdf() {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzli)).booleanValue()) {
            zzezf.zza(this.zzc, new zzekw());
        }
        zzezf.zza(this.zzg, new zzeki());
    }

    public final void zzdn(zzbvq zzbvq) {
    }

    public final void zzdo(zzfcn zzfcn) {
        this.zzh.set(true);
        this.zzj.set(false);
    }

    public final void zzdu(zzbwc zzbwc, String str, String str2) {
    }

    public final void zze() {
    }

    public final void zzf() {
    }

    public final synchronized zzbk zzg() {
        return (zzbk) this.zzc.get();
    }

    public final void zzh(zzt zzt) {
        zzezf.zza(this.zze, new zzekx(zzt));
    }

    public final synchronized zzco zzi() {
        return (zzco) this.zzd.get();
    }

    public final void zzj(zzbk zzbk) {
        this.zzc.set(zzbk);
    }

    public final void zzk(zzbn zzbn) {
        this.zzf.set(zzbn);
    }

    public final void zzl(zzdt zzdt) {
        this.zze.set(zzdt);
    }

    public final void zzm(zzco zzco) {
        this.zzd.set(zzco);
        this.zzi.set(true);
        zzo();
    }

    public final void zzn(zzcv zzcv) {
        this.zzg.set(zzcv);
    }

    public final void zzs(zze zze2) {
        zzezf.zza(this.zzg, new zzekp(zze2));
    }

    public final void zzt() {
        zzezf.zza(this.zzc, new zzekf());
    }

    public final synchronized void zzu() {
        zzezf.zza(this.zzc, new zzekn());
        zzezf.zza(this.zzf, new zzeko());
        this.zzj.set(true);
        zzo();
    }
}

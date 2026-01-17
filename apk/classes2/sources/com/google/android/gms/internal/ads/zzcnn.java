package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcnn implements zzazd, zzcwt, zzr, zzcws {
    private final zzcni zza;
    private final zzcnj zzb;
    private final Set zzc = new HashSet();
    private final zzbpi zzd;
    private final Executor zze;
    private final Clock zzf;
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final zzcnm zzh = new zzcnm();
    private boolean zzi = false;
    private WeakReference zzj = new WeakReference(this);

    public zzcnn(zzbpf zzbpf, zzcnj zzcnj, Executor executor, zzcni zzcni, Clock clock) {
        this.zza = zzcni;
        zzboq zzboq = zzbot.zza;
        this.zzd = zzbpf.zza("google.afma.activeView.handleUpdate", zzboq, zzboq);
        this.zzb = zzcnj;
        this.zze = executor;
        this.zzf = clock;
    }

    private final void zzk() {
        for (zzcfg zzf2 : this.zzc) {
            this.zza.zzf(zzf2);
        }
        this.zza.zze();
    }

    public final synchronized void zzd() {
        this.zzh.zzb = false;
        zzg();
    }

    public final synchronized void zzdj(Context context) {
        this.zzh.zze = "u";
        zzg();
        zzk();
        this.zzi = true;
    }

    public final synchronized void zzdk() {
        this.zzh.zzb = true;
        zzg();
    }

    public final synchronized void zzdl(Context context) {
        this.zzh.zzb = true;
        zzg();
    }

    public final synchronized void zzdm(Context context) {
        this.zzh.zzb = false;
        zzg();
    }

    public final synchronized void zzdr(zzazc zzazc) {
        zzcnm zzcnm = this.zzh;
        zzcnm.zza = zzazc.zzj;
        zzcnm.zzf = zzazc;
        zzg();
    }

    public final void zzds() {
    }

    public final void zzdt() {
    }

    public final void zzdv() {
    }

    public final void zzdw(int i) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0058, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzg() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.ref.WeakReference r0 = r5.zzj     // Catch:{ all -> 0x005e }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x0059
            boolean r0 = r5.zzi     // Catch:{ all -> 0x005e }
            if (r0 != 0) goto L_0x0057
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.zzg     // Catch:{ all -> 0x005e }
            boolean r0 = r0.get()     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x0057
            com.google.android.gms.internal.ads.zzcnm r0 = r5.zzh     // Catch:{ Exception -> 0x004f }
            com.google.android.gms.common.util.Clock r1 = r5.zzf     // Catch:{ Exception -> 0x004f }
            long r1 = r1.elapsedRealtime()     // Catch:{ Exception -> 0x004f }
            r0.zzd = r1     // Catch:{ Exception -> 0x004f }
            com.google.android.gms.internal.ads.zzcnj r1 = r5.zzb     // Catch:{ Exception -> 0x004f }
            org.json.JSONObject r0 = r1.zzb(r0)     // Catch:{ Exception -> 0x004f }
            java.util.Set r1 = r5.zzc     // Catch:{ Exception -> 0x004f }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x004f }
        L_0x002b:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x004f }
            if (r2 == 0) goto L_0x0042
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x004f }
            com.google.android.gms.internal.ads.zzcfg r2 = (com.google.android.gms.internal.ads.zzcfg) r2     // Catch:{ Exception -> 0x004f }
            java.util.concurrent.Executor r3 = r5.zze     // Catch:{ Exception -> 0x004f }
            com.google.android.gms.internal.ads.zzcnl r4 = new com.google.android.gms.internal.ads.zzcnl     // Catch:{ Exception -> 0x004f }
            r4.<init>(r0, r2)     // Catch:{ Exception -> 0x004f }
            r3.execute(r4)     // Catch:{ Exception -> 0x004f }
            goto L_0x002b
        L_0x0042:
            com.google.android.gms.internal.ads.zzbpi r1 = r5.zzd     // Catch:{ Exception -> 0x004f }
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zzc(r0)     // Catch:{ Exception -> 0x004f }
            java.lang.String r1 = "ActiveViewListener.callActiveViewJs"
            com.google.android.gms.internal.ads.zzcai.zzb(r0, r1)     // Catch:{ Exception -> 0x004f }
            monitor-exit(r5)
            return
        L_0x004f:
            r0 = move-exception
            java.lang.String r1 = "Failed to call ActiveViewJS"
            com.google.android.gms.ads.internal.util.zze.zzb(r1, r0)     // Catch:{ all -> 0x005e }
            monitor-exit(r5)
            return
        L_0x0057:
            monitor-exit(r5)
            return
        L_0x0059:
            r5.zzj()     // Catch:{ all -> 0x005e }
            monitor-exit(r5)
            return
        L_0x005e:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x005e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcnn.zzg():void");
    }

    public final synchronized void zzh(zzcfg zzcfg) {
        this.zzc.add(zzcfg);
        this.zza.zzd(zzcfg);
    }

    public final void zzi(Object obj) {
        this.zzj = new WeakReference(obj);
    }

    public final synchronized void zzj() {
        zzk();
        this.zzi = true;
    }

    public final synchronized void zzt() {
        if (this.zzg.compareAndSet(false, true)) {
            this.zza.zzc(this);
            zzg();
        }
    }
}

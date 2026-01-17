package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzch;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzfv;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public abstract class zzfld {
    protected final ClientApi zza;
    protected final Context zzb;
    protected final int zzc;
    protected final zzbpq zzd;
    protected zzfv zze;
    protected AtomicBoolean zzf;
    protected zzch zzg;
    private zzce zzh;
    private final Queue zzi;
    private final zzfkg zzj;
    private final String zzk;
    private AtomicBoolean zzl;
    private final ScheduledExecutorService zzm;
    private AtomicBoolean zzn;
    private AtomicBoolean zzo;
    /* access modifiers changed from: private */
    public zzfkl zzp;
    /* access modifiers changed from: private */
    public final Clock zzq;
    /* access modifiers changed from: private */
    public final zzfkt zzr;

    public zzfld(ClientApi clientApi, Context context, int i, zzbpq zzbpq, zzfv zzfv, zzce zzce, ScheduledExecutorService scheduledExecutorService, zzfkg zzfkg, Clock clock) {
        this("none", clientApi, context, i, zzbpq, zzfv, scheduledExecutorService, zzfkg, clock);
        this.zzh = zzce;
    }

    /* access modifiers changed from: private */
    public final String zzD() {
        return true != "none".equals(this.zzk) ? "2" : "1";
    }

    private final synchronized void zzE(Object obj) {
        Clock clock = this.zzq;
        zzfku zzfku = new zzfku(obj, clock);
        this.zzi.add(zzfku);
        zzea zza2 = zza(obj);
        long currentTimeMillis = clock.currentTimeMillis();
        if (this.zzn.get()) {
            zzs.zza.post(new zzfky(this, zza2));
        }
        ScheduledExecutorService scheduledExecutorService = this.zzm;
        scheduledExecutorService.execute(new zzfkz(this, currentTimeMillis, zza2));
        scheduledExecutorService.schedule(new zzfkx(this), zzfku.zza(), TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: private */
    public final synchronized void zzF(Throwable th) {
        this.zzl.set(false);
        if (th instanceof zzfka) {
            if (((zzfka) th).zza() == 0) {
                throw null;
            }
        }
        zzN(true);
    }

    /* access modifiers changed from: private */
    public final synchronized void zzG(Object obj) {
        boolean z = false;
        this.zzl.set(false);
        if (obj != null) {
            this.zzj.zzc();
            this.zzo.set(true);
            zzE(obj);
        }
        if (obj == null) {
            z = true;
        }
        zzN(z);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:14|15|16|17) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:4|5|6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call onAdPreloaded");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x001d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzH(com.google.android.gms.ads.internal.client.zzea r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.ads.internal.client.zzce r0 = r2.zzh     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x0012
            com.google.android.gms.ads.internal.client.zzfv r1 = r2.zze     // Catch:{ RemoteException -> 0x000b }
            r0.zze(r1)     // Catch:{ RemoteException -> 0x000b }
            goto L_0x0012
        L_0x000b:
            int r0 = com.google.android.gms.ads.internal.util.zze.zza     // Catch:{ all -> 0x0028 }
            java.lang.String r0 = "Failed to call onAdsAvailable"
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r0)     // Catch:{ all -> 0x0028 }
        L_0x0012:
            com.google.android.gms.ads.internal.client.zzch r0 = r2.zzg     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x0026
            java.lang.String r1 = r2.zzk     // Catch:{ RemoteException -> 0x001d }
            r0.zzf(r1, r3)     // Catch:{ RemoteException -> 0x001d }
            monitor-exit(r2)
            return
        L_0x001d:
            int r3 = com.google.android.gms.ads.internal.util.zze.zza     // Catch:{ all -> 0x0028 }
            java.lang.String r3 = "Failed to call onAdPreloaded"
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r3)     // Catch:{ all -> 0x0028 }
            monitor-exit(r2)
            return
        L_0x0026:
            monitor-exit(r2)
            return
        L_0x0028:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0028 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfld.zzH(com.google.android.gms.ads.internal.client.zzea):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:14|15|16|17) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:4|5|6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r0 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call onAdsExhausted");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x001d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzI() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.ads.internal.client.zzce r0 = r2.zzh     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x0012
            com.google.android.gms.ads.internal.client.zzfv r1 = r2.zze     // Catch:{ RemoteException -> 0x000b }
            r0.zzf(r1)     // Catch:{ RemoteException -> 0x000b }
            goto L_0x0012
        L_0x000b:
            int r0 = com.google.android.gms.ads.internal.util.zze.zza     // Catch:{ all -> 0x0028 }
            java.lang.String r0 = "Failed to call onAdsExhausted"
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r0)     // Catch:{ all -> 0x0028 }
        L_0x0012:
            com.google.android.gms.ads.internal.client.zzch r0 = r2.zzg     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x0026
            java.lang.String r1 = r2.zzk     // Catch:{ RemoteException -> 0x001d }
            r0.zzg(r1)     // Catch:{ RemoteException -> 0x001d }
            monitor-exit(r2)
            return
        L_0x001d:
            int r0 = com.google.android.gms.ads.internal.util.zze.zza     // Catch:{ all -> 0x0028 }
            java.lang.String r0 = "Failed to call onAdsExhausted"
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r0)     // Catch:{ all -> 0x0028 }
            monitor-exit(r2)
            return
        L_0x0026:
            monitor-exit(r2)
            return
        L_0x0028:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0028 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfld.zzI():void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:8|9|10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call onAdFailedToPreload");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x000c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzJ(com.google.android.gms.ads.internal.client.zze r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.ads.internal.client.zzch r0 = r2.zzg     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0015
            java.lang.String r1 = r2.zzk     // Catch:{ RemoteException -> 0x000c }
            r0.zze(r1, r3)     // Catch:{ RemoteException -> 0x000c }
            monitor-exit(r2)
            return
        L_0x000c:
            int r3 = com.google.android.gms.ads.internal.util.zze.zza     // Catch:{ all -> 0x0017 }
            java.lang.String r3 = "Failed to call onAdFailedToPreload"
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r3)     // Catch:{ all -> 0x0017 }
            monitor-exit(r2)
            return
        L_0x0015:
            monitor-exit(r2)
            return
        L_0x0017:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfld.zzJ(com.google.android.gms.ads.internal.client.zze):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void zzK() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.zzo     // Catch:{ all -> 0x0037 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0035
            java.util.Queue r0 = r2.zzi     // Catch:{ all -> 0x0037 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0035
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.zzo     // Catch:{ all -> 0x0037 }
            r1 = 0
            r0.set(r1)     // Catch:{ all -> 0x0037 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.zzn     // Catch:{ all -> 0x0037 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0029
            com.google.android.gms.internal.ads.zzfrw r0 = com.google.android.gms.ads.internal.util.zzs.zza     // Catch:{ all -> 0x0037 }
            com.google.android.gms.internal.ads.zzflb r1 = new com.google.android.gms.internal.ads.zzflb     // Catch:{ all -> 0x0037 }
            r1.<init>(r2)     // Catch:{ all -> 0x0037 }
            r0.post(r1)     // Catch:{ all -> 0x0037 }
        L_0x0029:
            java.util.concurrent.ScheduledExecutorService r0 = r2.zzm     // Catch:{ all -> 0x0037 }
            com.google.android.gms.internal.ads.zzflc r1 = new com.google.android.gms.internal.ads.zzflc     // Catch:{ all -> 0x0037 }
            r1.<init>(r2)     // Catch:{ all -> 0x0037 }
            r0.execute(r1)     // Catch:{ all -> 0x0037 }
            monitor-exit(r2)
            return
        L_0x0035:
            monitor-exit(r2)
            return
        L_0x0037:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0037 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfld.zzK():void");
    }

    /* access modifiers changed from: private */
    public final synchronized void zzL(zze zze2) {
        if (this.zzn.get()) {
            zzs.zza.post(new zzfla(this, zze2));
        }
        this.zzl.set(false);
        int i = zze2.zza;
        if (i == 1 || i == 8 || i == 10 || i == 11) {
            zzfv zzfv = this.zze;
            String str = "Preloading " + zzfv.zzb + ", for adUnitId:" + zzfv.zza + ", Ad load failed. Stop preloading due to non-retriable error:";
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi(str);
            this.zzf.set(false);
            zzfkr zzfkr = new zzfkr(this.zze.zza, zze());
            zzfkr.zzb(this.zzk);
            this.zzp.zzk(this.zzq.currentTimeMillis(), new zzfkt(zzfkr, (zzfks) null), zze2, this.zze.zzd, zzd(), zzD());
            return;
        }
        zzN(true);
    }

    private final synchronized void zzM() {
        Iterator it = this.zzi.iterator();
        while (it.hasNext()) {
            if (((zzfku) it.next()).zzd()) {
                it.remove();
            }
        }
    }

    private final synchronized void zzN(boolean z) {
        zzfkg zzfkg = this.zzj;
        if (!zzfkg.zze()) {
            if (z) {
                zzfkg.zzb();
            }
            this.zzm.schedule(new zzfkx(this), zzfkg.zza(), TimeUnit.MILLISECONDS);
        }
    }

    /* access modifiers changed from: private */
    public static final String zzO(zzea zzea) {
        if (!(zzea instanceof zzcvr)) {
            return null;
        }
        return ((zzcvr) zzea).zzl();
    }

    static /* bridge */ /* synthetic */ double zzc(zzfld zzfld, zzea zzea) {
        if (!(zzea instanceof zzcvr)) {
            return 0.0d;
        }
        return ((zzcvr) zzea).zzc();
    }

    public final void zzA() {
        this.zzf.set(false);
        this.zzn.set(false);
    }

    /* access modifiers changed from: protected */
    public final void zzB(int i) {
        Preconditions.checkArgument(i > 0);
        AdFormat adFormat = AdFormat.getAdFormat(this.zze.zzb);
        int i2 = this.zze.zzd;
        synchronized (this) {
            zzfv zzfv = this.zze;
            this.zze = new zzfv(zzfv.zza, zzfv.zzb, zzfv.zzc, i > 0 ? i : zzfv.zzd);
            Queue queue = this.zzi;
            if (queue.size() > i) {
                if (((Boolean) zzbd.zzc().zzb(zzbde.zzv)).booleanValue()) {
                    ArrayList arrayList = new ArrayList();
                    for (int i3 = 0; i3 < i; i3++) {
                        zzfku zzfku = (zzfku) queue.poll();
                        if (zzfku != null) {
                            arrayList.add(zzfku);
                        }
                    }
                    queue.clear();
                    queue.addAll(arrayList);
                }
            }
        }
        zzfkl zzfkl = this.zzp;
        if (zzfkl != null && adFormat != null) {
            zzfkl.zza(i2, i, this.zzq.currentTimeMillis(), new zzfkt(new zzfkr(this.zze.zza, adFormat), (zzfks) null));
        }
    }

    public final synchronized boolean zzC() {
        zzM();
        return !this.zzi.isEmpty();
    }

    /* access modifiers changed from: protected */
    public abstract zzea zza(Object obj);

    /* access modifiers changed from: protected */
    public abstract ListenableFuture zzb(Context context);

    /* access modifiers changed from: protected */
    public final synchronized int zzd() {
        return this.zzi.size();
    }

    /* access modifiers changed from: protected */
    public final AdFormat zze() {
        return AdFormat.getAdFormat(this.zze.zzb);
    }

    public final synchronized zzfld zzh() {
        this.zzm.submit(new zzfkx(this));
        return this;
    }

    /* access modifiers changed from: protected */
    public final synchronized Object zzj() {
        zzfku zzfku = (zzfku) this.zzi.peek();
        if (zzfku == null) {
            return null;
        }
        return zzfku.zzc();
    }

    public final synchronized Object zzk() {
        this.zzj.zzc();
        Queue queue = this.zzi;
        zzfku zzfku = (zzfku) queue.poll();
        this.zzo.set(zzfku != null);
        if (zzfku == null) {
            zzfku = null;
        } else if (!queue.isEmpty()) {
            zzfku zzfku2 = (zzfku) queue.peek();
            AdFormat adFormat = AdFormat.getAdFormat(this.zze.zzb);
            String zzO = zzO(zza(zzfku.zzc()));
            if (!(zzfku2 == null || adFormat == null || zzO == null || zzfku2.zzb() >= zzfku.zzb())) {
                this.zzp.zzn(this.zzq.currentTimeMillis(), this.zze.zzd, zzd(), zzO, this.zzr, zzD());
            }
        }
        zzw();
        if (zzfku == null) {
            return null;
        }
        return zzfku.zzc();
    }

    /* access modifiers changed from: protected */
    public final String zzn() {
        return this.zzk;
    }

    public final synchronized String zzo() {
        zzea zzea;
        Object zzj2 = zzj();
        if (zzj2 == null) {
            zzea = null;
        } else {
            zzea = zza(zzj2);
        }
        return zzO(zzea);
    }

    /* access modifiers changed from: protected */
    public final void zzv() {
        this.zzi.clear();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzw() {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.zzM()     // Catch:{ all -> 0x0060 }
            r3.zzK()     // Catch:{ all -> 0x0060 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.zzl     // Catch:{ all -> 0x0060 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0060 }
            if (r0 != 0) goto L_0x005e
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.zzf     // Catch:{ all -> 0x0060 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x005e
            java.util.Queue r0 = r3.zzi     // Catch:{ all -> 0x0060 }
            int r0 = r0.size()     // Catch:{ all -> 0x0060 }
            com.google.android.gms.ads.internal.client.zzfv r1 = r3.zze     // Catch:{ all -> 0x0060 }
            int r1 = r1.zzd     // Catch:{ all -> 0x0060 }
            if (r0 < r1) goto L_0x0024
            goto L_0x005e
        L_0x0024:
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.zzl     // Catch:{ all -> 0x0060 }
            r1 = 1
            r0.set(r1)     // Catch:{ all -> 0x0060 }
            com.google.android.gms.internal.ads.zzazx r0 = com.google.android.gms.ads.internal.zzv.zzb()     // Catch:{ all -> 0x0060 }
            android.app.Activity r0 = r0.zza()     // Catch:{ all -> 0x0060 }
            if (r0 != 0) goto L_0x004e
            com.google.android.gms.ads.internal.client.zzfv r0 = r3.zze     // Catch:{ all -> 0x0060 }
            java.lang.String r0 = r0.zza     // Catch:{ all -> 0x0060 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0060 }
            int r1 = com.google.android.gms.ads.internal.util.zze.zza     // Catch:{ all -> 0x0060 }
            java.lang.String r1 = "Empty activity context at preloading: "
            java.lang.String r0 = r1.concat(r0)     // Catch:{ all -> 0x0060 }
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r0)     // Catch:{ all -> 0x0060 }
            android.content.Context r0 = r3.zzb     // Catch:{ all -> 0x0060 }
            com.google.common.util.concurrent.ListenableFuture r0 = r3.zzb(r0)     // Catch:{ all -> 0x0060 }
            goto L_0x0052
        L_0x004e:
            com.google.common.util.concurrent.ListenableFuture r0 = r3.zzb(r0)     // Catch:{ all -> 0x0060 }
        L_0x0052:
            com.google.android.gms.internal.ads.zzfkv r1 = new com.google.android.gms.internal.ads.zzfkv     // Catch:{ all -> 0x0060 }
            r1.<init>(r3)     // Catch:{ all -> 0x0060 }
            java.util.concurrent.ScheduledExecutorService r2 = r3.zzm     // Catch:{ all -> 0x0060 }
            com.google.android.gms.internal.ads.zzgdn.zzr(r0, r1, r2)     // Catch:{ all -> 0x0060 }
            monitor-exit(r3)
            return
        L_0x005e:
            monitor-exit(r3)
            return
        L_0x0060:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0060 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfld.zzw():void");
    }

    public final synchronized void zzx(int i) {
        Preconditions.checkArgument(i >= 5);
        this.zzj.zzd(i);
    }

    public final synchronized void zzy() {
        this.zzf.set(true);
        this.zzn.set(true);
        this.zzm.submit(new zzfkx(this));
    }

    public final void zzz(zzfkl zzfkl) {
        this.zzp = zzfkl;
    }

    public zzfld(String str, ClientApi clientApi, Context context, int i, zzbpq zzbpq, zzfv zzfv, zzch zzch, ScheduledExecutorService scheduledExecutorService, zzfkg zzfkg, Clock clock) {
        this(str, clientApi, context, i, zzbpq, zzfv, scheduledExecutorService, zzfkg, clock);
        this.zzg = zzch;
    }

    private zzfld(String str, ClientApi clientApi, Context context, int i, zzbpq zzbpq, zzfv zzfv, ScheduledExecutorService scheduledExecutorService, zzfkg zzfkg, Clock clock) {
        this.zzk = str;
        this.zza = clientApi;
        this.zzb = context;
        this.zzc = i;
        this.zzd = zzbpq;
        this.zze = zzfv;
        this.zzi = new PriorityQueue(Math.max(1, zzfv.zzd), new zzfkw(this));
        this.zzf = new AtomicBoolean(true);
        this.zzl = new AtomicBoolean(false);
        this.zzm = scheduledExecutorService;
        this.zzj = zzfkg;
        this.zzn = new AtomicBoolean(true);
        this.zzo = new AtomicBoolean(false);
        this.zzq = clock;
        zzfkr zzfkr = new zzfkr(zzfv.zza, AdFormat.getAdFormat(this.zze.zzb));
        zzfkr.zzb(str);
        this.zzr = new zzfkt(zzfkr, (zzfks) null);
    }
}

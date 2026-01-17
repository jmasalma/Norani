package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.common.util.IOUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzceb extends zzgc {
    private final Context zza;
    private final zzgj zzb;
    private final String zzc;
    private final int zzd;
    private final boolean zze = ((Boolean) zzbd.zzc().zzb(zzbde.zzcc)).booleanValue();
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzbbo zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private boolean zzl = false;
    private boolean zzm = false;
    private long zzn = 0;
    private ListenableFuture zzo = null;
    private final AtomicLong zzp = new AtomicLong(-1);
    private final zzcel zzq;

    public zzceb(Context context, zzgj zzgj, String str, int i, zzhj zzhj, zzcel zzcel) {
        super(false);
        this.zza = context;
        this.zzb = zzgj;
        this.zzq = zzcel;
        this.zzc = str;
        this.zzd = i;
        zzf(zzhj);
    }

    private final boolean zzr() {
        if (!this.zze) {
            return false;
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzeG)).booleanValue() && !this.zzl) {
            return true;
        }
        return ((Boolean) zzbd.zzc().zzb(zzbde.zzeH)).booleanValue() && !this.zzm;
    }

    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (this.zzg) {
            InputStream inputStream = this.zzf;
            if (inputStream != null) {
                i3 = inputStream.read(bArr, i, i2);
            } else {
                i3 = this.zzb.zza(bArr, i, i2);
            }
            if (!this.zze || this.zzf != null) {
                zzg(i3);
            }
            return i3;
        }
        throw new IOException("Attempt to read closed GcacheDataSource.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x01d8  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:34:0x0103=Splitter:B:34:0x0103, B:39:0x0126=Splitter:B:39:0x0126} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long zzb(com.google.android.gms.internal.ads.zzgo r15) throws java.io.IOException {
        /*
            r14 = this;
            java.lang.String r0 = "ms"
            java.lang.String r1 = "Cache connection took "
            boolean r2 = r14.zzg
            if (r2 != 0) goto L_0x01f2
            r2 = 1
            r14.zzg = r2
            android.net.Uri r3 = r15.zza
            r14.zzh = r3
            boolean r4 = r14.zze
            if (r4 != 0) goto L_0x0016
            r14.zzj(r15)
        L_0x0016:
            com.google.android.gms.internal.ads.zzbbo r3 = com.google.android.gms.internal.ads.zzbbo.zza(r3)
            r14.zzi = r3
            com.google.android.gms.internal.ads.zzbcv r3 = com.google.android.gms.internal.ads.zzbde.zzeD
            com.google.android.gms.internal.ads.zzbdc r5 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r3 = r5.zzb(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r5 = -1
            r7 = 0
            if (r3 == 0) goto L_0x0176
            com.google.android.gms.internal.ads.zzbbo r3 = r14.zzi
            if (r3 == 0) goto L_0x01d2
            com.google.android.gms.internal.ads.zzbbo r3 = r14.zzi
            long r8 = r15.zze
            r3.zzh = r8
            com.google.android.gms.internal.ads.zzbbo r3 = r14.zzi
            java.lang.String r8 = r14.zzc
            java.lang.String r8 = com.google.android.gms.internal.ads.zzfwg.zzc(r8)
            r3.zzi = r8
            com.google.android.gms.internal.ads.zzbbo r3 = r14.zzi
            int r8 = r14.zzd
            r3.zzj = r8
            com.google.android.gms.internal.ads.zzbbo r3 = r14.zzi
            boolean r3 = r3.zzg
            if (r3 == 0) goto L_0x005e
            com.google.android.gms.internal.ads.zzbcv r3 = com.google.android.gms.internal.ads.zzbde.zzeF
            com.google.android.gms.internal.ads.zzbdc r8 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r3 = r8.zzb(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            goto L_0x006a
        L_0x005e:
            com.google.android.gms.internal.ads.zzbcv r3 = com.google.android.gms.internal.ads.zzbde.zzeE
            com.google.android.gms.internal.ads.zzbdc r8 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r3 = r8.zzb(r3)
            java.lang.Long r3 = (java.lang.Long) r3
        L_0x006a:
            long r8 = r3.longValue()
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzv.zzD()
            long r10 = r3.elapsedRealtime()
            com.google.android.gms.ads.internal.zzv.zzd()
            android.content.Context r3 = r14.zza
            com.google.android.gms.internal.ads.zzbbo r12 = r14.zzi
            java.util.concurrent.Future r3 = com.google.android.gms.internal.ads.zzbbz.zza(r3, r12)
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException | TimeoutException -> 0x0125, InterruptedException -> 0x0102, all -> 0x00ff }
            java.lang.Object r8 = r3.get(r8, r12)     // Catch:{ ExecutionException | TimeoutException -> 0x0125, InterruptedException -> 0x0102, all -> 0x00ff }
            com.google.android.gms.internal.ads.zzbca r8 = (com.google.android.gms.internal.ads.zzbca) r8     // Catch:{ ExecutionException | TimeoutException -> 0x0125, InterruptedException -> 0x0102, all -> 0x00ff }
            boolean r9 = r8.zzd()     // Catch:{ ExecutionException | TimeoutException -> 0x00fd, InterruptedException -> 0x00fb, all -> 0x00f9 }
            r14.zzj = r9     // Catch:{ ExecutionException | TimeoutException -> 0x00fd, InterruptedException -> 0x00fb, all -> 0x00f9 }
            boolean r9 = r8.zzf()     // Catch:{ ExecutionException | TimeoutException -> 0x00fd, InterruptedException -> 0x00fb, all -> 0x00f9 }
            r14.zzl = r9     // Catch:{ ExecutionException | TimeoutException -> 0x00fd, InterruptedException -> 0x00fb, all -> 0x00f9 }
            boolean r9 = r8.zze()     // Catch:{ ExecutionException | TimeoutException -> 0x00fd, InterruptedException -> 0x00fb, all -> 0x00f9 }
            r14.zzm = r9     // Catch:{ ExecutionException | TimeoutException -> 0x00fd, InterruptedException -> 0x00fb, all -> 0x00f9 }
            long r12 = r8.zza()     // Catch:{ ExecutionException | TimeoutException -> 0x00fd, InterruptedException -> 0x00fb, all -> 0x00f9 }
            r14.zzn = r12     // Catch:{ ExecutionException | TimeoutException -> 0x00fd, InterruptedException -> 0x00fb, all -> 0x00f9 }
            boolean r9 = r14.zzr()     // Catch:{ ExecutionException | TimeoutException -> 0x00fd, InterruptedException -> 0x00fb, all -> 0x00f9 }
            if (r9 != 0) goto L_0x00d7
            java.io.InputStream r8 = r8.zzc()     // Catch:{ ExecutionException | TimeoutException -> 0x00fd, InterruptedException -> 0x00fb, all -> 0x00f9 }
            r14.zzf = r8     // Catch:{ ExecutionException | TimeoutException -> 0x00fd, InterruptedException -> 0x00fb, all -> 0x00f9 }
            if (r4 == 0) goto L_0x00b2
            r14.zzj(r15)     // Catch:{ ExecutionException | TimeoutException -> 0x00fd, InterruptedException -> 0x00fb, all -> 0x00f9 }
        L_0x00b2:
            com.google.android.gms.common.util.Clock r15 = com.google.android.gms.ads.internal.zzv.zzD()
            long r3 = r15.elapsedRealtime()
            long r3 = r3 - r10
            com.google.android.gms.internal.ads.zzcel r15 = r14.zzq
            com.google.android.gms.internal.ads.zzceo r15 = r15.zza
            com.google.android.gms.internal.ads.zzceo.zzab(r15, r2, r3)
            r14.zzk = r2
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>(r1)
            r15.append(r3)
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            com.google.android.gms.ads.internal.util.zze.zza(r15)
            return r5
        L_0x00d7:
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzv.zzD()
            long r3 = r3.elapsedRealtime()
            long r3 = r3 - r10
            com.google.android.gms.internal.ads.zzcel r5 = r14.zzq
            com.google.android.gms.internal.ads.zzceo r5 = r5.zza
            com.google.android.gms.internal.ads.zzceo.zzab(r5, r2, r3)
            r14.zzk = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L_0x014a
        L_0x00f9:
            r15 = move-exception
            goto L_0x0151
        L_0x00fb:
            r4 = r2
            goto L_0x0103
        L_0x00fd:
            r4 = r2
            goto L_0x0126
        L_0x00ff:
            r15 = move-exception
            r2 = r7
            goto L_0x0151
        L_0x0102:
            r4 = r7
        L_0x0103:
            r3.cancel(r2)     // Catch:{ all -> 0x014f }
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x014f }
            r2.interrupt()     // Catch:{ all -> 0x014f }
            com.google.android.gms.common.util.Clock r2 = com.google.android.gms.ads.internal.zzv.zzD()
            long r2 = r2.elapsedRealtime()
            long r2 = r2 - r10
            com.google.android.gms.internal.ads.zzcel r5 = r14.zzq
            com.google.android.gms.internal.ads.zzceo r5 = r5.zza
            com.google.android.gms.internal.ads.zzceo.zzab(r5, r4, r2)
            r14.zzk = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            goto L_0x0140
        L_0x0125:
            r4 = r7
        L_0x0126:
            r3.cancel(r2)     // Catch:{ all -> 0x014f }
            com.google.android.gms.common.util.Clock r2 = com.google.android.gms.ads.internal.zzv.zzD()
            long r2 = r2.elapsedRealtime()
            long r2 = r2 - r10
            com.google.android.gms.internal.ads.zzcel r5 = r14.zzq
            com.google.android.gms.internal.ads.zzceo r5 = r5.zza
            com.google.android.gms.internal.ads.zzceo.zzab(r5, r4, r2)
            r14.zzk = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
        L_0x0140:
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
        L_0x014a:
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            goto L_0x01d2
        L_0x014f:
            r15 = move-exception
            r2 = r4
        L_0x0151:
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzv.zzD()
            long r3 = r3.elapsedRealtime()
            long r3 = r3 - r10
            com.google.android.gms.internal.ads.zzcel r5 = r14.zzq
            com.google.android.gms.internal.ads.zzceo r5 = r5.zza
            com.google.android.gms.internal.ads.zzceo.zzab(r5, r2, r3)
            r14.zzk = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            throw r15
        L_0x0176:
            com.google.android.gms.internal.ads.zzbbo r0 = r14.zzi
            if (r0 == 0) goto L_0x019b
            com.google.android.gms.internal.ads.zzbbo r0 = r14.zzi
            long r3 = r15.zze
            r0.zzh = r3
            com.google.android.gms.internal.ads.zzbbo r0 = r14.zzi
            java.lang.String r1 = r14.zzc
            java.lang.String r1 = com.google.android.gms.internal.ads.zzfwg.zzc(r1)
            r0.zzi = r1
            com.google.android.gms.internal.ads.zzbbo r0 = r14.zzi
            int r1 = r14.zzd
            r0.zzj = r1
            com.google.android.gms.internal.ads.zzbbk r0 = com.google.android.gms.ads.internal.zzv.zzc()
            com.google.android.gms.internal.ads.zzbbo r1 = r14.zzi
            com.google.android.gms.internal.ads.zzbbl r0 = r0.zzb(r1)
            goto L_0x019c
        L_0x019b:
            r0 = 0
        L_0x019c:
            if (r0 == 0) goto L_0x01d2
            boolean r1 = r0.zze()
            if (r1 == 0) goto L_0x01d2
            boolean r1 = r0.zzd()
            r14.zzj = r1
            boolean r1 = r0.zzg()
            r14.zzl = r1
            boolean r1 = r0.zzf()
            r14.zzm = r1
            long r3 = r0.zza()
            r14.zzn = r3
            r14.zzk = r2
            boolean r1 = r14.zzr()
            if (r1 != 0) goto L_0x01d2
            java.io.InputStream r0 = r0.zzc()
            r14.zzf = r0
            boolean r0 = r14.zze
            if (r0 == 0) goto L_0x01d1
            r14.zzj(r15)
        L_0x01d1:
            return r5
        L_0x01d2:
            r14.zzk = r7
            com.google.android.gms.internal.ads.zzbbo r0 = r14.zzi
            if (r0 == 0) goto L_0x01eb
            com.google.android.gms.internal.ads.zzgm r15 = r15.zza()
            com.google.android.gms.internal.ads.zzbbo r0 = r14.zzi
            java.lang.String r0 = r0.zza
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r15.zzd(r0)
            com.google.android.gms.internal.ads.zzgo r15 = r15.zze()
        L_0x01eb:
            com.google.android.gms.internal.ads.zzgj r0 = r14.zzb
            long r0 = r0.zzb(r15)
            return r0
        L_0x01f2:
            java.io.IOException r15 = new java.io.IOException
            java.lang.String r0 = "Attempt to open an already open GcacheDataSource."
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzceb.zzb(com.google.android.gms.internal.ads.zzgo):long");
    }

    public final Uri zzc() {
        return this.zzh;
    }

    public final void zzd() throws IOException {
        if (this.zzg) {
            boolean z = false;
            this.zzg = false;
            this.zzh = null;
            if (!this.zze || this.zzf != null) {
                z = true;
            }
            InputStream inputStream = this.zzf;
            if (inputStream != null) {
                IOUtils.closeQuietly(inputStream);
                this.zzf = null;
            } else {
                this.zzb.zzd();
            }
            if (z) {
                zzh();
                return;
            }
            return;
        }
        throw new IOException("Attempt to close an already closed GcacheDataSource.");
    }

    public final long zzk() {
        return this.zzn;
    }

    public final long zzl() {
        if (this.zzi != null) {
            AtomicLong atomicLong = this.zzp;
            if (atomicLong.get() != -1) {
                return atomicLong.get();
            }
            synchronized (this) {
                if (this.zzo == null) {
                    this.zzo = zzcaf.zza.zzb(new zzcea(this));
                }
            }
            if (this.zzo.isDone()) {
                try {
                    this.zzp.compareAndSet(-1, ((Long) this.zzo.get()).longValue());
                    return this.zzp.get();
                } catch (InterruptedException | ExecutionException unused) {
                }
            }
        }
        return -1;
    }

    public final boolean zzn() {
        return this.zzj;
    }

    public final boolean zzo() {
        return this.zzm;
    }

    public final boolean zzp() {
        return this.zzl;
    }

    public final boolean zzq() {
        return this.zzk;
    }
}

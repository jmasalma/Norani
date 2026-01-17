package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.collection.CircularIntArray;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzsv extends MediaCodec.Callback {
    private final Object zza = new Object();
    private final HandlerThread zzb;
    private Handler zzc;
    private final CircularIntArray zzd;
    private final CircularIntArray zze;
    private final ArrayDeque zzf;
    private final ArrayDeque zzg;
    private MediaFormat zzh;
    private MediaFormat zzi;
    private MediaCodec.CodecException zzj;
    private MediaCodec.CryptoException zzk;
    private long zzl;
    private boolean zzm;
    private IllegalStateException zzn;
    private zzte zzo;

    zzsv(HandlerThread handlerThread) {
        this.zzb = handlerThread;
        this.zzd = new CircularIntArray();
        this.zze = new CircularIntArray();
        this.zzf = new ArrayDeque();
        this.zzg = new ArrayDeque();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzsv r5) {
        /*
            java.lang.Object r0 = r5.zza
            monitor-enter(r0)
            boolean r1 = r5.zzm     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return
        L_0x0009:
            long r1 = r5.zzl     // Catch:{ all -> 0x002d }
            r3 = -1
            long r1 = r1 + r3
            r5.zzl = r1     // Catch:{ all -> 0x002d }
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0018
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return
        L_0x0018:
            if (r1 >= 0) goto L_0x0028
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x002d }
            r1.<init>()     // Catch:{ all -> 0x002d }
            monitor-enter(r0)     // Catch:{ all -> 0x002d }
            r5.zzn = r1     // Catch:{ all -> 0x0025 }
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return
        L_0x0025:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            throw r5     // Catch:{ all -> 0x002d }
        L_0x0028:
            r5.zzj()     // Catch:{ all -> 0x002d }
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return
        L_0x002d:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsv.zzd(com.google.android.gms.internal.ads.zzsv):void");
    }

    private final void zzi(MediaFormat mediaFormat) {
        this.zze.addLast(-2);
        this.zzg.add(mediaFormat);
    }

    private final void zzj() {
        ArrayDeque arrayDeque = this.zzg;
        if (!arrayDeque.isEmpty()) {
            this.zzi = (MediaFormat) arrayDeque.getLast();
        }
        this.zzd.clear();
        this.zze.clear();
        this.zzf.clear();
        arrayDeque.clear();
    }

    private final void zzk() {
        IllegalStateException illegalStateException = this.zzn;
        if (illegalStateException == null) {
            MediaCodec.CodecException codecException = this.zzj;
            if (codecException == null) {
                MediaCodec.CryptoException cryptoException = this.zzk;
                if (cryptoException != null) {
                    this.zzk = null;
                    throw cryptoException;
                }
                return;
            }
            this.zzj = null;
            throw codecException;
        }
        this.zzn = null;
        throw illegalStateException;
    }

    private final boolean zzl() {
        return this.zzl > 0 || this.zzm;
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.zza) {
            this.zzk = cryptoException;
        }
    }

    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.zza) {
            this.zzj = codecException;
        }
    }

    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.zza) {
            this.zzd.addLast(i);
            zzte zzte = this.zzo;
            if (zzte != null) {
                zztp zztp = ((zztm) zzte).zza;
                if (zztp.zzo != null) {
                    zztp.zzo.zza();
                }
            }
        }
    }

    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            MediaFormat mediaFormat = this.zzi;
            if (mediaFormat != null) {
                zzi(mediaFormat);
                this.zzi = null;
            }
            this.zze.addLast(i);
            this.zzf.add(bufferInfo);
            zzte zzte = this.zzo;
            if (zzte != null) {
                zztp zztp = ((zztm) zzte).zza;
                if (zztp.zzo != null) {
                    zztp.zzo.zza();
                }
            }
        }
    }

    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.zza) {
            zzi(mediaFormat);
            this.zzi = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.zza
            monitor-enter(r0)
            r4.zzk()     // Catch:{ all -> 0x001e }
            boolean r1 = r4.zzl()     // Catch:{ all -> 0x001e }
            r2 = -1
            if (r1 == 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return r2
        L_0x000f:
            androidx.collection.CircularIntArray r1 = r4.zzd     // Catch:{ all -> 0x001e }
            boolean r3 = r1.isEmpty()     // Catch:{ all -> 0x001e }
            if (r3 == 0) goto L_0x0018
            goto L_0x001c
        L_0x0018:
            int r2 = r1.popFirst()     // Catch:{ all -> 0x001e }
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return r2
        L_0x001e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsv.zza():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0048, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(android.media.MediaCodec.BufferInfo r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.zza
            monitor-enter(r0)
            r9.zzk()     // Catch:{ all -> 0x0049 }
            boolean r1 = r9.zzl()     // Catch:{ all -> 0x0049 }
            r2 = -1
            if (r1 == 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            return r2
        L_0x000f:
            androidx.collection.CircularIntArray r1 = r9.zze     // Catch:{ all -> 0x0049 }
            boolean r3 = r1.isEmpty()     // Catch:{ all -> 0x0049 }
            if (r3 == 0) goto L_0x0019
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            return r2
        L_0x0019:
            int r1 = r1.popFirst()     // Catch:{ all -> 0x0049 }
            if (r1 < 0) goto L_0x0039
            android.media.MediaFormat r2 = r9.zzh     // Catch:{ all -> 0x0049 }
            com.google.android.gms.internal.ads.zzdd.zzb(r2)     // Catch:{ all -> 0x0049 }
            java.util.ArrayDeque r2 = r9.zzf     // Catch:{ all -> 0x0049 }
            java.lang.Object r2 = r2.remove()     // Catch:{ all -> 0x0049 }
            android.media.MediaCodec$BufferInfo r2 = (android.media.MediaCodec.BufferInfo) r2     // Catch:{ all -> 0x0049 }
            int r4 = r2.offset     // Catch:{ all -> 0x0049 }
            int r5 = r2.size     // Catch:{ all -> 0x0049 }
            long r6 = r2.presentationTimeUs     // Catch:{ all -> 0x0049 }
            int r8 = r2.flags     // Catch:{ all -> 0x0049 }
            r3 = r10
            r3.set(r4, r5, r6, r8)     // Catch:{ all -> 0x0049 }
            goto L_0x0047
        L_0x0039:
            r10 = -2
            if (r1 != r10) goto L_0x0047
            java.util.ArrayDeque r1 = r9.zzg     // Catch:{ all -> 0x0049 }
            java.lang.Object r1 = r1.remove()     // Catch:{ all -> 0x0049 }
            android.media.MediaFormat r1 = (android.media.MediaFormat) r1     // Catch:{ all -> 0x0049 }
            r9.zzh = r1     // Catch:{ all -> 0x0049 }
            r1 = r10
        L_0x0047:
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            return r1
        L_0x0049:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsv.zzb(android.media.MediaCodec$BufferInfo):int");
    }

    public final MediaFormat zzc() {
        MediaFormat mediaFormat;
        synchronized (this.zza) {
            mediaFormat = this.zzh;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public final void zze() {
        synchronized (this.zza) {
            this.zzl++;
            Handler handler = this.zzc;
            String str = zzex.zza;
            Handler handler2 = handler;
            handler.post(new zzsu(this));
        }
    }

    public final void zzf(MediaCodec mediaCodec) {
        zzdd.zzf(this.zzc == null);
        HandlerThread handlerThread = this.zzb;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.zzc = handler;
    }

    public final void zzg(zzte zzte) {
        synchronized (this.zza) {
            this.zzo = zzte;
        }
    }

    public final void zzh() {
        synchronized (this.zza) {
            this.zzm = true;
            this.zzb.quit();
            zzj();
        }
    }
}

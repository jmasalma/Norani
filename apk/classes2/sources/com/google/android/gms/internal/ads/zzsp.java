package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzsp implements zztf {
    private final MediaCodec zza;
    private final zzsv zzb;
    private final zztg zzc;
    private final zztb zzd;
    private boolean zze;
    private int zzf = 0;

    /* synthetic */ zzsp(MediaCodec mediaCodec, HandlerThread handlerThread, zztg zztg, zztb zztb, zzso zzso) {
        this.zza = mediaCodec;
        this.zzb = new zzsv(handlerThread);
        this.zzc = zztg;
        this.zzd = zztb;
    }

    static /* bridge */ /* synthetic */ void zzh(zzsp zzsp, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        zztb zztb;
        zzsv zzsv = zzsp.zzb;
        MediaCodec mediaCodec = zzsp.zza;
        zzsv.zzf(mediaCodec);
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, i);
        Trace.endSection();
        zzsp.zzc.zzh();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (zztb = zzsp.zzd) != null) {
            zztb.zza(mediaCodec);
        }
        zzsp.zzf = 1;
    }

    /* access modifiers changed from: private */
    public static String zzt(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    public final int zza() {
        this.zzc.zzc();
        return this.zzb.zza();
    }

    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        this.zzc.zzc();
        return this.zzb.zzb(bufferInfo);
    }

    public final MediaFormat zzc() {
        return this.zzb.zzc();
    }

    public final ByteBuffer zzf(int i) {
        return this.zza.getInputBuffer(i);
    }

    public final ByteBuffer zzg(int i) {
        return this.zza.getOutputBuffer(i);
    }

    public final void zzi() {
        this.zza.detachOutputSurface();
    }

    public final void zzj() {
        this.zzc.zzb();
        MediaCodec mediaCodec = this.zza;
        mediaCodec.flush();
        this.zzb.zze();
        mediaCodec.start();
    }

    public final void zzk(int i, int i2, int i3, long j, int i4) {
        this.zzc.zzd(i, 0, i3, j, i4);
    }

    public final void zzl(int i, int i2, zzhp zzhp, long j, int i3) {
        this.zzc.zze(i, 0, zzhp, j, i3);
    }

    public final void zzm() {
        zztb zztb;
        zztb zztb2;
        zztb zztb3;
        try {
            if (this.zzf == 1) {
                this.zzc.zzg();
                this.zzb.zzh();
            }
            this.zzf = 2;
            if (!this.zze) {
                if (Build.VERSION.SDK_INT >= 30 && Build.VERSION.SDK_INT < 33) {
                    this.zza.stop();
                }
                if (Build.VERSION.SDK_INT >= 35 && (zztb3 = this.zzd) != null) {
                    zztb3.zzc(this.zza);
                }
                this.zza.release();
                this.zze = true;
            }
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && (zztb2 = this.zzd) != null) {
                zztb2.zzc(this.zza);
            }
            this.zza.release();
            this.zze = true;
            throw th;
        }
    }

    public final void zzn(int i, long j) {
        this.zza.releaseOutputBuffer(i, j);
    }

    public final void zzo(int i, boolean z) {
        this.zza.releaseOutputBuffer(i, false);
    }

    public final void zzp(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    public final void zzq(Bundle bundle) {
        this.zzc.zzf(bundle);
    }

    public final void zzr(int i) {
        this.zza.setVideoScalingMode(i);
    }

    public final boolean zzs(zzte zzte) {
        this.zzb.zzg(zzte);
        return true;
    }
}

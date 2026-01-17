package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcq implements zzcn {
    private int zzb;
    private float zzc = 1.0f;
    private float zzd = 1.0f;
    private zzcl zze;
    private zzcl zzf;
    private zzcl zzg;
    private zzcl zzh;
    private boolean zzi;
    private zzcp zzj;
    private ByteBuffer zzk;
    private ShortBuffer zzl;
    private ByteBuffer zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;

    public zzcq() {
        zzcl zzcl = zzcl.zza;
        this.zze = zzcl;
        this.zzf = zzcl;
        this.zzg = zzcl;
        this.zzh = zzcl;
        ByteBuffer byteBuffer = zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = byteBuffer;
        this.zzb = -1;
    }

    public final zzcl zza(zzcl zzcl) throws zzcm {
        if (zzcl.zzd == 2) {
            int i = this.zzb;
            if (i == -1) {
                i = zzcl.zzb;
            }
            this.zze = zzcl;
            zzcl zzcl2 = new zzcl(i, zzcl.zzc, 2);
            this.zzf = zzcl2;
            this.zzi = true;
            return zzcl2;
        }
        throw new zzcm("Unhandled input format:", zzcl);
    }

    public final ByteBuffer zzb() {
        int zza;
        zzcp zzcp = this.zzj;
        if (zzcp != null && (zza = zzcp.zza()) > 0) {
            if (this.zzk.capacity() < zza) {
                ByteBuffer order = ByteBuffer.allocateDirect(zza).order(ByteOrder.nativeOrder());
                this.zzk = order;
                this.zzl = order.asShortBuffer();
            } else {
                this.zzk.clear();
                this.zzl.clear();
            }
            zzcp.zzd(this.zzl);
            this.zzo += (long) zza;
            this.zzk.limit(zza);
            this.zzm = this.zzk;
        }
        ByteBuffer byteBuffer = this.zzm;
        this.zzm = zza;
        return byteBuffer;
    }

    public final void zzc() {
        if (zzg()) {
            this.zzg = this.zze;
            this.zzh = this.zzf;
            if (this.zzi) {
                zzcl zzcl = this.zzg;
                this.zzj = new zzcp(zzcl.zzb, zzcl.zzc, this.zzc, this.zzd, this.zzh.zzb);
            } else {
                zzcp zzcp = this.zzj;
                if (zzcp != null) {
                    zzcp.zzc();
                }
            }
        }
        this.zzm = zza;
        this.zzn = 0;
        this.zzo = 0;
        this.zzp = false;
    }

    public final void zzd() {
        zzcp zzcp = this.zzj;
        if (zzcp != null) {
            zzcp.zze();
        }
        this.zzp = true;
    }

    public final void zze(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            zzcp zzcp = this.zzj;
            zzcp.getClass();
            zzcp zzcp2 = zzcp;
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.zzn += (long) remaining;
            zzcp.zzf(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    public final void zzf() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        zzcl zzcl = zzcl.zza;
        this.zze = zzcl;
        this.zzf = zzcl;
        this.zzg = zzcl;
        this.zzh = zzcl;
        ByteBuffer byteBuffer = zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = byteBuffer;
        this.zzb = -1;
        this.zzi = false;
        this.zzj = null;
        this.zzn = 0;
        this.zzo = 0;
        this.zzp = false;
    }

    public final boolean zzg() {
        if (this.zzf.zzb != -1) {
            return Math.abs(this.zzc + -1.0f) >= 1.0E-4f || Math.abs(this.zzd + -1.0f) >= 1.0E-4f || this.zzf.zzb != this.zze.zzb;
        }
        return false;
    }

    public final boolean zzh() {
        if (!this.zzp) {
            return false;
        }
        zzcp zzcp = this.zzj;
        if (zzcp != null) {
            return zzcp.zza() == 0;
        }
        return true;
    }

    public final long zzi(long j) {
        long j2 = this.zzo;
        if (j2 < 1024) {
            return (long) (((double) this.zzc) * ((double) j));
        }
        long j3 = this.zzn;
        zzcp zzcp = this.zzj;
        zzcp.getClass();
        zzcp zzcp2 = zzcp;
        long zzb2 = j3 - ((long) zzcp.zzb());
        int i = this.zzh.zzb;
        int i2 = this.zzg.zzb;
        if (i == i2) {
            return zzex.zzu(j, zzb2, j2, RoundingMode.DOWN);
        }
        return zzex.zzu(j, zzb2 * ((long) i), j2 * ((long) i2), RoundingMode.DOWN);
    }

    public final void zzj(float f) {
        zzdd.zzd(f > 0.0f);
        if (this.zzd != f) {
            this.zzd = f;
            this.zzi = true;
        }
    }

    public final void zzk(float f) {
        zzdd.zzd(f > 0.0f);
        if (this.zzc != f) {
            this.zzc = f;
            this.zzi = true;
        }
    }
}

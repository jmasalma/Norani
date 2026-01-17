package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public abstract class zzco implements zzcn {
    protected zzcl zzb;
    protected zzcl zzc;
    private zzcl zzd;
    private zzcl zze;
    private ByteBuffer zzf;
    private ByteBuffer zzg;
    private boolean zzh;

    public zzco() {
        ByteBuffer byteBuffer = zza;
        this.zzf = byteBuffer;
        this.zzg = byteBuffer;
        zzcl zzcl = zzcl.zza;
        this.zzd = zzcl;
        this.zze = zzcl;
        this.zzb = zzcl;
        this.zzc = zzcl;
    }

    public final zzcl zza(zzcl zzcl) throws zzcm {
        this.zzd = zzcl;
        this.zze = zzi(zzcl);
        return zzg() ? this.zze : zzcl.zza;
    }

    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.zzg;
        this.zzg = zza;
        return byteBuffer;
    }

    public final void zzc() {
        this.zzg = zza;
        this.zzh = false;
        this.zzb = this.zzd;
        this.zzc = this.zze;
        zzk();
    }

    public final void zzd() {
        this.zzh = true;
        zzl();
    }

    public final void zzf() {
        ByteBuffer byteBuffer = zza;
        this.zzg = byteBuffer;
        this.zzh = false;
        this.zzf = byteBuffer;
        zzcl zzcl = zzcl.zza;
        this.zzd = zzcl;
        this.zze = zzcl;
        this.zzb = zzcl;
        this.zzc = zzcl;
        zzm();
    }

    public boolean zzg() {
        return this.zze != zzcl.zza;
    }

    public boolean zzh() {
        return this.zzh && this.zzg == zza;
    }

    /* access modifiers changed from: protected */
    public zzcl zzi(zzcl zzcl) throws zzcm {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final ByteBuffer zzj(int i) {
        if (this.zzf.capacity() < i) {
            this.zzf = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.zzf.clear();
        }
        ByteBuffer byteBuffer = this.zzf;
        this.zzg = byteBuffer;
        return byteBuffer;
    }

    /* access modifiers changed from: protected */
    public void zzk() {
    }

    /* access modifiers changed from: protected */
    public void zzl() {
    }

    /* access modifiers changed from: protected */
    public void zzm() {
    }

    /* access modifiers changed from: protected */
    public final boolean zzn() {
        return this.zzg.hasRemaining();
    }
}

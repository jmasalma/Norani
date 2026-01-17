package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzry extends zzco {
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private byte[] zzh = zzex.zzb;
    private int zzi;
    private long zzj;

    public final ByteBuffer zzb() {
        int i;
        if (super.zzh() && (i = this.zzi) > 0) {
            zzj(i).put(this.zzh, 0, this.zzi).flip();
            this.zzi = 0;
        }
        return super.zzb();
    }

    public final void zze(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i != 0) {
            int min = Math.min(i, this.zzg);
            this.zzj += (long) (min / this.zzb.zze);
            this.zzg -= min;
            byteBuffer.position(position + min);
            if (this.zzg <= 0) {
                int i2 = i - min;
                int length = (this.zzi + i2) - this.zzh.length;
                ByteBuffer zzj2 = zzj(length);
                int i3 = this.zzi;
                String str = zzex.zza;
                int max = Math.max(0, Math.min(length, i3));
                zzj2.put(this.zzh, 0, max);
                int max2 = Math.max(0, Math.min(length - max, i2));
                byteBuffer.limit(byteBuffer.position() + max2);
                zzj2.put(byteBuffer);
                byteBuffer.limit(limit);
                int i4 = i2 - max2;
                int i5 = this.zzi - max;
                this.zzi = i5;
                byte[] bArr = this.zzh;
                System.arraycopy(bArr, max, bArr, 0, i5);
                byteBuffer.get(this.zzh, this.zzi, i4);
                this.zzi += i4;
                zzj2.flip();
            }
        }
    }

    public final boolean zzh() {
        return super.zzh() && this.zzi == 0;
    }

    public final zzcl zzi(zzcl zzcl) throws zzcm {
        if (zzex.zzK(zzcl.zzd)) {
            this.zzf = true;
            return (this.zzd == 0 && this.zze == 0) ? zzcl.zza : zzcl;
        }
        throw new zzcm("Unhandled input format:", zzcl);
    }

    /* access modifiers changed from: protected */
    public final void zzk() {
        if (this.zzf) {
            this.zzf = false;
            int i = this.zze;
            int i2 = this.zzb.zze;
            this.zzh = new byte[(i * i2)];
            this.zzg = this.zzd * i2;
        }
        this.zzi = 0;
    }

    /* access modifiers changed from: protected */
    public final void zzl() {
        if (this.zzf) {
            int i = this.zzi;
            if (i > 0) {
                this.zzj += (long) (i / this.zzb.zze);
            }
            this.zzi = 0;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzm() {
        this.zzh = zzex.zzb;
    }

    public final long zzo() {
        return this.zzj;
    }

    public final void zzp() {
        this.zzj = 0;
    }

    public final void zzq(int i, int i2) {
        this.zzd = i;
        this.zze = i2;
    }
}

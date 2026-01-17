package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public abstract class zzhfy implements zzarq {
    private static final zzhgj zzg = zzhgj.zzb(zzhfy.class);
    protected final String zza;
    boolean zzb;
    boolean zzc;
    long zzd;
    long zze = -1;
    zzhgd zzf;
    private ByteBuffer zzh;

    protected zzhfy(String str) {
        this.zza = str;
        this.zzc = true;
        this.zzb = true;
    }

    private final synchronized void zzc() {
        String str;
        if (!this.zzc) {
            try {
                zzhgj zzhgj = zzg;
                String str2 = this.zza;
                if (str2.length() != 0) {
                    str = "mem mapping ".concat(str2);
                } else {
                    str = new String("mem mapping ");
                }
                zzhgj.zza(str);
                this.zzh = this.zzf.zzd(this.zzd, this.zze);
                this.zzc = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public final String zza() {
        return this.zza;
    }

    public final void zzb(zzhgd zzhgd, ByteBuffer byteBuffer, long j, zzarn zzarn) throws IOException {
        this.zzd = zzhgd.zzb();
        byteBuffer.remaining();
        this.zze = j;
        this.zzf = zzhgd;
        zzhgd.zze(zzhgd.zzb() + j);
        this.zzc = false;
        this.zzb = false;
        zzf();
    }

    /* access modifiers changed from: protected */
    public abstract void zze(ByteBuffer byteBuffer);

    public final synchronized void zzf() {
        String str;
        zzc();
        zzhgj zzhgj = zzg;
        String str2 = this.zza;
        if (str2.length() != 0) {
            str = "parsing details of ".concat(str2);
        } else {
            str = new String("parsing details of ");
        }
        zzhgj.zza(str);
        ByteBuffer byteBuffer = this.zzh;
        if (byteBuffer != null) {
            this.zzb = true;
            byteBuffer.rewind();
            zze(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                byteBuffer.slice();
            }
            this.zzh = null;
        }
    }
}

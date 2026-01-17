package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzarh extends ByteArrayOutputStream {
    private final zzaqu zza;

    public zzarh(zzaqu zzaqu, int i) {
        this.zza = zzaqu;
        this.buf = zzaqu.zzb(Math.max(i, 256));
    }

    private final void zza(int i) {
        if (this.count + i > this.buf.length) {
            zzaqu zzaqu = this.zza;
            int i2 = this.count + i;
            byte[] zzb = zzaqu.zzb(i2 + i2);
            System.arraycopy(this.buf, 0, zzb, 0, this.count);
            zzaqu.zza(this.buf);
            this.buf = zzb;
        }
    }

    public final void close() throws IOException {
        this.zza.zza(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        this.zza.zza(this.buf);
    }

    public final synchronized void write(int i) {
        zza(1);
        super.write(i);
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        zza(i2);
        super.write(bArr, i, i2);
    }
}

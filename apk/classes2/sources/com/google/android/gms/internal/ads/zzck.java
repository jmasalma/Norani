package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzck {
    private final zzfyq zza;
    private final List zzb = new ArrayList();
    private ByteBuffer[] zzc = new ByteBuffer[0];
    private boolean zzd;

    public zzck(zzfyq zzfyq) {
        this.zza = zzfyq;
        zzcl zzcl = zzcl.zza;
        this.zzd = false;
    }

    private final int zzi() {
        return this.zzc.length - 1;
    }

    private final void zzj(ByteBuffer byteBuffer) {
        boolean z;
        ByteBuffer byteBuffer2;
        do {
            z = false;
            for (int i = 0; i <= zzi(); i++) {
                if (!this.zzc[i].hasRemaining()) {
                    List list = this.zzb;
                    zzcn zzcn = (zzcn) list.get(i);
                    if (!zzcn.zzh()) {
                        if (i > 0) {
                            byteBuffer2 = this.zzc[i - 1];
                        } else {
                            byteBuffer2 = byteBuffer.hasRemaining() ? byteBuffer : zzcn.zza;
                        }
                        zzcn.zze(byteBuffer2);
                        this.zzc[i] = zzcn.zzb();
                        boolean z2 = true;
                        if (((long) byteBuffer2.remaining()) - ((long) byteBuffer2.remaining()) <= 0 && !this.zzc[i].hasRemaining()) {
                            z2 = false;
                        }
                        z |= z2;
                    } else if (!this.zzc[i].hasRemaining() && i < zzi()) {
                        ((zzcn) list.get(i + 1)).zzd();
                    }
                }
            }
        } while (z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzck)) {
            return false;
        }
        zzfyq zzfyq = this.zza;
        int size = zzfyq.size();
        zzfyq zzfyq2 = ((zzck) obj).zza;
        if (size != zzfyq2.size()) {
            return false;
        }
        for (int i = 0; i < zzfyq.size(); i++) {
            if (zzfyq.get(i) != zzfyq2.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final zzcl zza(zzcl zzcl) throws zzcm {
        zzcl zzcl2 = zzcl.zza;
        if (!zzcl.equals(zzcl2)) {
            int i = 0;
            while (true) {
                zzfyq zzfyq = this.zza;
                if (i >= zzfyq.size()) {
                    return zzcl;
                }
                zzcn zzcn = (zzcn) zzfyq.get(i);
                zzcl zza2 = zzcn.zza(zzcl);
                if (zzcn.zzg()) {
                    zzdd.zzf(!zza2.equals(zzcl2));
                    zzcl = zza2;
                }
                i++;
            }
        } else {
            throw new zzcm("Unhandled input format:", zzcl);
        }
    }

    public final ByteBuffer zzb() {
        if (!zzh()) {
            return zzcn.zza;
        }
        ByteBuffer byteBuffer = this.zzc[zzi()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        zzj(zzcn.zza);
        return this.zzc[zzi()];
    }

    public final void zzc() {
        List list = this.zzb;
        list.clear();
        this.zzd = false;
        int i = 0;
        while (true) {
            zzfyq zzfyq = this.zza;
            if (i >= zzfyq.size()) {
                break;
            }
            zzcn zzcn = (zzcn) zzfyq.get(i);
            zzcn.zzc();
            if (zzcn.zzg()) {
                list.add(zzcn);
            }
            i++;
        }
        this.zzc = new ByteBuffer[list.size()];
        for (int i2 = 0; i2 <= zzi(); i2++) {
            this.zzc[i2] = ((zzcn) list.get(i2)).zzb();
        }
    }

    public final void zzd() {
        if (zzh() && !this.zzd) {
            this.zzd = true;
            ((zzcn) this.zzb.get(0)).zzd();
        }
    }

    public final void zze(ByteBuffer byteBuffer) {
        if (zzh() && !this.zzd) {
            zzj(byteBuffer);
        }
    }

    public final void zzf() {
        int i = 0;
        while (true) {
            zzfyq zzfyq = this.zza;
            if (i < zzfyq.size()) {
                zzcn zzcn = (zzcn) zzfyq.get(i);
                zzcn.zzc();
                zzcn.zzf();
                i++;
            } else {
                this.zzc = new ByteBuffer[0];
                zzcl zzcl = zzcl.zza;
                this.zzd = false;
                return;
            }
        }
    }

    public final boolean zzg() {
        return this.zzd && ((zzcn) this.zzb.get(zzi())).zzh() && !this.zzc[zzi()].hasRemaining();
    }

    public final boolean zzh() {
        return !this.zzb.isEmpty();
    }
}

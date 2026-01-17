package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzajz implements zzadv {
    private zzady zza;
    private zzakh zzb;
    private boolean zzc;

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    private final boolean zza(zzadw zzadw) throws IOException {
        zzakb zzakb = new zzakb();
        if (zzakb.zzb(zzadw, true) && (zzakb.zza & 2) == 2) {
            int min = Math.min(zzakb.zze, 8);
            zzen zzen = new zzen(min);
            zzadw.zzh(zzen.zzN(), 0, min);
            zzen.zzL(0);
            if (zzen.zza() >= 5 && zzen.zzm() == 127 && zzen.zzu() == 1179402563) {
                this.zzb = new zzajy();
            } else {
                zzen.zzL(0);
                try {
                    if (zzafh.zzd(1, zzen, true)) {
                        this.zzb = new zzakj();
                    }
                } catch (zzaz unused) {
                }
                zzen.zzL(0);
                if (zzakd.zzd(zzen)) {
                    this.zzb = new zzakd();
                }
            }
            return true;
        }
        return false;
    }

    public final int zzb(zzadw zzadw, zzaer zzaer) throws IOException {
        zzdd.zzb(this.zza);
        if (this.zzb == null) {
            if (zza(zzadw)) {
                zzadw.zzj();
            } else {
                throw zzaz.zza("Failed to determine bitstream type", (Throwable) null);
            }
        }
        if (!this.zzc) {
            zzafb zzw = this.zza.zzw(0, 1);
            this.zza.zzG();
            this.zzb.zzh(this.zza, zzw);
            this.zzc = true;
        }
        return this.zzb.zze(zzadw, zzaer);
    }

    public final /* synthetic */ zzadv zzc() {
        return this;
    }

    public final /* synthetic */ List zzd() {
        return zzfyq.zzn();
    }

    public final void zze(zzady zzady) {
        this.zza = zzady;
    }

    public final void zzf(long j, long j2) {
        zzakh zzakh = this.zzb;
        if (zzakh != null) {
            zzakh.zzj(j, j2);
        }
    }

    public final boolean zzi(zzadw zzadw) throws IOException {
        try {
            return zza(zzadw);
        } catch (zzaz unused) {
            return false;
        }
    }
}

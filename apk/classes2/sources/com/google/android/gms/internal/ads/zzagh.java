package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzagh implements zzadv {
    private final zzen zza = new zzen(4);
    private final zzaew zzb = new zzaew(-1, -1, "image/heif");

    private final boolean zza(zzadw zzadw, int i) throws IOException {
        zzen zzen = this.zza;
        zzen.zzI(4);
        ((zzadl) zzadw).zzm(zzen.zzN(), 0, 4, false);
        if (zzen.zzu() == ((long) i)) {
            return true;
        }
        return false;
    }

    public final int zzb(zzadw zzadw, zzaer zzaer) throws IOException {
        return this.zzb.zzb(zzadw, zzaer);
    }

    public final /* synthetic */ zzadv zzc() {
        return this;
    }

    public final /* synthetic */ List zzd() {
        return zzfyq.zzn();
    }

    public final void zze(zzady zzady) {
        this.zzb.zze(zzady);
    }

    public final void zzf(long j, long j2) {
        this.zzb.zzf(j, j2);
    }

    public final boolean zzi(zzadw zzadw) throws IOException {
        ((zzadl) zzadw).zzl(4, false);
        if (!zza(zzadw, 1718909296) || !zza(zzadw, 1751476579)) {
            return false;
        }
        return true;
    }
}

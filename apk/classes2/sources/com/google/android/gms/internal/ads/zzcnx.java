package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcnx implements zzazd {
    private zzcfg zza;
    private final Executor zzb;
    private final zzcnj zzc;
    private final Clock zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final zzcnm zzg = new zzcnm();

    public zzcnx(Executor executor, zzcnj zzcnj, Clock clock) {
        this.zzb = executor;
        this.zzc = zzcnj;
        this.zzd = clock;
    }

    public static /* synthetic */ void zza(zzcnx zzcnx, JSONObject jSONObject) {
        int i = zze.zza;
        zzo.zze("Calling AFMA_updateActiveView(" + jSONObject.toString() + ")");
        zzcnx.zza.zzp("AFMA_updateActiveView", jSONObject);
    }

    private final void zzg() {
        try {
            JSONObject zza2 = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new zzcnw(this, zza2));
            }
        } catch (JSONException e) {
            zze.zzb("Failed to call video active view js", e);
        }
    }

    public final void zzb() {
        this.zze = false;
    }

    public final void zzd() {
        this.zze = true;
        zzg();
    }

    public final void zzdr(zzazc zzazc) {
        boolean z;
        if (this.zzf) {
            z = false;
        } else {
            z = zzazc.zzj;
        }
        zzcnm zzcnm = this.zzg;
        zzcnm.zza = z;
        zzcnm.zzd = this.zzd.elapsedRealtime();
        zzcnm.zzf = zzazc;
        if (this.zze) {
            zzg();
        }
    }

    public final void zze(boolean z) {
        this.zzf = z;
    }

    public final void zzf(zzcfg zzcfg) {
        this.zza = zzcfg;
    }
}

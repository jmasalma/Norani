package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzch;
import com.google.android.gms.ads.internal.client.zzfv;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfle {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final ScheduledExecutorService zzc;
    private final ClientApi zzd = new ClientApi();
    private zzbpq zze;
    private final Clock zzf;

    zzfle(Context context, VersionInfoParcel versionInfoParcel, ScheduledExecutorService scheduledExecutorService, Clock clock) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = scheduledExecutorService;
        this.zzf = clock;
    }

    private static zzfkg zzd() {
        return new zzfkg(((Long) zzbd.zzc().zzb(zzbde.zzB)).longValue(), 2.0d, ((Long) zzbd.zzc().zzb(zzbde.zzC)).longValue(), 0.2d);
    }

    public final zzfld zza(zzfv zzfv, zzce zzce) {
        AdFormat adFormat = AdFormat.getAdFormat(zzfv.zzb);
        if (adFormat == null) {
            return null;
        }
        int ordinal = adFormat.ordinal();
        if (ordinal == 1) {
            return new zzfki(this.zzd, this.zza, this.zzb.clientJarVersion, this.zze, zzfv, zzce, this.zzc, zzd(), this.zzf);
        } else if (ordinal == 2) {
            return new zzflh(this.zzd, this.zza, this.zzb.clientJarVersion, this.zze, zzfv, zzce, this.zzc, zzd(), this.zzf);
        } else if (ordinal != 5) {
            return null;
        } else {
            return new zzfkf(this.zzd, this.zza, this.zzb.clientJarVersion, this.zze, zzfv, zzce, this.zzc, zzd(), this.zzf);
        }
    }

    public final zzfld zzb(String str, zzfv zzfv, zzch zzch) {
        AdFormat adFormat = AdFormat.getAdFormat(zzfv.zzb);
        if (adFormat == null) {
            return null;
        }
        int ordinal = adFormat.ordinal();
        if (ordinal == 1) {
            return new zzfki(str, this.zzd, this.zza, this.zzb.clientJarVersion, this.zze, zzfv, zzch, this.zzc, zzd(), this.zzf);
        } else if (ordinal == 2) {
            return new zzflh(str, this.zzd, this.zza, this.zzb.clientJarVersion, this.zze, zzfv, zzch, this.zzc, zzd(), this.zzf);
        } else if (ordinal != 5) {
            return null;
        } else {
            return new zzfkf(str, this.zzd, this.zza, this.zzb.clientJarVersion, this.zze, zzfv, zzch, this.zzc, zzd(), this.zzf);
        }
    }

    public final void zzc(zzbpq zzbpq) {
        this.zze = zzbpq;
    }
}

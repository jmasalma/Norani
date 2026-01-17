package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbil;
import com.google.android.gms.internal.ads.zzbim;
import com.google.android.gms.internal.ads.zzbtn;
import com.google.android.gms.internal.ads.zzbxh;
import java.util.Random;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbb {
    public static final /* synthetic */ int zza = 0;
    private static final zzbb zzb = new zzbb();
    private final zzf zzc;
    private final zzaz zzd;
    private final String zze;
    private final VersionInfoParcel zzf;
    private final Random zzg;

    protected zzbb() {
        zzf zzf2 = new zzf();
        zzaz zzaz = new zzaz(new zzk(), new zzi(), new zzfg(), new zzbil(), new zzbxh(), new zzbtn(), new zzbim(), new zzl());
        String zzj = zzf.zzj();
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(0, ModuleDescriptor.MODULE_VERSION, true);
        Random random = new Random();
        this.zzc = zzf2;
        this.zzd = zzaz;
        this.zze = zzj;
        this.zzf = versionInfoParcel;
        this.zzg = random;
    }

    public static zzaz zza() {
        return zzb.zzd;
    }

    public static zzf zzb() {
        return zzb.zzc;
    }

    public static VersionInfoParcel zzc() {
        return zzb.zzf;
    }

    public static String zzd() {
        return zzb.zze;
    }

    public static Random zze() {
        return zzb.zzg;
    }
}
